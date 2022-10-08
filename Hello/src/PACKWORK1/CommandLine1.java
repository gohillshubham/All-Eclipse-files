package PACKWORK1;
import java.util.Scanner;
public class CommandLine1 {
	public static void main(String[] args) {
//		System.out.println(args.length);
//		
//		Scanner sc = new Scanner(System.in);
//		String k =sc.nextLine();
//		
//		for(String val: args) {
//			if(val.equalsIgnoreCase(k)) {
//				System.out.println("\n"+val);
//			}
//			System.out.print(val+" ");
//		}
		
		Scanner sc = new Scanner(System.in);
		int k =sc.nextInt();sc.nextLine();
		int j;
		for (int i = 0; i < k; i++) {
			int x= sc.nextInt();
			int y=sc.nextInt(); 
			int z =sc.nextInt();
			
			if(x<=3) {System.out.println(x*y);return;}
			
			if(x%3==0) {
				int gap = (x/3)-1;
				j = x*y+gap*z;
			}
			else {
				int gap = x/3;
				j = x*y+gap*z;
			}
			System.out.println(j);
		}
		
		
		
	}
	
//	i can also make fibonaci series by converting args[0] from string to int
}
