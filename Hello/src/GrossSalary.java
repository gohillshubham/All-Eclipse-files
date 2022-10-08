import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.*;
/**
 * Gross salary from 
 * rate
 * basic salary
 * and calling the function Gsalary
 * 
 */

import PACKWORK1.Rubicks;
public class GrossSalary {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		Inner:
//			break Inner;
//		System.out.println("Enter Basic Salary: ");
//		double Bsalary = in.nextDouble();
//		Rubicks R3 = new Rubicks(Bsalary);
//		double Gsalary = R3.Gsalary(Bsalary);
//		System.out.println("Gross Salary is: "+Gsalary);
		
		
		

		    

		    
		public static int designerPdfViewer(int[] letterValue,String word) {
		    // Write your code here
			int max =0;
			int[] ascWord = new int[word.length()];
			for (int i = 0; i < word.length(); i++) {
				ascWord[i] = word.charAt(i) - 96;
			}
			fori:
		for (int j = 0; j < ascWord.length; j++) {
			for (int i = 0; i < letterValue.length; i++) {
				if(i==ascWord[j]-1) {
					if(letterValue[i]>max) {
						max=letterValue[i];
						continue fori;
					}
				}
			}
		}
			max= max*word.length();
		  return max;
		  }
		    
		    public static void main(String[] args) throws Exception {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Hello");
		        
		        int[] letterValue = new int[26];
		        for (int i = 0; i < 26; i++) {
		        	letterValue[i] = sc.nextInt();
		        }
		        sc.nextLine();
		        String word = sc.nextLine();
		        sc.close();
		        int result  = GrossSalary.designerPdfViewer(letterValue,word);
		    	System.out.println(result);
//		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//	            int steps = Integer.parseInt(bufferedReader.readLine().trim());
//
//	            String path = bufferedReader.readLine();
//
//	            int result = GrossSalary.countingValleys(steps, path);
//
//	            bufferedWriter.write(String.valueOf(result));
//	            bufferedWriter.newLine();

//	            bufferedReader.close();
//	            bufferedWriter.close();
		    }
		

		
	}

