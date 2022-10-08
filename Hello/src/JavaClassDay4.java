


//class Constructer{
//	Constructer(){
//		System.out.println("Constructer is constructed");
//	}
//}


class Student1{
	int id;
	String name;
	float age;
	Student1(int i,String n,float a){
		id= i;
		name= n;
		age =a;
		System.out.println("Constructer is created memory for the variables");
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
	}
}

public class JavaClassDay4 {
		public static void main(String[] args) {
			Student1 C = new Student1(111,"Sarah",32);
			Student1 C1 = new Student1(112,"Rakesh",31);
			Student1 C2 = new Student1(113,"shakti",23);
			C.display();
			C1.display();
			C2.display();
			
   }
}
