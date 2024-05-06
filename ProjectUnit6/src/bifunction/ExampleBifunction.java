package bifunction;

import java.util.Scanner;
import java.util.function.BiFunction;

public class ExampleBifunction {

	public static void main(String[] args) {

		String String1, String2;

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Enter text");
		String1 = myScanner.nextLine();

		System.out.println("Introduce another String");
		String2 = myScanner.nextLine();

		BiFunction<String, String, String> bifuncion = (str1, str2) -> str1 + str2;

		System.out.println("The bifunction concat both strings: " + bifuncion.apply(String1, String2));

	}

}