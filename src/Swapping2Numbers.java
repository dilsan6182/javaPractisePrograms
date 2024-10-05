
public class Swapping2Numbers {

	public static void main(String[] args) {
	
       int a=10,b=20;
       //logic 1----third variable
//       System.out.println("before swapping a="+a+"b="+b);
//       int t=a;
//       a=b;
//       b=t;
//       System.out.println("after swapping a="+a+"b="+b);
//       
       //logic 2---- use + & -
//       System.out.println("before swapping a="+a+"b="+b);
//       a=a+b;           //a=30;
//       b=a-b;           //b=30-20=10;
//       a=a-b;           //a=30-10=20;
//       System.out.println("after swapping a="+a+"b="+b);
//       
       //logic 3------------use * and /
       //here a and b values should not be zero
//       System.out.println("before swapping a="+a+"b="+b);
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("after swapping a="+a+"b="+b);
		
		//logic4--------- use BITWISE XOR(^)
//		  System.out.println("before swapping a="+a+"b="+b);
//		  a=a^b;
//		  b=a^b;
//		  a=a^b;
//		  System.out.println("after swapping a="+a+"b="+b);
		  
		  //logic 5 -----single statement
       System.out.println("before swapping a="+a+"b="+b);
		  b=a+b-(a=b); 
		  System.out.println("after swapping a="+a+"b="+b);
		  
		
	}

}
