package Hackerrank;
//
//import java.math.*;
//import java.util.Scanner;
//
//public class BigDecimalSum1 {
//
//	public static void main(String []args){
//        //Input
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String []s=new String[n+2];
//        for(int i=0;i<n;i++){
//            s[i]=sc.next();
//        }
//      	sc.close();
//      	BigDecimal k;
//      	
//      	BigDecimal[] s1= new BigDecimal[n];
//      	for(int i=0;i<n;i++) {BigDecimal k1 = new BigDecimal(s[i]);s1[i]=k1;}
//      	for (int i = 0; i < s1.length-1; i++) {
//      		for (int j = i+1; j < s1.length; j++) {
//      			if(s1[i].compareTo(s1[j])==-1) {
//      				k=s1[i];s1[i] =s1[j];s1[j]=k;}}}
//      	for(int i=0;i<n;i++)s[i] = ""+s1[i];
//      	
//      	for(int i=0;i<n;i++)
//            System.out.println(s[i]);
//    }
//
//}

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BigDecimalSum1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        for(int tt=0; tt<n ;tt++){
            String p = sc.nextLine();
            int j=0;
            for(int i=0;i<p.length()-2;i++){
                if(p.substring(i,i+3).equals("010") ||p.substring(i,i+3).equals("101")){
                    System.out.println("Good");
                    j++;
                    break;
                }
            }
            if(j==0)
            System.out.println("Bad");
            
        }
	}

}
