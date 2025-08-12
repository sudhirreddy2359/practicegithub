package basicprograms;

public class method_overloading {
		static void overloading(int a, int b){
		System.out.println(a+b);
	}
		void overloading(String f, String  h) {
		System.out.println(f+h);
	}

	public static void main(String[] args) {
		
		overloading(10,2);
		
		//overloading(2222,9);
		method_overloading n=new method_overloading();
		n.overloading("sudhir","reddy");
		
	}

}
