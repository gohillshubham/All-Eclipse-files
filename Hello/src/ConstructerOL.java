

class Student5{
	int id;
	String name;
	float age;
	Student5(int i,String n){
		id= i;
		name= n;
		System.out.println("Constructer is created memory");
	}
	Student5(int i,String n,float a){
		id= i;
		name= n;
		age =a;
		System.out.println("Constructer is created memory for the variables");
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
}

public class ConstructerOL {
	public static void main(String[] args) {
		Student5 s1 = new Student5(111,"Karan");
		Student5 s2 = new Student5(112,"Rohit",23);
		s1.display();
		s2.display();
				
	}

}



