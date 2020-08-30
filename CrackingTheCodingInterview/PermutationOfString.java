package CrackingTheCodingInterview;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		printPermutation(a,"");
	}

	private static void printPermutation(String a, String ans) {
		// TODO Auto-generated method stub
		if(a.length() == 0) {
			System.out.println(ans);
		}
		boolean ch1[] = new boolean[26];
		for(int i =0; i<a.length();i++) {
			char ch = a.charAt(i);
			String ros = a.substring(0,i)+a.substring(i+1);
			if(ch1[ch-'a']==false)
				printPermutation(ros,ans+ch);
			ch1[ch-'a'] = true;
				
		}
		
	}

}
