
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12121;
		int rev=0;
		int rem=0;
		while(x>0) {
			rem=x%10;
			x=x/10;
			rev=rev*10+rem;
		}
//		if(rev==value) {
//			System.out.println("palindrome number");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
		System.out.println(rev);
    
}
}