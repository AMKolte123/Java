//11:Write a  program to find sum of all even and odd numbers between 1 to n.\\ 

import java.util.Scanner;
public class EvenOddSum {
	public static void main(String[]  args)
	{
		int num,evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		num=sc.nextInt();
		
		for (int i=1;i<=num; i++)
		{
			if(i%2==0)
			{
				evensum=evensum+i;
			}
			else
			{
				oddsum=oddsum+i;
			}
		}
		System.out.println("Sum of even number is : "+evensum);
		System.out.println("sum of odd number is : "+oddsum);
		
	}
}
