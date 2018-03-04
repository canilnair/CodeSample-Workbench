package test;
import java.util.Random;

public class TwoDimentional_Array {

	public static void main(String[] args) {
		int row=3;
		int col=5;
		
		int[][] a = new int[row][col];
		Random rand = new Random(System.currentTimeMillis());
		//Storing Data into the rows and columns
		for(int r=0;r<row;r++){
			for(int c=0;c<col;c++){
				a[r][c]=rand.nextInt(1000);
			}
		}
		
		//Printing out Array values by Rows
		for(int r=0;r<row;r++){
			for(int c=0;c<col;c++){
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		// Calculating Average for the ROW		
		System.out.println("Average is... ");
		
		for(int r=0;r<row;r++){
			int avg=0;
			for(int c=0;c<col;c++){
				avg+=a[r][c];
			}
			System.out.println("For Row: " + (r+1) +" the average is: "+ (avg/col));
		}
			
				

	}

}
