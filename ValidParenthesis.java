import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int len = ch.length;
		for(int a=0; a<len;a++) {
			if(ch[a] =='('||ch[a] =='{'||ch[a] =='[') {
				st.push(ch[a]);
			}
			else {
				switch(ch[a]) {
				case ')': if(st.pop() != '(') {
							result = false;
							}
							break;
				case '}': if(st.pop() != '{') {
							result = false;
							}
							break;		
				case ']':if(st.pop() != '[') {
							result = false;
							}
							break;	
				
				}
				if(result== false) {
					System.out.println(result);
					break;
				}
			}
		}
		System.out.println(result);
	}

}
