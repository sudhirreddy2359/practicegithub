
package basicprograms;

public class Practice2 {
	
	/// static methods
	static void add() {
		int a=1;
		int b=2;
		System.out.println(a+b);
	}
	static void add(int a,int b) {
		System.out.println(a-b);
	}
	
	//non static method
	
	void sub() {
		int a=10;
		int b=20;
		System.out.println(b-a);
	}

	void sub(int a,int b) {
		System.out.println(b-a);
	}
	
	
	public static void main(String[] args) {
		add();
		add(2,9);

		Practice2 n=new Practice2();
		n.sub();
		n.sub(9,10);
	}

}
