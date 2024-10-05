import java.util.Scanner;
public class MaximumOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in); 
     System.out.println("enter words");
     String str=sc.nextLine();
     
     String[] s=str.split(" ");
     int count=1;
     for(int i=0;i<s.length;i++ ) {
    	 
    	 for(int j=i+1;j<s.length;j++) {
    		 if(s[i]==s[j]) {
    			 count=count+1;
    		 }
    		 
    	 }
    	 if(count>1&&s[i]!="0") {
    	 System.out.println(s[i]+":"+count);
    	 
     }
    	 
    	 
     }
     System.out.println();
	}
}

