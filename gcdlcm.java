import java.util.Scanner;
public class gcdlcm 
{
   public static void main(String args[])
   {
      int num1,num2,i,hcf=1,lcm=1,max,min ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number = ");
      num1=sc.nextInt();
      System.out.println("Enter second number = ");
      num2=sc.nextInt();
	  min=(num1<num2)?num1:num2;
	  max=(num1>num2)?num1:num2;
      for(i=min;i>=1;i--)
	  {
		if(num1%i==0 && num2%i==0 )
		{
			hcf=i;
			break;
		}
      }
	  if(hcf>=2 && max%hcf==0)
	  {
		 lcm=hcf*(max/hcf);
	  }
	  else
	  {
		  lcm=num1*num2;
	  }
      System.out.println("HCF of given two numbers is ="+hcf);
	  System.out.println("LCM of given two numbers is ="+lcm);
   }
}