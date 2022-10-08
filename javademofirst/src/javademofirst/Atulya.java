package javademofirst;

import java.util.Scanner;
public class Atulya{
	public static void main(String[] args) {
		int a,b,c,sum;
		System.out.println("Enter three values");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b =in.nextInt();
		c= in.nextInt();
		sum = a+b+c;
		System.out.println("the value of sum of given three no. "+sum);
	}
}

