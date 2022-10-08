package Deposite;
import java.time.LocalDateTime;
import java.time.format.*;

public class Receipt {
		public Receipt(long mobile, String name, int amount, int updatedamount) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println("Deposite Date and Time :- "+dtf.format(now));
			String value = Long.toString(mobile);
			String mobileno = "xxxxxx"+value.substring(6, 10);
			System.out.println("Your Mobile no.:-  " + mobileno);
			System.out.println("amount deposited :- "+amount+ " Total amount:- "+updatedamount);
		}
}
