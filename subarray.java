package git;

import java.util.Scanner;

public class subarray {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
		int arr[]=new int[n];
		int num=0;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter number");
        num=in.nextInt();
        for(int i=0;i<n;i++)
        {
        	if(arr[i]==num)
        	{
        		System.out.println("starting index: "+i+" Ending index: "+i);
        	}
        	else
        	{
        		int j=i+1;
        		int sum=arr[i];
        		while(j!=n)
        		{
        			sum+=arr[j];
        			if(sum==num)
        			{
        				System.out.println("starting index: "+i+" Ending index: "+j);
        			}
        			j++;
        		}
        	}
        }
	}

}
