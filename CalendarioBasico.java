
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
        year = 2001;
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
    
    /**
     * Fijar una fecha concreta
     */
    public void fijarFecha (int day1, int month1, int year1) {
        day = day1;
        month = month1;
        year = year1;
    }
    
    /**
     * Devuelve en String la fecha puesta. Formato : dd/mm/aa.
     */
    public String obtenerFecha () {
        String dayNumDay = String.valueOf(day);
        String dayNumMonth = String.valueOf(month);
        String dayNumYear = String.valueOf(year);
        if (dayNumDay.length() < 2) {
            dayNumDay = "0" + String.valueOf(day);
        }
        if (dayNumMonth.length() < 2) {
            dayNumMonth = "0" + String.valueOf (month);
        }
        return dayNumDay + "-" + dayNumMonth + "-" + dayNumYear.substring(2,4);
    }
}
