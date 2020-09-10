import java.util.Scanner;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int ar[] = new int [l];
		for(int a=0; a<l; a++) {
			ar[a] = sc.nextInt();
		}
		int max_area = 0;
		for(int first =0, last = l-1; first< last; ) {
			max_area = Math.max(max_area, Math.min(ar[first], ar[last])*(last-first));
			if(ar[first]>=ar[last])
				last--;
			else
				first++;
		}
		System.out.println(max_area);
	}

}
