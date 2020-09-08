package CrackingTheCodingInterview;

public class ChildSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TNode root = new TNode(10);
		root.left = new TNode(8);
		root.right = new TNode(2);
		root.left.left = new TNode(3);
		root.right.right = new TNode(2);
		root.left.right = new TNode(5);
		
		int x = isChildSum(root);
		if(x== 1)
			System.out.println(true);
		else
			System.out.println(false);
	}

	private static int isChildSum(TNode root) {
		// TODO Auto-generated method stub
		int left_data = 0;
		int right_data = 0;
		if(root == null || (root.left == null && root.right == null))
			return 1;
		if(root.left!=null)
			left_data = root.left.data;
		if(root.right!=null)
			right_data = root.right.data;
		if((root.data == left_data + right_data)&& isChildSum(root.left)==1 && isChildSum(root.right)==1)
			return 1;
		
			
		return 0;
	}

}
