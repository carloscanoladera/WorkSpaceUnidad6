/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;


import java.util.Comparator;

/**
 *
 * @author carlo
 */


public class Futbolista2  {

      
    
private String nombre;
private String posicion;
private int calidad;

public Futbolista2(String nombre, String posicion, int calidad) {
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

 public static void main(String[] args) {
	

        Futbolista2 f1 = new Futbolista2("Peri", "Delantero",6);
    
	Futbolista2 f2 = new Futbolista2("Jari", "Defensa",7);
        
        Comparator<Futbolista2> comparador = new Comparator<Futbolista2> () {
            @Override
            public int compare(Futbolista2 o1, Futbolista2 o2) {
                 return (o1.getCalidad() > o2.getCalidad())  ? 1 : ((o1.getCalidad() == o2.getCalidad()) ? 0: -1 );
            }
       
                        
        };
        
        Comparator<Futbolista2> comparador2 = 
        		(fut1,fut2)-> (fut1.getCalidad() > fut2.getCalidad())  ? 1 
        				: ((fut1.getCalidad() == fut2.getCalidad()) ? 0: -1 );
        		
        
        //Hacer Comparator que compare por posicion
        
        //En persona hacer comparable que compare por nombre
         
        if (comparador.compare(f1,f2)>0) {
            
            System.out.println("futbolista " + f1.getNombre() + " es mejor que futbolista " + f2.getNombre());
            
        }
	
	 else if (comparador.compare(f1,f2)==0) {
            
             System.out.println(f1.getNombre()  +  " es igual de bueno que " + f2.getNombre());
            
        } else if (comparador.compare(f1,f2)==-1) {
            
             System.out.println(f1.getNombre()  +  " es peor que " + f2.getNombre());
            
        }
	
	
	}
 
  

}

