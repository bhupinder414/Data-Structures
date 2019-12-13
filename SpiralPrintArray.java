package git;
import java.util.Scanner;

public class SpiralPrintArray 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m=in.nextInt();
		System.out.println("Enter number of columns");
		int n=in.nextInt();
                System.out.println("Enter elements of matrix");
                int arr[][]=new int[m][n];
        
                for(int i=0;i<m;i++)
                {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=in.nextInt();
        	}
                }
                int row=0;
                int column=0;
                while(row<m && column<n)
               {
        	for(int i=0;i<n;i++)
        	{
        		System.out.print(arr[row][i]+" ");
        	}
        	row++;
        	for(int i=row;i<m;i++)
        	{
        		System.out.print(arr[i][m-1]+" ");
        	}
        	n--;
        	if(row<m)
        	{
        		for(int i=n-1;i>=column;i--)
        		{
        			System.out.print(arr[m-1][i]+" ");
        		}
        		m--;
        		if(column<n)
        		{
        			for(int i=m-1;i>row;i--)
        			System.out.print(arr[i][column]+" ");
        		}
        		column++;
        	}
               }
	}
}