package CrackingTheCodingInterview;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class CubeEquation {

	public static void main(String[] args) {
		HashMap<Long, ArrayList<Integer>> hm = new HashMap<>();
		for (int a = 1; a <= 1000; a++) {
			for (int b = 1; b <= 1000; b++) {
				ArrayList<Integer> ar = new ArrayList();
				ar.add(a);
				ar.add(b);
				long result = (long) (Math.pow(a, 3) + Math.pow(b, 3));
				if (hm.containsKey(result)) {
					ArrayList<Integer> ar1 = hm.get(result);
					System.out.println(a + " " + b + " " + ar1.get(0) + " " + ar1.get(1));
				}
				else
					hm.put(result, ar);
			}
		}

	}

}
