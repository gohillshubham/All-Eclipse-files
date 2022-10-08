import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;
//public class SwingTextAreaClass11 implements ActionListener{
//	JLabel words,chara;
//	JButton cw;
//	JTextArea ta;
//	SwingTextAreaClass11(){
//		JFrame f = new JFrame("For counting words");
//		 words = new JLabel();
//		 words.setBounds(50,25,100,30);
//		 chara = new JLabel();
//		 chara.setBounds(160,25,100,30);
//		 
//		 ta = new JTextArea();
//		 ta.setBounds(20,75,250,200);
//		 
//		 cw= new JButton("Count character");
//		 cw.setBounds(100,300,120,30);
//		 cw.addActionListener(this);
//		 
//		 f.add(words);f.add(chara);f.add(ta);
//		 f.add(cw);
//		 f.setSize(400,500);
//		 f.setLayout(null);
//		 f.setVisible(true);
//	}
//	public void actionPerformed(ActionEvent e) {
//		String str = ta.getText();
//		String word[] = str.split("\\s");
//		words.setText("Words:- "+word.length);
//		int k = str.length()+1-word.length;
//		chara.setText("Character:- "+k);
//	
//	}
//	public static void main(String[] args) {
//		 new SwingTextAreaClass11();
//		
//	}
//	
//
//}
//




public class SwingTextAreaClass11 {
  public static void main(String[] argv) {
	  JFrame f = new JFrame("For counting words");
    // Create a text area with some initial text
    JTextArea textarea = new JTextArea("Initial Text");

    int rows = 20;
    int cols = 30;
    textarea = new JTextArea("Initial Text", rows, cols);
    textarea.setBounds(10,10, 300, 400);
    f.add(textarea);
	 f.setSize(400,500);
	 f.setLayout(null);
	 f.setVisible(true);

  }
}
