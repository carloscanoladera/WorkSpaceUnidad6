package composition;

import java.util.Scanner;
import java.util.function.Predicate;

public class ExampleCompositionPredicateAnd {

	public static void main(String[] args) {

		Predicate<Integer> divisibleByTwo = (i) -> i % 2 == 0;
		Predicate<Integer> divisibleByThree = (i) -> i % 3 == 0;

		Predicate<Integer> compositionAnd = divisibleByTwo.and(divisibleByThree);

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter an integer number");
		Integer number = myScanner.nextInt();

		if (divisibleByTwo.test(number))
			System.out.println("The number " + number + " is divisible by two");

		if (divisibleByThree.test(number))
			System.out.println("The number " + number + " is divisible by three");

		if (compositionAnd.test(number))
			System.out.println("The number " + number + " is divisible by two and three");

	}

}
