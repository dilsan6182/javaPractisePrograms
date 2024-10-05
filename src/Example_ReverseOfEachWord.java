
public class Example_ReverseOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome To Java Classes";
String[] s = str.split(" ");
System.out.println(s.length);

for(int i=0; i < s.length; i++) {
	
	for(int j=s[i].length()-1;j>=0;j--) {
		System.out.print(s[i].charAt(j));
	}
	System.out.print(" ");
}
}
}