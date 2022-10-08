class Employees{
	int id;
	String name;
	float salary;
	void Salary(int i,String n,float s) {
		id= i;
		name=n;
		salary=s;
	}
	void Details() {
		System.out.println(id+" "+name+" "+salary);
	}
}
public class Employee {
			public static void main(String[] args) {
				Employees e1 = new Employees();
				Employees e2 = new Employees();
				Employees e3 = new Employees();
				e1.Salary(101,"ajeet",45000);
				e2.Salary(102,"rakesh",55000);
				e3.Salary(103,"rajesh",38000);
				e1.Details();
				e2.Details();
				e3.Details();
				
			}
}
