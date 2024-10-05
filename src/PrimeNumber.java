import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int x = sc.nextInt();
	
		
//		if (x==2 || x==3 || x==5) {
//			System.out.println("given number is prime number");
//		}
//		
//		else if (x%3!=0 & x%2!=0 & x%5!=0)  {
//			System.out.println("given number is prime number");
//		}
//		
//		else {
//			System.out.println("please enter valid number");
//		
//	}
	
		
		//cond: natural number>1 and factors only 1 and itself
		int count=0;
		if(x>1) {
			for(int i=1;i<=x;i++) {
				if(x%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("given number is a prime");
			}
			else {
				System.out.println("given number is not a prime");
			}
			
		}
		else {
			System.out.println("given number is not a prime");
		}

}
}