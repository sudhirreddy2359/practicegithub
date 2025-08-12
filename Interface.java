package basicprograms;

interface logic2{
	void sub();
	void mul();
}

interface logic1 extends logic2{
	
	void add();
	
	void sub(int  r,int y);
	
}
public class Interface implements logic1 {
	

	public static void main(String[] args) {
		Interface m=new Interface();
		m.add();
		m.sub();
		m.mul();
		m.sub(1,6);

	}

	@Override
	public void add() {
		System.out.println("logic 1");
		
	}

	@Override
	public void sub() {
		System.out.println("logic 2");
		
	}

	@Override
	public void mul() {
		System.out.println("logic 3");
		
	}

	@Override
	public void sub(int r, int y) {
		System.out.println("logic 4");
		
	}

}
