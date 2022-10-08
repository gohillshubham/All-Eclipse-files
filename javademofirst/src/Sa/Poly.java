package Sa;
//
////import java.util.Iterator;
//import java.util.Scanner;
//
//public class Poly {
//	public static void main(String args[] ) throws Exception {
//		Scanner sc= new Scanner(System.in);
//		int se = sc.nextInt();
//		int ee = sc.nextInt();
//		sc.close();
////		new Parent(se,ee);
//		ChildOne c1 = new ChildOne(se,ee);
//		String str1=c1.filter();
//		System.out.println(str1);
//		ChildTwo c2 = new ChildTwo(se,ee);
//		String str2=c2.filter();
//		System.out.println(str2);
//    }
//}
//	class Parent{
//		public int startElement;
//		public int endElement;
//		
//		public Parent(int startElement, int endElement) {
//			this.startElement = startElement;
//			this.endElement = endElement;
//		}
//
//		public String filter() {
//			return null;
//		}
//	}
//	class ChildOne extends Parent{
//
//	
//		public ChildOne(int startElement, int endElement) {
//			super(startElement, endElement);
//		}
//
//		@Override
//		public String filter() {
//			
//			String str="" ;
//			if(startElement ==0 || startElement ==1)
//				startElement=2;
//			for (int i = startElement; i <=endElement; i++) {
//				boolean flag =false;
//				for (int j = 2; j <= i/2; j++) {     
//					if(i % j == 0){
//		                flag = true;
//		                break;
//		            }
//				}
//				if (!flag)
//		            str = str+i+" ";
//				
//			}
//			return str;
//		}
//		
//	}
//	class ChildTwo extends Parent{
//
//
//		public ChildTwo(int startElement, int endElement) {
//			super(startElement, endElement);
//		}
//
//		@Override
//		public String filter() {
//			// TODO Auto-generated method stub
//			String str ="";
//			if(startElement==1) {
//				str=1+" ";
//				startElement=startElement+1;
//			}
//			for (int i = startElement; i <= endElement; i++) {
//				int i1=i;int c=0;
//				while(i1!=1) {
//					int sum=0;
//					int k =i1;
//					while(k!=0) {
//						int j = k%10;
//						sum = sum +j*j;
//						k=k/10;
//					}
//					i1=sum;
//					if(sum==4)
//						c++;
//					if(c==2)
//						break;
//				}
//				if(i1==1)
//					str=str+i+" ";
//			}
//			return str;
//		}
//		
//	}

//import java.util.Arrays;
import java.util.Scanner;


public class Poly{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];

        for(int i = 0; i < 11; i++)
        {
            hockeyPlayers[i] = sc.nextInt();
        }

        for(int i = 0; i < 11; i++)
        {
            footballPlayers[i] = sc.nextInt();
        }
        sc.close();
        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try{
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if(s instanceof HockeyTeam && s instanceof FootballTeam)
            {
                System.out.println(s.calculateHockeyScore());
                System.out.println(s.calculateFootballScore());
                System.out.println(s.findHighestGoalByIndividualInHockey());
                System.out.println(s.findHighestGoalByIndividualInFootball());
            }
        }
        catch (NoSuchMethodException ex)
        {
            System.out.println("No such function is exits");
        }
    }
}

class Sport implements HockeyTeam,FootballTeam{
	public int[] hockeyPlayers =new int[11];
	public int[] footballPlayers;
	public Sport(int[] hockeyPlayers, int[] footballPlayers) {
		this.hockeyPlayers = hockeyPlayers;
		this.footballPlayers = footballPlayers;
	}
	public int calculateFootballScore() {
		int sum =0;
		for (int i = 0; i < footballPlayers.length; i++) {
			sum = sum+ footballPlayers[i];
		}
		return sum;
	}
	
	public int calculateHockeyScore() {
		int sum =0;
		for (int i = 0; i < hockeyPlayers.length; i++) {
			sum = sum+ hockeyPlayers[i];
		}
		return sum;
	}
	public int findHighestGoalByIndividualInFootball() {
		int max=-1;
		for (int i = 0; i < footballPlayers.length; i++) {
			if(max<footballPlayers[i])
				max=footballPlayers[i];
		}
		return max;
	}
	public int findHighestGoalByIndividualInHockey() {
		int max=-1;
		for (int i = 0; i < hockeyPlayers.length; i++) {
			if(max<hockeyPlayers[i])
				max=hockeyPlayers[i];
		}
		return max;
	}
	
}
interface HockeyTeam{
	public int calculateHockeyScore();
	public int findHighestGoalByIndividualInHockey();
	
}
interface FootballTeam{
	public int calculateFootballScore();
	public int findHighestGoalByIndividualInFootball();
	
}
