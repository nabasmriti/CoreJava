import java.util.Scanner;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n and array");
		int n = sc.nextInt();
		int ar[] = new int[n+1];
		for(int i =0; i<n;i++)
			ar[i] = sc.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=0,j=1;i<n || j<n;i+=2,j+=2) {
			sum1+=ar[i];
			sum2+=ar[j];
		}
		System.out.println(sum1>sum2?sum1:sum2);
	}

}
