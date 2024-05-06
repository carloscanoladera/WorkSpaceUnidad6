package anonimas;

import java.util.concurrent.ForkJoinPool;

public class InterfacesLegacy {

	public static void main(String[] args) {

		ForkJoinPool pool = ForkJoinPool.commonPool();

		Runnable thread = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hilo anónimo: ");
			}
		};

		Runnable threadLambda = () -> System.out.println("Hilo anónimo lambda: ");

		pool.execute(thread);

		pool.execute(() -> System.out.println("Hilo anónimo lambda: "));
		
		
		new Thread(thread).run();
		
		new Thread(threadLambda).run();

	}

}
