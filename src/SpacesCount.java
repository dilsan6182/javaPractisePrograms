
public class SpacesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java world dileep";
		String str1=str;
		
		
		for(int i=0;i<str1.length();i++) {
			int count=1;
			if(str1.charAt(i)==' ') {
				for(int j=i+1;j<str1.length();j++) {
					if(str1.charAt(i)==str1.charAt(j)) {
				
						count=count+1;
					
				}
				}
				System.out.println("number of spaces are: "+count);
				break;
	}
}
}
}