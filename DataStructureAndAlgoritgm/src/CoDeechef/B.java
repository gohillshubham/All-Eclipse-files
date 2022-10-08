package CoDeechef;

	
import java.util.Scanner;


/* package codechef; // don't place package name! */



/* Name of the class has to be "Main" only if the class is public. */
public class B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int ii = 0; ii < t; ii++) {
			int n = sc.nextInt();
			long[] arr = new long[n];
			long min =Integer.MAX_VALUE;
			long sum ;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
//				System.out.println(arr[i]);
			}
			if(n==1)
				System.out.println(Math.abs(arr[n-1]));
			
			else {
				int k=0;
			do{
				sum =0;
				int j=0;
				if(n%2==0) {
					for (int i = 0; i < n; i++) {
						
						if(arr[i]!=0) {
						arr[i] =arr[i] - (long)(j+1);
						sum =sum+Math.abs(arr[i]);
						}
						if(j==1)
							j=0;	
						else
							j++;
					}
					
				}
				else {
					for (int i = 0; i < n-1; i++) {
						if(arr[i]!=0) {
						arr[i] =arr[i] - (long)(j+1);
						sum =sum+Math.abs(arr[i]);
						}
						sum= sum+arr[arr.length-1];
					}
					if(j==1)
						j=0;	
					else
						j++;
					
				}
					
				if(min>sum)
					min =sum;
				k++;
			}while(k<=10);
			System.out.println(min);
			}
		}
	}
}

