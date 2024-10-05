import java.util.*;
public class RetainSpacesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to java world";
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	rev=rev.replace(" ", "");
	System.out.println(rev);
	
    String value="";
    int j=0;
    for(int i=0;i<str.length();i++) {
    	if(str.charAt(i)==' ') {
    		value=value+" ";
    	}
    	else {
    		value=value+rev.charAt(j);
    		j++;
    		}
    	 
    }
    System.out.println(value);
	}
}