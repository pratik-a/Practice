
public class LinkedList 
{
	Node head;
	
	public void insert(int data)
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
	}
	
	public void insertAtStart(int data)
	{
		Node node=new Node();
		
		node.data=data;
		node.next=head;
		
		head=node;
		
	}
	
	public void insertAt(int index,int data)
	{
		if(index==0)
		{
			insertAtStart(data);
		}
		else
		{
			Node node=new Node();
			node.data=data;
			node.next=null;
		
			Node n=new Node();
			n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
		
			node.next=n.next;
			n.next=node;
		}
	}
	
	public void delete()
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
	}
	
	public void insertAtStart()
	{
		head=head.next;
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			Node n=new Node();
			n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			Node n1=new Node();
			n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	public void show()
	{
		Node n=new Node();
		n=head;
		
		while(n.next!=null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print(n.data);
	}
	
}
