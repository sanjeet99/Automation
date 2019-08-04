package array;

public class IntArray_RollNo {

	public static void main(String[] args) 
	{
	
		int[] str=new int[7];   //Syntax for declaration of integer
		
	     str[0]=11;
	     str[1]=12;
	     str[2]=13;
	     str[3]=14;
	     str[4]=15;
	     str[5]=16;
	     str[6]=17;
	     
	     System.out.println(str.length); // ln means new line
	  System.out.print(str.length+" "); // to check the length of the object
	     
		/*
		 * for(int i=0; i<6; i++) { System.out.println(str[i]); }
		 */
		
		/*
		 * for(int i=0; i<7; i++) { System.out.println(str[i]); }
		 */

	     
	     for(int i=0; i<=6; i++)
	     {
	    	 
	    	 System.out.print(str[i]+" ");
	     }
	     for(int i=0; i<=6; i++)
	     {
	     System.out.print(str[i]+"||");
	     }
	}

}
