package predicate;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

 class MayorQueCinco<E> implements Predicate<Integer> {

    @Override
    public boolean test(Integer v) {

        Integer five = 5;

        return v > five;
    }
}




public class EjemploPredicate2 {
   


  
  public static void main(String[] args) {

	  
	  Scanner sc = new Scanner(System.in);
	  
      MayorQueCinco <Integer> mqc = new MayorQueCinco <> ();
  	

      System.out.println("Escriba un número:");
      int n= sc.nextInt();
    	   
      if (mqc.test(n))
    	System.out.println("el número " + n +" es mayor que cinco");
      else
    	  System.out.println("el número " + n +" es menor que cinco");
		
      Predicate <Integer> mqn = (i) -> i<9;		
		Predicate <Integer> mAnd= mqn.and(mqc);
		
		if (mqn.test(n))
			System.out.println("el número " + n +" es mayor que 5 y menor que nueve");
		else 	
			System.out.println("el número " + n +" es menor que 5 y menor que nueve");
	    }
	    	    
    	    
    	    
    	
}
