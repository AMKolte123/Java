

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args)
	{
		int num,rem=0,que,num1,result=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number : ");
	    num=sc.nextInt();
        num1=num;	   
	    while(num!=0)
	    {
	    	rem=num%10;
	    	result=(result*10)+rem;
	    	que=num/10;
	    	num=que;
	    	  
	    }
	    
	    if(result==num1)
	    {
	    	System.out.println(+num1+" == "+result);
	    	System.out.println("Enter number is palindrome");
	    }
	    else 
	    {
	    	System.out.println(+num1+" != "+result);
	    System.out.println("Enter number is not palindrome");
	    }
	    }
	    

}
