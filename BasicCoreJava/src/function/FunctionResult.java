package function;

public class FunctionResult
{
	public static String Result(int marks)
	{
		String Result;
		if(marks>=35 && marks<60)
		{
			Result="Yippee! You're Pass";
		}
		else if(marks>=60 && marks<75)
		 {
			Result="Congrats! Pass with First division";
		 }
		else if(marks>=75)
		{
			Result ="Great Pass with distinction";
		}
		else
		{
			Result= "Fail";
		}
		return Result;
	}
	

	public static void main(String[] args) 
	
	{
	String Result;
	Result= Result(56);
	System.out.println(Result);
	}

}
