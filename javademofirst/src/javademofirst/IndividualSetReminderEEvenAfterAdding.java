package javademofirst;

import java.util.Scanner;

public class IndividualSetReminderEEvenAfterAdding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input the no. of elements you require");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Start typing the no.");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value to find the reminder");
		int m = sc.nextInt();
		int addedN= NoOfNIsAdded(n,arr,m);
		System.out.println(addedN);
	}

	private static int NoOfNIsAdded(int n,int[] arr,int m) {
		int j =0,maxReminder=0;
		do{
			int p = 0;
			for (int i = 0; i < n; i++) {
				int p1=0;
				for (int k2 = 0; k2 < arr.length-n+1; k2++) 
					 p= arr[k2+p1];
				p1++;
				j =p%m;
				if(maxReminder<j)
					maxReminder=j;	
			}
			n--;
		}while(n>0);
		return maxReminder;
	}
}
