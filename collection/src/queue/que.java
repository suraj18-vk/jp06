package queue;

import java.util.*;

public class que
{
	
	public static void main(String [] args)
	{
		
		Queue <String> q = new LinkedList<>();
		
		q.add("Delhi");
		q.add("Haryana");
		q.add("Gujrat");
		
		q.remove();  //removes first element
		
		System.out.println(" peek elemnt is "+q.peek());
		System.out.println("Queue is " + q);
	}
	
	

}
