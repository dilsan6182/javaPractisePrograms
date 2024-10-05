package collections;
import java.util.ArrayList;
import java.util.Collections;

public class AddListArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  ArrayList<Integer> list1=new ArrayList<Integer>();
			  int size=list1.size();
		
			  list1.add(10);
			  list1.add(20);
			  list1.add(30);
			  list1.add(10);
			  list1.add(40);
			  System.out.println(list1);
			  System.out.println(list1.size());
			  for(int i=0;i<list1.size();i++) {
				  System.out.println(list1.get(i));
				  
				 
			  }
			  System.out.println();
			  for(Integer value:list1) {            //using "for each" method to print array list
				  System.out.println(value);
				  
				  
			  }
			  System.out.println();                        
			  for(int i=list1.size()-1;i>=0;i--) {             //reverse of arraylist without reverse order 
				  System.out.println(list1.get(i));
			  }
			  System.out.println();
			  Collections.sort(list1);                         //sort and reverse of arraylist with "reverse order"
			  System.out.println(list1);
			  Collections.sort(list1,Collections.reverseOrder());
			  System.out.println(list1);
				}

				

			}





	
