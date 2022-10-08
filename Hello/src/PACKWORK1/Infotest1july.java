package PACKWORK1;
import java.util.*;

public class Infotest1july {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int N;
//		N= sc.nextInt();
//		int[] Perm = new int[N];
//		for (int i = 0; i <N; i++) {
//			Perm[i] = sc.nextInt();
//		}
//		int result;
//		result = minTurns(N,Perm);
//		System.out.print(result);
//	}
//		private static int minTurns(int N, int[] Perm) {
//		// TODO Auto-generated method stub
//			int p =0;
//			for (int i = 0; i < N-1; i++) {
//				for (int j = 1; j < N-2; j++) {
//					if(Perm[i]<Perm[j]) {
//						continue;
//					}
//					else {
//						int k = Perm[i];
//						Perm[i]=Perm[j];
//						Perm[j]=k;
//						p++;
//					}
//				}
//				
//			}
//			return p;
//			
//	}
		
		    public static char flip(char ch)
		    {
		        return (ch == '0') ? '1' : '0';
		    }
		    public static int getFlipWithStarting(String str,
		                                    char expected)
		    {
		        int flipCount = 0;
		        for (int i = 0; i < str.length(); i++)
		        {
		            if (str.charAt(i) != expected)
		                flipCount++;
		            expected = flip(expected);
		        }
		        return flipCount;
		    }
		    public static int minFlipToMakeStringAlternate(String str)
		    {
		        return
//		        		Math.min(
		        		getFlipWithStarting(str, '0');
//		        		,  getFlipWithStarting(str, '1'));
		    }
		    public static void main(String args[])
		    {
		    	Scanner sc = new Scanner(System.in);
		    	int N;
		    	System.out.println("Enter the value");
		    	N= sc.nextInt();
		    	
		        String str = sc.next();
		        sc.close();
		        System.out.println(minFlipToMakeStringAlternate(str));
		        
		    }
		    
		
	}

