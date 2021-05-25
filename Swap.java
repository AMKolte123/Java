import java.util.Scanner;

public class Swap {
public static void main(String[] args)
{
	int num1, num2, temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num1 and num2 : ");
	num1=sc.nextInt();
	num2=sc.nextInt();
	System.out.println("before swaping numbers are : "+num1+"  "+num2);
	temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("after swaping numbers are : "+num1+"  "+num2);
	
	
}
}
