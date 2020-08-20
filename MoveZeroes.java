import java.util.Scanner;

public class MoveZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and array");
		int n = sc.nextInt();
		int ar[] = new int[n];
		for(int i =0; i<n;i++)
			ar[i] = sc.nextInt();
		
		MoveZeroes(ar,n);

	}

	private static void MoveZeroes(int[] ar, int n) {
		//int zero;
		int a=1;
		int z=0;
		while(a<n && z<n)
		{
			if(ar[z]==0 && ar[a]!=0) {
				int temp = ar[a];
				ar[a] = ar[z];
				ar[z] = temp;
				a++;
				z++;
			}
			if(ar[z] == 0 && ar[a] == 0) {
				a++;
			}
			if(z==n || a==n)
				break;
		}
		for(int i=0; i<n; i++) {
			System.out.print(ar[i]);
		}
		
	}

}
