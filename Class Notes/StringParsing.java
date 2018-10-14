
/**
 * Write a description of class StringParsing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StringParsing
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.print("enter a number 1,000 to 999,999: ");
       String string1 = s.nextLine();
       int len = string1.length();
       String sHalf = string1.substring(len-3, len);
       String sFirst = string1.substring(0, len-4);
       String newString = sFirst + sHalf;
       System.out.println(newString);
    }
}
