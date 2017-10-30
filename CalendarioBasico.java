
/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        day = 01;
        month = 01;
        year = 01;
    }
    
    /**
     * Añadir metodo de avanzar fecha
     */
    public void avanzarFecha () {
        day = day + 1;
        if ( day > 30 ) {
            month = month + 1;
            day = 01;
        }
        if ( month > 12 ) {
            year = year + 1;
            month = 01;
        }
    }
}
