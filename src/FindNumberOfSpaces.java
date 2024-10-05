
public class FindNumberOfSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="welcome to java";
        
        int space=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(Character.isWhitespace(ch)) {
        		space++;
        	}
        	
        }
        System.out.println("space count is: "+space);
	}
}