package CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

public class DiagonalTraversal {

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
		diagonalTraversal(root);
	}

	private static void diagonalTraversal(TNode root) {
		// TODO Auto-generated method stub
		HashMap<Integer,Vector<Integer>> hs = new HashMap<>();
		diagonalTraversalUtil(root,0,hs);
		System.out.println("Diagonal Traversal of Binnary Tree");
		for(Entry<Integer, Vector<Integer>> entry: hs.entrySet())
			System.out.println(entry.getValue());
		}

	private static void diagonalTraversalUtil(TNode root, int i, HashMap<Integer, Vector<Integer>> hs) {
		// TODO Auto-generated method stub
		if(root == null)
			return;
		Vector<Integer> k = hs.get(i);
		if(k == null) {
			k = new Vector<>();
			k.add(root.data);
		}
		else {
			k.add(root.data);
		}
		hs.put(i, k);
		diagonalTraversalUtil(root.left,i+1,hs);
		diagonalTraversalUtil(root.right,i,hs);
	}

}
