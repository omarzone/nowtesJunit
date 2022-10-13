package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AlertDialog.AlertDialog;


public class CntrlAlertDialog implements ActionListener {
    
    
    private AlertDialog alertDialog;
    public CntrlAlertDialog( AlertDialog alertDialog ) {
       System.out.println("Controlador CntrlAlertDialog inicializado");
       this.alertDialog = alertDialog;

        alertDialog.getBtnCancel().addActionListener(this);
        alertDialog.getBtnAcept().addActionListener(this);
        

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (alertDialog.getBtnCancel() == e.getSource()) {
            alertDialog.setVisible(false);
            alertDialog.dispose();
            System.out.println("Cancelado");
        }
        
        if (alertDialog.getBtnAcept() == e.getSource()) {
            alertDialog.setVisible(false);
            alertDialog.dispose();
            System.out.println("Aceptado");
        }
        
    }
    
}
