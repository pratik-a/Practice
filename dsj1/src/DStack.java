/**
 * 
 */
/**
 * @author PRATIK AWASTHI
 *
 */
class DStack
{
	int capacity=2;
	int stack[] =new int[capacity];
	int top=0;
	
	void push(int data)
	{
		if(top==capacity)
		{
			expand();
		}
		
			stack[top]=data;
			top++;
	}
	
	void expand()
	{
		int length=stack.length;
		
		int nStack[]=new int[2*capacity];
		System.arraycopy(stack, 0, nStack, 0, top);
		stack=nStack;
		capacity*=2;
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
			shrink();
		}
	}
	
	void shrink()
	{
		int length=stack.length;
		if(top<=(capacity/2))
		{
			capacity=capacity/2;
		}
		int nStack[]=new int[capacity];
		System.arraycopy(stack, 0, nStack, 0, top);
		stack=nStack;
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
		System.out.println("\n");
	}
}

