import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;

public class SiSwingClass11 implements ActionListener {
			JTextField Bs,Ta,Da,Gr;
			JButton Si;
			JLabel Bs1,Ta1,Da1;
			public SiSwingClass11(){
				JFrame f = new JFrame("For Finding the Gross SAlary");
				Bs1 =new JLabel("Enter the Pricipal amount");
				Bs1.setBounds(10, 10, 100, 20);
				Bs =new JTextField();
				Bs.setBounds(10, 35, 100, 20);
				Ta1 =new JLabel("Enter the rate of interest in %");
				Ta1.setBounds(10, 60, 100, 20);
				Ta =new JTextField();
				Ta.setBounds(10, 85, 100, 20);
				Da1 =new JLabel("Enter the time in year");
				Da1.setBounds(10, 110, 100, 20);
				Da =new JTextField();
				Da.setBounds(10, 135, 100, 20);

				Si = new JButton("Simple Interest");
				Si.setBounds(10, 200, 100, 40);
				Si.addActionListener(this);
				Gr = new JTextField();
				Gr.setBounds(100,240, 100, 20);
				f.add(Bs1);f.add(Bs);
				f.add(Ta1);f.add(Ta);f.add(Da1);f.add(Da);

				f.add(Si);
				f.add(Gr);
				f.setSize(500,400);
				f.setLayout(null);
				f.setVisible(true);
//				f.setDefaultCloseOperation(JFram.EXIT_ON_CLOSE);
			}
			public void actionPerformed(ActionEvent e) {
//				String s1 = Bs.getText();
//				String s2 = Ta.getText();
//				String s3 = Da.getText();

				
				
				if(e.getSource()==Si) {
					int p = Integer.parseInt(Bs.getText());
					int r=Integer.parseInt(Ta.getText());
					int t=Integer.parseInt(Da.getText());

					int SiT= (p*r*t)/100;
					String result = ""+SiT;
//							String.valueOf(SiT);
					Gr.setText(result);
				}
				
			}

			
			public static void main(String[] args) {
				new SiSwingClass11();
			}
	}
