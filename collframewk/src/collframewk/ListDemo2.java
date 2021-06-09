package collframewk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ListDemo2 
{
	public static void main(String[] argd)
	{
		List<Integer> values=new ArrayList<>();
		
		values.add(18);
		values.add(123);
		values.add(327);
		values.add(451);
		
		Comparator<Integer> com =new Comparator<>()
		{
			@Override
			public int compare(Integer o1,Integer o2)
			{
				if(o1%10>o2%10)
					return 1;
				return -1;
			}
		};
		
		Collections.sort(values,com);
		
		for(int i: values)
		{
			System.out.println(i);
		}
	}
}
