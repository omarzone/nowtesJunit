package view.components;

import javax.swing.JLabel;

public class NoData extends javax.swing.JPanel {


    public NoData() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundedBorders1 = new view.components.RoundedBorders();
        lblMessage = new javax.swing.JLabel();
        iconNoData = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMessage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(153, 153, 153));
        lblMessage.setText("No se han encontrado resultados");
        roundedBorders1.add(lblMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        iconNoData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/noData.png"))); // NOI18N
        roundedBorders1.add(iconNoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 470, 290));

        add(roundedBorders1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 560));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconNoData;
    private javax.swing.JLabel lblMessage;
    private view.components.RoundedBorders roundedBorders1;
    // End of variables declaration//GEN-END:variables

    public JLabel getIconNoData() {
        return iconNoData;
    }

    public void setIconNoData(JLabel iconNoData) {
        this.iconNoData = iconNoData;
    }

    public JLabel getLblMessage() {
        return lblMessage;
    }

    public void setLblMessage(JLabel lblMessage) {
        this.lblMessage = lblMessage;
    }

    public RoundedBorders getRoundedBorders1() {
        return roundedBorders1;
    }

    public void setRoundedBorders1(RoundedBorders roundedBorders1) {
        this.roundedBorders1 = roundedBorders1;
    }

    
}
