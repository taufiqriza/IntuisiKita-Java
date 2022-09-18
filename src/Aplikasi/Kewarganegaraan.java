/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author TIUNIDA 28
 */
public class Kewarganegaraan extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Kewarganegaraan() {
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Shutdown = new javax.swing.JLabel();
        Games = new javax.swing.JLabel();
        News = new javax.swing.JLabel();
        Dashboard = new javax.swing.JLabel();
        Peningkatan = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        Kelasku = new javax.swing.JLabel();
        Power = new javax.swing.JLabel();
        Power1 = new javax.swing.JLabel();
        Power2 = new javax.swing.JLabel();
        setting1 = new javax.swing.JLabel();
        setting2 = new javax.swing.JLabel();
        isiSetting = new javax.swing.JLabel();
        Materi = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Mapel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cari = new javax.swing.JLabel();
        menu1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Shutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutdownMouseClicked(evt);
            }
        });
        getContentPane().add(Shutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 100, 20));

        Games.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GamesMouseClicked(evt);
            }
        });
        getContentPane().add(Games, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, 30));

        News.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewsMouseClicked(evt);
            }
        });
        getContentPane().add(News, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 30));

        Dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DashboardMouseClicked(evt);
            }
        });
        getContentPane().add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        Peningkatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PeningkatanMouseClicked(evt);
            }
        });
        getContentPane().add(Peningkatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 30));
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 30));

        Kelasku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KelaskuMouseClicked(evt);
            }
        });
        getContentPane().add(Kelasku, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 30));

        Power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Power.png"))); // NOI18N
        getContentPane().add(Power, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 130, 110));

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

        Materi.setBorder(null);
        Materi.setOpaque(false);
        getContentPane().add(Materi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 160, 30));

        Kelas.setBorder(null);
        Kelas.setOpaque(false);
        getContentPane().add(Kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 160, 30));

        Mapel.setBorder(null);
        Mapel.setOpaque(false);
        getContentPane().add(Mapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 160, 30));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 580, 190));
        getContentPane().add(Cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 100, 30));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplikasi/img/Edukasi.png"))); // NOI18N
        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

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

    private void KelaskuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KelaskuMouseClicked
        Kelasku kelas = new Kelasku();
        kelas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KelaskuMouseClicked

    private void GamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GamesMouseClicked
        Games game = new Games();
        game.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GamesMouseClicked

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

    private void DashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMouseClicked
        Search search = new Search();
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DashboardMouseClicked

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
            java.util.logging.Logger.getLogger(Kewarganegaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kewarganegaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kewarganegaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kewarganegaraan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kewarganegaraan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cari;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JLabel Games;
    private javax.swing.JTextField Kelas;
    private javax.swing.JLabel Kelasku;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Materi;
    private javax.swing.JLabel News;
    private javax.swing.JLabel Peningkatan;
    private javax.swing.JLabel Power;
    private javax.swing.JLabel Power1;
    private javax.swing.JLabel Power2;
    private javax.swing.JLabel Search;
    private javax.swing.JLabel Shutdown;
    private javax.swing.JLabel isiSetting;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel setting1;
    private javax.swing.JLabel setting2;
    // End of variables declaration//GEN-END:variables
}
