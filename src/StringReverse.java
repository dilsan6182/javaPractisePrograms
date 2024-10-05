
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="amma";
String temp="";
System.out.println(str.length());
char ch;
for(int i=0;i<str.length();i++) {
	ch=str.charAt(i);
	temp=temp+ch;
	}
System.out.println("original string: "+str);
System.out.println("reverse string: "+temp);
	if(str.equals(temp)) {
		System.out.println("given string is palindrome");
	}
	else {
			System.out.println("given string is not a palindrome");
		}
	}
	}


