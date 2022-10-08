import PACKWORK1.SimpleInteres;
import java.util.*;


public class HomeWorkDay1 {
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
			SimpleInteres A = new SimpleInteres(p,r,t);
			A.valuee();
//			Simple interest finished		
			
			
			
			
//		Percentage Profit and Loss		
//			System.out.println("Enter the price of item");
//			float Cp = in.nextFloat();in.nextLine();
//			System.out.println("Enter the selling price of item");
//			float Sp = in.nextFloat();in.nextLine();
//			if(Sp>Cp)
//			{
//				float Pp= (Sp - Cp)*100;
//					Pp = Pp/Cp;
//					System.out.println("The profit percentage is: "+Pp);
//			}
//			else {
//				float Lp= (Cp - Sp)*100;
//				Lp = Lp/Cp;
//				System.out.println("The Loss percentage is: "+Lp);
//			}		
//		Percentage Profit and Loss	end	
			
			
//      Area of Rectangle
//			System.out.println("Enter the base of the triangle");
//			float b = in.nextFloat();in.nextLine();
//			System.out.println("Enter the Height of the triangle");
//			float h = in.nextFloat();in.nextLine();
//			float k = (b*h)/2;
//			System.out.println("Area of the triangle is: "+k);
			
//	      Area of Rectangle Finished 
			
			
//		Percentage of Five Subjects.
//			System.out.println("Enter the marks of five subject one by one out of 100");
//			float First = in.nextFloat();
//			float Second = in.nextFloat();
//			First += Second;
//			Second = in.nextFloat();
//			First += Second;
//			Second = in.nextFloat();
//			First += Second;
//			Second = in.nextFloat();
//			First += Second;
//			Second = (First*100)/500;
//			System.out.println("Percentage marks obtained in overall subjects: "+Second);
			
//		Percentage of Five Subjects Finished
			
			
	}
}
