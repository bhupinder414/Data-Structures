package git;
import java.util.Scanner;
import java.util.Stack;

public class Balanced {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String in form of Parenthesis");
		String str=in.next();
		Stack s=new Stack();
        int d=0,j=0;
        char arr[]=str.toCharArray();
        int n=arr.length;
        s.push('(');
        s.push(arr[0]);
        for(int i=1;i<n;i++)
        {
        	s.push(arr[i]);
        	j=s.size()-2;
        	char c=(char)s.peek();
        	d=c-(char)s.get(j);
        	if(d>=1 && d<=2)
        	{
        		s.pop();
        		s.pop();
        	}
        }
        if(s.size()==1)
        	System.out.println("Balanced");
        else
        	System.out.println("Not Balanced"); 
	}
}