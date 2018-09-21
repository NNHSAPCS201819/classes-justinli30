
/**
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Target target1 = new Target(40,30);
        target1.draw(g2);
        
        Target target2 = new Target(300,300);
        target2.draw(g2);
        
        Target target3 = new Target(700,680);
        target3.draw(g2);
    }
}

