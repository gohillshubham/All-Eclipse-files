package Hackerrank;

import java.util.Scanner;

public class SubstractingEqualValue {
	    public int minimumOperations(int[] nums) {
	        int min;
	        int c=0,n;
	        do{
	        	min =Integer.MAX_VALUE;
	             n=0;
	            for(int i =0;i<nums.length;i++){
	                if(nums[i]!=0 && min>nums[i])
	                    min=nums[i];
	            }
	            c++;
	            for(int i =0;i<nums.length;i++){
	                if(nums[i] != 0)
	                    nums[i] = nums[i] -min;
	                else
	                    n++;
	            }       
	            // if(n==nums.length){
	            //     break;
	            // }
	        }while(n!=nums.length);
	        return c;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		SubstractingEqualValue sev = new SubstractingEqualValue();
		
		int result = sev.minimumOperations(arr);
		System.out.println(result);
	}
}
