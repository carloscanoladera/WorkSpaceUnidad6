package introductionfunctionalprogramming;

import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveTypeSpecialization {

	public static void main(String[] args) {

		Scanner miScanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number1 = miScanner.nextInt();

		IntFunction<String> convertFromInttoString = (i) -> String.valueOf(i);

		ToIntFunction<String> convertFromStringtoInt = (s -> Integer.valueOf(s));

		IntToDoubleFunction convertdeIntaDouble = (i -> Double.valueOf(i));

		String string = convertFromInttoString.apply(number1);

		System.out.println("Convert from primitive type int  " + number1 + " to String " + string);

		int number2 = convertFromStringtoInt.applyAsInt(string);

		System.out.println("Convert from String  " + string + " to primitive type int " + number2);

		Double decimalnumber = convertdeIntaDouble.applyAsDouble(number1);

		System.out.println("Convert from int " + number1 + " to double " + decimalnumber);

	}

}
