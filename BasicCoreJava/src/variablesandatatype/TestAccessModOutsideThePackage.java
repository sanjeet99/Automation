package variablesandatatype;

import function.AccessModifiers;

public class TestAccessModOutsideThePackage extends AccessModifiers {

	public static void main(String[] args) 
	
	{
		AccessModifiers obj= new AccessModifiers();
		obj.publicfuntion();
		
		TestAccessModOutsideThePackage obj2= new TestAccessModOutsideThePackage();
		obj2.protectedfuntion();
		
		//obj.privatefunction();  Will not be visible outside the class and the package
		
		//obj.protectedfunction(); Will not be visible outside the package, but can do it with the help of childclass
		
		//obj.defaultfuntion(); Will not be visible outside the package

	}

}
