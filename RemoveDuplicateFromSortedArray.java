import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int ar[] = new int[len];
		for(int a=0; a<len;a++) {
			ar[a] = sc.nextInt();
		}
		int ch = ar[0];
		int posi =0;
		for(int a=1; a<len;) {
			if(ar[a]==ch) {
				a++;}
			else{
				ar[++posi] = ar[a++];
				ch = ar[posi];
			}
		}
		for(int a=0; a<len;a++) {
			System.out.print(ar[a]);
		}
	}

}
