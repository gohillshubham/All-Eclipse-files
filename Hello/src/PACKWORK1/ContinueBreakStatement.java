package PACKWORK1;

public class ContinueBreakStatement {
	public static void main(String[] a) {
		int searchNo = 24;
		int count =0;
		Outer:
			for(int i =1;i<=100;i++) {
			Inner:
				for(int k = 1;k<=10;k++) {
					int num = i*k;
					System.out.print(num +" ");
					if(num == searchNo) {
						count++;
						System.out.println();
						continue Outer;
					}
				}
			System.out.println();
			}
		System.out.println("Search no. is "+searchNo+" and came: "+count+" Times");
	}
}
