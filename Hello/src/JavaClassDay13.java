
class Bikees {
	int speedLimit = 100;
	void run(){
		System.out.println("speedLimit = 90");
	}
}
public class JavaClassDay13 extends Bikees{
	int speedLimit = 50;
	final void run(){
		System.out.println("speedLimit = 100");
	}
	public static void main(String[] args) {
		JavaClassDay13 obj = new JavaClassDay13();
		obj.run();
		System.out.println(obj.speedLimit);
	}
}

