
public class CapsSmallCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="DiLeep";
		int lowercase=0;
		int uppercase=0;
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			char ch11=str1.charAt(i);
			if(Character.isUpperCase(ch11)) {
				uppercase++;
			}
			
			else if(Character.isLowerCase(ch11)) {
			lowercase++;
			}
			}
		
		System.out.println(uppercase);
		System.out.println(lowercase);
}
}