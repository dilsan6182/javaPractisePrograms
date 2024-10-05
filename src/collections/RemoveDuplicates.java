package collections;

import java.util.*;

public class RemoveDuplicates {
	//using linked hashset

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Duplicates=new ArrayList<Integer>();
		  int size=Duplicates.size();
		  Duplicates.add(10);
		  Duplicates.add(20);
		  Duplicates.add(30);
		  Duplicates.add(10);
		  Duplicates.add(40);
		  
		  System.out.println(Duplicates);
		  LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(Duplicates);
		  System.out.println(uniqueNumbers);
		  //linkedhashset will remove duplicate elements
	  ArrayList<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbers); // Create a new ArrayList from the LinkedHashSet
	                                                                          // This will contain the unique elements
		  for (int number : uniqueNumbersList) {                              // Print the unique elements
          System.out.println(number);
  
  }

	}
}
