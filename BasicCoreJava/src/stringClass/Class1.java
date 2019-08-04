package stringClass;

public class Class1 {

	public static void main(String[] args) 
	{
		String name="Sanjeet";
		String name2="sanjeet";
		
		//CharAt
		System.out.println(name.charAt(2));
		
		//2. ToUpperCase
		System.out.println(name.toUpperCase());
		
		
		//3. ToLowerCase
				System.out.println(name.toLowerCase());
				
				
		//4.Equals		
		System.out.println(name.equals(name2));
		
		
		//5. EqualIgnoreCase
		System.out.println(name.equalsIgnoreCase(name2));
		
		
		//6.Split
		String str="U1,U2,U3";
		String[] users=str.split(",");
		
		for(int i=0; i<users.length; i++)
		{
		System.out.println(users[i]);
		}
		
		//7. Replace
		System.out.println(str.replace(",", "|"));
		
		//8. Sub string
		System.out.println(name.substring(2));
		System.out.println(name.substring(0, 2));
		
		//9.Contains
		System.out.println(name.contains("jeet"));

	}

}
