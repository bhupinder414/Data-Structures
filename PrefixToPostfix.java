package git;
import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter expression in prefix form");
		String str=in.next();
                Stack <String>s=new Stack<String>();
                String post="";
                String ss="";
                int n=str.length();
                for(int i=n-1;i>=0;i--)
                {
        	if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='*'||str.charAt(i)=='%')
        	{
        		String op1=(String)s.pop();
        		String op2=(String)s.pop();
        		post=op1+op2+str.charAt(i);
        		s.push(post);
        	}
        	else
        	{
        		ss=str.charAt(i)+"";
        		s.push(ss);
        	}
                }
                System.out.println("Postfix Expression : "+s.peek());
	}
}