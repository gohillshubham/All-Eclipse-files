package Hackerrank;

import java.util.Scanner;

public class LexographyLibrary {

public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)<0)
        	System.out.println("No");
        else
        	System.out.println("Yes");
        int k = A.charAt(0)-32;
   	 	String A1=""+(char)k;
        for (int i = 1; i < A.length(); i++) {
        	 A1=A1+A.charAt(i);
		}
        A1=A1+" ";
        k = B.charAt(0)-32;
   	 	A1=A1+(char)k;
        for (int i = 1; i < B.length(); i++) {
       	 A1=A1+B.charAt(i);
		}
       System.out.println(A1);
    }
}



class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
    // String regex = ""(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
    
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}