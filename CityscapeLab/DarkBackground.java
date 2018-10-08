
/**
 * Write a description of class LightBackground here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class DarkBackground
{
    public DarkBackground()
    {
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double background = new Rectangle2D.Double(0, 0, 1000, 600);
        g2.setColor(Color.BLUE.darker());
        g2.fill(background);
        g2.draw(background);
    }
}
