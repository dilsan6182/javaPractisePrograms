
public class RemoveVowels {

	public static void main(String[] args) {
		
		/*String value="";
		String s="hihellohowareyou";
        for(int i=0;i<s.length();i++){
        	char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
            	value=value+s.charAt(i);
                }
                else {
                    value=value+"";
                }

            } 
            System.out.println(value);*/
		int count;
		String value="";
		String s="hihellohowareyou";
		for(int i=0;i<s.length();i++) {
			count=1;
			for(int j=i+1;j<s.length();j++) {
				
				if(s.charAt(j)==s.charAt(i)) {
					count+=1;
					}
				
					}
			if(count==1){
				value=value+s.charAt(i);
				
			}
			
		}
		System.out.println(value);
		
		
			
			}
}
		
	


