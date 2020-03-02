/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Naowas
 */
public class salarymanage extends javax.swing.JFrame {

    /**
     * Creates new form salarymanage
     */
    public salarymanage() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_update_salary = new javax.swing.JButton();
        back = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        btn_salary_info = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management System");
        setMinimumSize(new java.awt.Dimension(710, 450));
        getContentPane().setLayout(null);

        btn_update_salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/update.png"))); // NOI18N
        btn_update_salary.setText("Update Salary");
        btn_update_salary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update_salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_salaryActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update_salary);
        btn_update_salary.setBounds(70, 110, 170, 49);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/back.png"))); // NOI18N
        back.setText("Return");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 340, 120, 41);

        subtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/Payment.png"))); // NOI18N
        subtract.setText("Subtraction");
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });
        getContentPane().add(subtract);
        subtract.setBounds(240, 160, 180, 49);

        btn_salary_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/print.png"))); // NOI18N
        btn_salary_info.setText("Print Salary info");
        btn_salary_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salary_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salary_infoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salary_info);
        btn_salary_info.setBounds(420, 210, 200, 49);

        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/logoff.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout);
        btn_logout.setBounds(540, 30, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/work background.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 710, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_update_salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_salaryActionPerformed
        // TODO add your handling code here:
        salaryupdate updatesalary=new salaryupdate();
        updatesalary.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btn_update_salaryActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        mainpage back=new mainpage();
                back.setVisible(true);
                
                
    }//GEN-LAST:event_backActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        // TODO add your handling code here:
        subtraction subtract=new subtraction();
        subtract.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_subtractActionPerformed

    private void btn_salary_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salary_infoActionPerformed
        // TODO add your handling code here:
        
        salaryslip salary_slip=new salaryslip();
        salary_slip.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btn_salary_infoActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:

        login log=new login();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(salarymanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salarymanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salarymanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salarymanage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salarymanage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_salary_info;
    private javax.swing.JButton btn_update_salary;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}