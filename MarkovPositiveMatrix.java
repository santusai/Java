//Checking whether matrix is Markov positive or not
import java.util.Scanner;
public class MarkovPositiveMatrix {
	// main method starts here
	public static void main(String[] args) {
		// use scanner to ask user to enter values
		Scanner userInput = new Scanner(System.in);
		//Ask user to enter 3 by 3 matrix
		System.out.println("Enter values to create 3 by 3 matrix: ");
		// create 3 by 3 matrix
		double [][] matrix = new double [3][3];
		for (int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length;j++){
				matrix[i][j] = userInput.nextDouble();// storing values in matrix				
			}
		}
		System.out.println("User Entered Matrix is:");
		System.out.println();
		for (int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+ "  ");
							
			}
			System.out.println();// for new row of matrix starts here
		}
		System.out.println(); // for more space	
		if (positiveMarkovMatrix(matrix)==true) // if positive values entry and each column sum =1 then it displays markov positive.
			System.out.println("Matrix is a Positive Markov Matrix.");
		else
			System.out.println("Matrix is Not a Positive Markov Matrix.");
	}
	
	
	public static boolean positiveMarkovMatrix (double [][] matrix) {				
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[i].length; j++){
				if(matrix[i][j]<0)// checking for negative values entry
					return false;
			}
		}		
		for(int column=0; column<matrix.length; column++){
         double sumOfColumn =0;
			for(int row=0; row<matrix.length; row++){
				sumOfColumn = sumOfColumn + matrix[row][column];					
			}
			if (sumOfColumn != 1) // checking sum of each columns is equals to 1 or not
				return false;
		}
		return true;
		
	}
}
	

/* sample output:
Enter a 3-by-3 matrix row by row
0.15	0.875	0.375
0.55	0.005	0.225
0.30	0.12	0.4

Matrix is a positive Markov.

Enter a 3-by-3 matrix row by row
0.15	-0.875	0.375
0.65	0.005	0.225
0.30	0.22	-0.4

Matrix is not a positive Markov.












*/


