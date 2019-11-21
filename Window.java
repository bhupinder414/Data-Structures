package git;
import java.util.Scanner;

public class Window {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
		System.out.println("Enter window size");
                int k=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
                for(int i=0;i<=n-k;i++)
                {
        	int max=0;
        	int count=0;
        	while(count<k)
        	{
        		if(arr[i+count]>max)
        			max=arr[i+count];
        		count++;
        	}
        	System.out.print(max+" ");
                }
	}
}