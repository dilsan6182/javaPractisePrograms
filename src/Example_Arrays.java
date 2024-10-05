
public class Example_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] p = new int[5];
		p[0] = 10;
		p[1] = 20;
		p[2] = 30;
		p[3] = 40;
		p[4] = 50;
		System.out.println(p[3]);
		System.out.println("size: " + p.length);
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);

		}
		int[] q = { 10, 20, 30, 40, 50, 60 };
		System.out.println(q.length);

		for (int i = 0; i < q.length; i++) {
			System.out.println(q[i]);
		}

		int[][] x = new int[2][3];
		// first row
		x[0][0] = 11;
		x[0][1] = 12;
		x[0][2] = 13;
		// second row
		x[1][0] = 21;
		x[1][1] = 22;
		x[1][2] = 23;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
//	System.out.println(a.length);
//	System.out.println(a[0].length);
// to print the elements
/*
 * for(int arr[]:a) { for(int b:arr) { System.out.print(b+" "); }
 * System.out.println(); }
 */

// to print max value
