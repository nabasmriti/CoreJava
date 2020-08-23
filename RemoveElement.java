import java.util.Scanner;

public class RemoveElement {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int ar[] = new int[len];
		for(int a=0; a<len;a++) {
			ar[a] = sc.nextInt();
		}
		int value = sc.nextInt();
		int pos1 =	0;		
		boolean flag = false;
		for(int a=0; a<len;) {
			if(ar[a]!=value && pos1 == a) {
				pos1++;
				a++;
			}
			else if(ar[a]==value) {
				a++;
			}
			else {
				ar[pos1] = ar[a];
				pos1++;
				a++;
			}
			
		}
		for(int a=0; a<len;a++) {
			System.out.print(ar[a]);
		}
		System.out.println();
		System.out.print(pos1);
	}
}
