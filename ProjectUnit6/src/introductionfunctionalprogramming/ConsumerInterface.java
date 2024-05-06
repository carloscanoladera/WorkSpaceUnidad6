package introductionfunctionalprogramming;

import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {

		Consumer<Integer> consumer = i -> System.out.println("Consumer 1 compute an operation " + +i * i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out
				.println("Consumer With and Then: Explain the former operation, the square of two :" + i));

		System.out.println("First consumer is computed");
		consumer.accept(7);
		System.out.println("The composed comsumer(the second one) is executed");
		consumerWithAndThen.accept(6);

		Consumer<Integer> consumer3 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub

				System.out.println("Anonymous Consumer");

			}

		};

	}

}
