package git;
import java.util.Scanner;

public class Longest_Palindrome {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String str=in.next();
		String long_str="";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
			String s=str.substring(i,j);
	        	System.out.println(s);
	        	char a[]=s.toCharArray();
	        	int m=0,k=a.length-1;
	        	while(m<k)
	        	{
	        		char temp=a[m];
	        		a[m]=a[k];
	        		a[k]=temp;
	        		m++;
	        		k--;
	        	}
	        	String rev=new String(a);
	        	if(s.compareTo(rev)==0 && (s.length()>long_str.length()))
	        	{
	        		long_str=s;
	        	}
			}
		}        
        System.out.println("Longest Palindrome Substring : "+long_str);
	}
}