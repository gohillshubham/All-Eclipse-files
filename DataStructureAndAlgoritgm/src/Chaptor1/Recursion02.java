package Chaptor1;

import java.util.Scanner;

public class Recursion02 {

	public static int Recursion02Factorial(int n) {
		// TODO Auto-generated constructor stub
		if(n<1) 
			return -1;
		if(n==1 || n==0)
			return 1;
		
		return n*Recursion02Factorial(n-1);
		
	}
	public static int Recursion02Fibnacci(int n) {
		// TODO Auto-generated constructor stub
		if(n<0)
			return -1;
		if(n==1 || n==2)
			return n-1;
		return Recursion02Fibnacci(n-1)+Recursion02Fibnacci(n-2);
	}
	public static int Recursion02AddingIntegerSum(int n) {
		if(n<0)
			return -1;
		if(n<10) 
			return n;
		
		return Recursion02AddingIntegerSum(n/10)+(n%10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
//		int n1 = sc.nextInt();
		sc.close();
//		int rec = Recursion02Factorial(n);
//		int pow= Recursion02Fibnacci(n);
		int sum =Recursion02AddingIntegerSum(n);
		System.out.println(sum);
//		System.out.println(rec);
//		System.out.println(pow);
	}

}
