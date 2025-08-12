package basicprograms;

public class static_method_and_nonstatic_method {
	 void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		
	}
	 static void sub() {
		 int a=20;
		 int b=10;
		 int c=a-b;
		 System.out.println(c);
	 }

	 public static void main(String[] args) {
		 
		 static_method_and_nonstatic_method n=new static_method_and_nonstatic_method();
		 n.add();
		 sub(); //static method
		 
			 
		 }

	}

