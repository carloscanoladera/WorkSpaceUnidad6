package ejercicios;

import java.util.Comparator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> c = (n1,n2)-> (n1-n2)*-1;
		

		
		MiInterfazFuncional<Double> cuadrado = (n) ->n*n;
		
		System.out.println("El cuadrado de 5 es: "+ cuadrado.pruebaLambda(5.0));
		
		MiInterfazFuncional<Double> cubo = (n) ->n*n*n;
		
		System.out.println("El cubo de 5 es: "+ cubo.pruebaLambda(5.0));
		
		MiInterfazFuncional<Double> raizcuadrada = (n) ->Math.sqrt(n);
		
		System.out.println("La raiz de 100 es: "+ raizcuadrada.pruebaLambda(100.0));
		
		
		//// TRABAJAR EL EJERCICIO 1
		

	}

}
