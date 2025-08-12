package basicprograms;

import java.util.Scanner;

public class Cicumferance_using_scanner {
	 static void triangleCicumferance() {
		 Scanner n1=new Scanner(System.in);
		int a= n1.nextInt();
		int b= n1.nextInt();
		int c= n1.nextInt();
		
		System.out.println(a+b+c);
		//n1.close();
	 }
	 
	 void circleCicumferance() {
		 Scanner n2=new Scanner(System.in);
		 int r=n2.nextInt();
		 double b=2*Math.PI*r;
		 System.out.println(b);
		// n2.close();
	 }
	 
	 void rectangleCicumferance() {
		 Scanner n3= new Scanner(System.in);
		 int a=n3.nextInt();
		 int b=n3.nextInt();
		 int c=2*(a+b);
		 System.out.println(c);
		 //n3.close();
	 }
	 

	public static void main(String[] args) {
		triangleCicumferance();
		Cicumferance_using_scanner s1=new Cicumferance_using_scanner();
		s1.circleCicumferance();
		s1.rectangleCicumferance();
		
		

	}

}
