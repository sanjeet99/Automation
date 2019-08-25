package oops_inheritance;

public class MobilePhone extends Telephone // Overriding
{
	public void texting() 
	{
		System.out.println("Texting from Mobile");
	}

	
	 // public void calling(int a) : Parameter different, it will become overloading and the green Triangle on left will disappear
	 public void calling()
	 {
		 System.out.println("calling from mobile"); 
	 
	 }
	 

}
