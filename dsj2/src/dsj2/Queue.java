/**
 * 
 */
/**
 * @author PRATIK AWASTHI
 *
 */
package dsj2;

public class Queue
{
	int queue[]=new int[5];
	int front=0,rear=0,size=0;
	
	public void enqueue(int data)
	{
		if(!isfull())
		{
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
		}
		else
		{
			System.out.println("queue is full");
		}
	}
	
	public int dequeue()
	{
		int data=queue[front];
		if(!isempty())
		{
			front=(front+1)%5;
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
		System.out.println();
		System.out.print("elements : ");
		for(int i=0;i<size;i++)
		{
			System.out.print(queue[(front+i)%5]+" ");
		}
	}
}