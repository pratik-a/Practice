package collframewk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ListDemo5 
{
	public static void main(String[] argd)
	{
		List<Integer> values=new ArrayList<>();
		
		values.add(18);
		values.add(123);
		values.add(327);
		values.add(451);
		
		Collections.sort(values,(o1,o2)->
		{
			return o1%10>o2%10?1:-1;
		});
		
		for(int i: values)
		{
			System.out.println(i);
		}
	}
}
