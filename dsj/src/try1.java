
public class try1 
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insertAtStart(5);
		list.insertAt(2,25);
		
		list.show();
		
		list.delete();
		list.insertAtStart();
		list.deleteAt(2);
		
		System.out.println("\n\nafter deletion\n");
		list.show();
	}
}
