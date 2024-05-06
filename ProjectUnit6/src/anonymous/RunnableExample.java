package anonymous;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable thread = new Runnable() {
		      @Override
		      public void run(){
		        System.out.println("Anonymous thread");
		      }
		   };


		   Runnable threadLambda = () -> System.out.println("Anonymous thread");
		   
		  new Thread(threadLambda);
		   
	}

}
