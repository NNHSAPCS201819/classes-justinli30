
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RectangleCalculator
{
    private int height;
    private int width;
    // int area = height * width;
    // int perimeter = 2 * (height + width);
    public RectangleCalculator(int height1, int width1)
    {
        this.height = height1;
        this.width = width1;
    }
    public double getArea()
    {
        double area = this.height * this.width;
        return area;
    }
    
}
