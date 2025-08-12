package basicprograms;

public class arthematic_operations {
	static int a=10;
	static int b=20;
	 
	static void add() {
		System.out.println(a+b);
	}
	
	
	
	
	void sub(int a, int b) {
		//arthematic_operations n=new arthematic_operations();
		//n.sub();
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		add();
		arthematic_operations n=new arthematic_operations();
		n.sub(30,30);
		n.mul();
		
	}



void mul() {
	//arthematic_operations n=new arthematic_operations();
	//n.sub();
	System.out.println(a*b);
}
}
