package git;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
       Scanner in=new Scanner(System.in);
       System.out.println("Enter two numbers");
       int num1=in.nextInt();
       int num2=in.nextInt();
       while(num1>0)
       {
    	   num1--;
    	   num2++;
       }
       System.out.println("Sum : "+num2);
	}
}