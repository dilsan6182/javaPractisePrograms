import java.util.Scanner;

public class Cuberooot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		Double x=sc.nextDouble();
		Double y=Math.cbrt(x);
		System.out.println("cube root is "+y);
	}

}
