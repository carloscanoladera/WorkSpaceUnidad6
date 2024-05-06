package composition;

import java.util.Scanner;
import java.util.function.Function;

public class ExampleCompositionFunctionCompose {

	public static void main(String[] args) {

		Integer number;
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter a number");
		number = myScanner.nextInt();

		Function<Integer, Integer> product = (value) -> value * 2;
		Function<Integer, Integer> addition = (value) -> value + 3;

		Function<Integer, Integer> addingAndMultiplying = product.compose(addition);

		Integer result1 = addingAndMultiplying.apply(number);

		System.out.println(
				"The result of adding two and multiplying by three is " + number.toString() 
				+ "is " + result1);

	}

}
