package introduccionprogramacionfuncional;
import java.util.function.BiFunction;

public class BifunctionInterfaceEjemplo {
	
	
	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Double> floatDiv = (a,b) -> (double) a/b;
		
		
		
		BiFunction <String, String, String > concatMayusculas = (s1,s2)-> (s1 +s2).toUpperCase();
		
		
		System.out.println ("Division decimal de 5 y 7:" + floatDiv.apply(5, 7));
		
		
		System.out.println ("concatMayusculas interface:" + concatMayusculas.apply("String 1", "String 2"));
		
		
		
		
		
	}

}
