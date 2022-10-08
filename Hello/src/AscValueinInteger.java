import java.util.Scanner;

public class AscValueinInteger {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        System.out.println("Hello");
	        String word = sc.nextLine();
	        int[] ascWord = new int[word.length()];
	        String s="";
			for (int i = 0; i < word.length(); i++) {
				ascWord[i] = word.charAt(i) -96 ;
				s=""+ascWord[i]+" ";
			}
			for (int i = 0; i < word.length(); i++) {
				System.out.println(ascWord[i]);
			}
			System.out.println(word.length());
		}
}