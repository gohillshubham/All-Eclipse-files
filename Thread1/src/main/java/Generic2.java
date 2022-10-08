
	public class Generic2 {
	    public static <E> void printar(E []s){
	        for (int i=0;i<s.length;i++)
	            System.out.println(s[i]);
	    }

	    public static void main(String[] args) {
	       // Generic2 g=new Generic2();
	        String country[]=new String[]{"India","pakistan","china"};
	        Integer num[]= {10,59,784,87};
	        printar(country);
	        printar(num);
	    }
	}
