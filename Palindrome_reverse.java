package basicprograms;

public class Palindrome_reverse {

	public static void main(String[] args) {
		String input="rotators";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			char a=input.charAt(i);
			output=output+a;
			
		}
		if(input.equals(output)) {
			System.out.println("palindrome");
		}
		else {
		System.out.println("not");
		}
		
	
	}
}
