package oops_inheritance;

public class User {

	public static void main(String[] args)
	{
		SmartPhone sm= new SmartPhone();
		sm.internet();
		sm.calling();
		sm.texting();
		
		MobilePhone mb= new MobilePhone();
		mb.texting();
		mb.calling();
		
		Telephone phone=new Telephone();
		phone.calling();

	}

}
