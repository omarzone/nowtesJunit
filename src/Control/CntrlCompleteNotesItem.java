package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.CompletedNotes.CompleteNotesItem;
import view.CompletedNotes.CompleteNotesPanel;

import view.EditNote.EditNote;

import view.ViewCompleteNote.ViewCompleteNote;

public class CntrlCompleteNotesItem implements MouseListener {

    private CntrlMain cntrlMain;
    private EditNote editNotePanel = new EditNote();
    private CompleteNotesItem completeNotesItemView;
    private Note note;
    private ViewCompleteNote viewCompleteNote = new ViewCompleteNote();
    private CntrlViewCompleteNote cntrlViewCompleteNote;
    private CntrlEditNote cntrlEditNote;

    public CntrlCompleteNotesItem(CntrlMain cntrlMain,CompleteNotesItem completeNotesItemView, Note note) {
        System.out.println("Controlador CntrlCompleteNotesItem inicializado");
        this.cntrlMain = cntrlMain;
        this.completeNotesItemView = completeNotesItemView;
        this.note = note;
        //Seteamos data en la vista
        setData();
        //Seteamos el tema de la aplicación
        setTheme();

        //Inicializamos los listeners
        
        completeNotesItemView.getBtnViewNote().addMouseListener(this);
        completeNotesItemView.getBtnDeleteNote().addMouseListener(this);
        

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
        

        if (completeNotesItemView.getBtnViewNote() == e.getSource()) {

            if (cntrlViewCompleteNote == null) {
                cntrlViewCompleteNote = new CntrlViewCompleteNote(cntrlMain, viewCompleteNote, note, this);
            }
            cntrlMain.getMainView().getMainContent().removeAll();
            cntrlMain.getMainView().getMainContent().add(viewCompleteNote);
            cntrlMain.getMainView().getMainContent().repaint();
            cntrlMain.getMainView().getMainContent().revalidate();
            //System.out.println("Accion del boton ViewNote: " + pendingNotesItemView.getNote_title().getText());

        }

        if (completeNotesItemView.getBtnDeleteNote() == e.getSource()) {

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
                CompleteNotesPanel newCompleteNotesPanel = new CompleteNotesPanel();
                cntrlMain.setCntrlCompletePanel(new CntrlCompletePanel(cntrlMain, newCompleteNotesPanel));

                cntrlMain.setCompleteNotesView(newCompleteNotesPanel);
                cntrlMain.switchPanels(cntrlMain.getCompleteNotesView());
            }

            //alertDialog.setVisible(true);
            //alertDialog.setLocationRelativeTo(null);
            //System.out.println("Accion del boton DeleteNote: " + pendingNotesItemView.getNote_title().getText());;
        }
        
    }

    public void setData() {
        completeNotesItemView.getNote_title().setText(note.getTitle());
        completeNotesItemView.getNote_description().setText(note.getDescription());

        if (note.isStatus()) {
            completeNotesItemView.getNote_status().setText("Finalizado");
            completeNotesItemView.getNote_status().setBackground(new Color(245, 223, 83));
        } else {
            completeNotesItemView.getNote_status().setText("En proceso");
            completeNotesItemView.getNote_status().setBackground(new Color(153, 212, 172));
        }

        completeNotesItemView.getNote_date().setText(note.getDate());
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
        this.completeNotesItemView.getjScrollPane1().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.completeNotesItemView.getNote_date().setBackground(cntrlMain.getThemeApp().getLOW_STATUS());
        this.completeNotesItemView.getNote_status().setBackground(cntrlMain.getThemeApp().getLOW_STATUS());
        this.completeNotesItemView.getjScrollPane1().setOpaque(false);
        this.completeNotesItemView.getjScrollPane1().getViewport().setOpaque(false);
        this.completeNotesItemView.getjScrollPane1().setHorizontalScrollBarPolicy(this.completeNotesItemView.getjScrollPane1().HORIZONTAL_SCROLLBAR_NEVER);
        this.completeNotesItemView.getjScrollPane1().setVerticalScrollBarPolicy(this.completeNotesItemView.getjScrollPane1().VERTICAL_SCROLLBAR_NEVER);
        this.completeNotesItemView.getNote_description().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.completeNotesItemView.getLblAction().setForeground(cntrlMain.getThemeApp().getFONT());
        this.completeNotesItemView.getLblDate().setForeground(cntrlMain.getThemeApp().getFONT());
        this.completeNotesItemView.getLblStatus().setForeground(cntrlMain.getThemeApp().getFONT());

        if (cntrlMain.getSettingsUser().isThemeDark()) {
            this.completeNotesItemView.getNote_title().setForeground(cntrlMain.getThemeApp().getWHITE());
            this.completeNotesItemView.getNote_description().setForeground(cntrlMain.getThemeApp().getWHITE());
            
            this.completeNotesItemView.getBtnViewNote().setIcon(new ImageIcon(getClass().getResource("/resources/view_black.png")));
        }

    }
}
