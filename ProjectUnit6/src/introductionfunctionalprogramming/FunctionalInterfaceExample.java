package introductionfunctionalprogramming;

public class FunctionalInterfaceExample {

	@FunctionalInterface
	interface MyFirstFunctionalInterface {

		double operation(double a, double b);

		default double identity(double num) {

			return num;
		}

		public static int transformaAInteger(double num) {

			return (int) num;
		}

	}

	public static void main(String[] args) {

		MyFirstFunctionalInterface varFunctionalSum = new MyFirstFunctionalInterface() {

			@Override
			public double operation(double a, double b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		System.out.println("The defined operation in the interface is the sum:" + varFunctionalSum.operation(5, 7));

		MyFirstFunctionalInterface varFunctionalProduct = (x, y) -> x * y;

		System.out.println("The lambda expression defines as operation a product and the outcome of applying it is:"
				+ varFunctionalProduct.operation(5, 7));
		
		MyFirstFunctionalInterface varFunctionalblock = (x,y)->  { x=2*x ; return x*y; };

	}

}
