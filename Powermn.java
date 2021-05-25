// 7:Write a program to find m to the power n

import java.util.Scanner;
public class Powermn {
public static void main(String[] args)
{
	int m,n,result;
	Scanner sc= new Scanner(System.in);
	System.out.println("emter the number : n");
	n=sc.nextInt();
	System.out.println("enter the power : m ");
	m=sc.nextInt();
	result=n;
	int p =n;
	for(int i=1; i<m; i++)
	{
		result=result*p;
		p=n;
		
	}
	System.out.println(+m+" to the power of "+n+" is :="+result);
	
}
}
