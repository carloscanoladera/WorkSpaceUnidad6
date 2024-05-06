/**
 * 
 */
package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**

 *
 */
public class EjemploConsumerConListas1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Consumer<Integer> consumer = i -> System.out.println("Consumer normal "+i*i);
		Consumer<Integer> consumerWithAndThen = consumer.andThen(i -> System.out.println("Consumer With and Then: (hemos imprimido el cuadrado de:" + i + ")"));
		
                consumer.accept(6);
                consumerWithAndThen.accept(6);
		//Usando expresiones lambda
		imprimirLista(lista, System.out::print);
		System.out.println("\n\n");
		//Solo utilizamos un "consumer"
		imprimirLista(lista, consumer);
		//Usamos dos consumers encadenados
		imprimirLista(lista, consumerWithAndThen);

	}
	
	public static void imprimirLista(List<Integer> l, Consumer<Integer> consumer) {
		for(Integer i : l)
			consumer.accept(i);
		System.out.println("");
	}

}
