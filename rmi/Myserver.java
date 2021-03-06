import java.rmi.*;
import java.rmi.registry.*;

public class Myserver
{
	public static void main(String args[])
	{
		try
		{
			Adder stub = new AdderRemote();
		Naming.rebind("rmi://localhost:5000/mcaiv",stub);
		}
		catch(Exception e)
		{
			System.out.println(e);;
		}
	}
	
}