package introduccionprogramacionfuncional;
public class EjemploNumerospares {
	
	@FunctionalInterface
	interface Numerospares {
		
		public void muestraNumerospares(int n);
		
	}

	
	
	public static void main(String[] args) {
		

		Numerospares numerosPares = (n) -> {
			
			for (int i=0; i<=n ; i++) {
				
				if (i%2==0)
					System.out.println("El número " + i + " es par.");
				
			}
			
			
		};
		
		
		numerosPares.muestraNumerospares(10);
		
	}
	
	

}

