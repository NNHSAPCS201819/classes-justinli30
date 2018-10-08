import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int count = 0;
    Moon moon1 = new Moon();
    Sun sun1 = new Sun();
    House house1 = new House();
    Beanstalk beanstalk1 = new Beanstalk();
    LightBackground lightBackground1 = new LightBackground();
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent()
    {
        this.lightBackground1 = new LightBackground();
        this.sun1 = new Sun(0, 50);
        this.house1 = new House(45, 375);
        this.beanstalk1 = new Beanstalk(450, 560, 40);
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        if (count <= 10)
        {
        lightBackground1.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
    }
        if (count <= 20)
        {
            
        }
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sun1.moveSunCoord(100);
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
        this.count += 1;
    }

}
