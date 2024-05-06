package introductionfunctionalprogramming;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {

		UnaryOperator<Long> factorial = (n) -> {

			Long res = 1L;
			for (int i = 1; i <= n; i++) {

				res = res * i;
			}

			return res;
		};

		System.out.println("The factorial of 5 is: " + factorial.apply(5L));

	}

}
