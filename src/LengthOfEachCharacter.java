
public class LengthOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="selenium java";
		String str=s;
		int count=0;
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)!='#') 
			{
				for(int j=i+1;j<str.length();j++)
					if(str.charAt(i)==str.charAt(j)) 
					{
				count=count+1;
			        }
			
		     }
			System.out.println(str.charAt(i)+" "+count);
			str=str.replace(str.charAt(i),'#');

	    }

}
}