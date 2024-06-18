package synchnorization;

class counter
{
	private int count;
	
	public synchronized void increment()
	{
		count =count+1;
	}
	
	public int getcount()
	{
		return count;
	}
}

public class synchro {

	public static void main(String[] args)  throws InterruptedException{
		
		counter c = new counter();
		
		System.out.println(c.getcount());
		
		c.increment();
		
		Thread t1 = new Thread(() ->
		
		{
			System.out.println(c.getcount());
		});
		Thread t2 = new Thread(() ->
		
		{
			System.out.println(c.getcount());
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

	}

}
