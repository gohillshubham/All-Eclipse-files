package Hackerrank;
//import java.math.*;
//import java.util.*;
public class maxFunc {
	
	public static int MaxValue(int[] arr,int n) {
		if(n==1)
			return arr[0];
		return Math.max(arr[n-1],MaxValue(arr,n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[]= {1,7,945,4,4,6756,8,763};
		int max = MaxValue(Arr,Arr.length);
		System.out.println(max);
	}

}
