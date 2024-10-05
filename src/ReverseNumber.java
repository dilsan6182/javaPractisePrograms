import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt(); // 1234
		// logic1 using algorithm
//		int rev = 0;
//		while (num != 0) {
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//		System.out.println("reverse of a numbner is " + rev);
		
		//logic2 using StringBuffer
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer rev=sb.reverse();
//	System.out.println(rev);
	
		//logic3----using StringBuilder
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev=sbl.reverse();
		System.out.println(rev);
	}

}
