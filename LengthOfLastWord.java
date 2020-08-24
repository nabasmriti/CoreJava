import java.util.Scanner;

public class LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int len = st.length();
		int currl =0;
		for(int a=0; a<len; a++) {
			
			if(st.charAt(a)==' ')
			{
							
				currl =0;
			}
			else {
				currl++;
			}
		}
		System.out.println(currl);
	}

}
