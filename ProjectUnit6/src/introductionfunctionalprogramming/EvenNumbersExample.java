package introductionfunctionalprogramming;

public class EvenNumbersExample {

	public static void main(String[] args) {

		Numbers evenLambda = (n) -> {

			for (int i = 0; i <= n; i++) {

				if (i % 2 == 0)
					System.out.println("The number " + i + " is even.");

			}

		};
		

		
		evenLambda.unaryoperations(10);

	}

}
