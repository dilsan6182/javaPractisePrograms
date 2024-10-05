

public class LargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is java program";
		String[] s=str.split(" ");
		System.out.println(s.length);
		String max=s[0];
		String min=s[0];
		for(int i=0;i<s.length;i++) {
			if(max.length()<=s[i].length()) {
				max=s[i];
			}
			if(min.length()>=s[i].length()) {
				min=s[i];
			}
	}
	System.out.println(max);
	System.out.println(min);
}
}
