/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Naowas
 */
public class login extends javax.swing.JFrame {
    
    Connection conn=null;
    ResultSet res=null;
    PreparedStatement pst=null;
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        conn=db.dbconn();
        
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

        lable_user = new javax.swing.JLabel();
        lable_pass = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        lable_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Management System");
        setPreferredSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        lable_user.setBackground(new java.awt.Color(0, 0, 0));
        lable_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lable_user.setText("Username");
        getContentPane().add(lable_user);
        lable_user.setBounds(50, 160, 70, 30);

        lable_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lable_pass.setText("Password");
        getContentPane().add(lable_pass);
        lable_pass.setBounds(50, 207, 70, 40);

        username.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(130, 160, 160, 30);

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/user.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(90, 270, 110, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Please enter your username and password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 280, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button icons/users-icon.png"))); // NOI18N
        jLabel4.setText("Employee Management System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 320, 50);

        password.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(130, 214, 160, 30);

        lable_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgrounds/login.jpg"))); // NOI18N
        getContentPane().add(lable_bg);
        lable_bg.setBounds(-6, -6, 700, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
        String sql="select username and password from user where(username=? and password=?)";
        
        try{
            
            int count=0;
            pst=conn.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            
            res=pst.executeQuery();
            while(res.next())
            {
                count=count+1;
            }
            
            if(count==1){
                JOptionPane.showMessageDialog(null,"Login Success!");
                
                mainpage m = new mainpage();
                m.setVisible(true);
                this.setVisible(false);
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Username and Password does not matched!");
                
            }    
            
            
            
        }catch(Exception e){
//            JOptionPane.showMessageDialog(null,e);
//            System.out.println("fffff");
        }
        
        finally{
            try{
                res.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==com.sun.glass.events.KeyEvent.VK_ENTER){
            
        
        String sql="select username and password from user where(username=? and password=?)";
        
        
        try{
            
            int count=0;
            pst=conn.prepareStatement(sql);
            pst.setString(1,username.getText());
            pst.setString(2,password.getText());
            
            res=pst.executeQuery();
            while(res.next())
            {
                count=count+1;
            }
            
            if(count==1){
                JOptionPane.showMessageDialog(null,"Login Success!");
                
                mainpage m=new mainpage();
                m.setVisible(true);
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Username and Password does not matched!");
                
            }
            
            
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        finally{
            try{
                res.close();
                pst.close();
                
            }catch(Exception e){
                
            }
        }
        }
        
        
        
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lable_bg;
    private javax.swing.JLabel lable_pass;
    private javax.swing.JLabel lable_user;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
