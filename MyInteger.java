

//Santhosh Janagam
//Programming Assignment 3
//Solution for problem10.3
//Submitted for CS585C, Fall 2016
import java.util.*;
public class MyInteger {
		// int data field created with name value
		int value;
		// creating constructor. as per text book page no: 371, line no 9,10,11 constructor creation
		public MyInteger(int value){
			this.value = value; 			
		}
		// getter method creationg. as per text book page no 372. line 20
		public int getValue(){
			return value;
		}
		// method creation to check even condition
		public boolean isEven(){
			return (value%2 == 0)? true: false;			
		}
		// method creation to check odd condition
		public boolean isOdd(){
			return (value%2 == 1)? true: false;			
		}
		// method creation to check prime condition
		public boolean isPrime(){
			int count =0;
			for(double i=2; i<value; i++){
					if (value%i == 0){
						count = 1;
						count++;
					}			
			}
			return (count<2 && value>1) ? true : false;
		}
		// Here our main step is: same as previous methods but static methods contains isEven(int), isOdd(int), isPrime(int).
		// method creation to check even condition
		public boolean isEven(int value1){
			return (value%2 == 0)? true: false;			
		}
		// method creation to check odd condition
		public boolean isOdd(int value1){
			return (value%2 == 1)? true: false;			
		}
		// method creation to check prime condition
		public boolean isPrime(int value1){
			int count =0;
			for(double i=2; i<value; i++){
					if (value%i == 0){
						count = 1;
						count++;
					}			
			}
			return (count<2 && value>1) ? true : false;
		}
		// Here our main step is: same as previous methods but static methods contains isEven(int), isOdd(int), isPrime(int).
		// method creation to check even condition
		public boolean isEven(MyInteger value2){
			return (value%2 == 0)? true: false;				
			}
		// method creation to check odd condition
		public boolean isOdd(MyInteger value2){
			return (value%2 == 1)? true: false;			
			}
		// method creation to check prime condition
		public boolean isPrime(MyInteger value2){
			int count =0;
			for(double i=2; i<value; i++){
				if (value%i == 0){
					count = 1;
					count++;
				}			
			}
			return (count<2 && value>1) ? true : false;
		}
		public boolean equals(int value3){
			return (value3 == value)? true:false;
			}
		public boolean equals(MyInteger value4){
			// referred from my friend
			return (value4.value == this.value)? true:false;
			}
		// parseInt an array of numeric characters into int value. text book reference page no: 382
		// reference from internet I don't know how to convert char into int value.
		// referred from my friend
		public static int parseInt(char[] numericValue){
			return parseInt(new String(numericValue));				
			}
		// parseInt string into int value. text book reference page no: 382
		public static int parseInt(String someValue){
			return Integer.parseInt(someValue);					
			}
	// main method starts here	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating array of characters
		char[] numericValue = new char[] {'3', '2', '9', '5'};
		// creating string numeric type value
		String someValue = new String("754");
		// inserting numbers in values and calling those values from MyInteger class.
		MyInteger value = new MyInteger(3);
		MyInteger value1 = new MyInteger(8);
		MyInteger value2 = new MyInteger(7);
		MyInteger value3 = new MyInteger(6);
		MyInteger value4 = new MyInteger(29);
		// displaying output for checking: even, odd, prime, equals and char, string into int value.
		System.out.println("Even numbers check 3: "+ value.isEven());
		System.out.println("Even numbers check 8: "+value1.isEven());
		System.out.println("Odd numbers check 3: "+ value.isOdd());
		System.out.println("Odd numbers check 7: "+ value2.isOdd());
		System.out.println("Prime numbers check 6: "+ value3.isPrime());
		System.out.println("Prime numbers check 29: "+ value4.isPrime());
		System.out.println("equals check value3=6 & equals(6): "+ value3.equals(6));
		System.out.println("equals check 12: "+ value4.equals(12));		
		
		System.out.println("convertion char to parseInt(char[]): "+MyInteger.parseInt(numericValue) );
		System.out.println("convertion String to parseInt(String): " + MyInteger.parseInt(someValue));
	}

}
/* Sample output:
 
Even numbers check 3: false
Even numbers check 8: true
Odd numbers check 3: true
Odd numbers check 7: true
Prime numbers check 6: false
Prime numbers check 29: true
equals check value3=6 & equals(6): true
equals check 12: false
convertion char to parseInt(char[]): 3295
convertion String to parseInt(String): 754
*/
