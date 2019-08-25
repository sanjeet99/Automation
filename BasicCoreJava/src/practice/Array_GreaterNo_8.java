package practice;

public class Array_GreaterNo_8 {

	public static void main(String[] args) 
	{
		int[] arr= {1, 8, 3, 4, 7, 5, 5, 1};
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println(max);
		

	}

}
