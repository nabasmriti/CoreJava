package CrackingTheCodingInterview;

public class IsBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode root = new TNode(10);
		/*
		 * root.left = new TNode(7); root.right = new TNode(13); root.right.left = new
		 * TNode(12); root.right.right = new TNode(14); root.right.right.left = new
		 * TNode(15); root.right.right.right = new TNode(16); root.left.right = new
		 * TNode(8); root.left.right.right = new TNode(9); root.left.left = new
		 * TNode(3); root.left.left.right = new TNode(5);
		 */
		root.left = new TNode(7);
		root.left.left = new TNode(8);
		System.out.println(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

	private static boolean isBST(TNode root,int min, int max) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return true;
		else if(   root.data<min ||  root.data>max)
			return false;
		else if(!isBST(root.left,min, root.data-1) || !isBST(root.right,root.data+1,max))
			return false;
		
		return true;
		
	}

}
