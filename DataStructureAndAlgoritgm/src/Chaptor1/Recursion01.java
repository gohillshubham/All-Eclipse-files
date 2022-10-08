package Chaptor1;

import java.util.Scanner;

public class Recursion01 {
	public static int powerOfTwoRecursive(int n) {
		// TODO Auto-generated constructor stub
		if(n==1)
			return 2;
		else {
			int pow = 2*powerOfTwoRecursive(n-1);
			return pow;
		}
	}
	public static int powerOfTwoItreative(int n) {
		// TODO Auto-generated constructor stub
		int pow=2;
		for (int i = 1; i < n; i++) {
			pow=2*pow;
		}
		return pow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int pow = powerOfTwoRecursive(n);
		System.out.println(pow);
		int pow1 =powerOfTwoItreative(n);
		System.out.println(pow1);
		
	}
}
