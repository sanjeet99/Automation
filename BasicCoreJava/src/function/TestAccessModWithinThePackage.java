package function;

public class TestAccessModWithinThePackage {

	public static void main(String[] args) 
	
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfuntion();
		
		//obj.privatefuntion();  Will not be visible outside the class and within the package
		
		obj.protectedfuntion();
		obj.defaultfuntion();

	}

}
