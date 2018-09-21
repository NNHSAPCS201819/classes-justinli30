
/**
 * 
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.Color;
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
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(xLeft, yTop, 200, 200);
        g2.setColor(Color.WHITE);
        g2.fill(firstCircle);
        
        Ellipse2D.Double secondCircle = new Ellipse2D.Double(xLeft+20, yTop+20, 
                                            160, 160);
        g2.setColor(Color.BLACK);
        g2.fill(secondCircle);
        
        Ellipse2D.Double thirdCircle = new Ellipse2D.Double(xLeft+40, yTop+40,
                                           120, 120);
        g2.setColor(Color.CYAN);
        g2.fill(thirdCircle);
        
        Ellipse2D.Double fourthCircle = new Ellipse2D.Double(xLeft+60, yTop+60,
                                            80, 80);
        g2.setColor(Color.RED);
        g2.fill(fourthCircle);
        
        Ellipse2D.Double finalCircle = new Ellipse2D.Double(xLeft+80, yTop+80,
                                           40, 40);
        g2.setColor(Color.YELLOW);
        g2.fill(finalCircle);
        
        
        g2.draw(firstCircle);
        g2.draw(secondCircle);
        g2.draw(thirdCircle);
        g2.draw(fourthCircle);
        g2.draw(finalCircle);
    }
}

