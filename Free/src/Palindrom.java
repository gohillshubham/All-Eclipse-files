import java.util.Scanner; 

public class Palindrom {
    public static void main(String[] args) {
    	int n,k;
		Scanner in = new Scanner(System.in);
			n = in.nextInt();
			k = n;
			while(n ==0)
			{	int j = n%10;
				k = k*10+j;
				n= n/10;	
			}
//    	int k = checks1(a);
			if(k==n)
				System.out.println("this is palindrom no."+k);
			else
				System.out.println("this is not palindrom no."+k);
    }
}
