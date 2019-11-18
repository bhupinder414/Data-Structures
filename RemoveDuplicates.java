package git;
import java.util.Scanner;

public class RemoveDuplicates 
{
    static Node head;
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
    
    public static RemoveDuplicates insert(RemoveDuplicates l,int data)
    {
    	Node newNode = new Node(data);
    	newNode.next=null;
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
    	return l;
    }
    
    public static RemoveDuplicates remove_dup(RemoveDuplicates l)
    {
    	Node curr=l.head;
    	Node last=l.head;
    	Node prev=null;
    	Node s=null;
    	while(last!=null)
    	{
    		curr=last.next;
    		prev=last;
    		while(curr!=null)
    		{
    			if(prev.next==curr.next && last.data==curr.data)
    			{
    				last.next=curr.next;
    			}
    			else if(last.data==curr.data)
    			{
    				prev.next=curr.next;
    			}
    			else if(prev.next==curr.next && curr.data!=last.data)
    			{
    				prev=s;
    			}
    			s=prev;
    			curr=curr.next;
        		prev=prev.next;	
    		}
    		last=last.next;
    	}
    	return l;
    }
    
    public static void display(RemoveDuplicates l)
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
		RemoveDuplicates l=new RemoveDuplicates();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=in.nextInt();
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
        	int num=in.nextInt();
        	l=insert(l,num);
        }
        l=remove_dup(l);
        display(l);
	}
}