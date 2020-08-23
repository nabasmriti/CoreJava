import java.util.Scanner;

public class SearchInsertPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int ar[] = new int[len];
		for(int a=0; a<len;a++) {
			ar[a] = sc.nextInt();
		}
		int value = sc.nextInt();
		int pos =-1;
		for(int a=0; a<len;a++) {
			if(a==0 && value<ar[a]) {
				pos = a;
				break;
			}
			else if(ar[a]==value) {
				pos = a;
				break;
			}
			else if(ar[a+1] == value) {
				pos = a+1;
				break;
			}
			else if(value>ar[a] && value <ar[a+1]) {
				pos = a+1;
				break;
			}				
			
		}
		System.out.println(pos);

	}

}
