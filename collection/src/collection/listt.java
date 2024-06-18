package collection;

import java.util.ArrayList;
import java.util.List;

public class listt {
	
	public static void main(String [] args)
	{
		List<Comparable> l1 = new ArrayList<Comparable>() ;
		
		System.out.println("Size"+ l1.size());
		
		System.out.println("is empty " + l1.isEmpty());
		
		l1.add(11);
		
		l1.add("Abc");
		
		l1.add(55);
		
		//System.out.println("list is " + l1);
		
		//System.out.println("list contain " + l1.contains(5));
		
		//l1.remove(1); 
		
		//for int give the index no
		
		//for char give char in remove method
		
		l1.add(22);
		
		l1.forEach(k -> System.out.println(k));
		
//		System.out.println("list is :- " + l1);
		

		System.out.println("index 2  :- " + l1.get(2));  //get the index value in list
		
		l1.clear();
		

		System.out.println("list is " + l1);
		
	}
}
