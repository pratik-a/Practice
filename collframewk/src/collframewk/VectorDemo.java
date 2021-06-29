package collframewk;
import java.util.*;

public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		
		System.out.println("capacity : "+v.capacity());
		
		v.add(1);
		v.add(5);
		v.add(4);
		v.add(2);
		v.add(1);
		v.add(5);
		v.add(4);
		v.add(2);
		v.add(1);
		v.add(5);
		v.add(4);
		v.add(2);
		
		v.remove(3);
		v.remove(6);
		
		System.out.println("capacity : "+v.capacity());
		
		for(Object i : v)
		{
			System.out.println(i);
		}
		
		System.out.println("********");
		
		ArrayList a=new ArrayList();
		
		System.out.println("capacity : "+a.size());
		
		a.add(1);
		a.add(5);
		a.add(4);
		a.add(2);
		a.add(1);
		a.add(5);
		a.add(4);
		a.add(2);
		System.out.println("capacity : "+a.size());
		a.add(1);
		a.add(5);
		a.add(4);
		a.add(2);
		System.out.println("capacity : "+a.size());
		
		for(Object i : a)
		{
			System.out.println(i);
		}
		
	}
}
