/**
 * 
 */
/**
 * @author PRATIK AWASTHI
 *
 */
class Stack
{
	int stack[] =new int[5];
	int top=0;
	
	void push(int data)
	{
		if(top==5)
		{
			System.out.println("stack is full");
		}
		else
		{
			stack[top]=data;
			top++;
		}
	}
	
	void pop()
	{
		if(top==0)
		{
			System.out.println("stack is epmty");
		}
		else
		{
			top--;
			stack[top]=0;
		}
	}
	
	int peek()
	{
		return stack[top-1];
	}
	
	void size()
	{
		System.out.println("size of stack is : "+top);
	}
	
	void isEmpty()
	{
		System.out.println("stack is empty : "+(top<=0));
	}
	
	void show()
	{
		for(int value : stack)
		{
			System.out.print(value+" ");
		}
	}
}