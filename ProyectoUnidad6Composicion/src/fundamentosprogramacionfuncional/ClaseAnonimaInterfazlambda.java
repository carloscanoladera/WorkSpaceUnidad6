package fundamentosprogramacionfuncional;

interface  ClaseAnonimaInterfazlambda {
	
	

	 interface ClaseAnonima {
		
	
		public void metodoNombre(String nombre) ;
			
				
		}
		
		
	    public static void main(String[] args) { 
		
	       
	    	
	    	ClaseAnonima anon = (nombre)->	
	    	System.out.println("Sobreescribiendo el m�todo nombre an�nimamente " + nombre);
	      
	    
	    	anon.metodoNombre("Marta");
	    	
	    }
		
	}

