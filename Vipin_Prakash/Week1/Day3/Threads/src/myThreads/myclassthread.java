package myThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class myclassthread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Task1 o=new Task1();
		o.start();
		Task2 o1=new Task2();
		Thread task2thread = new Thread(o1);
		task2thread.start();
		o.join();
		task2thread.join();
		Task3 o3=new Task3();
		o3.start();*/
		//executer
		ExecutorService executorService= Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		
	}

}
