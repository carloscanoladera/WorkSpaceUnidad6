package ejercicios;
public class EjemploNumerospares {


	
	
	public static void main(String[] args) {
	

		Numeros numerosPares = (n) -> {
			
			int num= n.intValue();
			
			for (int i=0; i<=num ; i++) {
				
				if (i%2==0)
					System.out.println("El número " + i + " es par.");
				
			}
			
			
		};
		
		
		numerosPares.operacionesunarias(10);
		
	}
	
	

}
