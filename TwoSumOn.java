import java.util.HashMap;
import java.util.Scanner;

public class TwoSumOn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array and target");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i =0; i<n;i++)
			ar[i] = sc.nextInt();
		int target = sc.nextInt();
		int result[] = isPresent(ar,target,n);
		if(result.length == 2)
		System.out.println(result[0]+" "+result[1]);

	}

	private static int[] isPresent(int[] ar, int target, int n) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++) {
			int comp = target-ar[i];
			if(hm.containsKey(comp)) {
				System.out.println("The indexes are "+ hm.get(comp)+" "+i);
				return new int[] {hm.get(comp),i};
			}
			hm.put(ar[i], i);
		}
		return null;
	}

}
