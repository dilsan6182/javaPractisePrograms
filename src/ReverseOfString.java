
public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HEllo";
		String rev="";
		
		//logic1------using concatenation 
//		for(int i=s.length()-1;i>=0;i--) {            //reverse number
//		 char ch=s.charAt(i);
//		 rev=rev+ch;
//		 }
//		System.out.println(rev);
//		
//		if(s.equals(rev)) {
//			System.out.println("its a palindrome"+rev); //palindrome
//		}
//		
		//logic2----------using character array
//		char ch[]=s.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			rev=rev+ch[i];
//			}
//		System.out.println(rev);
		
	
	//logic3--------using stringbuffer class
//	StringBuffer sb=new StringBuffer(s);
//    StringBuffer reverse=sb.reverse();
//		System.out.println(reverse);
		
		//logic4
//		int uppercount=0;
//		int lowercount=0;
//		for(int i=s.length()-1;i>=0;i--) {
//			char ch=s.charAt(i);
//			System.out.print(ch);
//		}
		
		//logic5
		StringBuilder sbl=new StringBuilder(s);
		//StringBuilder sbl=new StringBuilder();
		//sbl.append(s);
		//sbl.reverse();
		sbl.reverse().toString();
		System.out.println(sbl);
		}

		}
