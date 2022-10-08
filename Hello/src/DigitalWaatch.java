import java.util.*;
import java.awt.*;
import java.text.*;
import javax.swing.*;

public class DigitalWaatch implements Runnable{
	
		JFrame f;
		Thread t= null;
		int hours =0,minutes=0,seconds=0;
		String timeString="";
		JButton b;
		DigitalWaatch(){
			f =new JFrame();
			
			t= new Thread(this);
			t.start();
			
			b=new JButton();
			b.setBounds(10, 10,200,100);
			
			f.add(b);
			f.setSize(300, 400);
			f.setLayout(null);
			f.setVisible(true);
		}
		public void run() {
			try {
				while(true) {
					
					Calendar cal = Calendar.getInstance();
					hours = cal.get(Calendar.HOUR_OF_DAY);
					if(hours>12)hours = hours-12;
					minutes = cal.get(Calendar.MINUTE);
					seconds = cal.get(Calendar.SECOND);
					
					
					SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
					Date date = cal.getTime();
					timeString = formatter.format(date);
					
					printTime();
					
					t.sleep(1000);
					
				}
			}
			catch(Exception e) {}
		}
		private void printTime() {
			// TODO Auto-generated method stub
			b.setText(timeString);
		}


public static void main(String[] args) {
	new DigitalWaatch();
}

}

