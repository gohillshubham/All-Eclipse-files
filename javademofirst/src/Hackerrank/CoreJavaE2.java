package Hackerrank;

import java.util.Scanner;

public class CoreJavaE2 {
	public static int ShiftingString(String str, int f1, int s2) {
		String subStr= str;
		int c=0;
		int size = str.length();
		do {
			String newStr1 = str.substring(size-f1);
			 str = newStr1+str.substring(0, size-f1);
			 c++;
			 if(str.equals(subStr))
				 break;
			String newStr2 = str.substring(size-s2);
			 str = newStr2 + str.substring(0, size-s2);
			c++;
		}while(!subStr.equals(str));
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int f1 = sc.nextInt();
		int s2 = sc.nextInt();
		sc.close();
		int result = ShiftingString(str,f1,s2);
		System.out.println(result);

	}

}
