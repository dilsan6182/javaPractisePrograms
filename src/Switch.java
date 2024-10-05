
public class Switch {
	public static void main(String[] args) {
		String a="monday";
		switch(a) {
		case "monday" -> System.out.println(1);
		case "tuesday" -> System.out.println(2);
		case "wednesday" -> System.out.println(3);
		case "thursday" -> System.out.println(4);
		case "friday" -> System.out.println(5);
		case "saturday" -> System.out.println(6);
		case "sunday" -> System.out.println(7);
		default -> System.out.println("invalid input");
		}
	}
}
