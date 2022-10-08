import java.util.*;
import PACKWORK1.Rubicks;

public class JavaClassDay6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of subject");
		int s;
		Rubicks R1 = new Rubicks("shubham kumar",23,69);
		s=in.nextInt();
		int[] m = new int[s];
		System.out.println("Enter all the subject marks");
		Rubicks[] marks=new Rubicks[s];
//		object array created
		for(int i=0;i<s;i++) {
			m[i]= in.nextInt();
			marks[i] = new Rubicks(m[i]);
//			object array value inserted
		}
		
		int max = Rubicks.maxMarks1(marks,s);
		int min = Rubicks.minMarks1(marks,s);
		
		System.out.println("1 max marks \n2 min marks \n3all marks");
		
		int no=in.nextInt();
		
		switch(no) {
		case 1: R1.maxMarks(max);
				break;
		case 2: R1.minMarks(min);
				break;
		case 3:	System.out.println("marks are");
			for(int i=0;i<s;i++) {
				R1.Marks(m[i]);
			}
			break;
		default: System.out.println("Wrong entry");
		}
	}


}
