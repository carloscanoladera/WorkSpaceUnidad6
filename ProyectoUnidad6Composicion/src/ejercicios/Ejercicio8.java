package ejercicios;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio8 {
	
	public static Double combina(BiFunction<Integer, Integer, Double> func1, BiFunction<Integer, Integer, Double> func2, Integer param1, Integer param2) {
		
		return 0.0;
	}
	
	public static Function<Integer, Double> combinaFunc(Function<Integer, Double> func1, Function<Integer, Double> func2) {
		
		return (n) -> Double.valueOf(n);
	}
	
	
	public static void main(String[] args) {
	}
}
