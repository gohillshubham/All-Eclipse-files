package Hackerrank;

import java.util.Scanner;
class ConstraintCheck{
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public ConstraintCheck(int a, int b, int c) {
		
		if((0<a && a<1000) && (0<b && b<1000) && (0<c && c<1000)) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else
			{System.out.println("Not in range");
				return;
			}
			
	}
	
}
public class InputWithConstraints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,b1,c1;
		Scanner sc = new Scanner(System.in);
			a1 = sc.nextInt();
			b1 = sc.nextInt();
			c1 = sc.nextInt();
			sc.close();
			ConstraintCheck obj = new ConstraintCheck(a1,b1,c1);
			int temp = obj.getA()>obj.getB()?obj.getA():obj.getB();
			int largest = obj.getC()>temp? obj.getC():temp;
			if(largest!=0)
			    System.out.println(largest);
			    return;
	}

}
