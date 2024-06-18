package synchro;

class incr
{
	int cnt;
	
	public synchronized void increment()
	{
		cnt++;
	}
}

public class synchroex
{

	public static void main(String []args) throws InterruptedException 
	{
		incr i = new incr();
		
		Thread t1 = new Thread(() ->
		
		{
			
			for(int j=0; j<1000; j++)
			{
				i.increment();
				
			}
			
		});
		
		Thread t2 = new Thread(() ->
		
		{
			for(int j=0; j<1000; j++)
			{
				i.increment();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		
		
		
		System.out.println(i.cnt);
	}
}
