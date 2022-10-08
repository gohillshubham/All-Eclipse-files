package Deposite;

import java.util.Scanner;

/*
	This is Deposite class processes 
	as you call the constructor you have invoked the Deposite processor.
	you have pass the details with bank class to verify and respond bank with 
	updated amount for receipt.
*/

public class Deposite {
	public Deposite() {
		Scanner sc = new Scanner(System.in);
		try {
//		The filling the Deposite slip by providing Account , Name , Mobile no. and Amount.
			System.out.println("Fill the deposite slip with correct details");
			System.out.print("Enter account no :- ");
			long accno = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter Your name:- ");
			String name = sc.nextLine();
			System.out.print("Enter Your Mobile no link with bank:- ");
			long mobile = sc.nextLong();
			sc.nextLine();

//		you can pass these details from here to bank and verify the customer details after that 
//		boolean verification = new Customer(accno,name,mobile);
//		but for now i am setting the verification as true for code processing.
			boolean verification = true;// delete this line when passing the customer details to customer class.
			if (verification) {
//		It will ask for amount to deposite.
				System.out.println("Verification is successful");
				System.out.print("Enter the amount:- ");
				int amount = sc.nextInt();sc.nextLine();
				System.out.println("Amount is deposited");

//		updated details of amount should be received from bank class
//		int updatedamount = new bank(accno,amount);
//		for now setting the updated amount to the same amount which is deposited.
				int updatedamount = amount;// delete this line when passing the amount to bank details.

				Receipt re = new Receipt(mobile, name, amount, updatedamount);
			} else {
//			If verification fails its again start the deposite process
				System.out.println("Enter the correct details " + "\n");
				new Deposite();
			}
		} catch (Exception e) {
//		If user enter the wrong details then deposite process start again.
			System.out.println("Invalid input Enter correct details");
			new Deposite();
		}
	}

	public static void main(String[] args) {
//		Deposite process start from here.
		new Deposite();
	}
}
