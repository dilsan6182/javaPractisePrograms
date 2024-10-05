
public class RemoveDuplicatesMuneer {

	public static void main(String[] args) {

		String s = "hihellohowareyouuuu";
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!str.contains(Character.toString(ch))) {
				str = str + ch;
			}

		}
		System.out.println(str);
	}

}
