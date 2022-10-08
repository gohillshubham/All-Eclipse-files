import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JavaClassDay11 implements ActionListener {
		JTextField bs,gr;
		JButton grSalary;
		JLabel bs1;
		JavaClassDay11(){
			JFrame f = new JFrame("For Finding the Gross SAlary");
			bs1 =new JLabel("Enter the Basic Pay");
			bs1.setBounds(10, 10,200, 20);
			bs =new JTextField();
			bs.setBounds(10, 35, 100, 20);

			grSalary = new JButton("GrossSalary");
			grSalary.setBounds(10, 200, 100, 100);
			grSalary.addActionListener(this);
			gr = new JTextField();
			gr.setBounds(120,240, 100, 20);
			
			f.add(bs1);f.add(bs);
			f.add(grSalary);f.add(gr);
			f.setSize(500,400);
			f.setLayout(null);
			f.setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			String s1 = bs.getText();
			double Bsy = Double.parseDouble(s1);

//			double Gsy = 0;
			if(e.getSource()==grSalary) {
				
				double Ta = (15*Bsy)/100;
				double Da = (20*Bsy)/100;
				double Hra = (30*Bsy)/100;
				double Gsy = Bsy + Ta + Da + Hra;
				String result = String.valueOf(Gsy);
			gr.setText(result);
			}
			
		}

		
		public static void main(String[] args) {
			new JavaClassDay11();
		}
}