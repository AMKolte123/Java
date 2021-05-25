import java.util.Scanner;
public class ArmstrongNum {
public static void main(String[]  args)
{
	int num,dig, result=0,num1,rem=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("how many digit numbe you want to enter ");
	dig=sc.nextInt();
	System.out.println("Enter the number : ");
	num=sc.nextInt();
	num1=num;
	for(int i=1; i<=dig; i++)
	{
	rem=num%10;
	result=result +(rem*rem*rem);
	num=num/10;
	
	}
	if(num1==result)
	{
		System.out.println(+num1+" == "+result);
		System.out.println(+result+" is a armstrong number");
	}
	else
	{
		System.out.println(+num1+" != "+result);
		System.out.println(+result+" is not a armstrong number");
	}
}
}
