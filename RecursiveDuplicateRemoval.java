package git;
import java.util.Scanner;

public class RecursiveDuplicateRemoval 
{
    public static char[] removeDuplicate(String s,int i,int n,char []arr,int j)
    {
    	if(i<n)
    	{
    		if(s.charAt(i)==s.charAt(i+1))
    		{
    			while(i<n && s.charAt(i)==s.charAt(i+1))
    			{
    				i++;
    			}
    			i++;
    			removeDuplicate(s,i,n,arr,j);
    		}
    		else
    		{
    			arr[j]=s.charAt(i);
    			j++;
    			removeDuplicate(s,i+1,n,arr,j);
    		}
    	}
    	return arr;
      }
	
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String");
		String s=in.next();
		int n=s.length()-1;
		char arr[]=new char[n];
		char a[]=removeDuplicate(s,0,n,arr,0);
                System.out.println(a);
	}
}
