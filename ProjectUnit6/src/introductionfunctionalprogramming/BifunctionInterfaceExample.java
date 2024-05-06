package introductionfunctionalprogramming;

import java.util.function.BiFunction;

public class BifunctionInterfaceExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double> floatDiv = (a, b) -> (double) a / b;

		BiFunction<String, String, String> concatUppercase = (s1, s2) -> (s1 + s2).toUpperCase();

		System.out.println("Decimal division between 5 and 7:" + floatDiv.apply(5, 7));

		System.out.println("concatUpperCase interface:" + concatUppercase.apply("String 1", "String 2"));

	}

}
