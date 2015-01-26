/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campusguider;

import obsolete.StyleTest;
import obj.TranslateService;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author danny
 */
public class NewJFrame3 extends javax.swing.JFrame {
	String[] locations = {"", "Marston Library", "New Engineering Buiding", "CSE Building"};

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame3() {
        initComponents();
        this.setResizable(false);

        this.setResizable(false);
        this.setLocation(900, 200);
        
        Container c = this.getContentPane();   
        Dimension d = new Dimension(Global.wid,Global.hig);
        c.setPreferredSize(d);
        this.pack();
        this.setVisible(true);
        
        
        //System.out.println(Global.clientLang);
        //System.out.println(Global.serverLang);
        String text = null;
        try
        {
        //TranslateService tls = new TranslateService();
        text = tls.translate("I don't understand", "en", Global.serverLang);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        this.iMGbutton1.setText(text);
        this.iMGbutton2.setVisible(false);
        
        jTextPane1.setEditable(false);
        st.updateTextPane(jTextPane1, Global.server);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        iMGbutton1 = new campusguider.IMGbutton();
        iMGbutton2 = new campusguider.IMGbutton();
        iMGbuttonPic1 = new campusguider.IMGbuttonPic();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Popular places");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guider's Mobile");

        jButton1.setLabel("send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        iMGbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMGbutton1ActionPerformed(evt);
            }
        });

        iMGbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMGbutton2ActionPerformed(evt);
            }
        });

        iMGbuttonPic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMGbuttonPic1ActionPerformed(evt);
            }
        });

        jButton4.setLabel("Survey");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iMGbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iMGbuttonPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iMGbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iMGbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iMGbutton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iMGbuttonPic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Global.msgs.add(jTextField1.getText());
        Global.owners.add(Global.server);
        
        
        
        
        //st.updateTextPane(jTextPane1, Global.server);
st1.updateTextPane1(jTextField1.getText(), Global.server);
        st3.updateTextPane3(jTextField1.getText(), Global.server);
        
//st.updateTextPane(Global.jf1.getJTextPane1(), Global.client);
        
        this.jTextField1.setText("");
        this.iMGbutton2.setVisible(false);
        //this.jTextPane1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iMGbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMGbutton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iMGbutton2ActionPerformed

    private void iMGbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMGbutton1ActionPerformed
        // TODO add your handling code here:
        
        String s = "wait for response...";
        try
        {
            s = tls.translate("wait for response...", "en", Global.server);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        Global.msgs.add(s);
        Global.owners.add(Global.server);
        
        
        Global.jf1.getIMGbutton2().setVisible(true);
                

        //st1.updateTextPane1(s, Global.server);
        st3.updateTextPane3(s, Global.server);
        
        this.getIMGbutton2().setVisible(false);
        
        //st.updateTextPane(jTextPane1, Global.server);
        
    }//GEN-LAST:event_iMGbutton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        URL url = null;
            try {
                url = new URL("https://ufl.qualtrics.com/jfe/form/SV_6DVJOP4WySPF0Q5");
            } catch (MalformedURLException ex) {
                Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
            }
    try {
        openWebpage(url.toURI());
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
    
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void iMGbuttonPic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMGbuttonPic1ActionPerformed
        // TODO add your handling code here:
        
        st1.updateTextPane1("[simulated image]", Global.server);
        st3.updateTextPane3("[simulated image]", Global.server);
        this.iMGbutton2.setVisible(false);
        
    }//GEN-LAST:event_iMGbuttonPic1ActionPerformed

    private static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new NewJFrame3().setVisible(true);           
            }
        });
    }

    public javax.swing.JTextPane getJTextPane1()
    {
        return this.jTextPane1;
    }
    
    public IMGbutton getIMGbutton2()
    {
        return this.iMGbutton2;
    }
    
    
    private TranslateService tls = new TranslateService();
    private  StyleTest st = new StyleTest();
    
    
    private StyleTest1 st1 = new StyleTest1();
    private StyleTest3 st3 = new StyleTest3();

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private campusguider.IMGbutton iMGbutton1;
    private campusguider.IMGbutton iMGbutton2;
    private campusguider.IMGbuttonPic iMGbuttonPic1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
