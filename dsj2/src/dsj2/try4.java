package dsj2;

public class try4 
{
	public static void main(String[] args)
	{
		Queue q=new Queue();
		
		System.out.println("\nsize is : "+q.getsize());
		System.out.println("\nis queue empty : "+q.isempty());
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.show();
		
		System.out.println("\nis queue full : "+q.isfull());
		System.out.println("\nis queue empty : "+q.isempty());
		System.out.println("\nsize is : "+q.getsize());
		
		q.dequeue();
		q.dequeue();
		
		System.out.println("\nis queue full : "+q.isfull());
		System.out.println("\nsize is : "+q.getsize());
		
		q.enqueue(60);
		q.enqueue(70);
		q.enqueue(80);
		q.enqueue(90);
		
		System.out.println("\nsize is : "+q.getsize());
		
		q.show();
	}
}
