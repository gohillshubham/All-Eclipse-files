import java.util.Scanner;

//class Simple{
//	float price,rate,time;
//	void Values(float p,float r,float t) {
//		price=p;
//		rate=r;
//		time= t;
//	}
//	public void DisplayInterest(float price, float rate,float time) {
//		float SI = (price*rate*time)/100;
//		float p=price+SI;
//
//		System.out.println("simple interest: "+SI+"\nTotal money is: "+p);
//	}


public class SimpleInterest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//	Simple interest finding
		float p,r,t;
		System.out.println("Enter the value of initial price");
		p = in.nextFloat();in.nextLine();
		System.out.println("Enter the value of interest per year in percentage");
		r = in.nextFloat();in.nextLine();
		System.out.println("Enter the value of time in year");
		t = in.nextFloat();in.nextLine();
//		Values(p, r, t);
		DisplayInterest(p,r,t);
		
//		
//	Simple interest finished
}

	public static void DisplayInterest(float price, float rate, float time) {
		// TODO Auto-generated method stub
		float SI = (price*rate*time)/100;
		float p=price+SI;

		System.out.println("simple interest: "+SI+"\nTotal money is: "+p);
		
	}
	
}
