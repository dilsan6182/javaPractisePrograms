
public class Example_LowerUpper {
	public static void main(String[] args) {
		String str="DileepJavaClasses";
		
	int lowCount = 0;
	int upperCount= 0;
	
    for(int i=0; i<str.length(); i++) {
    	char c=str.charAt(i);
    	if(Character.isLowerCase(c)) {
    		lowCount=lowCount+1;
    	}else if (Character.isUpperCase(c)) {
    		upperCount=upperCount+1;
    	}
    }
    System.out.println("lowercount is:" +lowCount);
    System.out.println("uppercount is:" +upperCount);
	}

}
