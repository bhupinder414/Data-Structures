package git;
import java.util.Scanner;

public class MergeArray 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int m=in.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter elements of first array in non decreasing order");
		for(int i=0;i<m;i++)
		{
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter size of second array");
		int n=in.nextInt();
		int arr2[]=new int[n];
		System.out.println("Enter elements of second array in non decreasing order");
                for(int i=0;i<n;i++)
                {
        	arr2[i]=in.nextInt();
                }
                int merge[]=new int[m+n];
                int i=0,j=0,k=0;
                while(i<merge.length)
                {
        	if(j==m && k<n)
        	{
        		merge[i]=arr2[k];
        		k++;
        	}
        	else if(k==n && j<m)
        	{
        		merge[i]=arr1[j];
        		j++;
        	}
        	else if(j<m && arr1[j]<=arr2[k])
        	{
        		merge[i]=arr1[j];
        		j++;
        	}
        	else if(k<n && arr2[k]<arr1[j])
        	{
        		merge[i]=arr2[k];
        		k++;
        	}
        	i++;
                }
                for(i=0;i<merge.length;i++)
                {
        	System.out.print(merge[i]+" ");
                }
	}
}