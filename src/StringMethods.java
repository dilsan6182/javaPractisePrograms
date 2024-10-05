import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		String s="welcome";
		int l=s.length();
		//System.out.println(l);
		System.out.println("welcome".length());
		String s1="welcome";
		String s2=" to java";
		String s3=" classes";
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));//for two strings adding
		System.out.println(s1.concat(s2).concat(s3));//for three strings adding
		
		s=" welcome   ";
		System.out.println("before trim "+s.length());
		System.out.println(s);//print string along with spaces
		System.out.println(s.trim());//print string without spaces
		System.out.println("after trim "+s.trim().length());
		
		//char()-->returns a character based on a string
		//index starts from 0
		s="welcome";
		System.out.println(s.charAt(3));//c
		//contains()-->returns true or false,cheks string part or not
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("welme"));//false

		//equals() and equalsIgnoreCase() ignore case
		s1="welcome";
		s2="welcome";
		String s31=new String("welcome");       
		System.out.println(s1==s2);  //true
		System.out.println(s1==s31);  //false  
		System.out.println(s1.equals(s31));  //true
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals("wElcome"));//false  w
		System.out.println(s1.equalsIgnoreCase("Welcome"));//true w
		
		//replace()--> replace single or multiple(sequence) of characters
		s="welcome to java classes java is best";
		System.out.println(s.replace('e', 'x'));//wxlcome...
		System.out.println(s.replace("java", "hi"));//welcome to hi
		
		//substring()-->extract substring from main string
		s="welcome";
		System.out.println(s.substring(0,3));//0123456->starting index  //wel
	                                         //welcome         //0--> starting index
		                                     //1234567->ending index //3-ending index
		
		//toUpperCase() toLowerCase()
		s="welcOmE";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//split()-->split the string into multiple parts based on delimeter
		s="dileepbandloju@gmail.com";
		String a[]=s.split("@");
		System.out.println(a[0]); //abc
		System.out.println(a[1]);  //@gmail.com
		
		//ex1
		String amount="$10,20,30";
		System.out.println(amount.replace("$", "").replace(",", ""));//102030
		
		//ex2
		s="dileep@gmail,com";
		String arr1[]=s.split("@");
		System.out.println(Arrays.toString(arr1));//dileep, gmail,com
		String arr2[]=arr1[1].split(",");
		System.out.println(Arrays.toString(arr2));//gmail, com
		//*  %  ^  &  we cant use with split
		//ex3
		String name="Dileep Bandloju";
		System.out.println(name.replace('D','d').contains("dileep"));//true
		System.out.println(name.toLowerCase().contains("dileep"));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
