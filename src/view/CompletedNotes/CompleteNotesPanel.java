package view.CompletedNotes;

import javax.swing.JLabel;
import javax.swing.JPanel;
import view.PendingNotes.*;

public class CompleteNotesPanel extends javax.swing.JPanel {
    
    
    public CompleteNotesPanel() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial");

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(893, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1020, -1));

        ContentPanel.setOpaque(false);
        ContentPanel.setLayout(new java.awt.CardLayout());
        add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 1020, 565));
    }// </editor-fold>//GEN-END:initComponents
    
    public JPanel getContentPanel() {
        return ContentPanel;
    }

    public void setContentPanel(JPanel ContentPanel) {
        this.ContentPanel = ContentPanel;
    }

    public JPanel getHeadPanel() {
        return HeadPanel;
    }

    public void setHeadPanel(JPanel HeadPanel) {
        this.HeadPanel = HeadPanel;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
