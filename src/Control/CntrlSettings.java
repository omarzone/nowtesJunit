package Control;

import DAONote.DAOSettings;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CntrlSettings implements ActionListener {

    private CntrlMain cntrlMain;
    private DAOSettings daoSetting = new DAOSettings();
    private int MensajeEmergenteSolucion = 0;
    public CntrlSettings(CntrlMain cntrlMain) {
        System.out.println("Controlador CntrlSettings inicializado");
        this.cntrlMain = cntrlMain;

        cntrlMain.getSettingsView().getBtnDeleteData().addActionListener(this);
        cntrlMain.getSettingsView().getBtnDarkTheme().addActionListener(this);
        cntrlMain.getSettingsView().getCbmPriority().addActionListener(this);

        cntrlMain.getSettingsView().getBtnDarkTheme().setSelected(cntrlMain.getSettingsUser().isThemeDark());

        //seteamos el Texto del darkThemeSettings
        if (cntrlMain.getSettingsUser().isThemeDark()) {
            cntrlMain.getSettingsView().getBtnDarkTheme().setText("Activado");
        } else {
            cntrlMain.getSettingsView().getBtnDarkTheme().setText("Desactivado");
        }

        //Seteamos el valor del priority
        cntrlMain.getSettingsView().getCbmPriority().setSelectedIndex(cntrlMain.getSettingsUser().getPriorityOrder());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (cntrlMain.getSettingsView().getBtnDeleteData() == e.getSource()) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "¿Esta seguro de borrar todos los datos?\n (Es necesario reiniciar la aplicacion para ver los cambios)", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                
                //Realizamos la consulta para borrar todos los elementos
                try {
                    daoSetting.DeleteAll();
                } catch (Exception exep) {
                    exep.printStackTrace();
                }

            }
        }

        if (cntrlMain.getSettingsView().getBtnDarkTheme() == e.getSource()) {
            JOptionPane.showMessageDialog(null,"Es necesario reiniciar la aplicacion para ver los cambios");
            if (cntrlMain.getSettingsView().getBtnDarkTheme().isSelected()) {
                cntrlMain.getSettingsView().getBtnDarkTheme().setText("Activado");

                try {
                    daoSetting.modifySpecific("darktheme", cntrlMain.getSettingsView().getBtnDarkTheme().isSelected());
                } catch (SQLException ex) {
                    System.out.println(ex);
                }

            } else {
                cntrlMain.getSettingsView().getBtnDarkTheme().setText("Desactivado");
                try {
                    daoSetting.modifySpecific("darktheme", cntrlMain.getSettingsView().getBtnDarkTheme().isSelected());
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        }

        if (cntrlMain.getSettingsView().getCbmPriority() == e.getSource()) {
            
            
            if (MensajeEmergenteSolucion > 0){
                JOptionPane.showMessageDialog(null,"Es necesario reiniciar la aplicacion para ver los cambios");
                
            }
            MensajeEmergenteSolucion++;
           boolean value;
           if(cntrlMain.getSettingsView().getCbmPriority().getSelectedIndex() == 0){
               value = false;
           }else{
               value= true;
           }
            try {
                daoSetting.modifySpecific("priorityorder",value);
                
               
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }

    }

}
