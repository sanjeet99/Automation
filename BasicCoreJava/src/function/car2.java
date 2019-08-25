package function;

public class car2 // class name is car2
{
	int cc;
	String fueltype;
	int steering;
	
	
	//Default Constructor
	public car2()
	{
		
	}
	
	
	//parameterized constructor
	/*
	 * public car2(int cc1, String fueltype1 , int steering1) // Looks like a method
	 * and name is class name { cc=cc1; fueltype=fueltype1; steering=steering1; }
	 */
	public car2(int cc, String fueltype , int steering)  // Looks like a method and name is class name
	{
		this.cc=cc;  // this is used to point the instance variable directly.
		this.fueltype=fueltype;
		this.steering=steering;
	}
	
	public void accelaration()
	{
		System.out.println("Car is accelarting with: Engine:"+cc+", fueltype="+fueltype+" and steering="+steering);
		System.out.println(steering+" steering cars's fueltype is "+fueltype+" and Engine size is "+cc);
		
	}
	
}
