package git;
import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of entries in phonebook");
		int n=in.nextInt();
		HashMap <String,Long>p=new HashMap<String,Long>();
		System.out.println("Enter entries as name and phone number");
		for(int i=0;i<n;i++)
		{
			String s=in.nextLine(); 
			String ss=in.nextLine(); 
			long ph=in.nextLong();
			p.put(ss,ph);
		}
                System.out.println("Enter number of queries");
                int q=in.nextInt();
                String ss=in.nextLine();
                for(int i=0;i<q;i++)
                {
        	String s=in.nextLine();
        	if(p.containsKey(s))
        	{
        		System.out.println(s+" = "+p.get(s));
        	}
        	else
        	{
        		System.out.println("Not Found");
        	}
                }
	}
}