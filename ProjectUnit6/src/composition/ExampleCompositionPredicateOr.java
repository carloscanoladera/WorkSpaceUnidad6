package composition;

import java.util.Scanner;
import java.util.function.Predicate;

public class ExampleCompositionPredicateOr {

	public static void main(String[] args) {

		Predicate<Integer> divisibleByTwo = (i) -> i % 2 == 0;
		Predicate<Integer> divisibleByThree = (i) -> i % 3 == 0;

		Predicate<Integer> compositionOr = divisibleByTwo.or(divisibleByThree);

		Scanner miScanner = new Scanner(System.in);

		System.out.println("Enter an integer number");
		Integer numero = miScanner.nextInt();

		if (divisibleByTwo.test(numero))
			System.out.println("The number " + numero + " is divisible by two");
		if (divisibleByThree.test(numero))
			System.out.println("The number " + numero + " is divisible by three");

		if (compositionOr.test(numero))
			System.out.println("The number " + numero + " is divisible by two or three");

	}

}
