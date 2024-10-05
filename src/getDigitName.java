
public class getDigitName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="jai01";
		String temp="";
		char ch;
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)) {
			temp=temp+getDigitName(c);
			}else {
				temp=temp+c;
				
			}
		}
	
		
			System.out.println(temp);
	}
	
	public static String getDigitName(char c) {
		String value=null;
		switch (c) {
		case '0' -> value="zero";
		case '1' ->  value="one";
		}
		return value;
		}
	}


