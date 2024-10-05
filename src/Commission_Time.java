import java.util.Scanner;
public class Commission_Time {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("enter a number");
int t=sc.nextInt();
int p=sc.nextInt();
 
 if (t>=12) {
	 System.out.println("commission is: "+(p*0.1)*t);
 }
 else if(t>=6 &&  t<12) {
	 int b=((p*5/100)*t);
	 System.out.println("commission is: "+(b+p));
 }
 
 else if(t < 6 & p>=50000) {
	 int c=(200*t)+p;
		 System.out.println("commission is: "+c);
		 
	 }
 else {
	 System.out.println("please enter valid time");
 }
 }
 
} 
 

