package array;

public class OneDimensionalArray {

	public static void main(String[] args) 
	{
		String[] str=new String[7];  //Syntax to define array #for string, going to create array on memory
		str[0]="Abhishek";
		str[1]="Rutuja";
		str[2]="Shirin";
		str[3]="Shiva";
		str[4]="Shital";
		str[5]="Sanjeet";
		str[6]="Ayushi";
		
		//System.out.println(str[3]);    // to print single value
		
		for(int i=0; i<=6; i++)         // to print all values#use loop
		{
			System.out.println(str[i]);
		}
		
		


	}

}
