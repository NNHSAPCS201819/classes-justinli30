
/**
 * Write a description of class Moon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class Moon
{
    private int moonX;
    private int moonY;
    public Moon()
    {
        moonX = 0;
        moonY = 0;
    }
    public Moon(int x, int y)
    {
        moonX = x;
        moonY = y;
    }
    public void setMoonCoord(int newX, int newY)
    {
        moonX = newX;
        moonY = newY;
    }
    public void draw(Graphics2D g2)
    {
        //drawing dark background
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 800, 600);
        g2.setColor(Color.BLUE.darker());
        g2.fill(background);
        g2.draw(background);
        
        Ellipse2D.Double moon = new Ellipse2D.Double(moonX, moonY, 70, 70);
        g2.setColor(Color.WHITE);
        g2.fill(moon);
        g2.draw(moon);
    }

}
