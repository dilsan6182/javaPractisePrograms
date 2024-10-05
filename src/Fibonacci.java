
public class Fibonacci {
	public static void main(String[] args) {
//		long i=0, j=1, k=0;
//		System.out.print(i+" "+j);
//		while(i<=50){
//			k=i+j;
//			System.out.print(" "+k);
//			i=j;
//			j=k;
//		}

		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
		System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
	}
}
