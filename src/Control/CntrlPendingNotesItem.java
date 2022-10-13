package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.CompletedNotes.CompleteNotesPanel;
import view.PendingNotes.PendingNotesItem;
import view.EditNote.EditNote;
import view.PendingNotes.PendingNotesPanel;
import view.ViewCompleteNote.ViewCompleteNote;

public class CntrlPendingNotesItem implements MouseListener {

    private CntrlMain cntrlMain;
    private EditNote editNotePanel = new EditNote();
    private PendingNotesItem pendingNotesItemView;
    private Note note;
    private ViewCompleteNote viewCompleteNote = new ViewCompleteNote();
    private CntrlViewCompleteNote cntrlViewCompleteNote;
    private CntrlEditNote cntrlEditNote;

    public CntrlPendingNotesItem(CntrlMain cntrlMain, PendingNotesItem pendingNotesItemView, Note note) {
        System.out.println("Controlador CntrlPendingNotesItem inicializado");
        this.cntrlMain = cntrlMain;
        this.pendingNotesItemView = pendingNotesItemView;
        this.note = note;
        //Seteamos data en la vista
        setData();
        //Seteamos el tema de la aplicación
        setTheme();

        //Inicializamos los listeners
        pendingNotesItemView.getBtnEditNote().addMouseListener(this);
        pendingNotesItemView.getBtnViewNote().addMouseListener(this);
        pendingNotesItemView.getBtnDeleteNote().addMouseListener(this);
        pendingNotesItemView.getNote_status().addMouseListener(this);

    }

    public EditNote getEditNotePanel() {
        return editNotePanel;
    }

    public void setCntrlEditNote(CntrlEditNote cntrlEditNote) {
        this.cntrlEditNote = cntrlEditNote;
    }

    public CntrlEditNote getCntrlEditNote() {
        return cntrlEditNote;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (pendingNotesItemView.getBtnEditNote() == e.getSource()) {

            if (cntrlEditNote == null) {
                cntrlEditNote = new CntrlEditNote(cntrlMain, editNotePanel, note);
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(editNotePanel);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();

        }

        if (pendingNotesItemView.getBtnViewNote() == e.getSource()) {

            if (cntrlViewCompleteNote == null) {
                cntrlViewCompleteNote = new CntrlViewCompleteNote(cntrlMain, viewCompleteNote, note, this);
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(viewCompleteNote);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();
            //System.out.println("Accion del boton ViewNote: " + pendingNotesItemView.getNote_title().getText());

        }

        if (pendingNotesItemView.getBtnDeleteNote() == e.getSource()) {

            String condition;
            condition = " id = " + note.getId();

            int dialogResult = JOptionPane.showConfirmDialog(null, "¿Esta seguro de que quiere borrar esta nota?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {

                //Realizamos la consulta para borrar el elemento
                DAONote daoCliente = new DAONote();
                try {
                    daoCliente.delete(condition);
                } catch (Exception exep) {
                    exep.printStackTrace();
                }

                //Regeneramos el panel
                PendingNotesPanel newPendingNotesPanel = new PendingNotesPanel();
                cntrlMain.setCntrlPendingPanel(new CntrlPendingPanel(cntrlMain, newPendingNotesPanel));

                cntrlMain.setPendingNotesView(newPendingNotesPanel);
                cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
            }

            //alertDialog.setVisible(true);
            //alertDialog.setLocationRelativeTo(null);
            //System.out.println("Accion del boton DeleteNote: " + pendingNotesItemView.getNote_title().getText());;
        }
        if (pendingNotesItemView.getNote_status() == e.getSource()) {
            String condition;
            condition = "id = " + note.getId();
            //Realizamos la consulta para modificar el estatus

            DAONote daoCliente = new DAONote();
            try {
                daoCliente.modifyStatus(true, condition);
            } catch (Exception exep) {
                exep.printStackTrace();
            }

            //Regeneramos el pending panel
            PendingNotesPanel newPendingNotesPanel = new PendingNotesPanel();
            cntrlMain.setCntrlPendingPanel(new CntrlPendingPanel(cntrlMain, newPendingNotesPanel));
            
            //Regenerar el historial panel
            CompleteNotesPanel newCompleteNotesPanel = new CompleteNotesPanel();
            cntrlMain.setCntrlCompletePanel(new CntrlCompletePanel(cntrlMain, newCompleteNotesPanel));
            cntrlMain.setCompleteNotesView(newCompleteNotesPanel);

            cntrlMain.setPendingNotesView(newPendingNotesPanel);
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());

        }
    }

    public void setData() {
        pendingNotesItemView.getNote_title().setText(note.getTitle());
        pendingNotesItemView.getNote_description().setText(note.getDescription());

        if (note.isStatus()) {
            pendingNotesItemView.getNote_status().setText("Finalizado");
            pendingNotesItemView.getNote_status().setBackground(new Color(245, 223, 83));
        } else {
            pendingNotesItemView.getNote_status().setText("En proceso");
            pendingNotesItemView.getNote_status().setBackground(new Color(153, 212, 172));
        }

        pendingNotesItemView.getNote_date().setText(note.getDate());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTheme() {
        //Cambios relacionados con el tema de la aplicación de la vista principal
        this.pendingNotesItemView.getjScrollPane1().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        
        if(note.isStatus()){
            this.pendingNotesItemView.getNote_status().setBackground(cntrlMain.getThemeApp().getLOW_STATUS());
        }else{
           this.pendingNotesItemView.getNote_status().setBackground(cntrlMain.getThemeApp().getMEDIUM_STATUS());
        }
        
        this.pendingNotesItemView.getNote_date().setBackground(cntrlMain.getThemeApp().getLOW_STATUS());
        this.pendingNotesItemView.getjScrollPane1().setOpaque(false);
        this.pendingNotesItemView.getjScrollPane1().getViewport().setOpaque(false);
        this.pendingNotesItemView.getjScrollPane1().setHorizontalScrollBarPolicy(this.pendingNotesItemView.getjScrollPane1().HORIZONTAL_SCROLLBAR_NEVER);
        this.pendingNotesItemView.getjScrollPane1().setVerticalScrollBarPolicy(this.pendingNotesItemView.getjScrollPane1().VERTICAL_SCROLLBAR_NEVER);
        this.pendingNotesItemView.getNote_description().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.pendingNotesItemView.getLblAction().setForeground(cntrlMain.getThemeApp().getFONT());
        this.pendingNotesItemView.getLblDate().setForeground(cntrlMain.getThemeApp().getFONT());
        this.pendingNotesItemView.getLblStatus().setForeground(cntrlMain.getThemeApp().getFONT());

        if (cntrlMain.getSettingsUser().isThemeDark()) {
            this.pendingNotesItemView.getNote_title().setForeground(cntrlMain.getThemeApp().getWHITE());
            this.pendingNotesItemView.getNote_description().setForeground(cntrlMain.getThemeApp().getWHITE());
            this.pendingNotesItemView.getBtnEditNote().setIcon(new ImageIcon(getClass().getResource("/resources/edit_black.png")));
            this.pendingNotesItemView.getBtnViewNote().setIcon(new ImageIcon(getClass().getResource("/resources/view_black.png")));
        }

    }
}
