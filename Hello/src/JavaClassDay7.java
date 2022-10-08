import java.util.*;
public class JavaClassDay7 {

	public static void main(String[] args)
	{
//		widening by doing data type casting
//		int x=7;
//		long y=x;
//		float z=y;
//		System.out.print(x+" ");
//		System.out.print(y+" ");
//		System.out.print(z+" ");
		
//		Narrowing by doing data type casting
		double x=9865.8456;
		float y = (float)x;
		long z= (long)y;
		int k= (int)z;
		System.out.print(x+" ");
		System.out.print(y+" ");
		System.out.print(z+" ");
		System.out.print(k+" ");
	}
}
