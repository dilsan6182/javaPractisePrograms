import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int i;
		
		if(n>=2 && n<=5 && n%2==0) {
				System.out.println("not wierd");
				       }
		else if(n>=6 && n<=20 && n%2==0) {
				System.out.println("weird");
			}
		else if(n%2==0 && n>20) {
			System.out.println("not weird");
		}
		else if(n%3==0) {
			System.out.println("wierd");
		           }
		

	}

}
