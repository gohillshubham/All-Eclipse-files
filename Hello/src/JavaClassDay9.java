//
//class PolyAdder{
//	static int Adder(int a,int b) {
//		return a+b;
//	}
//	static double Adder(double a,double b) {
//		return a+b;
//	}
//}


 class Address{
	String city,state,country;
	public Address(String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
 }
 class Empl{
	int id; 
	String name;
	Address add;
	public Empl(int id,String name,Address add){
		this.id=id;
		this.name=name;
		this.add=add;
	}
	void printLn(){
		System.out.println(id+" "+name+" ");
		System.out.println(add.city+" "+add.state+" "+add.country+" ");
		
	}
}
public class JavaClassDay9 {
	public static void main(String[] args) {
		Address a1 = new Address("gaya","Bihar","India");
		Address a2 =new Address("Ranchi","Jharkhand","India");
		Empl e1 = new Empl(101,"Shubham",a1);
		Empl e2 = new Empl(102,"Anand",a2);
		e1.printLn();
		e2.printLn();
	}

}