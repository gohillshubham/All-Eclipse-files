package javademofirst;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MinimumGoodSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input the no. of interger and it shold me greater than 3");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int value = GoodSumSubstract(arr);
		System.out.println(value);
	}

	private static int GoodSumSubstract(int[] arr) {
		// TODO Auto-generated method stub
		int[] index = new int[3];
		int[] arr1 = arr;
		Arrays.sort(arr);
		int i,j,k,i3=0,l=1;
		k = arr[arr.length-l];
		j = arr[arr.length-l-1];
		i = arr[arr.length-l-2];
		forStart:
		for (int k2 = 0; k2 < arr1.length; k2++) {
			if(i== arr[k2] || j== arr[k2] || k== arr[k2]) {
				index[i3]=k2;
				i3++;
				}
		}
		ifstart:
		if(index[0]<index[1]) {
			if(index[1]<index[2]) {
			return k-i;}
		}
		return -1;
	}
}
