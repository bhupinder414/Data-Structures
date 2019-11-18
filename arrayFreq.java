package git;
import java.util.Scanner;

public class arrayFreq {

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
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
        	if(arr[i]>max)
        		max=arr[i];
        }
        int count[]=new int[max+1];
        for(int i=0;i<n;i++)
        	count[arr[i]]++;
        for(int i=0;i<n;i++)
        {
        	if(count[arr[i]]!=-8888)
        	{
        	System.out.println(arr[i]+" occurs "+count[arr[i]]+" times");
        	 count[arr[i]]=-8888;
        	}
        }
        }

}
