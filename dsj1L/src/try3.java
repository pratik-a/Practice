
public class try3
{
	public static void main(String[] args)
	{
		
		System.out.println("dynamic stack using linked list\n");
		DStack sttk=new DStack();
		
		sttk.isEmpty();
		sttk.push(100);
		sttk.show();
		sttk.push(200);
		sttk.show();
		sttk.push(300);
		sttk.show();
		sttk.push(101);
		sttk.show();
		sttk.push(201);
		sttk.show();
		sttk.push(301);
		sttk.show();
		
		sttk.size();
		sttk.isEmpty();
		
		sttk.pop();
		sttk.show();
		sttk.pop();
		sttk.show();
		sttk.pop();
		sttk.show();
		sttk.pop();
		sttk.show();
	}
}
