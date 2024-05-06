package composition;

import java.util.Scanner;
import java.util.function.Function;

public class ExampleCompositionAndThen {

	
	public static void main(String[] args) {
		
		Integer number1;
		Scanner myScanner = new Scanner(System.in);  
		
		
	    System.out.println("Enter an integer value");
	    number1 = myScanner.nextInt();
	    
	 
		
		Function<Integer, Integer> product = (value) -> value * 2;
		Function<Integer, Integer> add      = (value) -> value + 3;
	
		Function<Integer, Integer> ProductAndSum = product.andThen(add);
	
		Integer result1 = ProductAndSum.apply(number1);
		
		
		System.out.println("Ther resulta of multiplying by 2 and adding three to " + number1.toString() + " is " + result1);

	}
	
	
}
