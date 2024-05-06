package fundamentosprogramacionfuncional;

public class ClaseBase {
	
	public ClaseBase (String nombre) {
		
		
	}
	
	public void metodoNombre(String nombre) {
		
		System.out.println("El nombre es:" + nombre);
	}
	
	
	
    public static void main(String[] args) { 
	
	
    	
    	ClaseBase anon = new ClaseBase("Marta") {
        @Override
        public void metodoNombre(String nombre) {
            
        	System.out.println("Sobreescribiendo el método nombre anónimamente" + nombre);
        }
       
        
    };
    
    	anon.metodoNombre("Marta");
    	
    }
	
}
