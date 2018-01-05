import java.util.Date;
public class Account{
	// id created
	private int id =0;//text book page no.355 reference
	// to store balance
	private double balance =0;//text book page no.355 reference
	// to store annual interest
	private double annualInterestRate=0;//text book page no.355 reference
	//stores date when the account created
	private Date dateCreated;
	/* Reference: https://books.google.com/books?id=T3OlBAAAQBAJ&pg=PT66&lpg=PT66&dq=java+code+private+new+dateCreated&source=bl&ots=AN6tFqj2PE&sig=mYWBrdQpqLzK3qv-GYmU_z_wv0s&hl=en&sa=X&ved=0ahUKEwjAsdyp6_zPAhXGYiYKHRoGA4UQ6AEISjAI#v=onepage&q=java%20code%20private%20new%20dateCreated&f=false */
	//created date displays
//	public class Account{		// here I was tried to to insert all code in this method but something went wrong.
		//Used reference 
		//A class normally provides a constructor without arguments (e.g., Circle()). Such a constructor is referred to as a no-arg or no-argument constructor.
		// text book page no:329 and 325
		// now am constructing non-arg constructor.
		Account(){
			// actually I don't understand here what is the use of this non arg constructor. because in my program it is not acting any role.
			// non arg constructor
			}
		public Account(int id, double balance){
			this.id =id;
			this.balance = balance;
			this.dateCreated = new Date();
			//second constructor as per text book no: 325
			}//A getter method is also referred to as an accessor and a setter to a mutator.
		// text book page no: 345
		// all get methods are refered from text-book page no: 325 for getArea, getPerimeter.
		public Date getDateCreated(){
			return this.dateCreated;
			}
		public int getId(){
			return id;
			}
		public double getBalance(){
			return balance;
			}
		public double getAnnualInterestRate(){
			return annualInterestRate;
			}
		// all set methods are refered from text-book page no: 325 for setRadius.
		public void setId(int newId){
			id = newId;
			}
		public void setBalance(double newBalance){
			balance = newBalance;
			}
		public void setAnnualInterestRate(double newAnnualInterestRate){
			annualInterestRate = newAnnualInterestRate ;
			}
		// we are calculating balance
		public double getMonthlyInterestRate(){
			return (balance * (4.5/100)/12) ;
			}
		// money withdraw
		public void withdraw(double specifiedAmountOfWithdraw){
			// remaining balance
			balance = balance - specifiedAmountOfWithdraw ;			
		}
		public void deposit(double specifiedAmountOfDeposit){
			// Adding money to balance
			balance = balance + specifiedAmountOfDeposit;
		}
		
//}
public static void main(String[] args) {
	Account acout = new Account(1122, 20000); // id and balance	
	acout.withdraw(2500); // after withdraw of 2500 total is 17,500
	acout.deposit(3000);// after deposit of 3000 total is 20,500
	System.out.println("Balance is: "+acout.getBalance()); // balance is 20,500
	System.out.println("Monthly interest is: "+ acout.getMonthlyInterestRate()); // interest calcuated
	System.out.println("Date of account created is: "+ acout.getDateCreated()); // displays date here
	
}		
}
/*
sample output:
Balance is: 20500.0
Monthly interest is: 76.875
Date of account created is: Fri Oct 28 05:43:06 CDT 2016
*/

 