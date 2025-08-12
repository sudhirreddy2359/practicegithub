package basicprograms;

public class nonstatic_method {
		void sub() {
		int a=50;
		int b=40;
		System.out.println(a-b);
		
	}
		
		
	
	public static void main(String[] args) {
		
		nonstatic_method m=new nonstatic_method();
		m.sub();
		
		
		
		
	}

}
