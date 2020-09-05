package CrackingTheCodingInterview;

public class isMirror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode root = new TNode(10);
		root.left = new TNode(2);
		root.right = new TNode(2);
		root.left.left = new TNode(3);
		root.right.right = new TNode(6);
		root.left.right = new TNode(4);
		root.right.left = new TNode(4);
		System.out.println(isMirror(root,root));
	}

	private static boolean isMirror(TNode root1, TNode root2) {
		// TODO Auto-generated method stub
		if(root1 == null && root2 == null)
			return true;
		else if(root1.data == root2.data)
			return (isMirror(root1.left, root2.right)&& isMirror(root1.right, root2.left));
		return false;
	}

}
