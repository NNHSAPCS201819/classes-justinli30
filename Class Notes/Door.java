
/**
 * Write a description of class Door here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Door
{
    private boolean isOpened;
    private String name;
    
    public Door()
    {
        this.isOpened = false;
        this.name = "Front";
    }
    
    public Door(boolean isOpened, String name)
    {
        this.isOpened = isOpened;
        this.name = name;
    }
    
    public void open()
    {
        this.isOpened = true;
    }
    public void close()
    {
        this.isOpened = false;
    }
    public String getName()
    {
        return this.name;
    }
    public boolean getIfOpened()
    {
        return this.isOpened;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
}
