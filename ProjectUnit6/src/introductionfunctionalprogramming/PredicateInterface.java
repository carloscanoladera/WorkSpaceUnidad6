package introductionfunctionalprogramming;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInterface {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number");
		
		
		int numero = sc.nextInt();
		
		Predicate<Integer> mayorque10 = (n)-> n>10;
		
		
		System.out.println("Is the number " + numero + " greater than 10? "+ 
				mayorque10.test(numero));
		
		
		Predicate<Integer> menorque20 = (n)-> n<20;
		
		System.out.println("Is the following number  " + numero + " less than 20? "+ 
				menorque20.test(numero));
		
		
		
		Predicate<Integer> and = mayorque10.and(menorque20);
		
		System.out.println("Is the following number  " + numero + " greater than 10 "+ 
				 " and " + " less than 20? " + and.test(numero));
		

		Predicate<Integer> or = mayorque10.or(menorque20);
		
		
		System.out.println("¿Is the following number " + numero + " greater than 10 "+ 
				 " or " + " less than 20? " + and.test(numero));

		
	}
	
	
}
