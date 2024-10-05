
public class MaximumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a={
				{5, 4, 3},
				{1, 2, 5},
				{9, 6, 5}
		        };
		
		for(int i=0;i<a.length;i++) {
			int max=a[i][0];
			for(int j=1;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
					
				}
				
			}
			System.out.println("maximum number from row number "+(i+1)+" is:7+"+max);
		}
	}
	

	}


