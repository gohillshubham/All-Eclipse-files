package Hackerrank;

import java.util.Scanner;

public class SplitSptringUse {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.length()==0) {
        	System.out.println(0);
        	return;
        }
        // Write your code here.
        scan.close();
        String delims = "[!,?._'@\\s]+";
        String[] slength = s.split(delims);
        int sl = slength.length;
        System.out.println(sl);
        fori:
        for (String string : slength) {
        	if(string==null)
        		continue fori;
            System.out.println(string);
        }
    }
}
