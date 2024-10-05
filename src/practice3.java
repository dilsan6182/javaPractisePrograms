
public class practice3{

	public static void main(String[] args) {
		
		String s="hihello";
		String temp="";
		
		
		for(int i=0;i<s.length();i++) {
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count=count+1;
					temp=temp+"";
				}
			}
				if(count==1) {
					temp=temp+s.charAt(i);
			}
		
			}
			System.out.println(temp);
		
		
	}
}