package paradigmaprogramacionfuncional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FuncionOrdenSuperiorEjemplo {

	
		public Supplier<Double> funcionOrdenSuperior(Supplier<Double> number, Function<Double,Double> function) {
			
			
			return ( ()->function.apply(number.get()));
			
		}
		
				
		  public static void main(String[] args) { 
			  
			  
			  Scanner miScanner = new Scanner(System.in);  
			  
			  System.out.println("Introduce un número decimal");
			   
			  Double numero1 = miScanner.nextDouble();
			
			  FuncionOrdenSuperiorEjemplo highOrder = new FuncionOrdenSuperiorEjemplo() ;
			  
			  
			  Supplier<Double> supplierNumerico= highOrder.funcionOrdenSuperior(()-> numero1 ,(x)->x*x);
			  
			  System.out.println(" Función de orden superior que retorna un supplier " + supplierNumerico.get());
			  
			
			  System.out.println(" Función de orden superior que retorna un supplier directamente" 
			  +  highOrder.funcionOrdenSuperior(()-> numero1 ,(x)->x*x).get());
		  
		  }

	}
