package tarea4;

import java.util.function.BiFunction;

public class Ejercicio6<T> {
	
	public T funcionOperacion(T opa, T opb, BiFunction<T,T,T> operacion) {
		
		
		return operacion.apply(opa, opb);
	}
	
	public static void main(String[] args) {
		
		
				
	}

}
