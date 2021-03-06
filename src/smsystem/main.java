/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsystem;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author HAMZA
 */
public class main extends javax.swing.JFrame {

    private void close()
{
    WindowEvent winClosing=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
        }
    /**
     * Creates new form main
     */
    public main() {
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
        stdnt = new javax.swing.JLabel();
        modi_std_info = new javax.swing.JButton();
        search_std = new javax.swing.JButton();
        faculty = new javax.swing.JLabel();
        modi_fac_info = new javax.swing.JButton();
        search_fac = new javax.swing.JButton();
        non_t_staf = new javax.swing.JLabel();
        modi_nts = new javax.swing.JButton();
        search_nts = new javax.swing.JButton();
        accounts = new javax.swing.JLabel();
        std_fee = new javax.swing.JButton();
        faculty_payroll = new javax.swing.JButton();
        sign_out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("School Management System");

        jPanel1.setLayout(null);

        stdnt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stdnt.setForeground(new java.awt.Color(255, 255, 51));
        stdnt.setText("Student");
        jPanel1.add(stdnt);
        stdnt.setBounds(30, 10, 80, 30);

        modi_std_info.setText("Modify Student Info");
        modi_std_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modi_std_infoActionPerformed(evt);
            }
        });
        jPanel1.add(modi_std_info);
        modi_std_info.setBounds(30, 50, 140, 23);

        search_std.setText("Search Student");
        search_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_stdActionPerformed(evt);
            }
        });
        jPanel1.add(search_std);
        search_std.setBounds(200, 50, 130, 23);

        faculty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        faculty.setForeground(new java.awt.Color(255, 255, 51));
        faculty.setText("Faculty");
        jPanel1.add(faculty);
        faculty.setBounds(30, 130, 50, 17);

        modi_fac_info.setText("Modify Faculty Info");
        modi_fac_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modi_fac_infoActionPerformed(evt);
            }
        });
        jPanel1.add(modi_fac_info);
        modi_fac_info.setBounds(30, 170, 140, 23);

        search_fac.setText("Search Faculty");
        search_fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_facActionPerformed(evt);
            }
        });
        jPanel1.add(search_fac);
        search_fac.setBounds(200, 170, 130, 23);

        non_t_staf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        non_t_staf.setForeground(new java.awt.Color(255, 255, 51));
        non_t_staf.setText("Non Teaching Staff");
        jPanel1.add(non_t_staf);
        non_t_staf.setBounds(30, 210, 150, 17);

        modi_nts.setText("Modify NTS Info");
        modi_nts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modi_ntsActionPerformed(evt);
            }
        });
        jPanel1.add(modi_nts);
        modi_nts.setBounds(30, 240, 140, 23);

        search_nts.setText("Search NTS");
        search_nts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_ntsActionPerformed(evt);
            }
        });
        jPanel1.add(search_nts);
        search_nts.setBounds(200, 240, 130, 23);

        accounts.setBackground(new java.awt.Color(255, 255, 0));
        accounts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accounts.setForeground(new java.awt.Color(255, 255, 51));
        accounts.setText("Accounts");
        jPanel1.add(accounts);
        accounts.setBounds(30, 280, 100, 17);

        std_fee.setText("Student Fee");
        std_fee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_feeActionPerformed(evt);
            }
        });
        jPanel1.add(std_fee);
        std_fee.setBounds(30, 310, 140, 23);

        faculty_payroll.setText("Faculty Payroll");
        faculty_payroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty_payrollActionPerformed(evt);
            }
        });
        jPanel1.add(faculty_payroll);
        faculty_payroll.setBounds(200, 310, 130, 23);

        sign_out.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sign_out.setForeground(new java.awt.Color(204, 0, 0));
        sign_out.setText("Sign out");
        sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_outActionPerformed(evt);
            }
        });
        jPanel1.add(sign_out);
        sign_out.setBounds(200, 10, 130, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smsystem/my.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_stdActionPerformed
close();
search_std o=new search_std();
o.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_search_stdActionPerformed

    private void sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_outActionPerformed
close();
sgnin o=new sgnin();
o.setVisible(true);
        

// TODO add your handling code here:
    }//GEN-LAST:event_sign_outActionPerformed

    private void modi_std_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modi_std_infoActionPerformed
close();
Modify_std_info o=new Modify_std_info();
o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_modi_std_infoActionPerformed

    private void modi_fac_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modi_fac_infoActionPerformed
close();
Modify_faculty_info o=new Modify_faculty_info();
o.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_modi_fac_infoActionPerformed

    private void search_facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_facActionPerformed
close();
search_faculty o=new search_faculty();
o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_search_facActionPerformed

    private void modi_ntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modi_ntsActionPerformed
close();
Modify_nts_info o=new Modify_nts_info();
o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_modi_ntsActionPerformed

    private void search_ntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_ntsActionPerformed
close();
Search_nts o=new Search_nts();
o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_search_ntsActionPerformed

    private void std_feeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_feeActionPerformed
close();
student_fee o=new student_fee();
o.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_std_feeActionPerformed

    private void faculty_payrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty_payrollActionPerformed
close();
payrol o=new payrol();
o.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_faculty_payrollActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accounts;
    private javax.swing.JLabel faculty;
    private javax.swing.JButton faculty_payroll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modi_fac_info;
    private javax.swing.JButton modi_nts;
    private javax.swing.JButton modi_std_info;
    private javax.swing.JLabel non_t_staf;
    private javax.swing.JButton search_fac;
    private javax.swing.JButton search_nts;
    private javax.swing.JButton search_std;
    private javax.swing.JButton sign_out;
    private javax.swing.JButton std_fee;
    private javax.swing.JLabel stdnt;
    // End of variables declaration//GEN-END:variables
}
