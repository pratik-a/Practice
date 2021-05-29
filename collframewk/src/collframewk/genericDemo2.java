package collframewk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class genericDemo2 
{
	public static void main(String[] args)
	{
		Collection values=new ArrayList<>();
		
		values.add(2);
		values.add("Pratik");
		values.add(65.2f);
		
		Iterator i= values.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("*******");
		values.forEach(System.out::println);
		System.out.println("*******");
		
		Collection<Integer> data=new ArrayList<>();
		
		data.add(4);
		data.add(5);
		
		System.out.println("*******");
		data.forEach(System.out::println);
		System.out.println("*******");
		for(Integer j : data)
		{
			System.out.println(j);
		}
	}
}
