/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooseproject_pages_views;
import java.util.ArrayList;
import ooseproject_business_logic.Hostel_Services;
import ooseproject_model.Hostel_Model;
import static ooseproject_pages_views.All_Hostels_Screen.*;
import static ooseproject_pages_views.Home_Screen.logged_in_username;
import static ooseproject_pages_views.Login_Screen.user;
import static ooseproject_pages_views.Booking_Screen.*;
/**
 *
 * @author KK
 */
public class Hostel_Details_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Details
     */
    
    private Hostel_Services hostel = new Hostel_Services();
   
    
    public Hostel_Details_Screen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home_button = new javax.swing.JButton();
        ___back_to_boyshostel = new javax.swing.JButton();
        __back_to_girlshostel = new javax.swing.JButton();
        book_button = new javax.swing.JButton();
        javax.swing.JButton ___back_to_officehostel = new javax.swing.JButton();
        address_label_set = new javax.swing.JLabel();
        type_label = new javax.swing.JLabel();
        fee_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        tot_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        hostel_image = new javax.swing.JButton();
        type_label_set = new javax.swing.JLabel();
        room_label_set = new javax.swing.JLabel();
        fee_label_set = new javax.swing.JLabel();
        email_label_set = new javax.swing.JLabel();
        name_label_set = new javax.swing.JLabel();
        mess_label = new javax.swing.JLabel();
        mess_label_set = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HBH - HOSTEL DETAILS");
        setLocation(new java.awt.Point(20, 20));
        setPreferredSize(new java.awt.Dimension(1325, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1325, 700));

        home_button.setBackground(new java.awt.Color(1, 215, 194));
        home_button.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        home_button.setForeground(new java.awt.Color(255, 255, 255));
        home_button.setText("HOME");
        home_button.setBorder(null);
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });

        ___back_to_boyshostel.setBackground(new java.awt.Color(1, 215, 194));
        ___back_to_boyshostel.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        ___back_to_boyshostel.setForeground(new java.awt.Color(255, 255, 255));
        ___back_to_boyshostel.setText("BOYS");
        ___back_to_boyshostel.setBorder(null);
        ___back_to_boyshostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ___back_to_boyshostelActionPerformed(evt);
            }
        });

        __back_to_girlshostel.setBackground(new java.awt.Color(1, 215, 194));
        __back_to_girlshostel.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        __back_to_girlshostel.setForeground(new java.awt.Color(255, 255, 255));
        __back_to_girlshostel.setText("GIRLS");
        __back_to_girlshostel.setBorder(null);
        __back_to_girlshostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                __back_to_girlshostelActionPerformed(evt);
            }
        });

        book_button.setBackground(new java.awt.Color(1, 215, 194));
        book_button.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        book_button.setForeground(new java.awt.Color(255, 255, 255));
        book_button.setText("BOOK");
        book_button.setBorder(null);
        book_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_buttonActionPerformed(evt);
            }
        });

        ___back_to_officehostel.setBackground(new java.awt.Color(1, 215, 194));
        ___back_to_officehostel.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        ___back_to_officehostel.setForeground(new java.awt.Color(255, 255, 255));
        ___back_to_officehostel.setText("OFFICE");
        ___back_to_officehostel.setToolTipText("");
        ___back_to_officehostel.setActionCommand("");
        ___back_to_officehostel.setBorder(null);
        ___back_to_officehostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ___back_to_officehostelActionPerformed(evt);
            }
        });

        address_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        address_label_set.setForeground(new java.awt.Color(0, 153, 255));
        address_label_set.setText("jLabel1");

        type_label.setBackground(new java.awt.Color(255, 255, 255));
        type_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        type_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        type_label.setText("Type");
        type_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fee_label.setBackground(new java.awt.Color(255, 255, 255));
        fee_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        fee_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fee_label.setText("Fee");
        fee_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        email_label.setBackground(new java.awt.Color(255, 255, 255));
        email_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        email_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email_label.setText("Email");
        email_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tot_label.setBackground(new java.awt.Color(255, 255, 255));
        tot_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        tot_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tot_label.setText("Rooms");
        tot_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name_label.setBackground(new java.awt.Color(255, 255, 255));
        name_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_label.setText("Name");
        name_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        address_label.setBackground(new java.awt.Color(255, 255, 255));
        address_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        address_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address_label.setText("Address");
        address_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hostel_image.setBorder(null);
        hostel_image.setPreferredSize(new java.awt.Dimension(250, 250));

        type_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        type_label_set.setForeground(new java.awt.Color(0, 153, 255));
        type_label_set.setText("jLabel1");

        room_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        room_label_set.setForeground(new java.awt.Color(0, 153, 255));
        room_label_set.setText("jLabel1");

        fee_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        fee_label_set.setForeground(new java.awt.Color(0, 153, 255));
        fee_label_set.setText("jLabel1");

        email_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        email_label_set.setForeground(new java.awt.Color(0, 153, 255));
        email_label_set.setText("jLabel1");

        name_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        name_label_set.setForeground(new java.awt.Color(0, 153, 255));
        name_label_set.setText("jLabel1");

        mess_label.setBackground(new java.awt.Color(255, 255, 255));
        mess_label.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        mess_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mess_label.setText("Mess");
        mess_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mess_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        mess_label_set.setForeground(new java.awt.Color(0, 153, 255));
        mess_label_set.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mess_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mess_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fee_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tot_label, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fee_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(type_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(408, 408, 408))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(___back_to_boyshostel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(__back_to_girlshostel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(___back_to_officehostel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(hostel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(hostel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(type_label_set)
                        .addGap(18, 18, 18)
                        .addComponent(fee_label_set)
                        .addGap(18, 18, 18)
                        .addComponent(room_label_set))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(type_label)
                        .addGap(18, 18, 18)
                        .addComponent(fee_label)
                        .addGap(18, 18, 18)
                        .addComponent(tot_label))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_label_set)
                            .addComponent(name_label))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email_label_set)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(address_label_set)
                                    .addComponent(address_label))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mess_label)
                    .addComponent(mess_label_set))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(___back_to_boyshostel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(__back_to_girlshostel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(___back_to_officehostel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(909, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ___back_to_boyshostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event____back_to_boyshostelActionPerformed
        // TODO add your handling code here:
        ArrayList<Hostel_Model> allboys = hostel.getHostel("Boys");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(allboys,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event____back_to_boyshostelActionPerformed

    private void __back_to_girlshostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event___back_to_girlshostelActionPerformed
        ArrayList<Hostel_Model> allgirls = hostel.getHostel("Girls");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(allgirls,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event___back_to_girlshostelActionPerformed

    private void ___back_to_officehostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event____back_to_officehostelActionPerformed
        // TODO add your handling code here:
        ArrayList<Hostel_Model> alloffice = hostel.getHostel("Office");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(alloffice,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event____back_to_officehostelActionPerformed

    private void book_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_buttonActionPerformed
        // TODO add your handling code here:
        new Booking_Screen().setVisible(true);
        hname_label_set.setText(name_label_set.getText());
        hemail_label_set.setText(email_label_set.getText());
        hfee_label_set.setText(fee_label_set.getText());
        uname_label_set.setText(user.getName());
        uemail_label_set.setText(user.getEmail());
        ucnic_label_set.setText(user.getCnic());
        this.dispose();
    }//GEN-LAST:event_book_buttonActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        // TODO add your handling code here:
        new Home_Screen().setVisible(true);
        logged_in_username.setText(user.getName());
        this.dispose();
    }//GEN-LAST:event_home_buttonActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Hostel_Details_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hostel_Details_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hostel_Details_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hostel_Details_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Hostel_Details_Screen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ___back_to_boyshostel;
    private javax.swing.JButton __back_to_girlshostel;
    private javax.swing.JLabel address_label;
    protected static javax.swing.JLabel address_label_set;
    private javax.swing.JButton book_button;
    private javax.swing.JLabel email_label;
    protected static javax.swing.JLabel email_label_set;
    private javax.swing.JLabel fee_label;
    protected static javax.swing.JLabel fee_label_set;
    private javax.swing.JButton home_button;
    protected static javax.swing.JButton hostel_image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mess_label;
    protected static javax.swing.JLabel mess_label_set;
    private javax.swing.JLabel name_label;
    protected static javax.swing.JLabel name_label_set;
    protected static javax.swing.JLabel room_label_set;
    private javax.swing.JLabel tot_label;
    private javax.swing.JLabel type_label;
    protected static javax.swing.JLabel type_label_set;
    // End of variables declaration//GEN-END:variables
}