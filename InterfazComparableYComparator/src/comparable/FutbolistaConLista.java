package comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FutbolistaConLista implements Comparable<FutbolistaConLista> {
private String nombre;
private String posicion;
private int calidad;

public FutbolistaConLista(String nombre, String posicion, int calidad) {
	this.nombre=nombre;
	this.posicion=posicion;
	
	this.calidad=calidad;
	
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public String getPosicion() {
	return posicion;
}



public void setPosicion(String posicion) {
	this.posicion = posicion;
}



public int getCalidad() {
	return calidad;
}



public void setCalidad(int calidad) {
	this.calidad = calidad;
}



public int compareTo(FutbolistaConLista o) {
	// TODO Auto-generated method stub
	
	
	
	 return (this.calidad > o.calidad)  ? 1 : ((this.calidad == o.calidad) ? 0: -1 );
         
	
}

public static void main(String[] args) {
	
    
        FutbolistaConLista f1 = new FutbolistaConLista("Peri", "Delantero",6);
    
	FutbolistaConLista f2 = new FutbolistaConLista("Jari", "Defensa",7);
        
        
        
        if (f1.compareTo(f2)>0) {
            
            System.out.println("futbolista " + f1.getNombre() + " es mejor que futbolista " + f2.getNombre());
            
        }
	
	 else if (f1.compareTo(f2)==0) {
            
             System.out.println(f1.getNombre()  +  " es igual de bueno que " + f2.getNombre());
            
        } else if (f1.compareTo(f2)==-1) {
            
             System.out.println(f1.getNombre()  +  " es peor que " + f2.getNombre());
            
        }
        
        
        List <FutbolistaConLista>  lista= new ArrayList<FutbolistaConLista>() ;
        
	lista.add(new FutbolistaConLista("Peri", "Delantero",8));
	
	lista.add(new FutbolistaConLista("Jari", "Defensa",6));
	
	lista.add(new FutbolistaConLista("Sori", "Medio",9));
	
	lista.add(new FutbolistaConLista("Tiri", "Lateral",5));
	
	
	
	if (lista.get(0).compareTo(lista.get(1))==1) {
		
		System.out.println(lista.get(0).getNombre() +  " es mejor que " + lista.get(1).getNombre());
		
	}
	System.out.println("Ordenamos Lista de futbolistas por calidad");
	
	lista.stream().
		  sorted().	
	      map(p->p.getNombre()).
	      forEach(System.out::println);
	
	
	System.out.println("Ordenamos Lista de futbolistas por Nombre");
		
	Comparator<FutbolistaConLista> interfazComparatorNombre = new Comparator<FutbolistaConLista> () { 
		
		@Override
		public int compare(FutbolistaConLista o1, FutbolistaConLista o2) {
			return o1.getNombre().compareTo(o2.getNombre());
		}
		
	};
	
	System.out.println("Ordenamos Lista de futbolistas por posicion");
	
	lista.stream().
	  sorted(new Comparator<FutbolistaConLista> () { 
			
			@Override
			public int compare(FutbolistaConLista o1, FutbolistaConLista o2) {
				return o1.getPosicion().compareTo(o2.getPosicion());
				
			}
			
		}).	
    map(p->p.getNombre()).
    forEach(System.out::println);
	
	lista.stream().
	  sorted(interfazComparatorNombre).	
  map(p->p.getNombre()).
  forEach(System.out::println);
	
}

}
