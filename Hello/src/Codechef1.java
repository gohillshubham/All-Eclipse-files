/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    while(t!=0){
	        t--;
	        int a=sc.nextInt();sc.nextLine();
	        
	            String k=sc.nextLine();
	            String[] ans= k.split(" ");
	            int count=0,c=0;
	        for(int i=0;i<a;i++) {
	        	
	            if(ans[i].equals("START38")){
	                count++;
	            }
	                else{
	                    c++;
	                }
	        }
	        System.out.println(count+" "+c);
	    }
		// your code goes here
	}
}



