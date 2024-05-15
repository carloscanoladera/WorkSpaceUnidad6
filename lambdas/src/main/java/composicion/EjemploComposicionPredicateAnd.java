package composicion;
import java.util.Scanner;
import java.util.function.Predicate;

public class EjemploComposicionPredicateAnd {

	
	
	
	public static void main(String[] args) {

	Predicate<Integer> divisiblePorDos = (i) -> i%2==0 ;
	Predicate<Integer> divisiblePorTres   = (i) -> i%3==0 ;

	Predicate<Integer> composicionAnd = divisiblePorDos.and(divisiblePorTres);
	Predicate<Integer> composicionOr = divisiblePorDos.or(divisiblePorTres);
	
	Scanner miScanner = new Scanner(System.in);  
	
	
    System.out.println("Escriba un número entero");
    Integer numero= miScanner.nextInt();
    
    if (divisiblePorDos.test(numero))
    	System.out.println("el numero" +numero + " es divisible por dos" );
    if (divisiblePorTres.test(numero))
    	System.out.println("el numero" + numero + " es divisible por tres" );
    
    
    if (composicionAnd.test(numero))
    	System.out.println("el numero" +numero + " es divisible por dos y por tres" );
   
    if (composicionOr.test(numero))
    	System.out.println("el numero" + numero + " es divisible por dos o por tres" );
    
	
	}

	
}
