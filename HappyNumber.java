import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Set<Integer> s = new HashSet<Integer>();
		int sum = 0;
		boolean isHappy = false;
		while(!isHappy) {
			while(num>0) {
				int rem = num%10;
				sum+=Math.pow(rem, 2);
				num = num/10;
			}
			if(s.contains(sum)) {
				System.out.println("Not Happy Number");
				isHappy = true ;
			}
			if(sum == 1) {
				System.out.println("Happy Number");
				isHappy = true;
			}
			s.add(sum);
			num = sum;
			sum =0;
			
		}
	}

}
