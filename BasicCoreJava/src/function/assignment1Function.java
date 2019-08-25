package function;

public class assignment1Function 
{

	public static void main(String[] args)
	{
		String Sanjeet=result(84);
		System.out.println(Sanjeet);
		
	}
	
	public static String result(int marks)
	{
		String res;
		if(marks>=75)
		{
			res="Outstanding! Pass with distinction";
		}
		else if(marks>=60)
		{
			res="Congrats! Pass with first division";
		}
		else if(marks>=35)
		{
			res="Good! Pass";
		}
		else
		{
			res="You are fail";
		}
		return res;
	}

}
