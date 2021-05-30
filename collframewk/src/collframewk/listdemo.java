package collframewk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listdemo 
{
	public static void main(String[] args) throws Exception
	{
		List<Integer> values=new ArrayList<Integer>();
		values.add(20);
		values.add(3);
		values.add(40);
		values.add(5);
		values.add(6);
		values.add(70);
				
		values.remove(3);
		values.remove(4);
		
		values.add(1,22);
		values.add(4,55);
		
		values.forEach(System.out::println);
		
		Collections.sort(values);
		
		for(Integer i : values)
		{
			System.out.println(i);
		}
	}
}
