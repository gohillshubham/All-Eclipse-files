package PACKWORK1;

import java.util.Scanner;

public class SimpleInteres {
	private float p;
	private float r;
	private float t;
	public SimpleInteres(float p,float r,float t){
		this.p =p;
		this.r=r;
		this.t=t;
	}
	
	public void valuee() {
		
//	Simple interest finding
		
		float SI = (p*r*t)/100;
		p=p+SI;
		System.out.println("simple interest: "+SI+"\nTotal money is: "+p);
//	Simple interest finished
}

	

}
