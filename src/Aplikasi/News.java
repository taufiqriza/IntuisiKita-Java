/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author TIUNIDA 28
 */
public class News extends javax.swing.JFrame {

    /**
     * Creates new form Kelasku
     */
    public News() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        isiSetting.setEnabled(false);
        isiSetting.setVisible(false);
        setting1.setEnabled(false);
        setting1.setVisible(false);
        
        Power.setEnabled(false);
        Power.setVisible(false);
        Power1.setEnabled(false);
        Power1.setVisible(false);
        
        Komentar.setEnabled(false);
        Komentar.setVisible(false);
        Komentar1.setEnabled(false);
        Komentar1.setVisible(false);
        
        Suka.setEnabled(false);
        Suka.setVisible(false);
        Suka1.setEnabled(false);
        Suka1.setVisible(false);
        
        Teruskan.setEnabled(false);
        Teruskan.setVisible(false);
        Teruskan1.setEnabled(false);
        Teruskan1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtKomen = new javax.swing.JTextField();
        Suka1 = new javax.swing.JLabel();
        Suka2 = new javax.swing.JLabel();
        Suka = new javax.swing.JLabel();
        Komentar = new javax.swing.JLabel();
        Komentar1 = new javax.swing.JLabel();
        Komentar2 = new javax.swing.JLabel();
        Shutdown = new javax.swing.JLabel();
        Teruskan = new javax.swing.JLabel();
        Teruskan1 = new javax.swing.JLabel();
        Teruskan2 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Peningkatan = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        News = new javax.swing.JLabel();
        Power = new javax.swing.JLabel();
        Power1 = new javax.swing.JLabel();
        Power2 = new javax.swing.JLabel();
        setting1 = new javax.swing.JLabel();
        setting2 = new javax.swing.JLabel();
        isiSetting = new javax.swing.JLabel();
        Games = new javax.swing.JLabel();
        Kelasku = new javax.swing.JLabel();
        Dashboard1 = new javax.swing.JLabel();
        Next = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtKomen.setBorder(null);
        txtKomen.setOpaque(false);
        getContentPane().add(txtKomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 280, 60));

        Suka1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Suka1MouseClicked(evt);
            }
        });
        getContentPane().add(Suka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 50, 40));

        Suka2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Suka2MouseClicked(evt);
            }
        });
        getContentPane().add(Suka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 50, 40));

        Suka.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/suka.png"))); // NOI18N
        getContentPane().add(Suka, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 50, 60));

        Komentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Komentar.png"))); // NOI18N
        getContentPane().add(Komentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 400, 100));

        Komentar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Komentar1MouseClicked(evt);
            }
        });
        getContentPane().add(Komentar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 40, 40));

        Komentar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Komentar2MouseClicked(evt);
            }
        });
        getContentPane().add(Komentar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 40, 40));

        Shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutdownMouseClicked(evt);
            }
        });
        getContentPane().add(Shutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 100, 20));

        Teruskan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Pesa2.png"))); // NOI18N
        getContentPane().add(Teruskan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 230, 170));

        Teruskan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teruskan1MouseClicked(evt);
            }
        });
        getContentPane().add(Teruskan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 60, 40));

        Teruskan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Teruskan2MouseClicked(evt);
            }
        });
        getContentPane().add(Teruskan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 60, 40));

        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        getContentPane().add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        Peningkatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeningkatanMouseClicked(evt);
            }
        });
        getContentPane().add(Peningkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 30));

        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        News.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewsMouseClicked(evt);
            }
        });
        getContentPane().add(News, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        Power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Power.png"))); // NOI18N
        Power.setText("jLabel1");
        getContentPane().add(Power, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 130, 110));

        Power1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Power1MouseClicked(evt);
            }
        });
        getContentPane().add(Power1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 40, 40));

        Power2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Power2MouseClicked(evt);
            }
        });
        getContentPane().add(Power2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 40, 40));

        setting1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting1MouseClicked(evt);
            }
        });
        getContentPane().add(setting1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 40, 40));

        setting2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting2MouseClicked(evt);
            }
        });
        getContentPane().add(setting2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 40, 40));

        isiSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Setting.png"))); // NOI18N
        getContentPane().add(isiSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 130, 110));

        Games.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GamesMouseClicked(evt);
            }
        });
        getContentPane().add(Games, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 30));

        Kelasku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelaskuMouseClicked(evt);
            }
        });
        getContentPane().add(Kelasku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 30));
        getContentPane().add(Dashboard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 80, 40));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/News.png"))); // NOI18N
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setting1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting1MouseClicked
        isiSetting.setEnabled(false);
        isiSetting.setVisible(false);
        setting1.setEnabled(false);
        setting1.setVisible(false);
        setting2.setEnabled(true);
        setting2.setVisible(true);
    }//GEN-LAST:event_setting1MouseClicked

    private void setting2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setting2MouseClicked
        isiSetting.setEnabled(true);
        isiSetting.setVisible(true);
        setting1.setEnabled(true);
        setting1.setVisible(true);
        setting2.setEnabled(false);
        setting2.setVisible(false);
    }//GEN-LAST:event_setting2MouseClicked

    private void Power1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Power1MouseClicked
        Power.setEnabled(false);
        Power.setVisible(false);
        Power1.setEnabled(false);
        Power1.setVisible(false);
        Power2.setEnabled(true);
        Power2.setVisible(true);
    }//GEN-LAST:event_Power1MouseClicked

    private void Power2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Power2MouseClicked
        Power.setEnabled(true);
        Power.setVisible(true);
        Power1.setEnabled(true);
        Power1.setVisible(true);
        Power2.setEnabled(false);
        Power2.setVisible(false);
    }//GEN-LAST:event_Power2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        for (double i = 0.0; i <=1.0;i = i+ 0.1)
//        {
//            String val = i+ "";
//            float f = Float.valueOf(val);
//            this.setOpacity(f);
//            try{
//                Thread.sleep(50);
//            }
//            catch(Exception e)
//            {
//                
//            }
//        }
    }//GEN-LAST:event_formWindowOpened

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DashboardMouseClicked

    private void GamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GamesMouseClicked
        Games game = new Games();
        game.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GamesMouseClicked

    private void KelaskuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelaskuMouseClicked
        Kelasku kelas = new Kelasku();
        kelas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KelaskuMouseClicked

    private void ShutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShutdownMouseClicked
        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Apakah anda ingin menutup Intuisi Kita?", "Exit Intuisi Kita", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_ShutdownMouseClicked

    private void NewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewsMouseClicked
        News news = new News();
        news.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewsMouseClicked

    private void Komentar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Komentar1MouseClicked
        Komentar.setEnabled(false);
        Komentar.setVisible(false);
        Komentar1.setEnabled(false);
        Komentar1.setVisible(false);
        Komentar2.setEnabled(true);
        Komentar2.setVisible(true);
    }//GEN-LAST:event_Komentar1MouseClicked

    private void Komentar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Komentar2MouseClicked
        Komentar.setEnabled(true);
        Komentar.setVisible(true);
        Komentar1.setEnabled(true);
        Komentar1.setVisible(true);
        Komentar2.setEnabled(false);
        Komentar2.setVisible(false);
    }//GEN-LAST:event_Komentar2MouseClicked

    private void Suka1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Suka1MouseClicked
        Suka.setEnabled(false);
        Suka.setVisible(false);
        Suka1.setEnabled(false);
        Suka1.setVisible(false);
        Suka2.setEnabled(true);
        Suka2.setVisible(true);
    }//GEN-LAST:event_Suka1MouseClicked

    private void Suka2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Suka2MouseClicked
        Suka.setEnabled(true);
        Suka.setVisible(true);
        Suka1.setEnabled(true);
        Suka1.setVisible(true);
        Suka2.setEnabled(false);
        Suka2.setVisible(false);
    }//GEN-LAST:event_Suka2MouseClicked

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        News2 news2 = new News2();
        news2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NextMouseClicked

    private void Teruskan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teruskan1MouseClicked
        Teruskan.setEnabled(false);
        Teruskan.setVisible(false);
        Teruskan1.setEnabled(false);
        Teruskan1.setVisible(false);
        Teruskan2.setEnabled(true);
        Teruskan2.setVisible(true);
    }//GEN-LAST:event_Teruskan1MouseClicked

    private void Teruskan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Teruskan2MouseClicked
        Teruskan.setEnabled(true);
        Teruskan.setVisible(true);
        Teruskan1.setEnabled(true);
        Teruskan1.setVisible(true);
        Teruskan2.setEnabled(false);
        Teruskan2.setVisible(false);
    }//GEN-LAST:event_Teruskan2MouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        Search search = new Search();
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchMouseClicked

    private void PeningkatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeningkatanMouseClicked
        Peningkatan peningkatan = new Peningkatan();
        peningkatan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PeningkatanMouseClicked

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
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(News.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new News().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Dashboard1;
    private javax.swing.JLabel Games;
    private javax.swing.JLabel Kelasku;
    private javax.swing.JLabel Komentar;
    private javax.swing.JLabel Komentar1;
    private javax.swing.JLabel Komentar2;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel News;
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Peningkatan;
    private javax.swing.JLabel Power;
    private javax.swing.JLabel Power1;
    private javax.swing.JLabel Power2;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Shutdown;
    private javax.swing.JLabel Suka;
    private javax.swing.JLabel Suka1;
    private javax.swing.JLabel Suka2;
    private javax.swing.JLabel Teruskan;
    private javax.swing.JLabel Teruskan1;
    private javax.swing.JLabel Teruskan2;
    private javax.swing.JLabel isiSetting;
    private javax.swing.JLabel setting1;
    private javax.swing.JLabel setting2;
    private javax.swing.JTextField txtKomen;
    // End of variables declaration//GEN-END:variables
}
