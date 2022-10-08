package PACKWORK1;
import java.util.*;

public class StringConAFind {
		public int findingA(String s,int n) {
			int q=0,k=0;
			q=n/s.length();
			k=n%s.length();
			int j = q *(SearchInString(s,s.length()))+k*(SearchInString(s,k));
			return j;
		}
		
		public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter String");
			String str = sc.nextLine();
			System.out.println("Enter no. of length you want");
			int n = sc.nextInt();
			StringConAFind in = new StringConAFind();
			int k =in.findingA(str, n);
			System.out.println(k);
		}
		public int SearchInString(String s,int length) {
			int nt = 0;
			for(int i=0;i<length;i++)
			{	if(s.charAt(i)=='a') {
					nt++;
				}
			}
			return nt;
		}
}

