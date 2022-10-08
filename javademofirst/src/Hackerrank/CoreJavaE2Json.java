package Hackerrank;

public class CoreJavaE2Json {
//	"{\"0\":{\"name\":\"[John]\"}\",\"1\":{\"name\":\"[micheal]\"}}"
	// import java.io.*;
	// import java.util.*;
	 
	  public static int levelCount(String word){
//	    int max=0;
//	    int c=0;
	     String[] str = word.split(",");
	     return str.length; 
	  /*write your code here and return appropriate value*/
//
//	      for (int i = 0; i < word.length(); i++) {
//	        if(word.charAt(i) == '{'){
//	          c++;
//	          if(c>max){
//	            max=c;
//	          }
//	        }
//	        else if(word.charAt(i)=='}'){
//	          if(c>0)
//	          {
//	            c--;
//	          }else{
//	            return -1;
//	          }
//	        }
//	      }
//	      if(c != 0)
//	        return -1;
//	      return max;
	  }
	  
	  
	  public static void main(String[] args)
	  {
	        
	    System.out.println(levelCount(args[0]));
	  }
}
