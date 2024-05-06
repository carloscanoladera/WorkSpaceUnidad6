package fundamentosprogramacionfuncional;

public class ClaseAnonimaInterfaz {

	 interface ClaseAnonima {
		
	
		
		public void metodoNombre(String nombre) ;
			
				
		}
		
		
	    public static void main(String[] args) { 
		
		
	    	
	    	ClaseAnonima anon = new ClaseAnonima() {
	        @Override
	        public void metodoNombre(String nombre) {
	            
	        	System.out.println("Sobreescribiendo el método nombre anónimamente " + nombre);
	        }
	       
	        
	    };
	    
	    	anon.metodoNombre("Marta");
	    	
	    }
		
	}

