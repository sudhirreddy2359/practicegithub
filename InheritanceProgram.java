package basicprograms;

class ParentClass extends childclass{
	static void login() {
		System.out.println("log in success");
	}
	void access() {
		System.out.println("access denied");
	}
}

class childclass{
	static void checkin() {
		System.out.println("check in sucess");
	}
		void checkout() {
			System.out.println("check out sucess");		}
}


public class InheritanceProgram extends ParentClass
{
	static void logout() {
		System.out.println("logout sucess");
	}
	public static void main(String[] args) {
		//childclass n2=new childclass();
		//ParentClass n3=new ParentClass();
		InheritanceProgram n1=new InheritanceProgram();
//		n1.login();
//		n1.logout();
		logout();
		login();
		checkin();
		n1.checkout();
		n1.access();
	}

}
