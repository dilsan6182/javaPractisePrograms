import java.util.Scanner;

public class Example_ReverseString {
	public static void main(String[] args) {
//		String str="welcome to java";
//		String[]words=str.split(" ",0);
//		String reverseString="";
//		for(String w:words) {
//			String reverseword="";
//			for(int i=w.length()-1;i>=0;i--) {
//				reverseword=reverseword+w.charAt(i);
//		
//				
//				
//			}
//				reverseString=reverseString+reverseword+"";
//			
//					
//		}
//		System.out.println(reverseString);
//		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String str=sc.nextLine();
		System.out.println(str);
		String[] words=str.split(" ");
		String outputString="";
		for(int  i=0;i<words.length; i++) {
			String word=words[i];
			String reverseword=getReverseString(word);
			
			outputString+=reverseword+" ";
		}
		System.out.println(outputString);
		sc.close();
		}
   private static String getReverseString(String InputString) {
	   String reverseString="";
	   for(int j=InputString.length()-1;j>=0;j--) {
			reverseString+=InputString.charAt(j);
		}
	return reverseString;
   }
}
