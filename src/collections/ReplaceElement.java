package collections;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		  int size=list1.size();
		  
		  System.out.println(list1);
		  list1.add(18);
		  list1.add(45);
		  list1.add(88);
		  list1.add(9);
		  list1.add(23);
		  list1.add(40);
		  list1.add(56);
		  list1.add(37);
		  
		  System.out.println(list1);
		  list1.remove(5);
		  System.out.println(list1);
		  list1.add(5,57);
		  System.out.println(list1);
		  
}
}