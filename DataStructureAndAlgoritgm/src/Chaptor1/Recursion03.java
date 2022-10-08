package Chaptor1;

import java.util.Scanner;

public class Recursion03 {
	 public static int productofArray(int A[], int N) 
	    { 
	    //   TODO
	        if(N==1)
	            return A[0];
	        return A[N-1]+productofArray(A, N-1);
	    } 

	public static int PowerOfValuen(int k,int n) {
		if(n<0)
			return -1;
		if(n==0)
			return 1;
//		if(n==1) {
//			return k;
//		}
		return k*PowerOfValuen(k, n-1);
	}
	public static int GCd(int a,int b) {
		if(a<0 || b<0)
			return -1;
		if(b==0)
			return a;
		return GCd(b,a%b);
	}
	public static int Binnarytodecimal(int n) {
		if(n<0) 
			return -1;
		if(n==0)
			return 0;
		return n%2+10*Binnarytodecimal(n/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc =new Scanner(System.in);
//		int base = sc.nextInt();
//		int exp= sc.nextInt();
//		sc.close();
//		int power = PowerOfValuen(base,exp);
//		int gcd = GCd(base,exp);
//		int bin = Binnarytodecimal(base);
//		System.out.println(bin);
//		System.out.println(gcd);
//		System.out.println(power);
		int arr[] = { 1, 2, 3, 4, 5 }; 
		int pro =productofArray(arr, arr.length);
		System.out.println(pro);
	}

}
