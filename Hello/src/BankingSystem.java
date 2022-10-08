
class Account{
	int acc_no;
	String name;
	float amount;
	void ValuePutting(int a,String n,float am) {
		acc_no = a;
		name = n;
		amount = am;
	}
	void deposit(float am) {
		amount = amount +am;
		System.out.println("Deposited "+am);
	}
	void withdraw(float am) {
		if(amount<am) {
		System.out.println("insufficient Balance");
		}
		else {
			amount =amount - am;
			System.out.println("windrawal amount "+am);
		}
	}
	void CheckBalance() {
		System.out.println("amount left "+amount);
	}
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
	}
}
public class BankingSystem {
	public static void main(String[] args) {
		Account a1 =new Account();
		a1.ValuePutting(832345,"ankit",10000);
		a1.display();
		a1.CheckBalance();
		a1.deposit(1000);
		a1.withdraw(10000);
		a1.CheckBalance();
		a1.withdraw(1000);
		a1.CheckBalance();
	}

}
