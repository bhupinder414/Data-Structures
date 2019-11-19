package git;
import java.util.Scanner;

public class RotateLL 
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
    
    public static RotateLL insert(RotateLL l,int data)
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
    
    public static RotateLL rotate(RotateLL l,int k)
    {
    	for(int i=0;i<k;i++)
    	{
    		Node temp=l.head;
    		Node prev=null;
    		while(temp.next!=null)
    		{
    			prev=temp;
    			temp=temp.next;
    		}
    		prev.next=null;
    		temp.next=l.head;
    		l.head=temp;
    	}
    	return l;
    }
    
    public static void display(RotateLL l)
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
		RotateLL l=new RotateLL();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=in.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int num=in.nextInt();
			l=insert(l,num);
		}
		System.out.println("Enter rotation number");
		int k=in.nextInt();
		l=rotate(l,k);
        display(l);
	}

}
