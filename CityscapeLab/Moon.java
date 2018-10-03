
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
    public Moon(int x, int y)
    {
        moonX = x;
        moonY = y;
    }
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 800, 600);
        g2.setColor(Color.BLUE.darker());
        g2.draw(background);
        
    }
}
