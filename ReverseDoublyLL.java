package git;
import java.util.Scanner;
public class ReverseDoublyLL 
{
	   static Node head;
	   static class Node
	   {
		   int data;
		   Node prev;
		   Node next;
		   public Node(int d)
		   {
			   data=d;
		   }
	   }
	
	   public static ReverseDoublyLL insert(ReverseDoublyLL l,int d)
	   {
		   Node newNode=new Node(d);
		   if(l.head==null)
		   {
			   l.head=newNode;
			   newNode.next=null;
			   newNode.prev=null;
		   }
		   else
		   {
		       Node n=l.head;
		       while(n.next!=null)
		       {
		    	   n=n.next;
		       }
		       n.next=newNode;
		       newNode.next=null;
		       newNode.prev=n;
		   }
		   return l;
	   }
	   
	   public static void displayRev(ReverseDoublyLL l)
	   {
		   if(l.head==null)
		   {
			   System.out.println("List is Empty");
		   }
		   else
		   {
		   Node last=l.head;
		   while(last.next!=null)
		   {
			   last=last.next;
		   }
		   while(last.prev!=null)
		   {
			   System.out.print(last.data+" ");
			   last=last.prev;
		   }
		    System.out.print(last.data+" ");
		   }
	   }
	   
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=in.nextInt();
		ReverseDoublyLL l=new ReverseDoublyLL();
                System.out.println("Enter elements");
                for(int i=0;i<n;i++)
                {
        	int ele=in.nextInt();
        	l=insert(l,ele);
                }
                displayRev(l);
	}
}