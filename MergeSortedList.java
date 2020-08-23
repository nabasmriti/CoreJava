import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MergeSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new LinkedList();
		List<Integer> list2 = new LinkedList();
		List<Integer> list3 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a=0; a<n;a++) {
			list1.add(sc.nextInt());
		}
		for(int a=0; a<n;a++) {
			list2.add(sc.nextInt());
		}
		int f = 0;
		int s = 0;
		while(f<n && s<n ) {
			if(list1.get(f)<= list2.get(s)) {
				list3.add(list1.get(f));
				f++;
			}
			else {
				list3.add(list2.get(s));
				s++;
			}
				
		}
		while(f<n) {
			list3.add(list1.get(f));
			f++;				
		}
		while(s<n) {
			list3.add(list2.get(s));
			s++;				
		}
		System.out.println(list3);
	}

}
