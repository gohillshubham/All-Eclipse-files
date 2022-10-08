package CoDeechef;

import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = sc.nextInt();
			int[] arra = new int[n];
			int[] arrb = new int[n];
			int sum1 =0;
			int sum2 =0;
			arra[0]=0;arrb[0]=0;
			for (int n1 = 1; n1 < n; n1++) {
				arra[n1]=sc.nextInt();
				sum1+=arra[n1];
				arrb[n1]=arra[n1];
				arra[n1]=sum1;
				
			}
			for (int i = 0; i < n-1; i++) {
				sum2  = arra[i+1]-arrb[i];
				if(sum2>0)
					arrb[i+1] = arrb[i]+sum2+arrb[i+1];
				else
					arrb[i+1]=arrb[i]+arrb[i+1];
			}
			
			System.out.println(arrb[arrb.length-1]);
		}
	}

}
