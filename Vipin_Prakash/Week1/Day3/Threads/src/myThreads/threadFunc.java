package myThreads;
class Task extends Thread{
	private int number;

	public Task(int number) {
		this.number = number;
	}
	public void run()
	{
		System.out.println("\ntask"+ number + "kicked off");
		for(int i=number*100;i<number*100+99;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\ntask"+ number + "done");
	}
}
//task1
class Task1 extends Thread {
	public void run()
	{
		System.out.println("\ntask1 kicked off");
		for(int i=101;i<200;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\ntask1 done");
	}
}

class Task3 extends Thread {
	public void run()
	{
		System.out.println("\ntask3 kicked off");
		for(int i=301;i<400;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\ntask3 done");
	}
}
class Task2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("\ntask2 kicked off");
		for(int i=201;i<300;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\ntask2 done");
	}
	
}