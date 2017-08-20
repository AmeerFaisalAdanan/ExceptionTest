public class Arithmetic
{
    /**
     * Constructor for objects of class Arithmetic
     */
    public int limit;
    public int amt;
    
    
    public Arithmetic(int newlimit)
    {
        limit = newlimit;
   
    }
    
    public boolean isCeiling(int newamt) throws ArithmeticException
    {        
        amt = newamt;
        //ArithmeticException atc = new ArithmeticException();
        if (amt > limit)
        {
            //return false;
            throw new ArithmeticException("Temperature "+amt+" Exceed Limit");
        }
        else
        {
            return true;
        }
    }
}
