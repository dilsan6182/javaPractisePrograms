package collections;

import java.util.ArrayList;

public class DuplicatesWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<Integer> Duplicates=new ArrayList<Integer>(); 
		  ArrayList<Integer>Dp1=new ArrayList<Integer>(); 
		  Duplicates.add(10); 
		  Duplicates.add(20);
		  Duplicates.add(30); 
		  Duplicates.add(10); //wrong Duplicates.add(40);                                                                                                                                                                                                                           
		  int size=Duplicates.size(); 
		  System.out.println(size);
		  
		  System.out.println(Duplicates); 
		  for(int i=1;i<size;i++) { 
		  for(int j=i+1;j<size;j++) { 
		 if(Duplicates.get(i).equals(Duplicates.get(j))) {
		  Duplicates.remove(j);
		 
		 }
		 } 
		  } 
		  
		  System.out.println(Duplicates);
		 
		
}
	}
