import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthFromLast {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList();
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b =0;
		int i=0;
		while(b< list1.size() && b<n) {
			b++;
			if(b == n)
				break;
		}
		while(b< list1.size()) {
			a++;
			b++;
		}
		
		System.out.println(list1);
		list1.remove(a);
		System.out.println(list1);

	}

}
