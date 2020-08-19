import java.util.Arrays;
import java.util.Scanner;

public class TwoSumOn2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array and target");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i =0; i<n;i++)
			ar[i] = sc.nextInt();
		int target = sc.nextInt();
		System.out.println("Target "+target+" is present "+ isPresent(ar,target,n));
	}

	private static boolean isPresent(int[] ar, int target,int n) {
		Arrays.sort(ar);
		for(int i = 0; i<n;i++) {
			int diff = target - ar[i];
			for(int j = i+1;j<n;j++) {
				if(ar[j]==diff) {
					System.out.println("The numbers are "+diff+" "+ar[i]);
					return true;
				}
			}
		}
		return false;
	}

}
