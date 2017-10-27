package switcher;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Settings extends javax.swing.JFrame {

    private String prog1=null, prog2=null, path1=null, path2=null, play1=null;
    private String time1=null, time2=null, interval=null;
    
    public Settings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Texe1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tpath1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Texe2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tplay1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Tpath2 = new javax.swing.JTextField();
        BtnPath = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BtnTime = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        LBack = new javax.swing.JLabel();
        Ttime1 = new javax.swing.JFormattedTextField();
        Ttime2 = new javax.swing.JFormattedTextField();
        Tpause = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Location");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Time");

        jLabel3.setText("Program 1");

        Texe1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Texe1FocusLost(evt);
            }
        });

        jLabel4.setText("Path #1:");

        Tpath1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Tpath1FocusLost(evt);
            }
        });

        jLabel6.setText("Program 2");

        Texe2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Texe2FocusLost(evt);
            }
        });

        jLabel5.setText("Playlist #1:");

        Tplay1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Tplay1FocusLost(evt);
            }
        });

        jLabel7.setText("Path #2:");

        Tpath2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Tpath2FocusLost(evt);
            }
        });

        BtnPath.setText("Save");
        BtnPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPathActionPerformed(evt);
            }
        });

        jLabel8.setText("Time 1:");

        jLabel9.setText("Time 2:");

        jLabel10.setText("Interval:");

        BtnTime.setText("Update Time");
        BtnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTimeActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("*Note: Enter time in 24 hrs format");

        LBack.setIcon(new javax.swing.ImageIcon("E:\\Switcher\\back.png")); // NOI18N
        LBack.setToolTipText("");
        LBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LBackMouseExited(evt);
            }
        });

        Ttime1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        Ttime1.setMaximumSize(new java.awt.Dimension(14, 24));
        Ttime1.setMinimumSize(new java.awt.Dimension(14, 24));
        Ttime1.setPreferredSize(new java.awt.Dimension(18, 24));
        Ttime1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Ttime1FocusLost(evt);
            }
        });

        Ttime2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        Ttime2.setMaximumSize(new java.awt.Dimension(14, 24));
        Ttime2.setMinimumSize(new java.awt.Dimension(14, 24));
        Ttime2.setPreferredSize(new java.awt.Dimension(14, 24));
        Ttime2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Ttime2FocusLost(evt);
            }
        });

        Tpause.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));
        Tpause.setMinimumSize(new java.awt.Dimension(14, 24));
        Tpause.setPreferredSize(new java.awt.Dimension(14, 24));
        Tpause.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TpauseFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tpath1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Texe1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(28, 28, 28))
                                    .addComponent(Texe2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Tplay1)
                            .addComponent(Tpath2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(BtnPath, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnTime)
                                .addGap(77, 77, 77))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(110, 110, 110))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jSeparator3)
                            .addComponent(Ttime1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(Ttime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Tpause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Texe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tpath1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tplay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tpath2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ttime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ttime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Tpause, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnPath)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnTime)
                        .addGap(25, 25, 25))))
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
/***********************************Left Hand Side******************************************************/
    
    private void Texe1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Texe1FocusLost
        prog1=null;
        if(Texe1.getText()!=null)
            prog1 = Texe1.getText()+".exe";
    }//GEN-LAST:event_Texe1FocusLost

    private void Texe2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Texe2FocusLost
        prog2=null;
        if(Texe2.getText()!=null)
            prog2 = Texe2.getText()+".exe";
    }//GEN-LAST:event_Texe2FocusLost

    private void Tpath1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tpath1FocusLost
        path1=null;
        if(Tpath1.getText()!=null)
            path1 = Tpath1.getText();
        if(path1.length()<1)
            path1 = null;
    }//GEN-LAST:event_Tpath1FocusLost

    private void Tplay1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tplay1FocusLost
        play1=null;
        if(Tplay1.getText()!=null)
            play1 = Tplay1.getText();
        if(play1.length()<1)
            play1 = null;
    }//GEN-LAST:event_Tplay1FocusLost

    private void Tpath2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tpath2FocusLost
        path2=null;
        if(Tpath2.getText()!=null)
            path2 = Tpath2.getText();
        if(path2.length()<1)
            path2 = null;
    }//GEN-LAST:event_Tpath2FocusLost

    private void BtnPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPathActionPerformed
        if(prog1==null || prog2==null || path1==null || path2==null)
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            //Create Files
            File f = new File("Prog.sys");
            BufferedWriter out = null;
            try {
                if(f.createNewFile())
                    System.out.println("Created!");
                else
                    System.out.println("Already Exists!");
                
                FileWriter fstream = new FileWriter("Prog.sys", false); //true tells to append data.
                out = new BufferedWriter(fstream);
                if(play1==null)
                    out.write(prog1+"\n"+path1+"\n"+"1"+"\n"+prog2+"\n"+path2);
                else    
                    out.write(prog1+"\n"+path1+"\n"+play1+"\n"+prog2+"\n"+path2);
                
            } catch (IOException ex) {
                Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if(out!=null)
                   try {
                       out.close();
                } catch (IOException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_BtnPathActionPerformed

/**********************************Right Hand Side********************************************/
    
    private void BtnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTimeActionPerformed
        if(time1==null || time2==null || interval==null)
        {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            //Create Files
            File f = new File("Time.sys");
            BufferedWriter out = null;
            try {
                if(f.createNewFile())
                    System.out.println("Created!");
                else
                    System.out.println("Already Exists!");
                
                FileWriter fstream = new FileWriter("Time.sys", false); //true tells to append data.
                out = new BufferedWriter(fstream);
                out.write(time1+"\n"+time2+"\n"+interval);
                
            } catch (IOException ex) {
                Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if(out!=null)
                   try {
                       out.close();
                } catch (IOException ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_BtnTimeActionPerformed

    private void LBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBackMouseEntered
        LBack.setOpaque(true);
        LBack.setBackground(Color.GRAY);
    }//GEN-LAST:event_LBackMouseEntered

    private void LBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBackMouseExited
        LBack.setOpaque(true);
        Color backColor = new Color(214, 217, 223);
        LBack.setBackground(backColor);
    }//GEN-LAST:event_LBackMouseExited

    private void LBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBackMouseClicked
        MainFrame m=new MainFrame();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LBackMouseClicked

    private void Ttime1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ttime1FocusLost
        time1=null;
        if(Ttime1.getText()!=null)
            time1 = Ttime1.getText();
        if(time1.length()<1)
            time1 = null;
    }//GEN-LAST:event_Ttime1FocusLost

    private void Ttime2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Ttime2FocusLost
        time2=null;
        if(Ttime2.getText()!=null)
            time2 = Ttime2.getText();
        if(time2.length()<1)
            time2 = null;
    }//GEN-LAST:event_Ttime2FocusLost

    private void TpauseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TpauseFocusLost
        interval=null;
        if(Tpause.getText()!=null)
            interval = Tpause.getText();
        if(time1.length()<1)
            interval = null;
    }//GEN-LAST:event_TpauseFocusLost
    
    
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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Settings s = new Settings();
                s.setLocationRelativeTo(null);
                s.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPath;
    private javax.swing.JButton BtnTime;
    private javax.swing.JLabel LBack;
    private javax.swing.JTextField Texe1;
    private javax.swing.JTextField Texe2;
    private javax.swing.JTextField Tpath1;
    private javax.swing.JTextField Tpath2;
    private javax.swing.JFormattedTextField Tpause;
    private javax.swing.JTextField Tplay1;
    private javax.swing.JFormattedTextField Ttime1;
    private javax.swing.JFormattedTextField Ttime2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
