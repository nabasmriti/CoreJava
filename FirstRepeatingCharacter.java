import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<Character, Integer> hs = new HashMap<>();
		boolean found = false;
		for(int a=0; a<s.length();a++) {
			if(hs.containsKey(s.charAt(a))){
					System.out.println(hs.get(s.charAt(a)));
					found = true;
					break;
			}
			else {
				hs.put(s.charAt(a),a);
			}
		}
		if(found == false) {
		System.out.println("-1");
		}

	}

}
