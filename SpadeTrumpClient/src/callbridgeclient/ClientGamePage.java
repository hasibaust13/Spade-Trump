package callbridgeclient;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ClientGamePage extends javax.swing.JFrame {

    int num, tot, cnt, pointGain, pointSub,cnt1;
    static boolean flag;
    static List<Card> L;
    static List<Card> LL;
    boolean take[] = new boolean[14];

    public ClientGamePage() {
        initComponents();
        cnt1 = 0;
        tot = 0;
        pointGain = 0;
        pointSub = 0;
        submit.setVisible(false);
        sub.setVisible(false);
        sub.setInputVerifier(new VarifyNumber());
        L = new ArrayList();
        LL = new ArrayList();
        flag = false;
        setTot();
        setPg();
        String s = "playing.png";
        _1.setIcon(new ImageIcon(s));
        _2.setIcon(new ImageIcon(s));
        _3.setIcon(new ImageIcon(s));
        _4.setIcon(new ImageIcon(s));
        jButton1.setName("0");
        jButton2.setName("1");
        jButton3.setName("2");
        jButton4.setName("3");
        jButton5.setName("4");
        jButton6.setName("5");
        jButton7.setName("6");
        jButton8.setName("7");
        jButton9.setName("8");
        jButton10.setName("9");
        jButton11.setName("10");
        jButton12.setName("11");
        jButton13.setName("12");

    }

    public void setVis() {
        submit.setVisible(true);
        sub.setVisible(true);
        sub.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        sub = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        _1 = new javax.swing.JLabel();
        _2 = new javax.swing.JLabel();
        _3 = new javax.swing.JLabel();
        _4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        totP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pg = new javax.swing.JLabel();
        ff = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.setAlignmentY(0.0F);
        jButton1.setName(""); // NOI18N
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.setActionCommand("jButton2");
        jButton2.setAlignmentY(0.0F);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.setActionCommand("jButton3");
        jButton3.setAlignmentY(0.0F);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton1");
        jButton4.setActionCommand("jButton4");
        jButton4.setAlignmentY(0.0F);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.setActionCommand("jButton5");
        jButton5.setAlignmentY(0.0F);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton1");
        jButton6.setActionCommand("jButton6");
        jButton6.setAlignmentY(0.0F);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setText("jButton1");
        jButton7.setActionCommand("jButton7");
        jButton7.setAlignmentY(0.0F);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton1");
        jButton8.setActionCommand("jButton8");
        jButton8.setAlignmentY(0.0F);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton1");
        jButton9.setActionCommand("jButton9");
        jButton9.setAlignmentY(0.0F);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton10.setText("jButton1");
        jButton10.setActionCommand("jButton10");
        jButton10.setAlignmentY(0.0F);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton11.setText("jButton1");
        jButton11.setActionCommand("jButton11");
        jButton11.setAlignmentY(0.0F);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton12.setText("jButton1");
        jButton12.setActionCommand("jButton12");
        jButton12.setAlignmentY(0.0F);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton13.setText("jButton1");
        jButton13.setActionCommand("jButton13");
        jButton13.setAlignmentY(0.0F);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        submit.setText("submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        _1.setText("jLabel1");
        _1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        _2.setText("jLabel2");
        _2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        _3.setText("jLabel3");
        _3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        _4.setText("_");
        _4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Total Point ");

        totP.setText("jLabel2");

        jLabel3.setText("Point Gain");

        pg.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totP))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pg))
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(ff)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submit))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(totP))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pg))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(ff)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        if (sub.getBackground() == Color.WHITE) {
            num = Integer.valueOf(sub.getText());
            try {
                pointSub = num;
                setPg();
                ClientPage.DO.writeInt(num);
                sub.setVisible(false);
                submit.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(ClientGamePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JButton jb = (JButton) evt.getSource();

        if (flag) {
            String ss = jb.getName();
            int nn = Integer.valueOf(ss);
            Card cc = L.get(nn);
            int a = cc.a;
            int b = cc.b;


            if (check(a, b)) {
                try {
                    ClientPage.DO.writeInt(a);
                    ClientPage.DO.writeInt(b);

                } catch (IOException ex) {
                    Logger.getLogger(ClientGamePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                jb.setVisible(false);
                String _s = jb.getName();
                System.out.println(_s);
                int num = Integer.valueOf(_s);
                take[num] = false;
            } else {
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    void setTot() {
        totP.setText(String.valueOf(tot));
    }

    void setPg() {
        pg.setText(String.valueOf(pointGain) + "/" + String.valueOf(pointSub));
    }

    boolean check(int a, int b) {
        if (cnt == 0) {
            return true;
        }
        System.out.println(a + " " + LL.get(0).a);
        if (a == LL.get(0).a) {
            return true;
        }
        for (int i = 0; i < 13; i++) {
            if (take[i]) {
                if (L.get(i).a == LL.get(0).a) {
                    return false;
                }
            }
        }
        return true;
    }

    public void setMove(String s) {
        if (cnt == 0) {
            _1.setIcon(new ImageIcon(s));
        }
        if (cnt == 1) {
            _2.setIcon(new ImageIcon(s));
        }
        if (cnt == 2) {
            _3.setIcon(new ImageIcon(s));
        }
        if (cnt == 3) {
            _4.setIcon(new ImageIcon(s));
        }
        cnt = (cnt + 1) % 4;
        
        if (cnt == 0) {
            s = "playing.png";
            _1.setIcon(new ImageIcon(s));
            _2.setIcon(new ImageIcon(s));
            _3.setIcon(new ImageIcon(s));
            _4.setIcon(new ImageIcon(s));
            LL.clear();
        }
    }

    public void set(int f) {
        flag = (f == 1);
        if (flag) {

            ff.setText("Your Turn");
            System.out.println(ff.getText());
        } else {
            ff.setText("");
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ClientGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGamePage().setVisible(true);
            }
        });
    }

    void init() {
        L.clear();
    }

    static void add(Card c) {
        L.add(c);
    }

    static void Sort() {
        Collections.sort(L);
    }

    void initButton() {
        pointGain = 0;
        pointSub = 0;
        setPg();
        for (int i = 0; i < 13; i++) {
            take[i] = true;
            Card c = L.get(i);
            if (i == 0) {
                jButton1.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton1.setVisible(true);
            }
            if (i == 1) {
                jButton2.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton2.setVisible(true);
            }
            if (i == 2) {
                jButton3.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton3.setVisible(true);
            }
            if (i == 3) {
                jButton4.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton4.setVisible(true);
            }
            if (i == 4) {
                jButton5.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton5.setVisible(true);
            }
            if (i == 5) {
                jButton6.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton6.setVisible(true);
            }
            if (i == 6) {
                jButton7.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton7.setVisible(true);
            }
            if (i == 7) {
                jButton8.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton8.setVisible(true);
            }
            if (i == 8) {
                jButton9.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton9.setVisible(true);
            }
            if (i == 9) {
                jButton10.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton10.setVisible(true);
            }
            if (i == 10) {
                jButton11.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton11.setVisible(true);
            }
            if (i == 11) {
                jButton12.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton12.setVisible(true);
            }
            if (i == 12) {
                jButton13.setIcon(new ImageIcon(String.valueOf(c.a) + "_" + String.valueOf(c.b) + ".png"));
                jButton13.setVisible(true);

            }


        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel _1;
    private javax.swing.JLabel _2;
    private javax.swing.JLabel _3;
    private javax.swing.JLabel _4;
    private javax.swing.JLabel ff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pg;
    private javax.swing.JTextField sub;
    private javax.swing.JButton submit;
    private javax.swing.JLabel totP;
    // End of variables declaration//GEN-END:variables
}
