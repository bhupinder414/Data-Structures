package git;
import java.util.Scanner;
public class RevString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int j=str.length()-1;
        int i=0;
        char a[]=str.toCharArray();
        while(i<j)
        {
        	if(a[i]>=65 && a[i]<=90 || a[i]>=97 && a[i]<=122)
        	{
        		if(a[j]>=65 && a[j]<=90 || a[j]>=97 && a[j]<=122)
        		{
        	     char s=a[i];
        	     a[i]=a[j];
        	     a[j]=s;
        	     i++;
        	     j--;
        		}
        		else
        		{
        		  j--;
        		}
        	}
        	else
        	{
        		i++;
        	}
        }
        str=new String(a);
        System.out.println("Reversed String : "+str);
	}
}
