package git;
import java.util.Scanner;

public class HighestPrimeFactor {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		int num=in.nextInt();
		int flag=0;
                for(int i=1;i<num;i++)
                {
                  flag=0;
                  int n=num/i;
                  for(int j=2;j<=n/2;j++)
                  {
        	  if(n%j==0)
        	  flag=1;
                  }
                  if(flag==0 && num%n==0)
                  {
        	  System.out.println(n);
        	  break;
                  }
                }
	}
}