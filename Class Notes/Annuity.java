
/**
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Annuity
{
    public static double calcPresentValue(double pmt, double i, int n)
    {
        double lol = Math.pow(1+i, n-1);
        double presentValue = pmt * ((((lol-1)/i)/lol) + 1);
        return presentValue;
    }
}