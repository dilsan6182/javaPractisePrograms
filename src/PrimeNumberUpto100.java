
public class PrimeNumberUpto100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=100;i++) {
			if(i==2||i==3||i==5) {
				System.out.print(i+" ");
			}
			else if(i%2!=0 & i%3!=0 & i%5!=0){
				System.out.print(i+" ");
				}
			else {
	
		System.out.print("");
		
		}
	    }
	}
}



