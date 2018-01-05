// Scanner import statement to read values from keyboard
import java.util.Scanner;

public class StandardDeviation {
	// main method starts here
	public static void main(String[] args) {
		// asking user to enter number of values to analyse				
		System.out.println("Enter the number of values the program is to analyze:");
		Scanner userInput = new Scanner(System.in);//using scanner to take values 
		int numberOfValues = userInput.nextInt();// taking integers values only these are number of values
		System.out.println("Enter the numbers to calculate mean & st.deviation:"); // asking user to enter values 
		double[] values = new double[numberOfValues];// taking values of double type
		//storing all input values in an array		
		double mean =0;
		double sum=0;
		double sumOfSquare=0;
		double stndDiv=0;
		for (int i = 0; i < values.length; i++) {
			values[i] = userInput.nextDouble();
			sum = sum + values[i];
		}
		mean = sum/values.length;
		System.out.println("mean is: "+mean);		
		for(int j=0; j<values.length; j++){
			sumOfSquare = sumOfSquare + Math.pow((values[j]-mean), 2);
		}
		stndDiv = Math.sqrt(sumOfSquare / (values.length - 1));
		System.out.println("Standard Deviation is: "+stndDiv);
	}
}

/* sample output:
Enter the number of values the program is to analyze: 10
Enter the numbers to calculate mean & st.deviation
1.9 
2.5 
3.7 
2 
1 
6 
3 
4 
5 
2
The mean is:  3.1100000000000003
The standard deviation is: 1.5573838462127583

*/
