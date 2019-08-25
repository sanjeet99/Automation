package practice;

public class forloop_2 {

	public static void main(String[] args) 
	
	{
		for(int i=0; i<=100; i++)
		{	
			
			if(i%2==0)
			{
			System.out.print(i+" ");
			}
			
		}
		
		System.out.println();
		int count=0;
		for(int i=0; i<=100; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("The count of odds are:" +count);
	}

}
