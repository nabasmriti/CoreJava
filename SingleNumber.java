import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and array");
		int n = sc.nextInt();
		int ar[] = new int[n+1];
		for(int i =0; i<n;i++)
			ar[i] = sc.nextInt();
		int n1 =ar[0];
		for(int a=1; a<n;a++) {
			n1 = n1^ar[a];
		}
		System.out.println(n1);
	}

}
