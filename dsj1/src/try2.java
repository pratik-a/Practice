
public class try2
{
	public static void main(String[] args)
	{
		Stack stk=new Stack();
		
		stk.isEmpty();
		stk.pop();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		System.out.println("peek : "+stk.peek());
		stk.show();
		
		System.out.println("\n\nafter pop \n");
		
		stk.pop();
		stk.size();
		stk.show();
		stk.isEmpty();
		stk.push(40);
		stk.push(50);
		stk.push(60);
		stk.push(70);
		stk.show();
		
		System.out.println("\n\ndynamic stack");
		DStack sttk=new DStack();
		
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
