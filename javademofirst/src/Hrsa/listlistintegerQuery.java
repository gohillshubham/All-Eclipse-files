package Hrsa;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
//public class listlistintegerQuery {
//
//}

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
    	int p = arr.size();
    	List<Integer> list = new LinkedList<>();
    	for (int i = d; i < p; i++) {
			list.add(arr.get(i));
		}
    	for (int i = 0; i < d; i++) {
    		Integer k =arr.get(i);
    		list.add(k);
		}
    	return list;
    }

}

public class listlistintegerQuery {
    public static void main(String[] args) throws IOException {
    	 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int d =sc.nextInt();sc.nextLine();
	        List<Integer> arr = new LinkedList<>();
	        for (int i = 0; i < n; i++) {
				Integer k = sc.nextInt();
				arr.add(k);
			}
	        
	        List<Integer> res = Result.rotateLeft(d, arr);
	        for (int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i));
			}
        
    }
}
