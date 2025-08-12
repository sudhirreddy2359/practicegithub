package basicprograms;


class one1{
	void add() {
		System.out.println("logic1");
	}
}

public class superkeyword extends one1 {
	
void add() {
	super.add();
	System.out.println("logic2");
}
	public static void main(String[] args) {
		superkeyword n=new superkeyword();
		n.add();

	}

}
