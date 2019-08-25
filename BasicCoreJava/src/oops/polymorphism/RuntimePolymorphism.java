package oops.polymorphism;

import oops_inheritance.SmartPhone;
import oops_inheritance.Telephone;

public class RuntimePolymorphism { // Dynamic polymorphism

	public static void main(String[] args) 
	
	{
		Telephone obj=new SmartPhone(); //Reference is of telephone and We are making object of child class i.e smartphone
		obj.calling();

	}

}
