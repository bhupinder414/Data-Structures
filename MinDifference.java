package git;
import java.util.Arrays;
import java.util.Scanner;

public class MinDifference 
{
	public static void main(String[] args) 
	{
	 Scanner in=new Scanner(System.in);
	 System.out.println("Enter array size");
	 int n=in.nextInt();
	 int arr[]=new int[n];
	 System.out.println("Enter choclates");
         for(int i=0;i<n;i++)
         {
    	 arr[i]=in.nextInt();
         }
         System.out.println("Enter number of students");
         int m=in.nextInt();
         Arrays.sort(arr);
         int diff=arr[m-1]-arr[0];
         System.out.println("Minimum Difference is "+diff);
	}
}