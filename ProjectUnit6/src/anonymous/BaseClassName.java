package anonymous;
public class BaseClassName {
	
		
		
		public BaseClassName () {
			
			
		}
		
		public void methodName(String nombre) {
			
			System.out.println("Named class created: " + nombre);	
		}
		
		
		
	    public static void main(String[] args) { 
		
		
	    	BaseClassName objetoNormal = new BaseClassName();
	    	
	    	objetoNormal.methodName("Betty");
	    	
	    	BaseClassName anon = new BaseClassName() {
	        @Override
	        public void methodName(String name) {
	            
	        	System.out.println("Overriden anonymous class:" + name);
	        }
	       
	        
	    };
	    
	    	anon.methodName("Mildred");
	    	
	    }
		
	}

