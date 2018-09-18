
/**
 * @author justinli30
 * @version 9/18/18
 */
public class VendingMachine
{
    private int numCans;
    private int numTokens;
    
    public VendingMachine()
    {
        this.numCans = 10;
        this.numTokens = 0;
    }
    public VendingMachine(int canNum)
    {
        this.numCans = canNum;
        this.numTokens = 0;
    }
    public void insertToken()
    {
        this.numTokens += 1;
        this.numCans -= 1;
    }
    public void fillUp(int cans)
    {
        this.numCans += cans;
    }
    public int getNumCans()
    {
        return this.numCans;
    }
    public int getNumTokens()
    {
        return this.numTokens;
    }
}
