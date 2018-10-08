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
    private int count = 1;
    Moon moon1 = new Moon();
    Sun sun1 = new Sun();
    House house1 = new House();
    Beanstalk beanstalk1 = new Beanstalk();
    LightBackground light = new LightBackground();
    DarkBackground dark = new DarkBackground();
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent()
    {
        this.light = new LightBackground();
        this.sun1 = new Sun(0, 50);
        this.house1 = new House(45, 375);
        this.beanstalk1 = new Beanstalk(450, 560, 40);
        this.dark = new DarkBackground();
        this.moon1 = new Moon(0, 50);
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
        light.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
    }
        if (count > 10 && count <= 20)
        {
            dark.draw(g2);
            moon1.draw(g2);
            house1.draw(g2);
            beanstalk1.draw(g2);
    }
    if (count > 20 && count <= 30)
        {
        light.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
    }
    if (count > 30 && count <= 40)
        {
            dark.draw(g2);
            moon1.draw(g2);
            house1.draw(g2);
            beanstalk1.draw(g2);
    }
    if (count > 40 && count <= 50)
        {
        light.draw(g2);
        sun1.draw(g2);
        house1.draw(g2);
        beanstalk1.draw(g2);
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
        if (count <= 10)
        {
       sun1.moveSunCoord(100);
    }
    if (count == 11)
    {
        sun1.setSunCoord(0);
    }
    if (count > 10 && count <= 20)
        {
           moon1.moveMoonCoord(100);
    }
    if (count == 21)
    {
        moon1.setMoonCoord(0);
    }
    if (count > 20 && count <= 30)
        {
        sun1.moveSunCoord(100);
    }
    if (count > 30 && count <= 40)
        {
         
         moon1.moveMoonCoord(100);
    }
    else
    {
    }

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
        this.count += 1;
    }

}
