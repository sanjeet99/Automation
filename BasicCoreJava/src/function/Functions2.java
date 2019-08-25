package function;

public class Functions2 
{
	public static void main(String[] args) 

	{
		int sum1, sum2;
		sum1=sum(10,20);
		sum2=sum(30,40);
		
		System.out.println(sum1+sum2);
	}
	
	public static int sum(int a, int b) // int as we want the return and values we want in return is numbers, that is int
	
	{
		return a+b;
	}

}
