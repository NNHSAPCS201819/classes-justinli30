

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    @Test
    public void testInsertToken()
    {
        VendingMachine coke = new VendingMachine();
        coke.insertToken();
        int tokenAmount = coke.getNumTokens();
        assertEquals(1, tokenAmount);
        int canAmount = coke.getNumCans();
        assertEquals(9, canAmount);
        
        coke.insertToken();
        tokenAmount = coke.getNumTokens();
        assertEquals(2, tokenAmount);
        canAmount = coke.getNumCans();
        assertEquals(8, canAmount);
    }
    @Test
    public void testFillUp()
    {
        VendingMachine coke1 = new VendingMachine();
        coke1.fillUp(5);
        int canAmount = coke1.getNumCans();
        assertEquals(15, canAmount);
        
        coke1.fillUp(15);
        canAmount = coke1.getNumCans();
        assertEquals(30, canAmount);
    }
}
