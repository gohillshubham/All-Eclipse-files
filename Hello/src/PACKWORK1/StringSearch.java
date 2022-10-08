package PACKWORK1;
import java.util.*;

public class StringSearch {
	public String[] SearchingString(String[] str,String s) {
		int k =0;
		String[] resultStr= new String[5];
		for(int i = 0; i<str.length;i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if(s.charAt(0) == str[i].charAt(j)) {
					System.out.println("1");
					resultStr[k] =null;
					int length2 = 1;
					for (int j2 = 1; j2 < s.length(); j2++) {
						j++;
						if (s.charAt(j2) ==str[i].charAt(j)) {
							System.out.println("2");
							length2++;
						}
						if(length2==s.length()) {
							resultStr[k] = str[i];
							System.out.println("3");
							j= str[i].length()-1;
							k++;
						}
						if(s.charAt(j2)!=str[i].charAt(j)) {
							j2=s.length();
							System.out.println("5");
						}
					}
				}
			else{	
				System.out.println("6");
				continue;	
			}
		}		
	}
		System.out.println("7");
		return resultStr;
		
}
//	public 	String[] SearchInString(String[] str1,String s){
//	String[] resultStr= new String[5];
//	int k =0;
//		for(int i = 0; i<str1.length;i++) {
//			for (int j = 0; j < str1[i].length(); j++) {
//			if(str1[i].charAt(j)==s.charAt(0)) {
//				resultStr[k]=str1[i];
//				k++;
//			}
//		}
//	}
//		return resultStr;
//}
//	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the total no. of string :- ");
		int k = in.nextInt();in.nextLine();
		System.out.println("Enter the strings :- ");
		String[] str = new String[k];
		for (int i = 0; i < k; i++) {
			str[i]= in.nextLine();
		}
		System.out.print("Enter the string you want to search in the provided string :- ");
		String s = in.nextLine();
		StringSearch n = new StringSearch();
//		if (s.length()==1) {
//			String[] str1=n.SearchingString(str, s);
//			for (int i = 0; i < str.length; i++) {
//				if (str1[i]==null) {
//					System.out.println("8");
//					continue;
//				}
//				else {
//					System.out.println(str1[i]);
//				}
//		}}
//		else{
		String[] str1 =n.SearchingString(str,s);
		
		for (int i = 0; i < str.length; i++) {
		if (str1[i]==null) {
			System.out.println("8");
			continue;
		}
		else {
			System.out.println(str1[i]);
		}
//	}
		}
		
}
	
//	public String SearchingString(String str,String s) {
//		String resultStr= null;
//		int length2 = 1;
//			for (int j = 0; j < str.length(); j++) {
//				if(s.charAt(0) == str.charAt(j)) {
//					for (int j2 = 1; j2 < s.length(); j2++) {
//						j++;
//						if (s.charAt(j2) ==str.charAt(j)) {
//							length2++;
//						}
//						if(length2==s.length()) {
//							resultStr = ""+	str;;
//						}
//						if (s.charAt(j2)!=str.charAt(j)) {
//							j2=s.length();
//						}
//					}
//				}
//				else{	
//					continue;	
//				}
//			}
//		return resultStr;
//		
//		
//	}
//
//	
//	public static void main(String[] args){
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter the total no. of string :- ");
//		int k = in.nextInt();in.nextLine();
//		System.out.println("Enter the strings :- ");
//		String[] str = new String[k];
//		for (int i = 0; i < k; i++) {
//			str[i]= in.nextLine();
//		}
//		System.out.print("Enter the string you want to search in the provided string :- ");
//		String s = in.nextLine();
//		StringSearch n = new StringSearch();
//		for (int i = 0; i < str.length; i++) {
//		String str1 =n.SearchingString(str[i],s);
//		if (str1==null) {
//			continue;
//			
//		}
//		else {
//			System.out.println(str1);
//		}
//	}	
//}
}	
