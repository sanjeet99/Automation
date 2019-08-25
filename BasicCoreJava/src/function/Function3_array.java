package function;

public class Function3_array {
	
	public static void main(String[] args) 
	
	{
		int[] marks= {38, 86, 25, 78, 91};   //created array in main function
		String sanjeet= finalResult(marks);                 //called array in that function finalResult. Sanjeet is array
		System.out.println(sanjeet);
	}
	
	
	public static String finalResult(int[] arr) // created function which accepts array
	{
		int total=0;
		boolean fail=false;
		for(int i=0; i<arr.length; i++)
		{
			total= total+arr[i];
			if(arr[i]<35)
			{
				fail=true;
			}
		}	
		System.out.println(total);
		double percentage=(total*100/500);
		System.out.println(percentage);
	
	String res = null;
	if (fail)
		{
			res="You are fail";
		}
	else if(percentage>=75)
	{
		res="Outstanding! Pass with distinction";
	}
	else if(percentage>=60)
	{
		res="Congrats! Pass with first division";
	}
	else if(percentage>=35)
	{
		res="Good! Pass";
	}
	
	return res;
 }
}
