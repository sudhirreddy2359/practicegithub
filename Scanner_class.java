package basicprograms;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	    //String m=s1.next();
		
		System.out.println("Please enter the value a:" ); 
		int a=s1.nextInt();
		
		
		
		System.out.println("Please enter the value b:");
			int b=s1.nextInt();
			
			s1.close();
			
			
			int c=a+b;
			System.out.println(c);
			
		}

	}


