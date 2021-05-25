import java.util.Scanner; 
public class Prim {
public static void main(String[] args)
{
	int num, flag=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number n :");
	num = sc.nextInt();
	if(num<=1)
		System.out.println("please enter valid number :");
	 else
		 for (int i=2; i<num; i++)
		 {
			 if( (num % i)== 0)
			 {
				 flag=1;
				 System.out.println(+num+" is not a prime number ");
			   break;
			 }
			 
		 }
	if (flag==0)
	 System.out.println(+num+" is a prime number ");
	
}
}
