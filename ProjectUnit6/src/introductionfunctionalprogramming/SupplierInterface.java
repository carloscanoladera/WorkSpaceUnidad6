package introductionfunctionalprogramming;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierInterface {
	
private static int i=0;	
	public static void main(String[] args) {
		
		final Scanner sc = new Scanner(System.in);
		
	
		
		Supplier<String> supNombre = ()->{
				
				i=5;
				System.out.println("Would you mind to introduce your name?");
				return sc.nextLine();

				
				
		};
		
		
		System.out.println("Name introduced by the user: " +supNombre.get());
		
		
		Supplier<Integer> supRandom = () -> new Random().nextInt(20);
		
		
			System.out.println("Generates a random number: " +supRandom.get());
	}

}
