
public class String_Replace {
	public static void main(String[] args) {
	String str="dileepjaavaaa";
	String str1=str;
	for(int i=0;i<str1.length();i++) {
		int count=1;
		if(str1.charAt(i)!='#') {
			for(int j=i+1;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					count=count+1;
					
				}
			}
			
			System.out.println(str1.charAt(i)+"-->"+count);
		str1=str1.replace(str1.charAt(i),'#');
		}
		}
	}
}