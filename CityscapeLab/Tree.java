
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
public class Tree
{
    private int treeX;
    private int treeY;
    private int tHeight;
    private int tWidth;
    
    /**
     * Default constructor for the House class. Sets the height and width of the
     *      the tree to be 100 and 30, respectively. Also sets coordinates of
     *      the tree to be (0,0).
     */
    public Tree()
    {
        treeX = 0;
        treeY= 0;
        tHeight = 100;
        tWidth = 30;
    }
    /**
     * Constructs a new Tree object with specified height and width.
     * 
     * @param   x   the x coordinate of bottom left of tree
     * @param   y   the y coordinate of bottom left of tree
     * @param   h   the height of the trunk of the tree
     * @param   w   the width of the trunk of the tree
     */
    public Tree(int x, int y, int h, int w)
    {
        treeX = x;
        treeY = y;
        tHeight = h;
        tWidth = w;
    }
    /**
     * Draws the scene.
     * 
     * @param   g2  the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double trunk = new Rectangle2D.Double(treeX, treeY, tWidth,
                                                          tHeight);
        Color brown = new Color(139, 69, 19);
        g2.setColor(brown);
        g2.draw(trunk);
        g2.fill(trunk);
        
        double widthMiddle = tWidth / 2; // calculates middle of trunk
        treeX += widthMiddle;
        double lDimen = tWidth * 5; // calculates dimensions of leaf
        double halfDimen = lDimen / 2.5; // calculates half of dimension
        double newX = treeX - halfDimen; // calculates x coord of leaf
        double heightMid = tHeight * (2/3);
        treeY -= heightMid;
        double newY = treeY - lDimen;
        Ellipse2D.Double leaf = new Ellipse2D.Double(newX, newY, lDimen, lDimen);
        g2.setColor(Color.GREEN);
        g2.draw(leaf);
        g2.fill(leaf);
    }
}
