
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // Declarando campos di
    private int day;
    private int month;
    private int year;

    /**
     * Constructor para calendario basico.
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
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
        if (year <= 1999){
            day = 0;
            month = 0;
            year = 0;
            System.out.println("Introduce un fecha mayor a 2000");
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
    public void avanzarFecha()
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
    
    /**
     * Permite devolver una fecha.
     */
    public String obtenerFecha()
    {
        String dosCifrDia = String.valueOf(day);
        String dosCifrMes = String.valueOf(month);
        String dosCifrAño = String.valueOf(year);
        if (dosCifrDia.length() < 2) {
            dosCifrDia = "0" + String.valueOf(day);
        }
        if (dosCifrMes.length() < 2) {
            dosCifrMes = "0" + String.valueOf(month);
        }
        return dosCifrDia + "-" + dosCifrMes + "-" + dosCifrAño.substring(2,4);
    }
       
}
