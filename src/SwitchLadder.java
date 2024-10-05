import java.util.Scanner;
public class SwitchLadder {
	public static void main(String[] args) {
		SwitchLadder(2);
	}
    
		public static void SwitchLadder(int dayno) {
    switch(dayno) {
    case 1:
    	System.out.println("Monday");
    break;
    case 2:
    	System.out.println("tuesday");
    	break;
    case 3:
    	System.out.println("wednesday");
    	break;
    	default:
    		System.out.println("invalid input");
    }
		
	}

}
