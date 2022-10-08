import javax.swing.*;
import java.awt.event.*;
public class SwingAwtClass extends JFrame implements ActionListener {
	JLabel lblP= new JLabel("Principle");
	JLabel lblR= new JLabel("Rate");
	JLabel lblT= new JLabel("Time");
	JLabel lblResult= new JLabel("Result");
	
	JTextField txtP = new JTextField();
	JTextField txtR = new JTextField();
	JTextField txtT = new JTextField();
	JTextField txtResult = new JTextField();
	
	SwingAwtClass(){
		setSize(400,500);
		setTitle("Simple Interest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		JButton btn = new JButton("Execute");
		btn.addActionListener(this);
		
		lblP.setBounds(50, 20, 60, 20);
		lblR.setBounds(50,50, 60, 20);
		lblT.setBounds(50, 80, 60, 20);
		lblResult.setBounds(50, 110, 60, 20);
		
		txtP.setBounds(150, 20, 100, 20);
		txtR.setBounds(150, 50, 100, 20);
		txtT.setBounds(150, 80, 100, 20);
		txtResult.setBounds(150, 110, 100, 20);
		
		btn.setBounds(150, 140, 100, 20);
		
		add(lblP);add(lblR);add(lblT);add(lblResult);add(txtP);
		add(txtR);add(txtT);add(txtResult);add(btn);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		int p,t,r;
		float res;
		p = Integer.parseInt(txtP.getText());
		t = Integer.parseInt(txtT.getText());
		r = Integer.parseInt(txtR.getText());
		res = (p*t*r)/100;
		txtResult.setText(String.valueOf(res));
	}
	public static void main(String[] args) {
		new  SwingAwtClass();
	}
}














//public static void main(String[] args) {
//	JFrame f = new JFrame("Button Example");
//	final JTextField  tf = new JTextField();
//	tf.setBounds(50, 50, 150, 20);
//	JButton b = new JButton("Click Here");
//	b.setBounds(50, 100, 95, 30);
//	b.addActionListener(new ActionListener() {
//		public void actionPerformed (ActionEvent e) {
//			tf.setText("Welcome to first inteface of swing ");
//		}
//	});
//	f.add(b);
//	f.add(tf);
//	f.setSize(400, 400);
//	f.setLayout(null);
//	f.setVisible(true);
//}
