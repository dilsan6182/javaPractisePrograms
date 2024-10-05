import java.util.Scanner;
public class EvenorOdd{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		
		if (x%2==0){
			System.out.println("given value is even");
		}
		else {
			System.out.println("given value is odd");
		
			
		}
		
	}

}
