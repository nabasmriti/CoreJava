import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and array");
		int n = sc.nextInt();
		int ar[] = new int[n+1];
		for(int i =0; i<=n;i++)
			ar[i] = sc.nextInt();
		
		System.out.println("Duplicate Number "+ duplicate(ar,n));
	}

	private static int duplicate(int[] ar,int n) {
		for(int i = 0; i<=n;i++) {
			if(ar[Math.abs(ar[i])]<0)
				return Math.abs(ar[i]);
			else {
				ar[Math.abs(ar[i])]= 0-ar[Math.abs(ar[i])];
			}
		}
		return -1;
	}

}