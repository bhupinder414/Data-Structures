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

public class LowestCommonAncestor 
{
	   static Node root;
	   public LowestCommonAncestor()
	   {
		   root=null;
	   }
	   public LowestCommonAncestor(int key)
	   {
		   root=new Node(key);
	   }
	   
	   public static Node LCA(Node root,Node n1,Node n2)
	   {
		  if(root==null)
			  return null;
		  if(root.data==n1.data||root.data==n2.data)
		  {
			  return root;
		  }
		  Node left=LCA(root.left,n1,n2);
		  Node right=LCA(root.right,n1,n2);
		  if(left==null)
			  return right;
		  if(right==null)
			  return left;
		  return root; 
	   }
	   
	public static void main(String[] args) 
	{
		LowestCommonAncestor bt=new LowestCommonAncestor();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.left=new Node(6);
		bt.root.right.right=new Node(7);
		Node node1=bt.root.left.left;
		Node node2=bt.root.left.right;
		Node n=LCA(root,node1,node2);
		System.out.println("Lowest Common Ancestor of "+node1.data+" and "+node2.data+" is "+n.data);
	}
}