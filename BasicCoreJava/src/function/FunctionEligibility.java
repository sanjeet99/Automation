package function;

public class FunctionEligibility 
{
	
	public static boolean eligibility(int age)
	{
		if(age>=18 && age<=30)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		boolean value;
	value=eligibility(31);
	
		if(value)
		{
		System.out.println("Yippee you're Eligible");
		}
		else
		{
			System.out.println("Bad Luck Not Eligible");
		}
	}

}
