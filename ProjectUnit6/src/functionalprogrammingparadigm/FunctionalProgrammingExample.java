package functionalprogrammingparadigm;

import java.util.Scanner;

public class FunctionalProgrammingExample {

	public static double cube(double x) {

		return x * x * x;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to raise it to 3: ");

		double number = sc.nextInt();

		// Imperative solution
		double result = number * number * number;
		System.out.println("The " + number + " cubed is:  " + result);

		// Declarative and functional solution
		System.out.println("The number " + number + " cubed is: " + FunctionalProgrammingExample.cube(number));

	}

}
