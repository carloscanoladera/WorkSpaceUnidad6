package fundamentosprogramacionfuncional;


	   class Persona {

		private String dni;
		private String nombre;
		private String apellidos;
		
		
		public Persona() { }
		
		
		public Persona cambiaDni(String dni) {
			
			this.dni=dni;
			return this;
			
		}
		
		
	public Persona cambiaNombre(String Nombre) {
			
			this.nombre=Nombre;
			return this;
			
		}
	
	
	public Persona cambiaApellidos(String Apellidos) {
		
		this.apellidos=Apellidos;
		return this;
		
	}
	
	
	public void accionMostrarPorPantalla() {
		
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
			
	}
		
	   }
	   
	   
	 public class CreaPersonas {
		   
		   public CreaPersonas() {
			   
			   
		   }
		   
		   
		   public static Persona getPersonas() {
			   
			   return new Persona() ;
			   
		   }
		   
	
	
	   public static void main(String[] args) { 
		   
		   
		   CreaPersonas.getPersonas().
		   cambiaDni("3342432342")
		   .cambiaNombre("Julian")
		   .cambiaApellidos("Lopez")
		   .accionMostrarPorPantalla();
		   
	   }
	   }

