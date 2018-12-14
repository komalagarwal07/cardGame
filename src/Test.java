import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	//ExecuterService executer = Executor.
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 7; i++) {
			executor.submit(new Runnable() {
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println(Thread.currentThread().getName() + " : " + i);
					}
				}
			});
		}
		
		ExecutorService executor1 = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 7; i++) {
			executor1.submit(new Runnable() {
				public void run() {
					for (int i = 0; i < 5; i++) {
						System.out.println(Thread.currentThread().getName() + " : " + i);
					}
				}
			});
		}
		
	}

}
