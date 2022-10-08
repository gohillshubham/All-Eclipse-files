package Sa;

public class Arrayvalue {
	    boolean rotateMatrix(int[][] matrix) {
	        // TODO
	    	System.out.print("[");
	        for(int i=0 ;i<=2;i++){
	        	System.out.print("[");
	            for(int j =2;j>=0;j--){
	                System.out.print(matrix[j][i]);
	                if(j!=0)
	                	System.out.print(",");
	            }
	            System.out.print("]");
	            if(i!=2)
	            	System.out.print(",");
	        }
	        System.out.print("]");
	        return true;
	    }
	  public int pricePizza(int quantity) {
		  int price=0;
		  while(quantity!=0) {
			  if(quantity>=50) {
				  quantity -=50;
				  price+=15000;
			  }
			  else if(quantity>=10) {
				  quantity -=10;
				  price+=3250;
			  }
			  else if(quantity>=2) {
				  quantity -=2;
				  price+=750;
			  }else {
				  quantity -=1;
				  price+=400;
			  }
		  }
		  return price;
	  }
	 public static int RaceCar(int n1 ,int n2 ,int x) {
		 if(n1>n2)
			 return -1;
		 int p1=x,p2=0;int t=0;
		 while(p2<=p1) {
			 p1=p1+n1;
			 p2=p2+n2;
			 t++;
		 }
		 return t;
	 }
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		Arrayvalue av = new Arrayvalue();
		boolean t = av.rotateMatrix(matrix);
		System.out.println(t);
		int price = av.pricePizza(49);
		System.out.println(price);
		int sec= Arrayvalue.RaceCar(3, 4, 1);
		System.out.println(sec);
	}
}
