package paradigmaprogramacionfuncional;

public class ObjetoInmutablePersona {
	
	private String nombre="";
	private String apellidos="";
	private int edad=0;
	
	
	public ObjetoInmutablePersona() {
	
	}
	
	public ObjetoInmutablePersona(String nombre, String apellidos, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	
	
	
	
	@Override
	public String toString() {
		return "ObjetoInmutablePersona [nombre=" + nombre + ", lastName=" + apellidos + ", age=" + edad + "]";
	}

	public static void main(String[] args) {
		
		
		ObjetoInmutablePersona person = new ObjetoInmutablePersona("John","Doe", 40);
		
		System.out.println("Nombre completo de la persona:"+ person.getNombre() + " " + person.getApellidos());
		
		
		
	}
}
