package git;
import java.util.Scanner;

public class Max_Element_Subarray 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter value of k");
                int k=in.nextInt();
                int ar[]=new int[n*6];
                int x=0;
                for(int i=0;i<n;i++)
                {
        	   int max=0;
        	   for(int j=i;j<n;j++)
        	   {
        	      if(arr[j]>max)
        		   max=arr[j];
        	      ar[x]=max;
        	      x++;
        	   }
                }
                int count=0;
                for(int i=0;i<ar.length;i++)
                {
        	if(ar[i]>k)
        		count++;
                }
                System.out.println(count);
	}
}