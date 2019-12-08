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

public class LeafNodes 
{
	   Node root;
    
	   public LeafNodes()
	   {
		   root=null;
	   }
	   
	   public LeafNodes(int key)
	   {
		   root=new Node(key);
	   }
	
	   public static void printLeaf(Node root)
	   {
		   if(root!=null)
		   {
			   printLeaf(root.left);
			   if(root.left==null && root.right==null)
			   System.out.print(root.data+" ");
			   printLeaf(root.right);
		   }
	   }
	   
	   public static void main(String[] args) 
	   {
		LeafNodes bt=new LeafNodes();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);
                printLeaf(bt.root);
	   }
}