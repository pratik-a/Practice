package dsjL2;

public class Queuel 
{
	Node head;
		int front=0,rear=0,size=0;
		
		public void enqueue(int data)
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
			size++;
		}
		
		public int dequeue()
		{
			int data=head.data;
			if(head.data!=0)
			{
				head=head.next;
				size--;
			}
			else
			{
				System.out.println("queue is empty");
			}
			return data;
			
		}
		
		public int getsize()
		{
			return size;
		}
		
		public boolean isempty()
		{
			return getsize()==0;
		}
		
		public boolean isfull()
		{
			return getsize()==5;
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
