import java.util.Scanner;
public class NPrim {
	public static void main(String[] args)
	{
	
		int num1,flag=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n no. : ");
		num1 = sc.nextInt();
		if(num1<=1)
			System.out.println("please enter valid number :");
		 else
			 System.out.println("2" );
			 for(int j=2; j<= num1; j++)
			 {
				 flag=0;
			 for (int i=2; i<=j; i++)
			 {
				 if( j % i== 0)
				 {
					 flag=1;
					break ; 
				 }
			  }
			 if (flag==0)
				 System.out.println(+j );
			 }
			 }
	}
	


