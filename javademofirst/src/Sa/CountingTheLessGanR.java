package Sa;

import java.util.Scanner;

public class CountingTheLessGanR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String str  = sc.nextLine();
//		int G=0,R=0;
//		for (int i = 0; i < n; i++) {
//			if(str.charAt(i)=='G')
//				G++;
//			if(str.charAt(i)=='R')
//				R++;
//		}
//		if(G>R)
//			System.out.println(R);
//		else 
//			System.out.println(G);
		int k = Integer.MAX_VALUE;
		if(n<=12)
			System.out.println("1");
		else if(n%12==0)
			System.out.println(n/12);
		else {
			if(n%10==0)
				k = n/10;
			int k1 = n/12;
			int k2 = Integer.MAX_VALUE;
			if((n-k1*12)%10==0)
				k2 = n/12 +(n-k1*12)/10;
			if(k2<k)
				System.out.println(k2);
			else 
				System.out.println(k);	
		}
			
	}
}
