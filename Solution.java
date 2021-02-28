import java.util.*;
class Solution {
   public static void main(String args[])
   {
       String chk;
       Stack<Character> stk=new Stack<Character>();
           Scanner sc=new Scanner(System.in);
       chk=sc.nextLine();
       for(int i=0;i<chk.length();i++)
       {
           if(chk.charAt(i)=='(') 
           {
               stk.push(')');
           }
		   else if (chk.charAt(i)=='{')
		   stk.push('}');
		   else if(chk.charAt(i)=='[')
		   stk.push(']');
           else
           {
                if(stk.peek()==chk.charAt(i))
				stk.pop();
           
           }           
       }
	   if(stk.empty())
	   System.out.println("true");
	   else
	   System.out.println("false");
   }
}
