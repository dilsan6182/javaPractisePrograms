
public class Example_String {
	public static void main(String[] args) {
		
		String str="dileep";
		//String str1= str;
		for(int i=0; i<str.length(); i++) {
			int count= 1;
			if(str.charAt(i)!='#') {
				for(int j=i+1; j<str.length(); j++) {
					if(str.charAt(i)==str.charAt(j)) {
						count=count+1;
					}
				}
				System.out.println(str.charAt(i)+"-->"+count);
				str=str.replace(str.charAt(i), '#');
			}
			
			
		}
				
	}

}
