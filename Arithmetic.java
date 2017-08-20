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
    
    public boolean isCeiling(int newamt)
    {        
        amt = newamt;
        //ArithmeticException atc = new ArithmeticException();
        if (amt > limit)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
