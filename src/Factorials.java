import java.util.Scanner;
public class Factorials {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Long num=sc.nextLong();
		long factorial=1;
		for(int i=1; i<=num; i++) {
			
			factorial=factorial*i;
			
			}
		
			System.out.println("factorial of a number is "+factorial);
		
}
}


