package introductionfunctionalprogramming;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

		String stringExample = " My String as a parameter ";

		Scanner sc = new Scanner(System.in);

		Function<Integer, Double> squareRoot  = (n) -> Math.sqrt(n);

		System.out.println(" The square root of 25 is: " + squareRoot.apply(25));

		Function<String, String> function1 = (s -> s.toUpperCase() + "  Function 1 convert to uppercase");

		System.out.println(" value of function1  " + function1.apply(stringExample));

		Function<String, String> function2 = (s -> s.trim() + " Function 2 erases blanks.");
		System.out.println(" value of function2  " + function2.apply(stringExample));

		Function<String, String> function3 = function1.andThen(function2);
		System.out.println(" value of function3  " + function3.apply(stringExample));

		Function<String, String> function4 = function1.compose(function2);
		System.out.println(" value of function4 " + function4.apply(stringExample));

	}

}
