package fundamentosprogramacionfuncional;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncionOrdenSuperior {
	
	public Supplier<Double> funcionOrdenSuperiorFunction(Supplier<Double> numero, Function<Double,Double> funcion) {
		
		
		return ( ()->funcion.apply(numero.get()));
		
	}
	
	

	
	  public static void main(String[] args) { 
		  
		  
		  Scanner miScanner = new Scanner(System.in);  
		  
		  System.out.println("Escriba un número decimal");
		   
		  Double numero1 = miScanner.nextDouble();
		
		  FuncionOrdenSuperior funcionOrdenSuperior = new FuncionOrdenSuperior() ;
		  
		  
		  Supplier<Double> numero= funcionOrdenSuperior.funcionOrdenSuperiorFunction(()-> numero1 ,(x)->x*x);
		  
		  System.out.println("Resultado funcion funcionOrdenSuperiorFunction que calcula el cuadrado " + numero.get());
		  
		
		  
	  
	  }

}
