//class Adder{
//	static int add(int a,int b) {
//		return a+b;
//	}
//	static int add(int a,int b,int c) {
//		return a+b+c;
//	}
//}

class OverLoading1{
	void sum(int a,long b) {
		System.out.print("1 ");
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.print("2 ");
		System.out.println(a+b+c);
	}
}
public class OverLoading {
	public static void main(String[] args) {
		OverLoading1 obj = new OverLoading1();
		obj.sum(20,20);
		obj.sum(20, 20,20);
	}

}
