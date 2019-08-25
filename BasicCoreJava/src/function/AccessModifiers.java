package function;

public class AccessModifiers 
{

	public static void main(String[] args)
	{
		AccessModifiers obj=new AccessModifiers();
		obj.publicfuntion();
		
		obj.privatefuntion();
		obj.protectedfuntion();
		obj.defaultfuntion();
		
		
	}
	public void publicfuntion()
	{
		System.out.println("Public funtion");
	}
	
	private void privatefuntion()
	{
		System.out.println("Protected funtion");
	}
	
	protected void protectedfuntion()
	{
		System.out.println("Protected funtion");
	}
	
	void defaultfuntion()
	{
		System.out.println("Default function");
	}
	
	

}
