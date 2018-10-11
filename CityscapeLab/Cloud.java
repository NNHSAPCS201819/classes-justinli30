
/**
 * Write a description of class Cloud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class Cloud
{
    private int cX;
    private int cY;
    private int diam;
    /**
     * Default constructor for the Cloud class.
     *      Initializes starting coordinates of the cloud to be (0,0). Also 
     *      initializes diameter of circles that make up cloud to be 10. 
     */
    public Cloud()
    {
        cX = 0;
        cY = 0;
        diam = 10;
    }
    /**
     * Constructs a new Cloud object with specified coordinates.
     * 
     * @param   x   the x-coordinate for the cloud
     * @param   y   the y-coordinate for the cloud
     * @param   d   the diameter of the circles of the cloud
     */
    public Cloud(int x, int y, int d)
    {
        cX = x;
        cY = y;
        diam = d;
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double circ = new Ellipse2D.Double(cX, cY, diam, diam);
        int calcDiam = diam * 2;
        calcDiam /= 3;
        g2.setColor(Color.WHITE);
        g2.draw(circ);
        g2.fill(circ);
        int newX = cX + calcDiam;
        int calcDiam2 = diam / 2;
        for (int i = 1; i < 4; i++)
        {
           Ellipse2D.Double nextCirc = new Ellipse2D.Double(newX, cY, diam, diam);
           g2.draw(nextCirc);
           g2.fill(nextCirc);
           newX += calcDiam;
        }
        newX -= calcDiam;
        newX += calcDiam2;
        int rightCircY = cY + calcDiam2;
        Ellipse2D.Double rightCirc = new Ellipse2D.Double(newX, rightCircY,
                                                          diam, diam);
        g2.draw(rightCirc);
        g2.fill(rightCirc);
        int diamFrac = diam / 8;
        int newY = cY + diam - diamFrac;
        newX -= calcDiam2;
        for (int i = 1; i < 5; i++)
        {
           Ellipse2D.Double nextCirc2 = new Ellipse2D.Double(newX, newY, diam, diam);
           g2.draw(nextCirc2);
           g2.fill(nextCirc2);
           newX -= calcDiam;
        }
        newX += calcDiam;
        newX -= calcDiam2;
        int leftCircY = cY + calcDiam2;
        Ellipse2D.Double leftCirc = new Ellipse2D.Double(newX, leftCircY,
                                                         diam, diam);
        g2.draw(leftCirc);
        g2.fill(leftCirc);
    }
}
