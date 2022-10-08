import java.sql.*;
import java.awt.event.*;
import javax.swing.*;

public class Welcome implements ActionListener{
 JFrame f;
 JLabel n1,n2,e1,e2,m1,m2,u1,u2,p1,p2;
 JButton del_btn;
 
 public Welcome() throws Exception{
  f=new JFrame("Welcome");
  n1=new JLabel("Name : ");
  e1=new JLabel("Email : ");
  m1=new JLabel("Mobile number : ");
  u1=new JLabel("User Name : ");
  p1=new JLabel("Password : ");
  
  n2=new JLabel("N/A");
  e2=new JLabel("N/A");
  m2=new JLabel("N/A");
  u2=new JLabel("N/A");
  p2=new JLabel("N/A");
  del_btn=new JButton("Delete Account");
  
  f.setVisible(true);
  f.setBounds(300,10,440,400);
  f.setLayout(null);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  n1.setBounds(10, 10, 100, 30);
  n2.setBounds(210, 10, 200, 30);
  e1.setBounds(10, 70, 200, 30);
  e2.setBounds(210, 70, 200, 30);
  m1.setBounds(10, 130, 200, 30);
  m2.setBounds(210, 130, 200, 30);
  u1.setBounds(10, 190, 200, 30);
  u2.setBounds(210, 190, 200, 30);
  p1.setBounds(10, 250, 200, 30);
  p2.setBounds(210, 250, 200, 30);
  del_btn.setBounds(50,310,150,30);
  
  f.add(n1);
  f.add(n2);
  f.add(e1);
  f.add(e2);
  f.add(m1);
  f.add(m2);
  f.add(u1);
  f.add(u2);
  f.add(p1);
  f.add(p2);
  f.add(del_btn);
  
  del_btn.addActionListener(this);
  
  Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Saurav@45");
  PreparedStatement st=(PreparedStatement)conn.prepareStatement("SELECT * FROM student where usr=? or email=?");
   
  st.setString(1,UserLogin1.userName );
  st.setString(2,UserLogin1.userName);
  ResultSet rs=st.executeQuery();
   
  if(rs.next()) {
   n2.setText(rs.getString("name"));
   e2.setText(rs.getString("email"));
   m2.setText(rs.getString("mob"));
   u2.setText(rs.getString("usr"));
   p2.setText(rs.getString("password"));
  }
 }
 public void actionPerformed(ActionEvent e)  {
  if(e.getSource()==del_btn) {
   try{
    int rs=0;
    Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
    int a=JOptionPane.showConfirmDialog(f,"Are you sure?");  
    if(a==JOptionPane.YES_OPTION){  
     PreparedStatement st=(PreparedStatement)conn.prepareStatement("DELETE FROM student where usr=?");
     
     st.setString(1,UserLogin1.userName );
     rs=st.executeUpdate(); 
    }  
    
    if(rs==1) {
     f.dispose();
     JOptionPane.showMessageDialog(del_btn, "Account deleted successfully.");
    }
   }
   catch(Exception ex) {
    System.out.println(ex);
    JOptionPane.showMessageDialog(del_btn, "Server Error");
   }
  }
 }
 public static void main(String[] args) throws Exception {
  new Welcome();
 }
}