package basicprograms;

public class Constructor_usingthis_nonparameter {
	Constructor_usingthis_nonparameter()
	{
		//this();
		System.out.println("non parametarized");
	}
	
	Constructor_usingthis_nonparameter(int a,long b){
		this();
		System.out.println("parameterized");
	}

	public static void main(String[] args) {
		Constructor_usingthis_nonparameter n=new Constructor_usingthis_nonparameter(2,999333l);
		

	}

}
