package basicprograms;

public class Local_variables {
	
	static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	void sub() {
		int a=10;
		int b=20;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		add();
		Local_variables n1=new Local_variables();
		n1.sub();

	}

}
