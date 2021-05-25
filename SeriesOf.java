import java.util.Scanner;

public class SeriesOf {
 public static void main(String[]  args)
 {
	 int num,sum=0;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the number : ");
	   num=sc.nextInt();
	   for(int i=0;i<=num;i++)
		   sum=sum+i;
		   System.out.println("sum of "+num+" namber is : "+sum);
	   
 }

}
