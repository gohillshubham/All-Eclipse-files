package Sa;

	import java.io.*;
	import java.util.*;
	class Register {
	    
//	    private static Register register = null;
	    /*
	     * Complete the 'getTotalBill' function below.
	     *
	     * The function is expected to return a STRING.
	     * The function accepts MAP itemDetails as parameter.
	     */

	    public String getTotalBill(Map<String,Integer> itemDetails) {

	        // Write your code here
	        Set<?> s1 = itemDetails.entrySet();
	        Iterator<?> i = s1.iterator();
	        float sum= 0;
	        while(i.hasNext()){
	            @SuppressWarnings("rawtypes")
				Map.Entry m = (Map.Entry) i.next();
	            if(m.getKey().equals("orange"))
	                sum+=1.5*(int)m.getValue();
	            if(m.getKey().equals("apple"))
	                sum+=2.0*(int)m.getValue();
	            if(m.getKey().equals("mango"))
	                sum+=1.2*(int)m.getValue();
	            if(m.getKey().equals("grape"))
	                sum+=1.0*(int)m.getValue();
	        } 
	        return ""+sum;
	            

	    }
		


	}

	public class Solution {
	    public static void main(String[] args) throws IOException {
	        
	        Scanner readInput = new Scanner(System.in);        
	        String[] input=readInput.nextLine().split(" ");                
	        Map<String,Integer> myItems=new HashMap<String,Integer>();
	        for(int i=0;i<input.length;i+=2){
	          myItems.put(input[i],Integer.parseInt(input[i+1]));	
	        }
//	        Register regObj = Register.getInstance(); 
	        Register regObj = new Register();
	        System.out.println(regObj.getTotalBill(myItems));
	        readInput.close();
	        
	    }
	
}
