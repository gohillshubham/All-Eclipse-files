package Hackerrank;
import java.util.*;
public class IndexJump {

	    public static boolean canWin(int leap, int[] game) {
	        // Return true if you can win the game; otherwise, return false.
	        if(leap>=game.length-1)
	                return true;
	        if(game[1]==0){
	            if(leap>=game.length-1)
	                return true;
	        }
	        
	            if(game[1]==0){
	            	int k = leap +1;
	                if(k<game.length){
	                    if(game[k]==0)
	                        return true;
	                    else
	                        return false;
	                }
	                if(k>=game.length)
	                    return true;
	            }
	            else{
	            	int k = leap;
	                if(k<game.length){
	                    if(game[k]==0)
	                        return true;
	                    else
	                        return false;
	                }
	                if(k>=game.length)
	                    return true;
	            }
	            return false; 
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }
	

}
