package functionalprogrammingparadigm;

import java.util.Scanner;
import java.util.function.Function;

public class FirstClassMemberExample {

	public Double functionFormula(Double x, Function<Double, Double> formula) {

		return formula.apply(x);
	}

	public Double formulaSquare(Double x) {

		return x * x;

	}

	public Double formulaCube(Double x) {

		return x * x * x;

	}

	public static Double formulaSquareRoot(Double x) {

		return Math.sqrt(x);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		Double number = sc.nextDouble();
		FirstClassMemberExample object = new FirstClassMemberExample();

		Double result = object.functionFormula(number, object::formulaSquare);

		System.out.println("The square of the number is:  " + result);

		Function<Double, Double> formulaVar = object::formulaSquare;

		result = object.functionFormula(number, object::formulaCube);

		System.out.println("The cube of the number is: " + result);

		result = object.functionFormula(number, x -> x * x * x * x);

		System.out.println("The number raise to four: " + result);

		result = object.functionFormula(number, FirstClassMemberExample::formulaSquareRoot);

		System.out.println("The square root of the number: " + result);

	}

}
