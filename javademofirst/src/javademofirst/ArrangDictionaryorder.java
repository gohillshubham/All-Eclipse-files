package javademofirst;

import java.util.Scanner;

public class ArrangDictionaryorder {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String[] kDivided = new String[s.length()-k+1]; 
        
        for (int i = 0; i < s.length()-k+1; i++) {
        	kDivided[i] ="";
			for (int j = i; j < i+k; j++) {
				kDivided[i] = kDivided[i]+s.charAt(j);
			}
		}
        
        String temp;
        for (int i = 0; i < kDivided.length; i++) {
        	for (int j = i+1; j < kDivided.length; j++) {
        		if (kDivided[i].compareTo(kDivided[j]) > 0) {
                    // swapping
                    temp = kDivided[i];
                    kDivided[i] = kDivided[j];
                    kDivided[j] = temp;
                }
                 
			}
			
		}
        
        smallest = ""+kDivided[0];
//        System.out.println(smallest);
        largest = ""+kDivided[kDivided.length-1];
        String add = smallest + "\n" + largest;
        return add;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();
		sc.close();
		System.out.println(str.length());
		String result =getSmallestAndLargest(str,n);
		System.out.println(result);
		

	}

}
