
public class UpperLowerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y="hi HEllo";
	    
	    int uppercase=0;
	    int lowercase=0;
	    for(int i=0;i<y.length();i++) {
	    	char ch=y.charAt(i);
	    if(Character.isUpperCase(ch)) {
	    	
	    	uppercase++;
	    	}
	    if(Character.isLowerCase(ch)) {
	    	lowercase++;
	    }
	    }
	    System.out.println(uppercase);
	    System.out.println(lowercase);
		

	}

}
