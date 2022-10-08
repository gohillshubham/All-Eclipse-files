/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t,x,y,x_floor,y_floor;
	    Scanner sc=new Scanner (System.in);
	    t=sc.nextInt();
	    while(t!=0){
	        t--;
	        x=sc.nextInt();
	        y=sc.nextInt();
	        if (x%10 == 0) {
	        x_floor = x/10;
	    }
	    else {
	        x_floor = (x/10)+1;
	    }
	    
	    if (y%10 == 0) {
	        y_floor = y/10;
	    }
	    else {
	        y_floor = (y/10)+1;
	    }
	    
	    if (x_floor > y_floor) {
	        System.out.println(x_floor - y_floor);
	    }
	    else {
	       System.out.println(y_floor - x_floor);
	    }
	} 
	    }
		// your code goes here
	}

