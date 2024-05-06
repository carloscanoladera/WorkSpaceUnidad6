package introduccionprogramacionfuncional;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

		String stringEjemplo = " Mi String como parametro ";

		Scanner sc = new Scanner(System.in);

		Function<Double, Double> cuadrado = (n) -> n*n;

		Function<Double, Double> sumarcinco = (n) -> n + 5;

		// da 30
		System.out.println(cuadrado.andThen(sumarcinco).apply(5.0));

		// da 100
		System.out.println(cuadrado.compose(sumarcinco).apply(5.0));

		Function<String, String> function1 = (s -> s.toUpperCase() + "  Function 1 pasa a mayusculas.");

		System.out.println(" valor de function1  " + function1.apply(stringEjemplo));

		Function<String, String> function2 = (s -> s.trim() + " Function 2 elimina blancos.");
		System.out.println(" valor de function2  " + function2.apply(stringEjemplo));

		Function<String, String> function3 = function1.andThen(function2);
		System.out.println(" valor de function3  " + function3.apply(stringEjemplo));

		Function<String, String> function4 = function1.compose(function2);
		System.out.println(" valor de function4 " + function4.apply(stringEjemplo) + "function 1 pasa a mayusculas");

	}

}
