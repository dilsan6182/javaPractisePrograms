
public class VowelsInString {

	public static void main(String[] args) {
	
				String s="wearestartingseleniumtomorrow";
				String value="";
				int count=1;
				for(int i=0;i<s.length();i++) {
					for(int j=i+1;j<s.length();j++) {
						char ch=s.charAt(i);
						
		            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
							
							value=value+"";
						
								
							}
		            else if(s.charAt(i)==s.charAt(j)) { 
		            value=value+s.charAt(i);  
		            count=count+1;
		            
		            }
								
					}
					
				}
				System.out.println(value+" "+count);
				 
	}

}
