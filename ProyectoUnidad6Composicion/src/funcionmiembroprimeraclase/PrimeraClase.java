package funcionmiembroprimeraclase;

import java.util.Scanner;
import java.util.function.Function;

public class PrimeraClase {
	
  public static Double formulaPotencia4(Double x) {
		

		
		return x*x*x*x;
		
	}
	
	
	public Double funcionFormula(Double x, Function<Double,Double> formula) {
	
		  
		  Function<Double,Double> variableFuncionThis = this::formulaCubo;
		
		return formula.apply(x);
	}

	
	public Double formulaCuadrado(Double x) {
		
		return x*x;
		
	}
	
	public Double formulaCubo(Double x) {
		
		return x*x*x;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero por pantalla");
		
		Double numero = sc.nextDouble();
		PrimeraClase objeto = new PrimeraClase();
		
		Function<Double,Double> variableFuncion = objeto::formulaCubo;
		Function<Double,Double> variableFuncionEstatica = PrimeraClase::formulaPotencia4;
		
		Double resultado = objeto.funcionFormula(numero, objeto::formulaCuadrado);
		
		System.out.println("Aplicamos la formula del cuadrado con resultado " + resultado);
		
		resultado = objeto.funcionFormula(numero, objeto::formulaCubo);		
		
		System.out.println("Aplicamos la formula del cubo con resultado " + resultado);
		
		resultado = objeto.funcionFormula(numero, x->x*x*x*x);		
		
		System.out.println("Aplicamos la formula de potencia 4 con resultado " + resultado);
		
	}
	
}
