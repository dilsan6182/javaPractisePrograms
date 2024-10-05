
public class PatternsOfNumbers {
	public static void main(String[] args) {
		
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+"\t");
			}
			System.out.println("\n");
			
			
		}
		
			for(int i=5;i<=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+"\t");
				}
			System.out.println();
		
		}
			for(int i=1;i<=5;i++) {
				if(i!=2 & i!=4) {
				for(int j=5;j>=i;j--) {
					System.out.print(j+"\t");
				}
				System.out.println("\n");
				
				
			}
		
	}

}
}

