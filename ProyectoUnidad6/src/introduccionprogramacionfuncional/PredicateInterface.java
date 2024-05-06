package introduccionprogramacionfuncional;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateInterface {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero");
		
		
		int numero = sc.nextInt();
		
		Predicate<Integer> mayorque10 = (n)-> n>10;
		
		
		System.out.println("¿Es el siguiente número  " + numero + " mayor que 10? "+ 
				mayorque10.test(numero));
		
		
		Predicate<Integer> menorque20 = (n)-> n<20;
		
		System.out.println("¿Es el siguiente número  " + numero + " menor que 20? "+ 
				menorque20.test(numero));
		
		
		
		Predicate<Integer> and = mayorque10.and(menorque20);
		
		System.out.println("¿Es el siguiente número  " + numero + " mayor que 10 "+ 
				 " y " + " menorque20? " + and.test(numero));
		

		Predicate<Integer> or = mayorque10.or(menorque20);
		
		
		System.out.println("¿Es el siguiente número " + numero + " mayor que 10 "+ 
				 " 0 " + " menor que 20? " + and.test(numero));

		
	}
	
	
}
