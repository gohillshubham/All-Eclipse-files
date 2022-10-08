
public class JavaClassDay17Code extends javax.swing.JFrame{
//		creating new form of the main class as constructor 
		public JavaClassDay17Code() {
			initComponents();
//		this is the method for constructor which is defined a head
		}
		

//		 declaring all the variables
		private javax.swing.ButtonGroup buttonGroup1;
		private javax.swing.JComboBox<String> date;
		private javax.swing.JLabel	 dob;
		private javax.swing.JLabel email;
		private javax.swing.JRadioButton female;
		private javax.swing.JLabel gender;
		private javax.swing.JSeparator jSeparator1;
		private javax.swing.JRadioButton male;
		private javax.swing.JComboBox<String> month;
		private javax.swing.JLabel name;
		private javax.swing.JRadioButton other;
		private javax.swing.JLabel password;
		private javax.swing.JPasswordField passwordfield;
		private javax.swing.JCheckBox receivemails;
		private javax.swing.JLabel signup;
		private javax.swing.JButton submit;
		private javax.swing.JTextField tfemail;
		private javax.swing.JTextField tfname;
//      all the variable is declared
		
//		 regerarated by the form editor
		
		@SuppressWarnings("unchecked")
		
		private void initComponents() {
			// initializing all components
			signup = new javax.swing.JLabel("SIGN-UP Form");
			name = new javax.swing.JLabel("Enter your name");
			male = new javax.swing.JRadioButton("Male");
			submit = new javax.swing.JButton("SUBMIT");
			receivemails = new javax.swing.JCheckBox("Would you like to recive promotional mails");
			jSeparator1 = new javax.swing.JSeparator();
			passwordfield = new javax.swing.JPasswordField();
			tfemail = new javax.swing.JTextField();
			password = new javax.swing.JLabel("Enter Password");
			email = new javax.swing.JLabel("Enter Email address");
			tfname = new javax.swing.JTextField();
			dob = new javax.swing.JLabel("Date Of Birth");
			other = new javax.swing.JRadioButton("Prefer not to tell");
			female = new javax.swing.JRadioButton("Female");
			date = new javax.swing.JComboBox<>();
			month = new javax.swing.JComboBox<>();
			gender = new javax.swing.JLabel("Gender");
			buttonGroup1 = new javax.swing.ButtonGroup();
	        buttonGroup1.add(other);
	        buttonGroup1.add(female);
	        buttonGroup1.add(male);
	        
	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        signup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
	        
	        receivemails.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                receivemailsActionPerformed(evt);
	            }
	        });
	        passwordfield.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                passwordfieldActionPerformed(evt);
	            }
	        });

	        tfemail.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {

	            	tfemailActionPerformed(evt);
	            }
	        });
	        tfname.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                tfnameActionPerformed(evt);
	            }
	        });

	        date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

	        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November ", "December", " " }));
	        month.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                monthActionPerformed(evt);
	            }
	        });

	        //layout and formating
	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(55, 55, 55)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(password)
	                    .addComponent(name)
	                    .addComponent(email)
	                    .addComponent(gender)
	                    .addComponent(dob)
	                    .addComponent(receivemails))
	                .addGap(86, 86, 86)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(tfemail)
	                    .addComponent(tfname)
	                    .addComponent(passwordfield)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(male)
	                                .addGap(35, 35, 35)
	                                .addComponent(female))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(30, 30, 30)
	                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
	                        .addComponent(other)))
	                .addGap(64, 64, 64))
	            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(286, 286, 286)
	                        .addComponent(submit))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(268, 268, 268)
	                        .addComponent(signup)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(66, 66, 66)
	                .addComponent(signup)
	                .addGap(18, 18, 18)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(40, 40, 40)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(name)
	                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(email)
	                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(password))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(male)
	                    .addComponent(other)
	                    .addComponent(female)
	                    .addComponent(gender))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(dob)
	                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(28, 28, 28)
	                .addComponent(receivemails)
	                .addGap(18, 18, 18)
	                .addComponent(submit)
	                .addContainerGap(295, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       

	    private void tfnameActionPerformed(java.awt.event.ActionEvent evt) {                                       
	        // TODO add your handling code here:
	    }                                      

	    private void monthActionPerformed(java.awt.event.ActionEvent evt) {                                      
	        // TODO add your handling code here:
	    }                                     

	    private void receivemailsActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        // TODO add your handling code here:
	    }                                            

	    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    }                                             

	    /**
	     * @param args The command-line arguments
	     */
	    public static void main(String args[]) {
	        /* Set the Nimbus look and feel */
	        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
	         */
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(JavaClassDay17Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(JavaClassDay17Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(JavaClassDay17Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(JavaClassDay17Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new JavaClassDay17Code().setVisible(true);
	            }
	        });

	        

		}
		
		
}
