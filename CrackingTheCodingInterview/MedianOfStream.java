package CrackingTheCodingInterview;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[] {5, 15, 10, 20, 3};
		printMedian(ar);
	}

	private static void printMedian(int[] ar) {
		// TODO Auto-generated method stub
		//Max heap to store smaller half  of array
		double med = ar[0];
		PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
		//Min heap to store bigger half of array
		PriorityQueue<Integer> bigger = new PriorityQueue<>();
		
		smaller.add(ar[0]);
		
		System.out.println(med);
		
		for(int a=1; a<ar.length; a++) {
			int x = ar[a];
			if(smaller.size()>bigger.size()) {
				if(x<med) {
					bigger.add(smaller.remove());
					smaller.add(x);
					
				}
				else {
					bigger.add(x);
					
				}
				
				
					med = (double)(smaller.remove()+bigger.remove())/2;
			}
			else if(smaller.size()==bigger.size()) {
				if(x<med) {
					smaller.add(x);
					med = (double)smaller.peek();
				}
				else {
					bigger.add(x);
					med = (double)bigger.peek();
				}
				
			}
			else {
				if(x>med) {
					smaller.add(bigger.remove());
					bigger.add(x);
					
				}
				else
					smaller.add(x);
				
				
					med = (double)(smaller.remove()+bigger.remove())/2;
			}
			System.out.println(med);
		}
		
	}
}
