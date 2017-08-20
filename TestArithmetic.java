
/**
 * Testing the amount of valve using isCeiling() method.
 *
 * @author (Muhammad Ameer Faisal)
 * @version (20/08/2017)
 */
public class TestArithmetic
{
    /**
     * Constructor for objects of class TestArithmetic
     */
    public TestArithmetic()
    {
    }
    
    public static void main(String[] args)
    {
        int limit = 100;
        //int amt = 300;
        int amt = 99;
        Arithmetic atc = new Arithmetic(limit);
        try{
            atc.isCeiling(amt);
            System.out.println("Valve is ok");
            }  
        catch (ArithmeticException ex)
        {
            System.err.print(ex);
        }
    }
        
}
