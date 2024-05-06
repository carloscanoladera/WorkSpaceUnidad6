package paradigmaprogramacionfuncional;

import java.util.Scanner;
import java.util.function.Function;


public class FuncionPrimeraClaseEjemplo{

	
	
	public Double funcionFormula(Double x, Function<Double,Double> formula) {
	
		
		
		return formula.apply(x);
	}

	
	public Double formulaCuadrado(Double x) {
		
		return x*x;
		
	}
	
	public Double formulaCubo(Double x) {
		
		return x*x*x;
		
	}
	


public static Double formulaRaizCuadrada(Double x) {
		
		return Math.sqrt(x);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un n�mero en la consola");
		
		Double numero = sc.nextDouble();
		FuncionPrimeraClaseEjemplo objeto = new FuncionPrimeraClaseEjemplo();
		
		
		
		Double result = objeto.funcionFormula(numero, objeto::formulaCuadrado);
		
		System.out.println("Calculamos el cuadrado del n�mero  " + result);

		Function<Double,Double> formulaVar = objeto::formulaCuadrado;
		
		result = objeto.funcionFormula(numero, objeto::formulaCubo);		
		
		System.out.println("Calculamos el cubo del n�mero: " + result);
		
		result = objeto.funcionFormula(numero, x->x*x*x*x);		
		
		System.out.println("Calculamos la cuarta potencia del n�mero: " + result);

		result = objeto.funcionFormula(numero, FuncionPrimeraClaseEjemplo::formulaRaizCuadrada);		
		
	System.out.println("Calculamos la raiz cuadrada del n�mero: " + result);
		
	}
	
}

