
class Student6{
	int id;
	String name;
	
	Student6(int i,String n){
		id= i;
		name= n;
	}
	Student6(Student6 s){
		id= s.id;
		name= s.name;
		
	}
	void display() {
	System.out.println(id+" "+name);
	}

}
public class CopyConstructer {
	public static void main(String[] args) {
		Student6 s = new Student6(111,"raja");
		Student6 s1 =new Student6(s);
		s.display();
		s1.display();
			
	}

}
