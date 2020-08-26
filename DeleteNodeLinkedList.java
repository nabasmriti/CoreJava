import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNodeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a=0; a<n;a++)
			list1.add(sc.nextInt());
		int k = sc.nextInt();
		for(int a=0; a<n;a++) {
			if(list1.get(a)== k) {
				list1.remove(a);
				n--;
			}
		}
		System.out.println(list1);
			
	}

}
