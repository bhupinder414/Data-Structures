package git;
import java.util.Scanner;

public class SumList 
{
	   Node head;
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
	
	   public static SumList insert(SumList l,int d)
	   {
		   Node newNode = new Node(d);
	       if(l.head==null)
	       {
	    	   l.head=newNode;
	       }
	       else
	       {
	    	   Node temp=l.head;
	    	   while(temp.next!=null)
	    	   {
	    		   temp=temp.next;
	    	   }
	    	   temp.next=newNode;
	       }
	       return l;
	   }
	
	public static SumList sumlist(SumList l1,SumList l2)
	{
		SumList l3=new SumList();
		Node temp1=l1.head;
		Node temp2=l2.head;
		int num1=0,num2=0;
		int digit=0;
		while(temp1!=null && temp2!=null)
		{
			num1=temp1.data*(int)Math.pow(10, digit)+num1;
			num2=temp2.data*(int)Math.pow(10, digit)+num2;
			temp1=temp1.next;
			temp2=temp2.next;
			digit++;
		}
        int sum=num1+num2;
        while(sum!=0)
        {
        	int rem=sum%10;
        	sum=sum/10;
        	l3=insert(l3, rem);
        }
		return l3;
	}
	
	public static void display(SumList l)
	{
		Node temp=l.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) 
	{
		SumList l1=new SumList();
		SumList l2=new SumList();
		System.out.println("Enter number of elements");
		Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                System.out.println("Enter elements of List 1");
                for(int i=0;i<n;i++)
                {
        	int num=in.nextInt();
        	l1=insert(l1,num);
                }
                System.out.println("Enter elements of List 2");
                for(int i=0;i<n;i++)
                {
        	int num=in.nextInt();
        	l2=insert(l2,num);
                }
                SumList l3=sumlist(l1,l2);
                System.out.println();
                display(l3);
	}
}