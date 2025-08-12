package basicprograms;

class parents extends grand {
	parents(){
		//super();
		int a=10;
		int b=20;
		
		System.out.println(a+b);
	}
}

class grand{
	grand(){
		float a=20f;
		float b=10f;
		System.out.println(a*b);
	}
}
public class constructorsuper extends parents {
	constructorsuper(){
		//super();
		double a=2d;
		double b=4d;
		System.out.println(b-a);
	}

	public static void main(String[] args) {
		constructorsuper n=new constructorsuper();
		

	}

}
