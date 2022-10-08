

public class JavaClassDay3 {
	public static void main(String[] args) {
	Student s1 = new Student();
	Student s2 = new Student();
//	System.out.print("Student details: ");
//	s1.id = 102;
//	s1.name = "Shubham";
	
	s1.StudentDetails(102, "Shubham");
	s2.StudentDetails(103, "Rameshwar");
	s1.DisplayDetails();
	s2.DisplayDetails();
	}
}

class Student{
	   int id;
	   String name;
	   void StudentDetails(int i,String n) {
		   id= i;
		   name =n;
	   }
	   void DisplayDetails(){
		   System.out.println(id+" "+name);  
	   }
}
