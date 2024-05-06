package introduccionprogramacionfuncional;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String[] args) {
	
	Consumer<Integer> consumer = i -> System.out.println("Consumer 1 hace una operación " + +i*i);
	Consumer<Integer> consumerWithAndThen =
			consumer
			.andThen(i -> System.out.println("Consumer With and Then: Explica la operación anterior, el cuadrado de :" + i ));

	System.out.println("Ejecutamos el primer Consumer");
	consumer.accept(7);
	System.out.println("Ejecutamos el consumer compuesto que ejecutará los dos uno detras de otro");
	consumerWithAndThen.accept(6);

	
	
	Consumer<Integer> consumer3 = new Consumer<Integer> () {

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			
			System.out.println("Consumer anónimo");
			
		}
		
		
		
	};
	
	}

}

