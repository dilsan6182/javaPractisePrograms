
public class AnotherSwitch {
	public static void main(String[] args){
		System.out.println(DisplayName(2));
		System.out.println(DisplayName(3));
		
		
		
	}
	static int a=10;
   public static String DisplayName(int dayno) {
	   String result=null;
	   switch(dayno){
		   case 1:
			   result="monday";
			   break;
		   case 2:
			   result="tuesday";
			   break;
		   case 3:
			   result="wednesday";
			   break;
			   default:
				   System.out.println("invalid input");
			   
			   }
	   return result;
	   
   }

}