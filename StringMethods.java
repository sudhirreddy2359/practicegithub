package basicprograms;

public class StringMethods {

	public static void main(String[] args) {
		String s1="sudhir";
		//to check weather the letter is starting with given input
		System.out.println(s1.matches("s(.*)"));
		//to check weather the letter is ending with given input
		System.out.println(s1.matches("(.*)r"));
		String s2="with";
		 System.out.println(s2.matches("...."));
		 String s3="postman";
		 System.out.println(s3.matches("(.*)man(.*)"));
		

	}

}
