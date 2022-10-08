package javademofirst;

import java.util.Scanner;

public class PalindrominString {
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
//        if(A.length()==1){
//            System.out.print("Yes");
//            return;
//        }
        int i=0,j=A.length()-1;
        int c=0;
        while(i<j){
            if(A.charAt(i)==A.charAt(j)){
                c++;i++;j--;
            }
            else{
                System.out.print("No");
                return;
            }
            if(c==A.length()/2){
                System.out.print("Yes");
                return;
            }
            
        }
//        StringBuilder k = new StringBuilder(A);
//       k.reverse();
//       String Anew = new String(k);
//       if(A.equals(Anew)) {
//    	   System.out.print("Yes");
//         return;
//       }
//       else{
//         System.out.print("No");
//         return;
//     }
//        
    }
}
