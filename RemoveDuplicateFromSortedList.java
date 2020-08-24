import java.util.LinkedList;

public class RemoveDuplicateFromSortedList {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		int a=1;
		while(a<list1.size()) {
			if(list1.get(a)==list1.get(a-1)) {
				list1.remove(a);
			}
			else {
				a++;
			}
		}
		System.out.print(list1);
	}

}
