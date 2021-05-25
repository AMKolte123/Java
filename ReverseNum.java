import java.util.Scanner;
public class ReverseNum {
public static void main (String[] args)
{
	int num,result=0, que, val, num1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number : ");
	num=sc.nextInt();
	num1=num;
	while(num !=0)
	{
		val=num%10;
		result=result*10+val;
		que=num/10;
		num=que;
	}
	System.out.println("Enter number is : "+num1);
	System.out.println("revese number is : "+result);
}
}
