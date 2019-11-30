package git;

class Node
{
	  int data;
	  Node left;
	  Node right;
	  Node(int d)
	  {
		  data=d;
		  left=null;
		  right=null;
	  }
}

public class LeftView 
{
	   static Node root;
	   public LeftView()
	   {
		   root=null;
	   }
	   public LeftView(int key)
	   {
		   root=new Node(key);
	   }
	   
	  
	   static int count=0;
	   
	   public static void LFT(Node root)
	   {
	     leftview(root,1);
	   }
	   
	   public static void leftview(Node root,int level)
	   {
		   if(root==null)
			   return;
		   if(count<level)
		   {
			   System.out.print(root.data+" ");
			   count=level;
			   
		   }
	           leftview(root.left,level+1);
	           leftview(root.right,level+1);
			   
	   }
	   
	public static void main(String[] args) 
	{
		LeftView bt=new LeftView();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);
		bt.root.right.right.left=new Node(8);
		LFT(bt.root);
	}
}