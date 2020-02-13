/*
This program figures out the monthly payment for a car after getting a loan
Created by Emma on Feb. 12th, 2020
Intermediate Programming - Block 8
*/
//defines the class
public class CarLoan {
	public static void main(String[] args) {
//defines car loan
	  int carLoan = 10000;
//defines loan length
    int loanLength = 3;
//defines interest rate
		int interestRate = 5;
//defines down payment
		int downPayment = 2000;
//if loan lengths is at 0, or interest rate is at 0, there is an error
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
//if the down payment is more than the loan, the car can be completely paid for
		} else if (downPayment >= carLoan) {
      System.out.println("The car can be paid in full");
//this will tell the user the monthly payment needed to pay for the car
		} else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println("The monthly payment is $" + monthlyPayment + ".");
    }
	}
}
