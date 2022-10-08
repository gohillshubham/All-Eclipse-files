import javax.swing.*;
import java.awt. event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Course1 implements ActionListener {
    JFrame fr;
    JLabel h,m,H,s,l,d,n,f,c,b,bc,fa,la,u,r,ps,as,tm;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9;
    JButton bn;
    public Course1(){
        fr=new JFrame("course");
        h=new JLabel("Director - Vinit Sir");
        m=new JLabel("Mob. 6317960575");
        H=new JLabel("ATULYA COMPUTER INSTITUTE");
        s=new JLabel("AN ISO 9001:2015 Certified");
        l=new JLabel("LEAVE VOUCHER");
        d=new JLabel("Date:");
        n=new JLabel("Name:");
        f=new JLabel("Father's Name:");
        c=new JLabel("Course:");
        b=new JLabel("Batch Time:");
        bc=new JLabel("Batch Code:");
        fa=new JLabel("Faculty:");
        la=new JLabel("Leave/Absent from:");
        bn=new JButton("confirm");
        u=new JLabel("upto:");
        r=new JLabel("Reason:");
        ps=new JLabel("Student/Parent's Sign");
        as=new JLabel("Authorised Signatary");
        tm=new JLabel("TM");
        t=new JTextField(20);
        t1=new JTextField(20);
        t2=new JTextField(20);t3=new JTextField(20);
        t4=new JTextField(20);t5=new JTextField(20);
        t6=new JTextField(20);
        t7=new JTextField(20);
        t8=new JTextField(20);
        t9=new JTextField(20);
       // H.setFont(new Font("Verdana", Font.PLAIN, 25));
       // tm.setFont(new Font("Verdana", Font.PLAIN, 10));
      //  l.setFont(new Font("Verdana", Font.PLAIN, 21));
        h.setBounds(5,1,150,50);m.setBounds(350,1,170,50);
        tm.setBounds(415,35,28,10);
        H.setBounds(20,25,450,50);s.setBounds(113,50,200,30);
        l.setBounds(100,64,200,30);
        d.setBounds(330,71,50,30);
        t1.setBounds(365,72,95,20);
        n.setBounds(10,105,50,30);
        t.setBounds(55,105,415,20);
        f.setBounds(10,130,100,20);t2.setBounds(103,130,370,20);
        c.setBounds(10,155,50,20);t3.setBounds(56,155,100,20);
        b.setBounds(155,155,90,20);t4.setBounds(230,155,90,20);
        bc.setBounds(325,155,90,20);t5.setBounds(400,155,70,20);
        fa.setBounds(10,185,50,20);t6.setBounds(65,185,90,20);
        la.setBounds(160,185,150,20);t7.setBounds(290,185,70,20);
        u.setBounds(370,185,40,20);t8.setBounds(410,185,65,20);
        r.setBounds(10,215,50,20);t9.setBounds(62,215,410,20);
        ps.setBounds(5,265,140,20);as.setBounds(350,265,140,20);
        bn.setBounds(200,265,80,30);
        fr.add(h);fr.add(m);fr.add(H);fr.add(s);fr.add(l);fr.add(d);fr.add(n);fr.add(f);fr.add(c);fr.add(b);fr.add(bc);fr.add(fa);
        fr.add(la);fr.add(u);fr.add(r);fr.add(ps);fr.add(as);fr.add(tm);
        fr.add(t);fr.add(t1);fr.add(t2);fr.add(t3);fr.add(t4);fr.add(t5);fr.add(t6);fr.add(t7);fr.add(t8);fr.add(t9);
        fr.add(bn);
        bn.addActionListener(this);
        /*t9.setEditable(false);t2.setEditable(false);t3.setEditable(false);t4.setEditable(false);
        t1.setEditable(false);t7.setEditable(false);t6.setEditable(false);t5.setEditable(false);
        t8.setEditable(false);t.setEditable(false);*/
        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(510,370);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        String name =t.getText();
        String fathers_name =t2.getText();String course =t3.getText();
        String batch_time = t4.getText();
        String batch_code=t5.getText();
        String faculty=t6.getText();
        String leave_ab_from=t7.getText();String upto=t8.getText();String reason=t9.getText();
        if(e.getSource()==bn)
            try {
                Connection connection = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/stddetails","root", "");
                PreparedStatement st = (PreparedStatement) connection.prepareStatement("INSERT INTO detail(name,father_name,course,batch_time,batch_code,faculty,leave_ab_from,upto,reason)"+"VALUES(?,?,?,?,?,?,?,?,?);");
                st.setString(1, name);
                st.setString(2, fathers_name);
                st.setString(3, course);
                st.setString(4,batch_time);
                st.setString(5, batch_code);
                st.setString(6, faculty);st.setString(7,leave_ab_from);
                st.setString(8,upto);st.setString(9,reason);
                int rs = st.executeUpdate();
                if(rs==1) {
                    JOptionPane.showMessageDialog(bn,"You have successfully do your details.\nYou can go now");
                    fr.dispose();
                }
            }
        catch(Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(bn, "Server Error");
            }
    }
    public static void main(String[] args) throws Exception {
        new Course1();
    }
}
