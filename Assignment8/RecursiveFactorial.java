
/**
 * Two implementations of the factorial function.
 * This is just a place holder class for the two functions
 * 
 * @author Charle's Hoot 
 * @version 4.0
 */
public class RecursiveFactorial
{

    /**
     * The basic recursive factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long basic(long n)
    {
        long result = 1;
        if (n > 1) 
            result = n*basic(n-1);
        
        return result;
    }
    
    
    
    /**
     * The tail recursive version of factorial.
     * 
     * @param  n   The number to compute factorial of.
     * @return     n factorial.
     */
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING THE RECURSIVE HELPER FUNCTION
        // AND RETURN SOMETHING APPROPRIATE
    	return helper(n,1);        //calling tail recursion
    }

    /**
     * The tail recursive helper function for factorial. 
     * 
     * @param  n   The number to compute factorial of.
     * @param  partial   The partial result that is being built up.
     * @return     n factorial.
     */

    private long helper(long n, long partial)
    {
        long result = 0;
        // IMPLEMENT THIS TAIL RECURSIVE METHOD
      
        if(n<=1)              //if n=...-3,-2,-1,0,1
    	   return partial;                  //return partial, base condition for the exit 
       else
    	  return  helper(n-1,n*partial);    //recursive call to tail function
    }



}
