package function;

public class FuntionOverloading // Function name is same but *parameters are different
{

	public static void main(String[] args) 
	{
		
		sum(10,20);
		sum(10,20,30);

	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}

	public static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
}
