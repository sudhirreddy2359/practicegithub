package basicprograms;

public class Global_Staticvariables {
	 static int a=1;
	static int b=2;
	
	
	static void add() {
		//int a=29;  //updating value of a and b
		//int b=1;
		    //
		System.out.println(a+b);
	}

    void sub() {
    	
		System.out.println(a-b);
	}

     void mul() {
	System.out.println(a*b);
}

	public static void main(String[] args) {
		add();
		Global_Staticvariables n1=new Global_Staticvariables();
		a=11;
		n1.sub();
		
		n1.mul();

	}

}
