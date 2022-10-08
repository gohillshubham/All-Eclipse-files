import java.util.*;


public class OldTV {
		public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    System.out.println("enter the no. of line and error");
		    int k = in.nextInt();in.nextLine(); 	// no. of line has error
		    System.out.println("enter the error");
		    String[] s = new String[k]; 			// variable for taking error as a String
		    int[] count = new int[k];  				// variable for counting the no. of error in each line
		    String[] str = new String[5];			//Taking all value one by one in str 
//		    											from s and converting it to integer and assigning into arr
		    int[][] arr= new int[k][str.length];	// variable for Storing where the error as occurred
//		    String delims = "[ .,?!']+";
//		    Taking error input as a string
		    for(int i =0;i<k;i++){
		        s[i]= in.nextLine();
		        s[i]= s[i].replaceAll("[^a-zA-Z0-9]", " ");// for giving space in place of special character
		    }
//		    Taken error input as a string
		    
		    String[] L = new String[k];				// variable for storing Actual line 	
		    
//		    Taking input of actual line
		    for(int i =0;i<k;i++){
		        L[i]= in.nextLine();
		    }
//			Taken input of actual line
		    
		    char ch='*';							// * is the error at variable value arr
		    
// 			Splitting error value by space and assigning those value to arr   
		    for(int i =0;i<k;i++){
		    	str = s[i].split(" ");
		    	count[i]=0;
		    	for (int j1 = 0; j1 < str.length; j1++) {
		    			arr[i][j1] = Integer.valueOf(str[j1]);
		    			if(j1==0) {
		    				continue;
		    			}
		    			else {
		    				count[i]++;
		    			}
		    	}
		    }
//		    End of value assigning
		    
		    String s1 = "";							// created new String to save all the string in one
		    
//		    now replacing all the error value arr with * in this function
		    for(int i =0;i<k;i++){
		    	StringBuilder string = new StringBuilder(L[i]);
		    for(int j=1;j<count[i]+1;j++) {
			        string.setCharAt((arr[i][j]-1), ch);
		    }
		    L[i]=string.toString();
		    }
//		    End of assigning * 
		    
//		    Adding all the string in one string
		    for(int i =0;i<k;i++){
		    	if(L[i] != null) {
		    		 s1=s1+ L[i]+" ";
		    	}
		    }
//		    end of this function
		    
//			For changing line in every 40 character    
		    for(int i =0; i<s1.length();i++) {
		    	if(i%40==0)
		    	{
		    		System.out.print("\n"); 
		    		System.out.print(s1.charAt(i)+""); 
		    	}
		    	else {
		    		System.out.print(s1.charAt(i)+""); 
		    	}
		    }
//		    End of this function
		    
		}
	}

