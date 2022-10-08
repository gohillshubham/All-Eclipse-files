import java.util.*; 

public class palindrom {
    public static void main(String args[]) {
    	int k=0;
    	System.out.println("write a no.");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
//    	int n = 569896;
		int a= n;
		while(n != 0){	
			int j = n%10;
			k = k*10+j;
			n= n/10;	
		}
		if(k==a)
			System.out.println("this is palindrom no."+k);
		else
			System.out.println("this is not palindrom no."+k);
    }
}
