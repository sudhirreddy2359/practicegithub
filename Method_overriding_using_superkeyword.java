package basicprograms;

class parentt {
	 void login() {
		System.out.println("hellow");
	}
}


public class Method_overriding_using_superkeyword extends parentt {
	 void login() {
		
		System.out.println("hai");
		super.login();
	}
	
	public static void main(String[] args) {
		Method_overriding_using_superkeyword n=new Method_overriding_using_superkeyword();
		n.login();

	}

}
