package collections;

public class ObjectArray2 {

	public static void main(String[] args) 
	
	{
		Object[] arr= new Object[3];
		
		arr[0]=100;
		arr[1]=true;
		arr[2]="anand";
		
		/*
		 * for(int i=0; i<arr.length; i++) { System.out.println(arr[i]); }
		 */
		
		for(Object o:arr) //Enhanced forLoop 
		{
			System.out.println(o);
		}

	}

}
