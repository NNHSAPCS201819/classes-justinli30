
/**
 * Write a description of class house here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class House
{
    private int houseX;
    private int houseY;
    /**
     * Default constructor for the House class. Sets the initial coordinates of the top left
     *      corner of the house to be (0,0).
     */
    public House()
    {
        houseX = 0;
        houseY = 0;
    }
    /**
     * Constructs a new House object with specified coordinates of the top left corner.
     * 
     * @param   x   the x-coordinate for the house
     * @param   y   the y-coordinate for the house
     */
    public House(int x, int y)
    {
        houseX = x;
        houseY = y;
    }
    /**
     * Sets the new coordinates for the house.
     * 
     * @param   newX    the new x-coordinate for the house
     * @param   newY    the new y-coordinate for the house
     */
    public void setHouseCoord(int newX, int newY)
    {
        houseX = newX;
        houseY = newY;
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //draw roof
        int[] xPoints = {houseX, houseX + 150, houseX+ + 300};
        int[] yPoints = {houseY + 70, houseY, houseY + 70}; 
        g2.setColor(Color.YELLOW.darker());
        g2.drawPolygon(xPoints, yPoints, 3); // found how to make polygon on javadoc
        g2.fillPolygon(xPoints, yPoints, 3);
        
        //draw house
        Rectangle2D.Double houseBody = new Rectangle2D.Double(houseX + 20, houseY + 71,
                                                              260, 150);
        g2.setColor(Color.ORANGE);
        g2.draw(houseBody);
        g2.fill(houseBody);
        
        //draw door
        Rectangle2D.Double door = new Rectangle2D.Double(houseX + 190, houseY + 120, 40, 80);
        g2.setColor(Color.RED.darker());
        g2.draw(door);
        g2.fill(door);
        Ellipse2D.Double doorknob = new Ellipse2D.Double(houseX + 215, houseY + 150, 10, 10);
        g2.setColor(Color.ORANGE.darker());
        g2.draw(doorknob);
        g2.fill(doorknob);
    }
}
