package collframewk;

class Container<T>
{
	T value;
	
	public void show()
	{
		System.out.println(value.getClass().getName());
	}

	public T getValue() 
	{
		return value;
	}

	public void setValue(T value) 
	{
		this.value = value;
	}
}

public class genericDemo1 
{
	public static void main(String[] args)
	{
		Container<String> obj=new Container<>();
		obj.value="hello";
		obj.show();
	}
}
