/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ooseproject_pages_views;


import core.PlaceHolder;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ooseproject_business_logic.Booking_Services;
import ooseproject_business_logic.Hostel_Services;
import ooseproject_model.Booking_Model;
import ooseproject_model.Hostel_Model;
import static ooseproject_pages_views.All_Hostels_Screen.*;
import static ooseproject_pages_views.Login_Screen.user;
import static ooseproject_pages_views.All_Booked_Screen.*;

/**
 *
 * @author KK
 */
public class Home_Screen extends javax.swing.JFrame {
    /**
     * Creates new form HomePage
     */
    
    private Hostel_Services hostel = new Hostel_Services();
    private Booking_Services booking = new Booking_Services();
    private PlaceHolder placeholder = new PlaceHolder();
    
    public Home_Screen() {
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
        girls_hostel = new javax.swing.JLabel();
        boys_hostel = new javax.swing.JLabel();
        logged_in_username = new javax.swing.JLabel();
        office_hostel = new javax.swing.JLabel();
        _logout = new javax.swing.JButton();
        search_field = new javax.swing.JTextField();
        search_button = new javax.swing.JLabel();
        _booked = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HBH - HOME");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(20, 20));
        setPreferredSize(new java.awt.Dimension(1325, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        girls_hostel.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        girls_hostel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        girls_hostel.setIcon(new javax.swing.ImageIcon("D:\\Java\\ooseproject\\images\\girls.png")); // NOI18N
        girls_hostel.setText("GIRLS HOSTEL");
        girls_hostel.setToolTipText("");
        girls_hostel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                girls_hostelMousePressed(evt);
            }
        });

        boys_hostel.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        boys_hostel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boys_hostel.setIcon(new javax.swing.ImageIcon("D:\\Java\\ooseproject\\images\\boys.png")); // NOI18N
        boys_hostel.setText("BOYS HOSTEL");
        boys_hostel.setToolTipText("");
        boys_hostel.setMaximumSize(new java.awt.Dimension(0, 0));
        boys_hostel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boys_hostelMousePressed(evt);
            }
        });

        logged_in_username.setBackground(new java.awt.Color(255, 255, 255));
        logged_in_username.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        logged_in_username.setForeground(new java.awt.Color(0, 153, 255));
        logged_in_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logged_in_username.setText("USERNAME");
        logged_in_username.setToolTipText("");

        office_hostel.setFont(new java.awt.Font("Source Code Pro", 0, 16)); // NOI18N
        office_hostel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        office_hostel.setIcon(new javax.swing.ImageIcon("D:\\Java\\ooseproject\\images\\office.png")); // NOI18N
        office_hostel.setText("OFFICE HOSTEL");
        office_hostel.setToolTipText("");
        office_hostel.setIconTextGap(10);
        office_hostel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                office_hostelMousePressed(evt);
            }
        });

        _logout.setBackground(new java.awt.Color(0, 153, 255));
        _logout.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        _logout.setForeground(new java.awt.Color(255, 255, 255));
        _logout.setText("LOGOUT");
        _logout.setToolTipText("");
        _logout.setBorder(null);
        _logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _logoutActionPerformed(evt);
            }
        });

        search_field.setFont(new java.awt.Font("Source Code Pro", 0, 14)); // NOI18N
        search_field.setForeground(new java.awt.Color(1, 215, 194));
        search_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_field.setText("SEARCH BY CITY");
        search_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 1, true));
        search_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_fieldFocusLost(evt);
            }
        });

        search_button.setBackground(new java.awt.Color(0, 153, 255));
        search_button.setForeground(new java.awt.Color(0, 153, 255));
        search_button.setIcon(new javax.swing.ImageIcon("D:\\Java\\ooseproject\\images\\search_icon.png")); // NOI18N
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
        });

        _booked.setBackground(new java.awt.Color(0, 153, 255));
        _booked.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        _booked.setForeground(new java.awt.Color(255, 255, 255));
        _booked.setText("BOOKED");
        _booked.setToolTipText("");
        _booked.setBorder(null);
        _booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _bookedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(250, Short.MAX_VALUE)
                        .addComponent(boys_hostel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(girls_hostel)
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(_booked, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(office_hostel)
                        .addGap(383, 383, 383))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(_booked, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logged_in_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boys_hostel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(girls_hostel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(office_hostel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(308, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1058, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__logoutActionPerformed
            new Login_Screen().setVisible(true);
            this.dispose();
    }//GEN-LAST:event__logoutActionPerformed

    private void boys_hostelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boys_hostelMousePressed
        // TODO add your handling code here:
        ArrayList<Hostel_Model> allboys = hostel.getHostel("Boys");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(allboys,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event_boys_hostelMousePressed

    private void girls_hostelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girls_hostelMousePressed
        ArrayList<Hostel_Model> allgirls = hostel.getHostel("Girls");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(allgirls,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 ,
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event_girls_hostelMousePressed

    private void office_hostelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_office_hostelMousePressed

        ArrayList<Hostel_Model> alloffice = hostel.getHostel("Office");
        new All_Hostels_Screen().setVisible(true);
        hostel.setValues(alloffice,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
        );
        this.dispose();
    }//GEN-LAST:event_office_hostelMousePressed

    private void search_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_fieldFocusGained
        // TODO add your handling code here:
        if(search_field.getText().equals("SEARCH BY CITY")){
            search_field.setText(null);
            search_field.requestFocus();
            placeholder.removePlaceHolder(search_field);
        }
    }//GEN-LAST:event_search_fieldFocusGained

    private void search_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_fieldFocusLost
        // TODO add your handling code here:
        if(search_field.getText().length()==0){
            placeholder.addPlaceHolder(search_field);
            search_field.setText("SEARCH BY CITY");
        }
    }//GEN-LAST:event_search_fieldFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
        // TODO add your handling code here:
        ArrayList<Hostel_Model> allcity = hostel.getHostelCity(search_field.getText());
        int count=0;
        for (Hostel_Model a: allcity) {
            count++;
        }
        if(count == 0){
           JOptionPane.showMessageDialog(rootPane, "No hostel available in " + (search_field.getText().toUpperCase()));
        }
        else{
            new All_Hostels_Screen().setVisible(true);
            hostel.setValues(allcity,
                hostel_name_1, hostel_name_2, hostel_name_3, hostel_name_4, hostel_name_5, hostel_name_6 , 
                image_1,image_2,image_3,image_4,image_5,image_6
            );
            count = 0;
            this.dispose();
        }

    }//GEN-LAST:event_search_buttonMouseClicked


    private void _bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__bookedActionPerformed
        // TODO add your handling code here:
        new All_Booked_Screen().setVisible(true);
        ArrayList<Booking_Model> all = booking.getallbooked(Integer.parseInt(user.getId()));
        DefaultTableModel  defaultTableModel = (DefaultTableModel) datatable.getModel();
        datatable.setBackground(new Color(255,255,255));
        for(int i = 0; i < all.size(); i++){
            defaultTableModel.addRow(new Object[] {
                all.get(i).getHosname(),
                all.get(i).getHosemail(),
                all.get(i).getHosfee(),
                all.get(i).getDate(),
                all.get(i).getTime(),
            });
        }
        this.dispose();
    }//GEN-LAST:event__bookedActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home_Screen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _booked;
    private javax.swing.JButton _logout;
    private javax.swing.JLabel boys_hostel;
    private javax.swing.JLabel girls_hostel;
    private javax.swing.JPanel jPanel1;
    protected static javax.swing.JLabel logged_in_username;
    private javax.swing.JLabel office_hostel;
    private javax.swing.JLabel search_button;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}
