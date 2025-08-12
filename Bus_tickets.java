package basicprograms;

import java.util.Scanner;

public class Bus_tickets {

	public static void main(String[] args) {
//		String name="Boy";
//		int age=56;

		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		int age=s1.nextInt();

		//if(name=="Boy") 
			if(name.equalsIgnoreCase("Boy"))
		{
			if(age>0 && age<=15)
			{
				System.out.println("Ticket is 50 rs");
			}
			if(age>15 && age<=40)
			{
				System.out.println("Ticket is 100 rs");
			}

			if(age>40 && age<=55) 
			{
				System.out.println("Ticket is 75 rs");
			}
			if(age>55)
			{
				System.out.println("Ticket is free");
			}
		}
		else
		{
			System.out.println("Ticket is free for womens");
		}
	}

}
