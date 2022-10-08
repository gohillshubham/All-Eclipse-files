class Employee12{
	float salary= 50000;
}
class Bonus extends Employee12{
	float bonus = 10000;
	void Total(){
	System.out.println("Gross salary: "+(salary+bonus));
	}
}
public class JavaClassDay8 extends Bonus{
	public static void main(String[] args) {

		JavaClassDay8 b =new JavaClassDay8();
		System.out.println("Total Bonus: "+b.bonus);
		System.out.println("Total salary: "+b.salary);
		b.Total();
		
	}
}
