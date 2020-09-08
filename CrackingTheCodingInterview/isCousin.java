package CrackingTheCodingInterview;

public class isCousin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode root = new TNode(10);
		root.left = new TNode(8);
		root.right = new TNode(2);
		root.left.left = new TNode(3);
		//root.right.left = new TNode(1);
		root.right.right = new TNode(2);
		root.left.right = new TNode(5);
		if(isCousin(root,root.right.right,root.left))
			System.out.println("true");
		else
			System.out.println("false");
		if(isCousin(root,root.right.right,root.left.left))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	static boolean isCousin(TNode root, TNode i, TNode j) {
		// TODO Auto-generated method stub
		if(level(root,i,1) == level(root,j,1) && !isSibling(root,i,j))
			return true;
			
		return false;
	}

	static int level(TNode root, TNode j, int lev) {
		// TODO Auto-generated method stub
		if(root == null)
			return 0;
		if(root == j)
			return lev;
		int l = level(root.left,j,lev+1);
		if(l !=0)
			return l;
		return level(root.right,j,lev+1);
	}

	static boolean isSibling(TNode root, TNode a, TNode b) {
		if(root == null)
			return false;
		return((root.left == a && root.right == b)||(root.right == a && root.left == b)||
				isSibling(root.left, a, b)|| isSibling(root.right, a, b));
	}
	
	

}
