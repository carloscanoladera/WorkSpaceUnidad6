package composicion;
import java.util.Scanner;
import java.util.function.Function;

public class EjemploComposicionFunctionSumas {

	
	public static void main(String[] args) {
		
		Integer numero1;
		Scanner miScanner = new Scanner(System.in);  
		
		
	    System.out.println("Escriba un número entero");
	    numero1 = miScanner.nextInt();
	    
	 
		
		Function<Integer, Integer> multiplicar = (value) -> value * 2;
		Function<Integer, Integer> sumar      = (value) -> value + 3;
	
		Function<Integer, Integer> sumarYMultiplicar = multiplicar.compose(sumar);
	
		Integer result1 = sumarYMultiplicar.apply(3);
		
		
		Function<Integer, Integer> MultiplicarYSumar = sumar.compose(multiplicar);
		
		MultiplicarYSumar = multiplicar.andThen(sumar);
		
		System.out.println("El resultado de sumar 3 y multiplicar 2 a " + numero1.toString() + " es " + result1);

	}
	
	
}
