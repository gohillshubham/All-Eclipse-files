import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
 
//public class SwingClass2Day11 {
//	public static void main(String[] args) {
//		JFrame f =new JFrame("Label Example");
//		
//// Label Example
//		JLabel l1,l2;	
//		l1 =new JLabel("First label");
//		l2 =new JLabel("Second label");
//		l1.setBounds(50, 50, 100, 30);
//		l2.setBounds(50, 100, 100, 30);
//		f.add(l1);f.add(l2);
//// Label Example end
//		
//		
//		
//		f.setSize(300,300);
//		f.setLayout(null);
//		f.setVisible(true);
//	}
//
//}


//For finding the ip of sites.
//public class SwingClass2Day11 extends Frame implements ActionListener {
//	JTextField tf;JLabel l1; JButton b;
//	SwingClass2Day11(){
//		tf =new JTextField();
//		tf.setBounds(50, 50, 150, 20);
//		l1 =new JLabel();
//		l1.setBounds(50, 100, 250, 20);
//		b = new JButton("Find Ip");
//		b.setBounds(50, 150, 95, 20);
//		b.addActionListener(this);
//		add(tf);add(l1);add(b);
//		setSize(400,400);
//		setLayout(null);
//		setVisible(true);
//	}
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		try {
//			String host = tf.getText();
//			String ip = java.net.InetAddress.getByName(host).getHostAddress();
//			l1.setText("The Ip of "+host+" is: "+ip);
//		}catch(Exception ex) {System.out.println(ex);}
//	}
//	public static void main(String[] args) {
//		new SwingClass2Day11();
//	}
//	
//}
//      End of the code for finding the ip 


public class SwingClass2Day11 implements ActionListener{
	JTextField tf1,tf2,tf3;
	JButton b1,b2;
	SwingClass2Day11(){
		JFrame f= new JFrame("For Implementing Action listener in Textfield");
		tf1 = new JTextField();
		tf1.setBounds(50, 100, 150, 20);
		tf2 = new JTextField();
		tf2.setBounds(50, 150, 150, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 200, 150, 20);
		b1 =new JButton("+");
		b1.setBounds(50, 250, 50, 50);
		b2 =new JButton("+");
		b2.setBounds(120, 250, 50, 50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		int c=0;
		if(e.getSource()==b1) {
			c=a+b;
		}
		else if(e.getSource()==b2) {
			c=a-b;
		}
		String result =String.valueOf(c);
		tf3.setText(result);	
	}
	public static void main(String[] args) {
		new SwingClass2Day11();
	}
	
}
