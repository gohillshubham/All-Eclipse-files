package Sa;

import java.util.Scanner;

public class zycusTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long po = Integer.MAX_VALUE;
		System.out.println(po);
		int t = sc.nextInt();sc.nextLine();
		for (int ii = 0; ii < t; ii++) {
			int  n = sc.nextInt();
			int k;
			if(n<=250000) {
				System.out.println(n);
			}else if(250000<n && n<=500000) {
				n=n-250000;
				k = n-(n*5)/100+250000;
				System.out.println(k);
			}else if(500000<n && n<=750000) {
				k =237500+250000;
				n= n-500000;
				k =k+n-(n*10)/100;
				System.out.println(k);
			}else if(750000<n && n<=1000000) {
				k =225000+237500+250000;
				n= n-750000;
				k =k+n-(n*15)/100;
				System.out.println(k);
			}else if(1000000<n && n<=1250000) {
				k =212500+225000+237500+250000;
				n= n-1000000;
				k =k+n-(n*20)/100;
				System.out.println(k);
			}else if(1250000<n && n<=1500000) {
				k= 200000+212500+225000+237500+250000;
				n= n-1250000;
				k =k+n-(n*25)/100;
				System.out.println(k);
			}else if(1500000<n ) {
				k= 187500+200000+212500+225000+237500+250000;
				n= n-1500000;
				k =k+n-(n*30)/100;
				System.out.println(k);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int ii = 0; ii < t; ii++) {
//			String f1 = sc.next();
//			String f2 = sc.next();
//			f1 = f1+f2;
//			int n = sc.nextInt();
//			String s1 = "";
//			for (int i = 0; i < n; i++) {
//				String k = sc.next();
//				s1=s1+k;
//			}
//			int c = 0;
//			for (int i = 0; i < s1.length(); i++) {
//				for (int j = 0; j < f1.length(); j++) {
//					if(f1.charAt(j) ==  s1.charAt(i)) {
//						c++;
//						break;
//					}		
//				}
//			}
//			if(c==s1.length())
//				System.out.println("Yes");
//			else
//				System.out.println("No");
//		}
	}
}
