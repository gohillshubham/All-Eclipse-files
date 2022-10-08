import javax.swing.*;
import java.awt.event.*;

public class SwingPasswordClass14 implements ActionListener{
	JLabel l1,l2,l3;
	JButton login;
	JTextField t1;
	JPasswordField t2;
	SwingPasswordClass14(){
		JFrame f = new JFrame("Log in panel");
		
		l1= new JLabel("Username");
		l1.setBounds(10, 20, 100, 30);
		l2 = new JLabel("Password");
		l2.setBounds(10, 60,100,30);
		l3= new JLabel();
		l3.setBounds(20,150, 200, 30);
		
		t1 = new JTextField();
		t1.setBounds(80, 20, 100, 30);
		t2 = new JPasswordField();
		t2.setBounds(80,60,100,30);
		
		login= new JButton("login");
		login.setBounds(130,100, 100,30);
		login.addActionListener(this);
		
		f.add(l1);f.add(l2);f.add(l3);
		f.add(t1);f.add(t2);
		f.add(login);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String str = t1.getText()+","+new String(t2.getPassword());
		l3.setText(str);
	}
	public static void main(String[] args) {
		SwingPasswordClass14 i = new SwingPasswordClass14();
	}
}
