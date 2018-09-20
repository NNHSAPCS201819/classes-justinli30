
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
        Target target1 = new Target(0,0);
        int x = getWidth() - 10;
        int y = getHeight() - 10;
        
        Target target2 = new Target(x,y);
        target1.draw(g2);
        target2.draw(g2);
    }
}

