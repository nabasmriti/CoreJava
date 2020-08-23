import java.util.Scanner;

public class StsStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String haystack = sc.next();
		String needle = sc.next();
		boolean result =false;
		int found =-1;
		int len1 = haystack.length();
		int len2 = needle.length();
		if(len2 == 0)
			found =0;
		else {
		int n2 =0;
		for(int a=0; a<len1; ) {
			if(found!=-1) {
				if(haystack.charAt(a)==needle.charAt(n2)) {
					a++;
					n2++;
				}			
			if(n2 == len2)
				break;
			}
			else if(haystack.charAt(a)==needle.charAt(n2)) {
				found =a;
				a++;
				n2++;
				if(n2 == len2)
					break;
			}
			else
				a++;
		}
		
	}
	System.out.println(found);	
	}

}
