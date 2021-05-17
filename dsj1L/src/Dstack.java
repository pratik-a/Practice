/**
 * 
 */
/**
 * @author PRATIK AWASTHI
 *
 */
class DStack
{
	Node head ;
	int top=0;
	
	void push(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=new Node();
			n=head;
			
			while(n.next!=null)
			{
				n=n.next;
			}
			
			n.next=node;
		}
		top++;
	}
	
	
	
	void pop()
	{
		Node n=new Node();
		n=head;
		Node n1=new Node();
		while(n.next!=null)
		{
			n1=n;
			n=n.next;
		}
		n1.next=null;
		top--;
	}
	
	
	
	int peek()
	{
		Node n=new Node();
		n=head;
		
		while(n.next!=null)
		{
			n=n.next;
		}
		
		return n.data;
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
		Node n=new Node();
		n=head;
		
		while(n.next!=null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print(n.data);
		
		System.out.println("\n");
	}
}

