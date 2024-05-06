package functionalprogrammingparadigm;

import java.util.Scanner;

public class Factorial {

	public static Long factorial(long n)
	{
	    if (n <= 1) // caso base 
	        return Long.valueOf(1);
	    else    
	        return n*factorial(n-1);    
	}

	
	public static void main(String[] args) {

	
		Scanner miScanner = new Scanner(System.in);  
		
		
	    System.out.println("Escriba un número entero");
	    Long numero1 = miScanner.nextLong();
	    
	    Long resultado = Factorial.factorial(numero1);
	    
	    
	    
	    System.out.println("El resultado del factorial de " + numero1 + " es: "+ resultado);
	    
	    
	}
	
}

