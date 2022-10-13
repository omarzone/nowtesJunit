package view.PendingNotes;

import DAONote.DAONote;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchPanel extends javax.swing.JPanel {
   DAONote xd = new DAONote();
   
   
    public SearchPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        resultsLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        resultsLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        resultsLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultsLabel.setText("Resultados");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Arrow.png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(resultsLabel)
                .addContainerGap(793, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(resultsLabel))
                .addContainerGap())
        );

        add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1020, -1));

        ContentPanel.setOpaque(false);
        ContentPanel.setLayout(new java.awt.CardLayout());
        add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 1020, 565));
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel resultsLabel;
    // End of variables declaration//GEN-END:variables

    
    
    

    

//    public PendingNotesItem getPendingNotesItem1() {
//        return pendingNotesItem1;
//    }

    public JPanel getContentPanel() {
        return ContentPanel;
    }

    public JLabel getResultsLabel() {
        return resultsLabel;
    }

    public JLabel getBtnBack() {
        return btnBack;
    }

    
    
    
    
    
}
