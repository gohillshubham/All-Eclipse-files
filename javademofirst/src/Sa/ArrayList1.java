package Sa;

import java.util.*;

public class ArrayList1 {
	 public static void main(String[] args)
	  {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<String> al = new ArrayList<String>();
		 
		 
		 
		 al.add("1");
		 al.add("q");
		 al.add("s");
		 al.add(0,"A");
		 al.set(0, "1");
		 System.out.print(al);
		 al.remove(1);
		 System.out.println(al);
		
		 LinkedList<String> ll = new LinkedList<String>();
		  ll.add("1");
		  ll.add("q");
		  ll.add("s");
		  System.out.print(ll);
		  ll.add(0,"A");
		  ll.set(0, "1");
		 System.out.print(ll);
		 ll.remove(1);
		 System.out.print(ll);
		 String str = sc.nextLine();
		 sc.close();
		 String[] value = str.split(" ");
		 System.out.println(value.length);
		 String[] v = new String[3];
		 float[] kg = new float[3];
		 int j =0;
		 for (int i = 0; i < value.length; i+=2) {
			v[j] = value[i];
			kg[j]= Float.valueOf(value[i+1]);
			j++;
		}
		 for (int i = 0; i < kg.length; i++) {
			 System.out.println(v[i]+" "+kg[i]);
		 }
		 HashMap<String, Integer> hm = new HashMap<String, Integer>();
		 hm.put("Orange", 20);
		 hm.put("Banana", 10);
		 hm.put("Pineapple", 30);
		 Set<?> s1 = hm.entrySet();
		 Iterator<?> i = s1.iterator();
		 float sum =0;
//		 Orange 2 Banana 1.75 Pineapple 3.4
		 while(i.hasNext()) {
			 Map.Entry m1 = (Map.Entry)i.next();
			 if(m1.getKey().equals(v[0])) {
				 sum+=kg[0]*(int)m1.getValue();
			 }
			 if(m1.getKey().equals(v[1])) {
				 sum+=kg[1]*(int)m1.getValue();
			 }
			 if(m1.getKey().equals(v[2])) {
				 sum+=kg[2]*(int)m1.getValue();
			 }
			 
		 }
		 System.out.println(sum);
		 
	  }
}
