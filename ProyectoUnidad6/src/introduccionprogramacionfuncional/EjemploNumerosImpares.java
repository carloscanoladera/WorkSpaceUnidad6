package introduccionprogramacionfuncional;
public class EjemploNumerosImpares {
	
	@FunctionalInterface
	interface NumerosImpares {
		
		void muestraNumerosImpares(int n);
		
	}

	
	
	public static void main(String[] args) {
		

		NumerosImpares evenLambda = (n) -> {
			
			for (int i=0; i<=n ; i++) {
				
				if (i%2==0)
					System.out.println("El número " + i + " es impar.");
				
			}
			
			
		};
		
		
		evenLambda.muestraNumerosImpares(10);
		
	}
	
	

}

