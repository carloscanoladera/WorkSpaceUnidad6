package bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ExampleBifunctionPure {

	public Supplier<Double> PureFunctionBifunction(Supplier<Integer> num1, Supplier<Integer> num2,
			BiFunction<Integer, Integer, Double> funcion) {

		return (() -> funcion.apply(num1.get(), num2.get()));

	}

	public static void main(String[] args) {

		Integer number1, number2;

		ExampleBifunctionPure example = new ExampleBifunctionPure();
		Scanner miScanner = new Scanner(System.in);

		System.out.println("Enter an integer number");
		number1 = miScanner.nextInt();

		System.out.println("Enter another integer");
		number2 = miScanner.nextInt();

		Supplier<Double> result =

				example.PureFunctionBifunction(() -> number1, () -> number2,
						(num1, num2) -> Double.valueOf(num1) / Double.valueOf(num2));

		System.out.println("The outcome is a real number" + result.get());

	}

}
