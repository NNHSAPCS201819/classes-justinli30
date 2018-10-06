
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
public class Sun
{
    private int sunX;
    private int sunY;
    public Sun()
    {
        sunX = 0;
        sunY = 0;
    }
    public Sun(int x, int y)
    {
        sunX = x;
        sunY = y;
    }
    public void setSunCoord(int newX, int newY)
    {
        sunX = newX;
        sunY = newY;
    }
    public void draw(Graphics2D g2)
    {
        //drawing dark background
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 800, 600);
        g2.setColor(Color.CYAN.brighter());
        g2.fill(background);
        g2.draw(background);
        
        Ellipse2D.Double sun = new Ellipse2D.Double(sunX, sunY, 70, 70);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
}