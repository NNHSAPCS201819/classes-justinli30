
/**
 * Write a description of class Sun here.
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
    /**
     * Default constructor for the Sun class.
     *      Initializes the starting coordinates of the sun to be (0,0).
     */
    public Sun()
    {
        sunX = 0;
        sunY = 0;
    }
    /**
     * Constructs a new Sun object with specified coordinates.
     * 
     * @param   x   the x-coordinate for the sun
     * @param   y   the y-coordinate for the sun
     */
    public Sun(int x, int y)
    {
        sunX = x;
        sunY = y;
    }
    /**
     * Moves the sun.
     * 
     * @param   moveX    the amount the sun should move
     */
    public void moveSunCoord(int moveX)
    {
        sunX += moveX;
    }
    /**
     * Sets the sun x-coordinate.
     * 
     * @param   newCoord    the new x-coordinate for the sun
     */
    public void setSunCoord(int newCoord)
    {
        sunX = newCoord;
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {        
        Ellipse2D.Double sun = new Ellipse2D.Double(sunX, sunY, 80, 80);
        g2.setColor(Color.YELLOW);
        g2.fill(sun);
        g2.draw(sun);
    }
}