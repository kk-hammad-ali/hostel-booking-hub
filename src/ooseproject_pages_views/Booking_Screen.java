/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooseproject_pages_views;

import javax.swing.JOptionPane;
import ooseproject_business_logic.Booking_Services;
import ooseproject_business_logic.Hostel_Services;
import ooseproject_model.Hostel_Model;
import static ooseproject_pages_views.All_Hostels_Screen.hostel_id;
import static ooseproject_pages_views.Home_Screen.logged_in_username;
import static ooseproject_pages_views.Hostel_Details_Screen.name_label_set;
import static ooseproject_pages_views.Login_Screen.user;

/**
 *
 * @author KK
 */
public class Booking_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Booking_Screen
     */
    private int id;
    private int fee;
    private int hid;
    private Hostel_Services hostel = new Hostel_Services();
    private Booking_Services booking = new Booking_Services();

    public Booking_Screen() {
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

        main_panel = new javax.swing.JPanel();
        inner_panel = new javax.swing.JPanel();
        uname_label_set = new javax.swing.JLabel();
        uemail_label_set = new javax.swing.JLabel();
        ucnic_label_set = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back_to_details = new javax.swing.JButton();
        home_page_button = new javax.swing.JButton();
        confirm_button = new javax.swing.JButton();
        hfee_label_set = new javax.swing.JLabel();
        hemail_label_set = new javax.swing.JLabel();
        hname_label_set = new javax.swing.JLabel();
        one_seater = new javax.swing.JButton();
        two_seater = new javax.swing.JButton();
        three_seater = new javax.swing.JButton();
        four_seater = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HBH - BOOKING");
        setLocation(new java.awt.Point(20, 20));
        setPreferredSize(new java.awt.Dimension(1325, 700));

        main_panel.setBackground(new java.awt.Color(0, 153, 255));

        inner_panel.setBackground(new java.awt.Color(255, 255, 255));

        uname_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        uname_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uname_label_set.setText("jLabel7");

        uemail_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        uemail_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uemail_label_set.setText("jLabel8");

        ucnic_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        ucnic_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ucnic_label_set.setText("jLabel9");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 0));

        back_to_details.setBackground(new java.awt.Color(1, 215, 194));
        back_to_details.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        back_to_details.setForeground(new java.awt.Color(255, 255, 255));
        back_to_details.setText("BACK");
        back_to_details.setBorder(null);
        back_to_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_detailsActionPerformed(evt);
            }
        });

        home_page_button.setBackground(new java.awt.Color(1, 215, 194));
        home_page_button.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        home_page_button.setForeground(new java.awt.Color(255, 255, 255));
        home_page_button.setText("HOME");
        home_page_button.setBorder(null);
        home_page_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_page_buttonActionPerformed(evt);
            }
        });

        confirm_button.setBackground(new java.awt.Color(1, 215, 194));
        confirm_button.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        confirm_button.setForeground(new java.awt.Color(255, 255, 255));
        confirm_button.setText("CONFIRM");
        confirm_button.setBorder(null);
        confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_buttonActionPerformed(evt);
            }
        });

        hfee_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        hfee_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hfee_label_set.setText("jLabel12");

        hemail_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        hemail_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hemail_label_set.setText("jLabel11");

        hname_label_set.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        hname_label_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hname_label_set.setText("jLabel10");

        one_seater.setBackground(new java.awt.Color(1, 215, 194));
        one_seater.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        one_seater.setForeground(new java.awt.Color(255, 255, 255));
        one_seater.setText("One Seater");
        one_seater.setBorder(null);
        one_seater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one_seaterActionPerformed(evt);
            }
        });

        two_seater.setBackground(new java.awt.Color(1, 215, 194));
        two_seater.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        two_seater.setForeground(new java.awt.Color(255, 255, 255));
        two_seater.setText("Two Seater");
        two_seater.setBorder(null);
        two_seater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                two_seaterActionPerformed(evt);
            }
        });

        three_seater.setBackground(new java.awt.Color(1, 215, 194));
        three_seater.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        three_seater.setForeground(new java.awt.Color(255, 255, 255));
        three_seater.setText("Three Seater");
        three_seater.setBorder(null);
        three_seater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                three_seaterActionPerformed(evt);
            }
        });

        four_seater.setBackground(new java.awt.Color(1, 215, 194));
        four_seater.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        four_seater.setForeground(new java.awt.Color(255, 255, 255));
        four_seater.setText("Four Seater");
        four_seater.setBorder(null);
        four_seater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                four_seaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inner_panelLayout = new javax.swing.GroupLayout(inner_panel);
        inner_panel.setLayout(inner_panelLayout);
        inner_panelLayout.setHorizontalGroup(
            inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inner_panelLayout.createSequentialGroup()
                .addGroup(inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(uname_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(ucnic_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(hname_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(hemail_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(hfee_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inner_panelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(two_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(three_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(four_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uemail_label_set, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(back_to_details, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(home_page_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inner_panelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(one_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        inner_panelLayout.setVerticalGroup(
            inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inner_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(two_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(three_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(four_seater, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(uname_label_set)
                .addGap(18, 18, 18)
                .addComponent(uemail_label_set)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ucnic_label_set)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hname_label_set)
                .addGap(18, 18, 18)
                .addComponent(hemail_label_set)
                .addGap(18, 18, 18)
                .addComponent(hfee_label_set)
                .addGap(61, 61, 61)
                .addGroup(inner_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home_page_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back_to_details, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        one_seater.getAccessibleContext().setAccessibleName("one_seater");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(inner_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(inner_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_detailsActionPerformed
        // TODO add your handling code here:
        Hostel_Model mn = hostel.getOneHostel(name_label_set.getText());
        new Hostel_Details_Screen().setVisible(true);
        All_Hostels_Screen.setIndiviual(mn);
        this.dispose();
    }//GEN-LAST:event_back_to_detailsActionPerformed

    private void confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_buttonActionPerformed
        //TODO add your handling code here:
        id = Integer.parseInt(user.getId());
        fee = Integer.parseInt(hfee_label_set.getText());
        hid = hostel_id;
        booking.bookingDetails(hid, hname_label_set.getText(), hemail_label_set.getText(), fee, id, user.getName(), user.getEmail(), user.getCnic());
        JOptionPane.showMessageDialog(this, "Congrulations!\nYou have SucessFully Booked Your Rooms");
    }//GEN-LAST:event_confirm_buttonActionPerformed

    private void home_page_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_page_buttonActionPerformed
        // TODO add your handling code here:
        new Home_Screen().setVisible(true);
        logged_in_username.setText(user.getName());
        this.dispose();
    }//GEN-LAST:event_home_page_buttonActionPerformed

    private void one_seaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one_seaterActionPerformed
        booking.setFee(hostel_id, hfee_label_set, "one_seater");        
    }//GEN-LAST:event_one_seaterActionPerformed

    private void two_seaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_two_seaterActionPerformed
        booking.setFee(hostel_id, hfee_label_set, "two_seater");
    }//GEN-LAST:event_two_seaterActionPerformed

    private void three_seaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_three_seaterActionPerformed
        booking.setFee(hostel_id, hfee_label_set, "three_seater");
    }//GEN-LAST:event_three_seaterActionPerformed

    private void four_seaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_four_seaterActionPerformed
        booking.setFee(hostel_id, hfee_label_set, "four_seater");
    }//GEN-LAST:event_four_seaterActionPerformed

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
            java.util.logging.Logger.getLogger(Booking_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Booking_Screen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_details;
    private javax.swing.JButton confirm_button;
    private javax.swing.JButton four_seater;
    protected static javax.swing.JLabel hemail_label_set;
    protected static javax.swing.JLabel hfee_label_set;
    protected static javax.swing.JLabel hname_label_set;
    private javax.swing.JButton home_page_button;
    protected static javax.swing.JPanel inner_panel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel main_panel;
    private javax.swing.JButton one_seater;
    private javax.swing.JButton three_seater;
    private javax.swing.JButton two_seater;
    protected static javax.swing.JLabel ucnic_label_set;
    protected static javax.swing.JLabel uemail_label_set;
    protected static javax.swing.JLabel uname_label_set;
    // End of variables declaration//GEN-END:variables
}
