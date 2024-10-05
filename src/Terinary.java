
public class Terinary {
		public static void main(String[] args) {
			//for 2 numbers
//			int a=10, b=20;
//			int largest=a>b?a:b;
//			System.out.println("greatest is " +largest);
		
		
		//for 3 numbers
			int a=10,b=20,c=30;
//		int largestOfAB=a>b?a:b;
//		int largestOfABC=c>largestOfAB?c:largestOfAB;
//		
		int largestOfABC=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("largest of A,B,C is "+largestOfABC);

		}
	}


