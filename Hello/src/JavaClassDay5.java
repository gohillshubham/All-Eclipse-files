
class StudentType{
	String name;
	int rollno;
	int age;
	public static String college ="ITIS";
	StudentType(String n,int r,int a){
		name = n;
		rollno= r;
		age = a;
	}
	void displayDetails() {
		System.out.println(name+" "+rollno+" "+age+" "+college);
	}
}
public class JavaClassDay5 {
	public static void main(String[] args) {
		StudentType s1 = new StudentType("Shalu",101,24);
		StudentType s2 = new StudentType("Shanu",102,26);
		StudentType s3 = new StudentType("Shaloni",103,25);
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
	}
	
}
