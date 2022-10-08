package javademofirst;

import java.util.Scanner;

public class IndividualWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input a string");
		String letters = sc.nextLine();
		String[] splitWord = letters.split(" ");
		System.out.println("Reverse string: ");
		String reverseWord ="";
		int i =0;
		do
		{
			reverseWord = reverseWord+WordReverse(splitWord[i]);
			reverseWord = reverseWord+" ";
			i++;
		}while(i<splitWord.length);
		System.out.println(reverseWord);
		

	}
	
	public static String WordReverse(String individualWord) {
		String reverse ="";
		
		Loop:
		for(int i=individualWord.length()-1;i>=0;i--)
		{
			if(i==individualWord.length()-1) {
				int ascValue = 32;
				ascValue =  individualWord.charAt(i)-ascValue;
				reverse = reverse + (char)ascValue;
			}
			if(i==0) {
				int ascValue = 32;
				ascValue = individualWord.charAt(i) + ascValue;
				reverse = reverse + (char)ascValue;
				continue Loop;
			}
			reverse = reverse + individualWord.charAt(i);
		}
		
		return reverse;
	}
}
