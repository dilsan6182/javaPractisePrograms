
public class Example_DuplicateString {
	public static void main(String[] args) {
		String str="dileepJavaClasses1234*/@$";
		String str1=str;
		String Lower="";
		String Upper="";
		String Digit="";
		String Spec="";
		int Lowercount=0;
		int Uppercount=0;
		int Digitcount=0;
		int Speccount=0;;
		
		for(int i=0; i<str1.length(); i++) {
			char c=str1.charAt(i);
			if(Character.isLowerCase(c)) {
				Lower=Lower+c;
				Lowercount=Lowercount+1;
			}
//			else if(Character.isUpperCase(c)) {
//				Upper=Upper+c;
//				Uppercount=Uppercount+1;
//				}
//			else if(Character.isDigit(c)) {
//				Digit=Digit+c;
//				Digitcount=Digitcount+1;
//			}
//			else{
//				Spec=Spec+c;
//				Speccount=Speccount+1;
//			}
//			
				
				
				
		}
		
		System.out.println("LowerLetters are: "+Lower +" count is " +Lowercount);
//		System.out.println("UpperLetters are: "+Upper +" count is " +Uppercount);
//	    System.out.println("Digits are: "+Digit +" count is "+Digitcount);
//	    System.out.println("special characters are: "+Spec +" count is "+Speccount);
	}

}
