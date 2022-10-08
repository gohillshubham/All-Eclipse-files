
 abstract class Bike{
	Bike(){
		System.out.println("bike is created");
	}
		abstract void run();
			void changeGear() {
				System.out.println("Gear changed");	
		}
}

 class Honda1 extends Bike{
	void run() {	System.out.println("Running safely"); 	}
	
	
}
public class JavaClassDay14{
	public static void main(String[] args) {
		Bike obj = new Honda1();
		obj.run();
		obj.changeGear();
	}  
	
}