package collframewk;

import java.util.*;

public class listDemo1 
{
	public static void main(String[] argd)
	{
		List<Integer> values=new ArrayList<>();
		
		values.add(11);
		values.add(123);
		values.add(321);
		values.add(451);
		
		Collections.sort(values);
		Collections.reverse(values);
		
		for(int i: values)
		{
			System.out.println(i);
		}
		
		System.out.println("**********");
				
		values.add(51);
		values.add(723);
		values.add(421);
		values.add(951);
		
		Comparator<Integer> com =new CompImpl();
		Collections.sort(values,com);
		
		for(int i: values)
		{
			System.out.println(i);
		}
	}
}
