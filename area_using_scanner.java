package basicprograms;

import java.util.Scanner;



public class area_using_scanner {
	 static void trianglearea() {
		 Scanner n1=new Scanner(System.in);
		int a= n1.nextInt();
		double b=0.5*a*a;
		System.out.println(b);
		//n1.close();
	 }
	 
	 void circlearea() {
		 Scanner n2=new Scanner(System.in);
		 int r=n2.nextInt();
		 double b=Math.PI*r*r;
		 System.out.println(b);
		 //n2.close();
	 }
	 
	 void rectanglearea() {
		 Scanner n3= new Scanner(System.in);
		 int a=n3.nextInt();
		 int b=n3.nextInt();
		 int c=a*b;
		 System.out.println(c);
		 //n3.close();
	 }
	 
	public static void main(String[] args) {
		
		trianglearea();
		area_using_scanner s1=new area_using_scanner();
		s1.circlearea();
		s1.rectanglearea();
		
	
	
	}

}
