package introductionfunctionalprogramming;

public class EvenNumbersExample {

	@FunctionalInterface
	interface EvenNumbers {

		void showEvenNumbers(int n);

	}

	public static void main(String[] args) {

		EvenNumbers evenLambda = (n) -> {

			for (int i = 0; i <= n; i++) {

				if (i % 2 == 0)
					System.out.println("The number " + i + " is even.");

			}

		};

		evenLambda.showEvenNumbers(10);

	}

}
