package view.PendingNotes;

import DAONote.DAONote;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PendingNotesPanel extends javax.swing.JPanel {
   DAONote xd = new DAONote();
   
   
    public PendingNotesPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeadPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddNote = new javax.swing.JButton();
        SearchPanel = new javax.swing.JPanel();
        btnSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        ContentPanel = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pendientes");

        btnAddNote.setBackground(new java.awt.Color(0, 0, 0));
        btnAddNote.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddNote.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add_icon.png"))); // NOI18N
        btnAddNote.setText("Nueva nota");
        btnAddNote.setFocusable(false);
        btnAddNote.setIconTextGap(5);
        btnAddNote.setMargin(new java.awt.Insets(5, 5, 5, 14));
        btnAddNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNoteActionPerformed(evt);
            }
        });

        SearchPanel.setBackground(new java.awt.Color(255, 255, 255));
        SearchPanel.setPreferredSize(new java.awt.Dimension(365, 42));
        SearchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search (4).png"))); // NOI18N
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusable(false);
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SearchPanel.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        txtSearch.setBorder(null);
        txtSearch.setCaretColor(new java.awt.Color(31, 72, 126));
        SearchPanel.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 40));

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(btnAddNote)
                .addContainerGap())
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNote)
                    .addComponent(jLabel1)
                    .addComponent(SearchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1020, -1));

        ContentPanel.setOpaque(false);
        ContentPanel.setLayout(new java.awt.CardLayout());
        add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, 1020, 565));
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAddNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNoteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JPanel SearchPanel;
    private javax.swing.JButton btnAddNote;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    
    public JButton getBtnAddNote() {
        return btnAddNote;
    }

    public JLabel getBtnSearch() {
        return btnSearch;
    }

//    public PendingNotesItem getPendingNotesItem1() {
//        return pendingNotesItem1;
//    }

    public JPanel getContentPanel() {
        return ContentPanel;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }
    
    
    
    
}
