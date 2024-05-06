package functionalprogrammingparadigm;

import java.util.function.Function;

public class HighOrderFunctionExample2 {

	public Function<Double, Double> composeSelectedFormulaAndRound(Function<Double, Double> function) {

		return function.andThen(HighOrderFunctionExample2::round);

	}

	public static Double squareRoot(Double a) {

		return Math.sqrt(a);
	}

	public static Double square(Double a) {

		return a * a;
	}

	public static double round(Double a) {

		return (double) Math.round(a);

	}

	public static void main(String[] args) {

		HighOrderFunctionExample2 objectHighOrder = new HighOrderFunctionExample2();

		Function<Double, Double> myFormula = objectHighOrder
				.composeSelectedFormulaAndRound(HighOrderFunctionExample2::square);

		System.out.println("The composed function computes the square of the number 24.2"				
		+ " and rounds: " + myFormula.apply(24.2));

	}

}
