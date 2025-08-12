package basicprograms;

public class Global_nonstaticvariables {  //Globalvariables using both static method nad non static method
	 int a=10;
	 int b=20;
	
	 static void add() {
		 Global_nonstaticvariables n1=new Global_nonstaticvariables();
		System.out.println(n1.a+n1.b);
	}

	 static void sub() {
		 Global_nonstaticvariables n1=new Global_nonstaticvariables();
		System.out.println(n1.a-n1.b);
	}

	 static void mul() {
		 Global_nonstaticvariables n1=new Global_nonstaticvariables();
	System.out.println(n1.a*n1.b);
}
	 public static void main(String[] args) {
		 add();
		 sub();
		 mul();
	 }
}
