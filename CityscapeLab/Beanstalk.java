/**
 * Write a description of class Beanstalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class Beanstalk
{
    private int beanstalkX;
    private int beanstalkY;
    private int height;
    /**
     * Default constructor for the Beanstalk class.
     *      Initializes the starting coordinates of the bottom left corner of the 
     *      beanstalk to be (0,0).
     */
    public Beanstalk()
    {
        beanstalkX = 0;
        beanstalkY = 600;
        height = 0;
    }
    /**
     * Constructs a new Beanstalk object with specified coordinates.
     * 
     * @param   x   the x-coordinate for the beanstalk
     * @param   y   the y-coordinate for the beanstalk
     */
    public Beanstalk(int x, int y, int z)
    {
        beanstalkX = x;
        beanstalkY = y;
        height = z;
    }
    /**
     * Grows the beanstalk.
     */
    public void growBeanstalk()
    {
        //FINISH
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //drawing dark background
        Rectangle2D.Double plant = new Rectangle2D.Double(beanstalkX, beanstalkY - height, 
                                                          15, height);
        g2.setColor(Color.GREEN.darker());
        g2.fill(plant);
        g2.draw(plant);
    }

}
