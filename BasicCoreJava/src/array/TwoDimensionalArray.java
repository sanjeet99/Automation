package array;

public class TwoDimensionalArray {

	public static void main(String[] args)
	
	{
		String[][] data=new String[5][2];
		
		
		//Row1
		data[0][0]="U1";
		data[0][1]="P1";
		
		//Row2
		data[1][0]="U2";
		data[1][1]="P2";
		
		//Row3
		data[2][0]="U3";
		data[2][1]="P3";
		
		//Row4
		data[3][0]="U4";
		data[3][1]="P4";
		
		//Row5
		data[4][0]="U5";
		data[4][1]="P5";
		
		/*
		 * System.out.print(data[0][0]+"|"); System.out.println(data[0][1]);
		 * System.out.print(data[1][0]+"|"); System.out.println(data[1][1]);
		 */
		
		//for(int r=0; r<5; r++)  //5 is hard coded
		for(int r=0; r<data.length; r++)
		{
			//for(int c=0; c<2; c++) //2 is hard coded
			for(int c=0; c<data[0].length; c++)
		  {
			System.out.print(data[r][c]+" ");
		  }
			System.out.println();
		}

	}

}
