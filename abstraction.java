package basicprograms;

abstract class Abstraction_Parent{
	abstract void add();
	abstract void sub();
}

public class abstraction extends Abstraction_Parent
{
	void add() {
		System.out.println("add");
	}
	
	void sub() {
		System.out.println("sub");
	}
	void sum() {
		System.out.println("sum");
	}
	
	
	
	public static void main(String[] args) {
		
		abstraction n=new abstraction();
		n.add();
		n.sub();
		//n.sum();

	}

}
