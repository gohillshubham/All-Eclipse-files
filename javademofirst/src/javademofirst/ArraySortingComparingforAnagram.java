package javademofirst;

import java.util.Scanner;

public class ArraySortingComparingforAnagram {
	static boolean isAnagram(String a, String b) {
        // Complete the function
        int c=1;
        boolean k= false;
        if(a.length()!=b.length())
            return false;
        String A =a.toLowerCase();
        System.out.println(A);
        String B =b.toLowerCase();
        System.out.println(B);
        char charArray[] = A.toCharArray();
      int size = charArray.length;
      int temp;
      for(int i = 0; i < size; i++ ) {
         for(int j = i+1; j < size; j++) {
             
            if(charArray[i]>charArray[j]) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
            }
         }
      }
      for (int i = 0; i < charArray.length; i++) {
		System.out.print(charArray[i]+" ");
	}
      System.out.println();
      char[] chararray = B.toCharArray();
      int size1= chararray.length;
      int temp1;
      for(int i = 0; i < size1; i++ ) {
         for(int j = i+1; j < size1; j++) {
            if(chararray[i]>chararray[j]) {
               temp1 = chararray[i];
               chararray[i] = chararray[j];
               chararray[j] = (char) temp1;
            }
         }
      }
      for (int i = 0; i < chararray.length; i++) {
		System.out.print(chararray[i]+" ");
	}
      for (int i = 0; i < chararray.length; i++) {
    	  if(c==a.length()) {
              k=true;
              return k;
    	  }
          if(charArray[i]==chararray[i]) {
                c++;continue;}
          else
                return k;
          
          
      }
       return k;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
