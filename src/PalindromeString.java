
public class PalindromeString {

	public static void main(String[] args) {

		String s = "madam";
		//String s1=s;
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}

}
