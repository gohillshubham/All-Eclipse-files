package Employee1;

public class Employee {
	private String name;
	private float salary;
	private String organis;
	
	public Employee(String name, float salary, String organis) {
		this.name = name;
		this.salary = salary;
		this.organis = organis;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getOrganis() {
		return organis;
	}

	public void setOrganis(String organis) {
		this.organis = organis;
	}
	public void monthlySalary() {
		System.out.println(getSalary()/12);
	}

	@Override
	public String toString() {
		return "Employee: ["+name + ","+ salary+","+ ","+organis +"]";
	}
	
	
}
