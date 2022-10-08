
import java.awt.event.*;

import javax.swing.*;
public class SwingFormJavaDay13 implements ActionListener {
	JTextField tf1,tf2,tf3,tf4;
	JButton save,exit;
	JLabel name,desig,code,salary,newlabel;
	SwingFormJavaDay13(){
	JFrame f = new JFrame("Form");
	name = new JLabel("NAME");
	name.setBounds(10, 5, 50, 30);
	code = new JLabel("CODE");
	code.setBounds(10, 30, 50, 30);
	desig = new JLabel("DESIGNATION");
	desig.setBounds(10, 55, 50, 30);
	salary = new JLabel("SALARY");
	salary.setBounds(10, 80, 50, 30);
	
	tf1 = new JTextField();
	tf1.setBounds(100,5, 200, 30);
	tf2 = new JTextField();
	tf2.setBounds(100, 30, 200, 30);
	tf3 = new JTextField();
	tf3.setBounds(100, 55, 200, 30);
	tf4 = new JTextField();
	tf4.setBounds(100, 80, 200, 30);
	
	save = new JButton("SAVE");
	save.setBounds(80,150,80,30);
	save.addActionListener(this);
	exit = new JButton("EXIT");
	exit.setBounds(170,150,80,30);
	
	newlabel = new JLabel();
	newlabel.setBounds(10, 200, 200, 30);
	
	f.add(name);f.add(code);f.add(desig);f.add(salary);
	f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);
	f.add(save);f.add(exit);f.add(newlabel);
	f.setSize(400, 280);
	f.setLayout(null);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String str = "";
		str = str+ tf1.getText();
		str = str+" "+ tf2.getText();
		str = str+" "+ tf3.getText();
		str = str+" "+ tf4.getText();
	
		if(e.getSource()== save) {
			newlabel.setText(str);
		}
	}
	
	
	public static void main(String[] args) {
		new SwingFormJavaDay13();
	}
	
}
