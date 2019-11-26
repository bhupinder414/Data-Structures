package git;
import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n=in.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter size of second array");
		int m=in.nextInt();
		System.out.println("Enter any integer value");
		int x=in.nextInt();
		int arr2[]=new int[m];
		System.out.println("Enter first array elements");
		for(int i=0;i<n;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int i=0;i<m;i++)
		{
			arr2[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr2[j]!=-9999)
				{
				if(arr1[i]+arr2[j]==x)
				{
					System.out.println(arr1[i]+","+arr2[j]);
					arr2[j]=-9999;
				}
				}
			}
		}
	}
}