package CrackingTheCodingInterview;

public class Boundarytraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode root = new TNode(10);
		root.left = new TNode(2);
		root.right = new TNode(2);
		root.left.left = new TNode(3);
		root.right.right = new TNode(6);
		root.left.right = new TNode(4);
		root.left.right.left = new TNode(9);
		root.right.left = new TNode(8);
		boundaryTraversal(root);
	}
	private static void leftBoundaryTraversal(TNode root) {
		if(root==null) 
			return;
			
		if(root.left!=null) {
			System.out.print(root.data +" ");
			leftBoundaryTraversal(root.left);
		}
		else if(root.right!=null) {
			leftBoundaryTraversal(root.right);
			System.out.print(root.data + " ");
		}
		
	}
	private static void rightBoundaryTraversal(TNode root) {
		if(root==null) 
			return;
		if(root.right!=null) {
			rightBoundaryTraversal(root.right);
			System.out.print(root.data+ " ");
		}	
		if(root.left!=null) {
			rightBoundaryTraversal(root.left);
			System.out.print(root.data+" ");			
		}
		
	}
	private static void leafTraversal(TNode root) {
		if(root == null)
			return;
		leafTraversal(root.left);
		if(root.left == null && root.right == null)
			System.out.print(root.data+" ");		
		leafTraversal(root.right);
	}
	private static void boundaryTraversal(TNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		
			System.out.print(root.data+" ");
			
				leftBoundaryTraversal(root.left);
				leafTraversal(root.left);
				leafTraversal(root.right);
				rightBoundaryTraversal(root.right);
			
			
		
	}

}
