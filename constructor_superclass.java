package basicprograms;

 class parent {
	// parent(double a,double b){
	 parent(){
		 int a=10;
		 int b=20;
		System.out.println(a+b); 
	 }
	
}
 
 class grandparent extends parent {
	 
	 grandparent(float a,float b){
	super();
	System.out.println(a-b);
	 }
 }
 
 
public class constructor_superclass extends grandparent 
{

	constructor_superclass(byte a,byte b) {
		super(1f,2f);
		// TODO Auto-generated constructor stub
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		constructor_superclass c = new constructor_superclass((byte)5,(byte)6);
		
	
	}

	}
