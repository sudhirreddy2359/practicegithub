package basicprograms;

public class String_functions {
	public static void main(String[] args) {
		String n="sudhir";
		String m="";
		for(int i=n.length()-1;i>=0;i--) {
			char a=n.charAt(i);
			m=m+a;
		}
System.out.println(m);
	}
}
