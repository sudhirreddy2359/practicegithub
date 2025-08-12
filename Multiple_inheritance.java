package basicprograms;

interface firstclass {
	void add();
	
}
 interface secondclass {
	void sub();
 }
 
 


public class Multiple_inheritance implements firstclass , secondclass {

	public static void main(String[] args) {
		Multiple_inheritance m=new Multiple_inheritance();
		m.add();
		m.sub();
		
	}

	@Override
	public void sub() {
		System.out.println("second class");
		
	}

	@Override
	public void add() {
		System.out.println("first class");
		
	}

}
