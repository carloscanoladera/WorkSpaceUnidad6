package unaryoperator;

import java.util.function.UnaryOperator; 

public class Identity { 
    public static void main(String args[]) 
    { 
          
        UnaryOperator<Boolean> 
            op = UnaryOperator.identity(); 
 
        System.out.println("returns the same:" + op.apply(true)); 
        
        
        
    } 
}
