
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
    /**
     * Default constructor for the Moon class.
     *      Initializes the starting coordinates of the moon to be (0,0).
     */
    public Moon()
    {
        moonX = 0;
        moonY = 0;
    }
    /**
     * Constructs a new Moon object with specified coordinates.
     * 
     * @param   x   the x-coordinate for the moon
     * @param   y   the y-coordinate for the moon
     */
    public Moon(int x, int y)
    {
        moonX = x;
        moonY = y;
    }
    /**
     * Moves the moon.
     * 
     * @param   moveX    the amount the moon should move
     */
    public void moveMoonCoord(int moveX)
    {
        moonX += moveX;
    }
    /**
     * Sets the moon x-coordinate.
     * 
     * @param   newCoord    the new x-coordinate for the moon
     */
    public void setMoonCoord(int newCoord)
    {
        moonX = newCoord;
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(moonX, moonY, 80, 80);
        g2.setColor(Color.WHITE);
        g2.fill(moon);
        g2.draw(moon);
    }

}
