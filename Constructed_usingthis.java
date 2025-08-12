package basicprograms;

public class Constructed_usingthis {
	Constructed_usingthis(int a,int b){
		this((byte)10 , (byte)20);
		System.out.println(a+b + "this is addition");
		
	}
	Constructed_usingthis(byte a,byte b){
		this((short)20,(short)30);
		
		System.out.println(a-b + "this is subtraction");
		
	}
	Constructed_usingthis(short a,short b){
		
		System.out.println(a*b + "this is multiplication");
		
	}

	public static void main(String[] args) {
		new Constructed_usingthis(1,8);
		//new Constructed_usingthis((byte)6,(byte)7);
		//new Constructed_usingthis((short)6,(short)7);

	}

}
