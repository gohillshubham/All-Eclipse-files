import java.util.*;
public class ClassDay2 {

//	public void calculate(int p,int t,double r, int n) {
//		r= 1+r/n;
//		n=n*t;
//		double amount = p*Math.pow(r,n);
//		double Cinterest = amount - p;
//		System.out.println("Compound interest after"+t+"years is: "+Cinterest);
//		System.out.println("Only interest amount after"+t+"years is: "+amount);
//	}
//	public static void main(String[] args) {
//		ClassDay2 obj = new ClassDay2();
//		obj.calculate(2000, 5, .08, 12);
//	}
	
	
	
	
//	Check Vowel in String
	   
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word to find the no. of vowels");
		String s= in.nextLine();
		int k=0;
		for(int i =0;i<s.length();i++)
		{ char ch = s.charAt(i);
			if(ch=='a' || ch == 'A' || ch=='e' || ch == 'E' || ch=='I' || ch == 'i' || 
					ch=='o' || ch == 'O' || ch=='u' || ch == 'U') {
				k = k+1;
			}
		}
		
		System.out.println("Total no. of vowels is: "+k);
	}
	
}
