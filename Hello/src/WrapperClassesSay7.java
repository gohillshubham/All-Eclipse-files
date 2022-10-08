
public class WrapperClassesSay7 {
	public static void main(String[] args)
	{
		
//	 Example first 
//		Integer i1 = Integer.valueOf("101011",2);
//		Double d1 = Double.valueOf("3.14");
//		int a = Integer.parseInt("123");
//		double b = Double.parseDouble("13.45");
//		System.out.print("the value is: ");
//		int c = i1;//.intValue();
//		System.out.println(i1+" "+d1+" "+a+" "+b+" "+c);
//		example first end
		
//		Example Second
		Integer intWrapper = Integer.valueOf("12345");
		
		Integer intWrapper1 = Integer.valueOf("-11011",2);
		
		Integer intWrapper2 = Integer.valueOf("D",16);
		
		System.out.println("value of intWrapper Object "+intWrapper);
		System.out.println("value of intWrapper1 Object "+intWrapper1);
		System.out.println("value of intWrapper2 Object "+intWrapper2);
		System.out.println("Hex value of intWrapper "+Integer.toHexString(intWrapper));
		
		System.out.println("Binary value of intWrapper Object1 "+Integer.toBinaryString(intWrapper1));
		System.out.println("Binary value of intWrapper Object2 "+Integer.toBinaryString(intWrapper2));
	}		
}
