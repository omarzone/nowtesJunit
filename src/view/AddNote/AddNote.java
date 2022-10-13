package view.AddNote;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import view.components.RoundedBorders;


public class AddNote extends javax.swing.JPanel {

    public AddNote() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        JPanelAddNote = new javax.swing.JPanel();
        HeadPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        roundedInnePanel = new view.components.RoundedBorders();
        lblPriority = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JTextField();
        cmbPriority = new javax.swing.JComboBox<>();
        optionDate = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtErrTitleField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtErrDescriptionField = new javax.swing.JLabel();
        txtErrDateField = new javax.swing.JLabel();

        setOpaque(false);

        JPanelAddNote.setBackground(new java.awt.Color(130, 156, 188));
        JPanelAddNote.setOpaque(false);
        JPanelAddNote.setPreferredSize(new java.awt.Dimension(1037, 714));
        JPanelAddNote.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadPanel.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Añadir Nota");

        javax.swing.GroupLayout HeadPanelLayout = new javax.swing.GroupLayout(HeadPanel);
        HeadPanel.setLayout(HeadPanelLayout);
        HeadPanelLayout.setHorizontalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(841, Short.MAX_VALUE))
        );
        HeadPanelLayout.setVerticalGroup(
            HeadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        JPanelAddNote.add(HeadPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1020, -1));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setOpaque(false);

        lblPriority.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPriority.setForeground(new java.awt.Color(0, 0, 0));
        lblPriority.setText("Prioridad:");
        roundedInnePanel.add(lblPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Título:");
        roundedInnePanel.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(0, 0, 0));
        lblDescription.setText("Descripción:");
        roundedInnePanel.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("Fecha:");
        roundedInnePanel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(130, 156, 188));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        jScrollPane2.setViewportView(txtDescripcion);

        roundedInnePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 680, 230));

        txtTitulo.setBackground(new java.awt.Color(130, 156, 188));
        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 72, 126), 1, true));
        roundedInnePanel.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 680, 40));

        cmbPriority.setBackground(new java.awt.Color(130, 156, 188));
        cmbPriority.setForeground(new java.awt.Color(255, 255, 255));
        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "baja", "media", "alta" }));
        cmbPriority.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 72, 126), 1, true));
        roundedInnePanel.add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        optionDate.setBackground(new java.awt.Color(130, 156, 188));
        roundedInnePanel.add(optionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, -1));

        btnGuardar.setBackground(new java.awt.Color(31, 72, 126));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedInnePanel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 80, 30));

        btnCancelar.setBackground(new java.awt.Color(254, 91, 107));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(112, 112, 112), 1, true));
        roundedInnePanel.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, 30));

        txtErrTitleField.setForeground(new java.awt.Color(255, 51, 51));
        roundedInnePanel.add(txtErrTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 90, 20));
        roundedInnePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 50, 20));

        txtErrDescriptionField.setForeground(new java.awt.Color(255, 0, 0));
        roundedInnePanel.add(txtErrDescriptionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 90, 30));

        txtErrDateField.setForeground(new java.awt.Color(255, 0, 0));
        roundedInnePanel.add(txtErrDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 390, 20));

        javax.swing.GroupLayout ContentPanelLayout = new javax.swing.GroupLayout(ContentPanel);
        ContentPanel.setLayout(ContentPanelLayout);
        ContentPanelLayout.setHorizontalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundedInnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ContentPanelLayout.setVerticalGroup(
            ContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedInnePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        JPanelAddNote.add(ContentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1020, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanelAddNote, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPanelAddNote, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    public javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel HeadPanel;
    private javax.swing.JPanel JPanelAddNote;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblPriority;
    private javax.swing.JLabel lblTitle;
    private com.toedter.calendar.JDateChooser optionDate;
    private view.components.RoundedBorders roundedInnePanel;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JLabel txtErrDateField;
    private javax.swing.JLabel txtErrDescriptionField;
    private javax.swing.JLabel txtErrTitleField;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration                   

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public JButton getBtnGuardar() {
        return btnGuardar;
    }

    

    public JComboBox<String> getCmbPriority() {
        return cmbPriority;
    }

    public JDateChooser getOptionDate() {
        return optionDate;
    }

    public JTextArea getTxtDescripcion() {
        return txtDescripcion;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public JLabel getTxtErrDateField() {
        return txtErrDateField;
    }

    public JLabel getTxtErrDescriptionField() {
        return txtErrDescriptionField;
    }

    public JLabel getTxtErrTitleField() {
        return txtErrTitleField;
    }

    public RoundedBorders getRoundedInnerPanel() {
        return roundedInnePanel;
    }

    public JLabel getLblDate() {
        return lblDate;
    }

    public JLabel getLblDescription() {
        return lblDescription;
    }

    public JLabel getLblPriority() {
        return lblPriority;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    

    
    

}
