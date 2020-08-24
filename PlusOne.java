import java.util.Scanner;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int ar[] = new int[len];
		for(int a=0; a<len;a++) {
			ar[a] = sc.nextInt();
		}
		int carry =0;
		int sum =0;
		for(int a=len-1; a>=0;a--) {
			if(a==len-1) {
				sum = ar[a]+1;
				carry = sum/10;
				ar[a] = sum%10;
			}
			else {
				sum = ar[a]+carry;
				if(a==0) {
					ar[a] = sum;
				}else {
				carry = sum/10;
				ar[a] = sum%10;
				}
			}
		}
		for(int a=0; a<len;a++) {
			System.out.print(ar[a]);
		}
	}

}
