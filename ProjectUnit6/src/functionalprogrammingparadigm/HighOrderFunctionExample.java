package functionalprogrammingparadigm;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class HighOrderFunctionExample {

	
		public Supplier<Double> highOrderFunction(Supplier<Double> number, Function<Double,Double> function) {
			
			
			return ( ()->function.apply(number.get()));
			
		}
		
				
		  public static void main(String[] args) { 
			  
			  
			  Scanner myScanner = new Scanner(System.in);  
			  
			  System.out.println("Enter a decimal number");
			   
			  Double number1 = myScanner.nextDouble();
			
			  HighOrderFunctionExample highOrder = new HighOrderFunctionExample() ;
			  
			  
			  Supplier<Double> supplierNumerico= highOrder.highOrderFunction(()-> number1 ,(x)->x*x);
			  
			  System.out.println(" High Order function that returns a Supplier function" + supplierNumerico.get());
			  
			
			  System.out.println(" High Order function that returns a Supplier function directly" 
			  +  highOrder.highOrderFunction(()-> number1 ,(x)->x*x).get());
		  
		  }

	}
