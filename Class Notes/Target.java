
/**
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
public class Target
{
    private int xLeft;
    private int yTop;
    
    public Target(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(xLeft, yTop, 10, 10);
        Ellipse2D.Double secondCircle = new Ellipse2D.Double(xLeft+2, yTop-2, 8,8);
        
    }
}

