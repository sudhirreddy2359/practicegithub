package basicprograms;

public class constructor_overloading {
	constructor_overloading(int a,int b){
		System.out.println(a+b);
	}
	constructor_overloading(int a, String b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		//there are two types to create object in constructor
		//type 1
		//constructor_overloading n=new constructor_overloading(1,3);
		//constructor_overloading r=new constructor_overloading(1,"sudhir");
		
		//type 2
		new constructor_overloading(1,4);
		new constructor_overloading(1,"sudhir");

	}

}
