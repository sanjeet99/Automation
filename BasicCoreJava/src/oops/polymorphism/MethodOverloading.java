package oops.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	
	//Static Polymorphism
	{
		MethodOverloading obj= new MethodOverloading();
		
		obj.sum(10,20);
		obj.sum(10, 20, 30);
	
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum( int a, int b, int c)
	{
		return a+b+c;
	}

}
