import java.util.*;
import java.math.BigInteger;

public class BigIntegerSum {
		public static void main(String[] args) {
			String n1,n2;
			try (Scanner in = new Scanner(System.in)) {
				System.out.println("Enter First BIg Value");			
				n1= in.nextLine();
				System.out.println("Enter Secound BIg Value");
				n2 = in.nextLine();
				System.out.println("Enter Third BIg Value");
				String n3 = in.nextLine();
				BigInteger f1 = new BigInteger(n1);
				BigInteger f2 = new BigInteger(n2);
				BigInteger f3 = new BigInteger(n3);
				BigInteger sum;
				sum = f1.add(f2);
				System.out.println("Resut of addition of both value: "+sum);
				sum = sum.add(f3);
				System.out.println("Resut of addition of All value: "+sum);
			}
			
		}
}
