package fundamentosprogramacionfuncional;

import java.util.function.Function;

class Persona2 implements Comparable<Persona2> {

		private String dni;
		private String nombre;
		private String apellidos;
		
		
		public Persona2() { }
		
		
		public Persona2 cambiaDni(String dni) {
			
			this.dni=dni;
			return this;
			
		}
		
		
	public Persona2 cambiaNombre(String Nombre) {
			
			this.nombre=Nombre;
			return this;
			
		}
	
	
	public Persona2 cambiaApellidos(String Apellidos) {
		
		this.apellidos=Apellidos;
		return this;
		
	}
	
	
	public void accionMostrarPorPantalla() {
		
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
			
	}
		

	
	
	public int compareTo(Function<Persona2,Integer> compara) {
		// TODO Auto-generated method stub
		return compara.apply(this);
	}

	
	@Override
	public int compareTo(Persona2 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	   
	   
	   }
	   
	   
	 public class CreaPersonasFuncionalCompare {
		   
		   public CreaPersonasFuncionalCompare() {
			   
			   
		   }
		   
		   
		   public static Persona2 getPersonas() {
			   
			   return new Persona2() ;
			   
		   }
		   
	
	
	   public static void main(String[] args) { 
		   
		   
		 
		   
		   
		   Persona2 p1 =  CreaPersonasFuncionalCompare.getPersonas().
				   cambiaDni("3342432")
				   .cambiaNombre("Julian")
				   .cambiaApellidos("Lopez");
		   
		   Persona2 p2 =  CreaPersonasFuncionalCompare.getPersonas().
				   cambiaDni("3342436L")
				   .cambiaNombre("Luis")
				   .cambiaApellidos("marquez");
				   
		   //
		   
		   System.out.println("Ahora cambiamos el comportamiento para ordenar por Nombre");
		   
		   if ( p1.compareTo((p)->p.getNombre().compareTo(p2.getNombre()))==1)  {
			   
			   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "
			   		+ p1.toString() + " Es mayor que "+ p2.toString());
			   	
			   
		   } else   
		   
		   if ( p1.compareTo((p)->p.getNombre().compareTo(p2.getNombre()))==0)  {
			   
			   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "
			   		+ p1.toString() + " Es igual que "+ p2.toString());
			   	
			   
		  		   	
			   
		   } else {
			   
			   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "
				   		+ p1.toString() + " Es menor que "+ p2.toString());
			   
		   }
			   
			   
		   System.out.println("Ahora cambiamos el comportamiento para ordenar por DNI");
		   
		   
		   if ( p1.compareTo((p)->p.getDni().compareTo(p2.getDni()))==1)  {
		   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "
				   		+ " para que compare por dni" +
						  p1.toString() + " Es mayor que "+ p2.toString());

		   
		   } else   if ( p1.compareTo((p)->p.getDni().compareTo(p2.getDni()))==0) {
			   
			   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "+ 
			   " para que compare por dni" +
				  p1.toString() + " Es igual que "+ p2.toString());
			   
		   } else {
			   
			   System.out.println(" hemos cambiado el comportamiento de el Compare con una expresion lambda\n "+ 
					   " para que compare por dni" +
						  p1.toString() + " Es menor que "+ p2.toString());
		   }
		   
		   
	   }


	 }

