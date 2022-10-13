package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        title_app = new javax.swing.JPanel();
        titleApp = new javax.swing.JLabel();
        WindowActions = new javax.swing.JPanel();
        MinimizeWindow = new javax.swing.JLabel();
        MaximizeWindow = new javax.swing.JLabel();
        CloseWindow = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        MainContent = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        btnHistory = new javax.swing.JLabel();
        btnHelp = new javax.swing.JLabel();
        btnSettings = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nowtes");
        setUndecorated(true);
        setResizable(false);

        HeaderPanel.setBackground(new java.awt.Color(98, 144, 200));
        HeaderPanel.setForeground(new java.awt.Color(98, 144, 200));
        HeaderPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPanelMouseDragged(evt);
            }
        });
        HeaderPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPanelMousePressed(evt);
            }
        });
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_app.setOpaque(false);
        title_app.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        titleApp.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        titleApp.setForeground(new java.awt.Color(255, 255, 255));
        titleApp.setText("Nowtes");
        title_app.add(titleApp);

        HeaderPanel.add(title_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        WindowActions.setOpaque(false);
        WindowActions.setPreferredSize(new java.awt.Dimension(150, 30));
        WindowActions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        MinimizeWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/line.png"))); // NOI18N
        MinimizeWindow.setPreferredSize(new java.awt.Dimension(30, 30));
        WindowActions.add(MinimizeWindow);

        MaximizeWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaximizeWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minimize.png"))); // NOI18N
        MaximizeWindow.setPreferredSize(new java.awt.Dimension(30, 30));
        WindowActions.add(MaximizeWindow);

        CloseWindow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseWindow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        CloseWindow.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        CloseWindow.setPreferredSize(new java.awt.Dimension(35, 30));
        WindowActions.add(CloseWindow);

        HeaderPanel.add(WindowActions, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 110, 30));

        getContentPane().add(HeaderPanel, java.awt.BorderLayout.PAGE_START);

        Content.setBackground(new java.awt.Color(130, 156, 188));

        MainContent.setOpaque(false);

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        getContentPane().add(Content, java.awt.BorderLayout.CENTER);

        Menu.setBackground(new java.awt.Color(255, 255, 255));

        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(31, 72, 126));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHome.setText("Inicio");
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });

        btnHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(31, 72, 126));
        btnHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHistory.setText("Historial");
        btnHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistory.setIconTextGap(0);
        btnHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistoryMouseClicked(evt);
            }
        });

        btnHelp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHelp.setForeground(new java.awt.Color(31, 72, 126));
        btnHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHelp.setText("Ayuda");
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
        });

        btnSettings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(31, 72, 126));
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSettings.setText("Configuración");
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingsMouseClicked(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo_small.png"))); // NOI18N

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(logo)
                .addGap(58, 58, 58)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMousePressed
       //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
    }//GEN-LAST:event_HeaderPanelMousePressed

    private void HeaderPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPanelMouseDragged
        //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
    }//GEN-LAST:event_HeaderPanelMouseDragged

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
        
        
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoryMouseClicked
        //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
    }//GEN-LAST:event_btnHistoryMouseClicked

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
        //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
    }//GEN-LAST:event_btnHelpMouseClicked

    private void btnSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseClicked
        //NO AGREGUEN NADA PORQUE ELIMINA SYSTEM32
    }//GEN-LAST:event_btnSettingsMouseClicked


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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseWindow;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel MainContent;
    private javax.swing.JLabel MaximizeWindow;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel MinimizeWindow;
    private javax.swing.JPanel WindowActions;
    private javax.swing.JLabel btnHelp;
    private javax.swing.JLabel btnHistory;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnSettings;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel titleApp;
    private javax.swing.JPanel title_app;
    // End of variables declaration//GEN-END:variables

    public JPanel getMainContent() {
        return MainContent;
    }

    public JLabel getBtnHelp() {
        return btnHelp;
    }

    public JLabel getBtnHistory() {
        return btnHistory;
    }

    public JLabel getBtnHome() {
        return btnHome;
    }

    public JLabel getBtnSettings() {
        return btnSettings;
    }

    public JLabel getCloseWindow() {
        return CloseWindow;
    }

    public JLabel getMaximizeWindow() {
        return MaximizeWindow;
    }

    public JLabel getMinimizeWindow() {
        return MinimizeWindow;
    }

    public JPanel getHeaderPanel() {
        return HeaderPanel;
    }

    public JPanel getContent() {
        return Content;
    }

    public JPanel getMenu() {
        return Menu;
    }

    public JPanel getWindowActions() {
        return WindowActions;
    }

    public JLabel getTitleApp() {
        return titleApp;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public JSeparator getjSeparator2() {
        return jSeparator2;
    }

    public JSeparator getjSeparator3() {
        return jSeparator3;
    }

    public JLabel getLogo() {
        return logo;
    }

    public JPanel getTitle_app() {
        return title_app;
    }
    
    
    
    
}
