package collframewk;
import java.util.ArrayList;
import java.util.List;

public class genericDemo 
{
	public static void main(String[] args)
	{
		List<Integer> values=new ArrayList<>();
		
		values.add(2);
		values.add(4);
		
		//for(Integer i : values)
		{
			System.out.println(values);
		}
	}
}
