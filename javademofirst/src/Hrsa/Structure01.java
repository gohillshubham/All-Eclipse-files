package Hrsa;
import java.io.*;
import java.util.*;



class Solution {
	    /*
	     * Complete the 'matchingStrings' function below.
	     *
	     * The function is expected to return an INTEGER_ARRAY.
	     * The function accepts following parameters:
	     *  1. STRING_ARRAY strings
	     *  2. STRING_ARRAY queries
	     */

	    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
	        List<Integer> intvalues = new ArrayList<>(queries.size());
	        for (int j = 0; j < queries.size(); j++) {
	        	int c=0;
	        	for (int i = 0; i < strings.size(); i++) {
					if(queries.get(j).equals(strings.get(i))) {
						c++;
					}
				}
	        	intvalues.add(c);
			}
	        return intvalues;
	    }

	}

	public class Structure01 {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();sc.nextLine();
	        List<String> strings = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
				String k = sc.nextLine();
				strings.add(k);
			}
	        int p = sc.nextInt();sc.nextLine();
	        List<String> queries = new ArrayList<>();
	        for (int i = 0; i < p; i++) {
				String k = sc.nextLine();
				queries.add(k);
			}
	        List<Integer> res =Solution.matchingStrings(strings, queries);
	        for (int i = 0; i < res.size(); i++) {
				System.out.println(res.get(i));
			}
	    }
}
