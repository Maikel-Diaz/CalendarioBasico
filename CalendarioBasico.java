
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
        day = 0;
        month = 0;
        year = 0;
    }

    /**
     * Permite introducir el dia, mes y año de una fecha.
     */
    public void IntroduceDate(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
        if (year <= 1999){
            day = 0;
            month = 0;
            year = 0;
            System.out.println("Introduce una fecha mayor a 2000");
        }
        if (year >= 2100){
            day = 0;
            month = 0;
            year = 0;
            System.out.println("Introduce una fecha menor a 2099");
        }
    }

    /**
     * Nos permite avanzar dia a dia en la fecha introducida.
     */
    public void moveDate()
    {
        if (day < 31){
            day = day + 1;
        }
        if (day == 31){
            day = 1;
            month = month + 1;
        }
        if (month == 13){
            month = 1;
            year = year + 1;
        }
    }

}
