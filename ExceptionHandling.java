package basicprograms;

public class ExceptionHandling {

	public static void main(String[] args) {
		// 1/1=1
		// 1/0=infinity
		// 0/1=0
		try {
		int a=1/0;
		System.out.println("try block");
		}
		catch(ArithmeticException a1) { //ArithmeticException copy from output
		System.out.println("catch block is executing");
		}
	}

}
