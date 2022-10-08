package PACKWORK1;
import java.util.*;

public class RankingAliceMArks {
	public static void main(String[] args) {
//		int marks[] = {100,80,80,50,40,30,30,10,10};
		Scanner in = new Scanner(System.in);
//		System.out.println("no. of marks");
		int nmarks = in.nextInt();in.nextLine();
		int marks[] = new int[nmarks];
		for (int i = 0; i < marks.length; i++) {
			marks[i] =in.nextInt();
		}
		int n= in.nextInt();in.nextLine();
		int al[] = new int[n];
//		System.out.println(n);
//		System.out.println("start entering the marks");
		for (int i = 0; i < al.length; i++) {
			al[i] =in.nextInt();
		}
		int[] allR= RankingMarks(marks,al);
		for (int j = 0; j < allR.length; j++) {
			System.out.print(allR[j]+" ");
		}
		
	}

	public static int[] RankingMarks(int[] marks,int[] al) {
		// TODO Auto-generated method stub
		int m=marks.length;
		int n = al.length;
		int[] rank = new int[m];
		rank[0]= 1;
		for(int i=1;i<m;i++) {
			if(marks[i-1]== marks[i]) {
				rank[i] = rank[i-1];
			}
			else  {
				rank[i] = rank[i-1]+1;
			}
		}
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			int alm= al[i];
			if (alm >=marks[0]) {
				result[i]=1;	
			}
			else if (alm < marks[m-1] ) {
				result[i] = rank[m-1]+1;
			} 
			else {
				int j = BinarySearch(marks,alm);
				result[i] = rank[j];
			}
		}
		return result;
		
		
	}

	public static int BinarySearch(int[] a,int k) {
		// TODO Auto-generated method stub
		int lo=0;
		int ko= a.length-1;
		while(lo<=ko) {
			int mid = lo+(ko-lo)/2;
			if (a[mid] == k) {
				return mid;
			}
			if(a[mid] < k && a[mid-1] > k) {
				return mid;
			}
			else if(a[mid] > k && a[mid+1] <= k) {
				return mid+1;
			}
			else if(a[mid] > k) {
				lo=mid+1;
			}
			else if(a[mid] < k) {
				ko=mid-1;
			}
		}
		return -1;
	}
	

}
