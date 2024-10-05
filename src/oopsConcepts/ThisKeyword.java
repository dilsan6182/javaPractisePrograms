package oopsConcepts;

public class ThisKeyword{
	int x,y;
	ThisKeyword (int a, int b){
		x=a;
		y=b;
	}
	void display() {
		System.out.println(x);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th=new ThisKeyword(100,200);
		th.display();
		
	
		
		
		
		}
	}

