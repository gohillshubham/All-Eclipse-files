 import javax.swing.*;
 import java.awt.event.*;
 class JavaClassDay10 {
	 public static void main(String[] args) {
//		 JFrame f = new JFrame("Button Example");
//		 JButton b = new JButton("Click Here");
//		 b.setBounds(50, 100, 95, 30);
//		 f.add(b);
//		 f.setSize(2180, 1050);
//		 f.setLayout(null);
//		 f.setVisible(true);
		 
		 
		 
//		 creating 3 buttons OK,save,cancel
		 JFrame f =new JFrame("Frame for Button");
		 
		 JButton ok =new JButton("Ok");
		 JButton save =new JButton("Save");
		 JButton cancel =new JButton("Cancel");
		 ok.setBounds(100, 200, 100, 50);
		 save.setBounds(210, 200, 100, 50);
		 cancel.setBounds(320, 200, 100, 50);
		 ok.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JTextField tf =new  JTextField();
				 tf.setBounds(100, 90, 200, 100);
				 tf.setText("After Clicking OK");
//				 tf.setBackground(null);
				 f.add(tf);
			 } 
		 });
		 save.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JTextField tf =new  JTextField();
				 tf.setBounds(100, 250, 200, 100);
				 tf.setText("After Clicking save");
				 f.add(tf);
			 } 
		 });
		 cancel.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 JTextField tf =new  JTextField();
				 tf.setBounds(100, 360, 200, 100);
				 tf.setText("After Clicking cancel");
				 f.add(tf);
			 } 
		 });
		 f.add(ok);f.add(save);f.add(cancel);
		 f.setSize(500, 500);
		 f.setLayout(null);
		 f.setVisible(true);
		 
		 
	 }

}
