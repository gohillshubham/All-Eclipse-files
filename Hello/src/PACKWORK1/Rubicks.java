package PACKWORK1;

public class Rubicks{
	private String name;
	private int age,rollno,marks;
	double Bsalar;
	public Rubicks(String n,int a,int r) {
		name=n;
		age=a;
		rollno=r;
	}
	public Rubicks(double Bsalary){
		Bsalar = Bsalary;
	}
	public void maxMarks(int max) {
		System.out.println("Maximum marks in the subject is: "+max);
	}
	public void minMarks(int min) {
		System.out.println("Minimum marks in the subject is: "+min);
	}
	public void Marks(int m) {
			System.out.print(m+" ");
	}
//	min finding
	public static int minMarks1(Rubicks[] m,int s) {
		 int min =98794654;
		for(int i=0;i<s;i++) 
		{	if(m[i].marks<= min) 
			{
				min=m[i].marks;
			}
		}
		return min;
	}
//   end function 2
	
	public static int maxMarks1(Rubicks[] m,int s) {
		 int min =98794654;
		for(int i=0;i<s;i++) 
		{	if(m[i].marks>= min) 
			{
				min=m[i].marks;
			}
		}
		return min;
	}

//Gross Salary Function start
		public Rubicks(int r) {
		 marks =r;
		}
		public double Gsalary(double Bsalar) {
			double Ta = (15*Bsalar)/100;
			double Da = (20*Bsalar)/100;
			double Hra = (30*Bsalar)/100;
			double Gsalar = Bsalar + Ta + Da + Hra;
			return Gsalar;
		}
	// Gross Salary function end
		
}