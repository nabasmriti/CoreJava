import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSum {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList();
		LinkedList<Integer> list2 = new LinkedList();
		//Scanner sc = new Scanner(System.in);
		list1.add(2);
		list2.add(5);
		list1.add(4);
		list2.add(6);
		list1.add(3);
		list2.add(9);
		/*
		 * for(int a=0;a<3;a++) { list1.add(sc.nextInt()); list2.add(sc.nextInt());
		 * list1.add(sc.nextInt()); list2.add(sc.nextInt()); list1.add(sc.nextInt());
		 * list2.add(sc.nextInt()); }
		 */
		int carry =0;
		int sum =0;	
		
		LinkedList<Integer> result = new LinkedList();
		int i=0;
		int j=0;
		
		while(list1!=null||list2!=null) {
			int x = list1.get(i)!=null?list1.get(i++):0;
			int y = list2.get(j)!=null?list2.get(j++):0;
			sum = x+y+carry;
			carry = sum / 10;
			result.add(sum % 10);
			///System.out.println(result);	
			if(i>=list1.size()||j>=list2.size())
				break;
		}
		if(carry>0) {
			result.add(carry);
		}
		System.out.println(result);
		

	}

}
