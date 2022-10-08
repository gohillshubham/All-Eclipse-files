import java.awt.*;
	
 public class Atulya extends Frame {
	private static final long serialVersionUID = 1L;
			Atulya(){
	            Button b = new Button("Click Me!!");
	            b.setBounds(30,100,80,30);
	            add(b);
	            setSize(300,300);
	            setTitle("this our basic AWT example");
	            setLayout(null);
	            setVisible(true);

	        }
	        public static void main(String args[]){
	            Atulya f = new Atulya();
	    }
	   }