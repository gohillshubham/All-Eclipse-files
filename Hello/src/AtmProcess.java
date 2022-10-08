import java.util.*;
class AtmFlow{
	static int pin = 6985;
	static int amaount= 50000;
	void Transcation(int tran) {
		if(tran==1) {
			System.out.print("Enter money to be withdrawn:\n"); 
			System.out.println("Enter the amount");
		}
		else if(tran==2) {
			System.out.print("Enter the amount to be deposited:");
		}
		else 
		{
			System.out.println("Only withdrawal and deposite process is live");
		}	
	}
	public void withdrawal(int wd) {
		amaount = amaount - wd;
	}
	public void deposited(int wd1) {
		amaount = amaount + wd1;
	}

}
public class AtmProcess {
	public static void main(String[] args) {
		System.out.println("Insert your Card");
		Scanner in= new Scanner(System.in);
		AtmFlow process = new AtmFlow();
		System.out.println("Enter your four digit pin");
		int a= in.nextInt();
		if(a!=AtmFlow.pin)
		{
			System.out.println("Enter correct pin by removing and inserting card");
			
		}
		else
		{
			System.out.println("Select Transcation \n1. Withdrawal\t 2.Deposite \n"
					+ "3. account details\t 4. Account balance");
			int Tran = in.nextInt();
			process.Transcation(Tran);
			switch(Tran)
			{
				case 1:
//					System.out.print("Enter money to be withdrawn:\n"); 
//						System.out.println("Enter the amount");
						int wd = in.nextInt();
						if(wd<= AtmFlow.amaount)
						{
							System.out.println("Transcation Successfully ");
							process.withdrawal(wd);
							System.out.println("Amount left = "+AtmFlow.amaount);
						}
						else {
							System.out.println("Insufficient Balance");
						}
						break;
				case 2: 
//						System.out.print("Enter the amount to be deposited:"); 
						int wd1 = in.nextInt();
						process.deposited(wd1);
						System.out.print("Amount is deposited \nBalance "+AtmFlow.amaount); 
						break;
						
//				case 3,4:
//						System.out.println("Only withdrawal and deposite process is live");
//						break;
			}
		}
	}
}
