import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @justinli30
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int count = 1;
    private Moon moon1;
    private Sun sun1;
    private House house1;
    private Beanstalk beanstalk1;
    private LightBackground light;
    private DarkBackground dark;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Cloud cloud1;
    private Cloud cloud2;
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent()
    {
        this.light = new LightBackground();
        this.sun1 = new Sun(0, 50);
        this.house1 = new House(45, 375);
        this.beanstalk1 = new Beanstalk(450, 560, 15, 40);
        this.dark = new DarkBackground();
        this.moon1 = new Moon(0, 50);
        this.tree1 = new Tree(900, 600, 140, 33);
        this.tree2 = new Tree(1050, 600, 180, 45);
        this.tree3 = new Tree(1200, 600, 160, 39);
        this.cloud1 = new Cloud(260, 60, 90);
        this.cloud2 = new Cloud(790, 60, 90);
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
        if (count <= 14)
        {
        light.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
        tree1.draw(g2);
        tree2.draw(g2);
        tree3.draw(g2);
    }
        if (count > 14 && count <= 28)
        {
        dark.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        moon1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
        tree1.draw(g2);
        tree2.draw(g2);
        tree3.draw(g2);
    }
    if (count > 28 && count <= 42)
        {
        light.draw(g2);
        cloud1.draw(g2);
        cloud2.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
        tree1.draw(g2);
        tree2.draw(g2);
        tree3.draw(g2);
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
        if (count <= 14)
        {
       sun1.moveSunCoord(100);
       beanstalk1.growBeanstalk();
    }
    if (count == 15)
    {
        sun1.setSunCoord(0);
        beanstalk1.growBeanstalk();
    }
    if (count > 14 && count <= 28)
        {
           moon1.moveMoonCoord(100);
           beanstalk1.growBeanstalk();
    }
    if (count == 29)
    {
        moon1.setMoonCoord(0);
        beanstalk1.growBeanstalk();
    }
    if (count > 28 && count <= 42)
        {
        sun1.moveSunCoord(100);
        beanstalk1.growBeanstalk();
    }
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
        this.count += 1;
    }

}
