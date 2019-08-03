package conditionalStatements;

public class ConditionalStatements {

	public static void main(String[] args)
{
		int a=10;
		int b=20;
		
		//1. >
		/*
		 * if(a>b) { System.out.println("a is grater than b"); } else {
		 * System.out.println("b is greater than a"); }
		 */
		
		//2. ==
		/*\
		 * if(a==b) { System.out.println("a is equals to b"); } else {
		 * System.out.println("b is not equals a"); }
		 */
		
		//3. !=
		if(a!=b)
		{
			System.out.println("a is not equals to b");
		}
		else
		{
			System.out.println("a is equals b");
		}

	}

}
