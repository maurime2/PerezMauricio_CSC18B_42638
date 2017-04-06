/*
    **************************************
    fact(10,000) - Dont use a recursive algorithm
    **************************************	
            int fact(int n)
            {
            double result = 1.0;
            if (n<0) result = -1.0;
         /* if (n==0 || n==1) result =1.0; //NOT USED
        
            for(int i=2, i<=n, i++)
                    {
                            result *=i;
                    }
            return result;
            }

*/


//libraries
package factorialwithbiginteger;

//Import Libraries
import java.math.BigInteger;

public class Factorialwithbiginteger {
    
    //Execute BigInteger
    public static BigInteger fact(int n)
    {
        BigInteger result = BigInteger.ONE;
        if (n<0) result = result.negate(); //MEMBER FUNCTION of Subtract
        for(int i=2; i<=n; i++)
            result = result.multiply(BigInteger.valueOf(i));
            
        //Exit BigInteger
        return result;
    }
    
    
    //Execute Main Program
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The factorial of 10,000 is: "+fact(100000));
    }
    
}
