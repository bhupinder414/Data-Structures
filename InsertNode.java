package git;
import java.util.Scanner;

public class InsertNode 
{
    Node head;
    static int count=0;
	
    static class Node
    {
    	int data;
    	Node next;
    	Node(int d)
    	{
    	   data=d;
    	   next=null;
    	}
    }
    
    public static InsertNode insert(InsertNode l,int data)
    {
    	Node newNode = new Node(data);
    	if(l.head==null)
    	{
    		l.head=newNode;
    	}
    	else
    	{
    		Node last =l.head;
    		while(last.next!=null)
    		{
    			last=last.next;
    		}
    		last.next=newNode;
    	}
    	count++;
    	return l;
    }
    
    public static InsertNode insertMiddle(InsertNode l,int data)
    {
    	int i=0,n;
    	Node newNode = new Node(data);
    	if(count%2==0)
    	 n=count/2;
    	else
    	 n=(count/2)+1;
    	
    	Node temp=l.head;
    	while(i<n-1)
    	{
    		temp=temp.next;
    		i++;
    	}
    	newNode.next=temp.next;
    	temp.next=newNode;
    	return l;
    }
    
    public static void display(InsertNode l)
    {
    	Node first=l.head;
    	while(first.next!=null)
    	{
    		System.out.print(first.data+" ");
    		first=first.next;
    	}
    	System.out.print(first.data);
    }

	public static void main(String[] args) 
	{
		InsertNode l=new InsertNode();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size");
		int n=in.nextInt();
		System.out.println("Enter elements");
                for(int i=0;i<n;i++)
                {
        	int num=in.nextInt();
        	l=insert(l,num);
                }
                display(l);
                System.out.println("\nEnter element to be inserted in middle");
                int x=in.nextInt();
                l=insertMiddle(l,x);
                display(l);
	}
}