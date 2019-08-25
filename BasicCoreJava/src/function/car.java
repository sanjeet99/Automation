package function;

public class car    //Non static
{
	//int wheels;
	static int wheels=4;
	String colour="Blue";
	String model;
	
	public void specification()
	{
		System.out.println("Specifications: wheels:"+wheels+", colour="+colour+" and model="+model);
	}
	
	public static void testdrive()    // testdrive is a function
	{
		System.out.println("test drive");
	}
	
	public static void main(String[] args) 
	{
		//static variables and static functions
		testdrive();                    // called that function in main
		System.out.println(wheels);
		
		//Non static variables and non static functions
		//Now call specifications
		car c= new car();
		System.out.println(c.colour);
		c.specification();
		
	}

}

