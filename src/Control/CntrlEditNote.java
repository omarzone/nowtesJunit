package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.EditNote.EditNote;
import view.PendingNotes.PendingNotesPanel;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
import java.util.Calendar;
import java.util.Date;


public class CntrlEditNote implements ActionListener {

    private Note note;
    private DAONote DaoNote = new DAONote();
    private CntrlMain cntrlMain;
    private CntrlPendingPanel cntrlPendingPanel;
    private EditNote editNotePanel;

    public CntrlEditNote(CntrlMain cntrlMain, EditNote editNotePanel, Note note) {
        System.out.println("Controlador CntrlAddNote inicializado");
        this.cntrlMain = cntrlMain;
        this.editNotePanel = editNotePanel;
        this.note = note;   
        
        setTheme();

        editNotePanel.getBtnCancel().addActionListener(this);
        editNotePanel.getBtnSave().addActionListener(this);

        editNotePanel.getTxtDescripcion().setText(note.getDescription());
        editNotePanel.getTxtTitulo().setText(note.getTitle());
        
        try {
            editNotePanel.getOptionDate().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(note.getDate()));
        } catch (ParseException ex) {
            //
        }
        editNotePanel.getCmbPriority().setSelectedIndex(note.getPriority());
        editNotePanel.getTxtErrTitleField().setText(null);
        editNotePanel.getTxtErrDescriptionField().setText(null);
        editNotePanel.getTxtErrDateField().setText(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (editNotePanel.getBtnCancel() == e.getSource()) {

            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
//            editNotePanel.getTxtDescripcion().setText(null);
//            editNotePanel.getTxtTitulo().setText(null);
//            editNotePanel.getCbEndedTask().setSelected(false);
//            editNotePanel.getOptionDate().setDate(null);
//            editNotePanel.getCmbPriority().setSelectedIndex(0);
//            editNotePanel.getTxtErrTitleField().setText(null);
//            editNotePanel.getTxtErrDescriptionField().setText(null);
//            editNotePanel.getTxtErrDateField().setText(null);

        }

        if (editNotePanel.getBtnSave() == e.getSource()) {
            validateFields(editNotePanel);

        }
    }

    public void validateFields(EditNote editNotePanel) {
        boolean hasTitle = false;
        boolean hasDescription = false;
        boolean hasDeadLine = false;
        String title = "";
        String description = "";
        SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
        int prioritySelected = editNotePanel.getCmbPriority().getSelectedIndex();
        Calendar cal = Calendar.getInstance();
        Date actualDate;
        Date realDate = new Date();
        
        String date = "";

        if (editNotePanel.getTxtTitulo().getText().equals("")) {
            editNotePanel.getTxtErrTitleField().setText("Rellenar campo");
            hasTitle = false;
        } else {
            title = editNotePanel.getTxtTitulo().getText();
            editNotePanel.getTxtErrTitleField().setText(null);
            hasTitle = true;
        }

        if (editNotePanel.getTxtDescripcion().getText().equals("")) {
            editNotePanel.getTxtErrDescriptionField().setText("Rellenar campo");
            hasDescription = false;
        } else {
            description = editNotePanel.getTxtDescripcion().getText();
            editNotePanel.getTxtErrDescriptionField().setText(null);
            hasDescription = true;
        }

        try {
            actualDate = editNotePanel.getOptionDate().getDate();
            date = dcn.format(editNotePanel.getOptionDate().getDate());

            date = dcn.format(editNotePanel.getOptionDate().getDate());
            //System.out.println(date);
            hasDeadLine = true;
            if (date != null) {
                editNotePanel.getTxtErrDateField().setText("");
            }
             if(actualDate.compareTo(realDate) < 0){
                    hasDeadLine = false;
                    editNotePanel.getTxtErrDateField().setText("No ingrese fechas antes de la actual");
                }
        } catch (NullPointerException ex) {
            editNotePanel.getTxtErrDateField().setText("Rellenar campo");
            hasDeadLine = false;
        }

        // System.out.println(date);
        if (hasTitle && hasDescription && hasDeadLine) {

            //System.out.println("Todo Oki para la BD");

            note = new Note(note.getId(),title, description, date, prioritySelected, false);
            String condition;
            condition = " id = " + this.note.getId();
            
            try {
                DaoNote.modify(note, condition);
                //Redibujamos el panel
            PendingNotesPanel newPendingNotesPanel = new PendingNotesPanel();
            cntrlPendingPanel = new CntrlPendingPanel(cntrlMain, newPendingNotesPanel);

            //Cambiamos a la pantalla principal
            cntrlMain.setPendingNotesView(newPendingNotesPanel);
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
            
            }catch(MysqlDataTruncation ex){
                JOptionPane.showMessageDialog(editNotePanel, "El texto del titulo es demasiado grande");
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(editNotePanel, "Hubo un error al modificar la nota");
                System.err.println(ex);
            }
        }
    }
    
    private void setTheme(){
        this.editNotePanel.getLblDescription().setForeground(cntrlMain.getThemeApp().getFONT());
        this.editNotePanel.getRoundedInnerPanel().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.editNotePanel.getLblDate().setForeground(cntrlMain.getThemeApp().getFONT());
        this.editNotePanel.getLblTitle().setForeground(cntrlMain.getThemeApp().getFONT());
        this.editNotePanel.getLblDescription().setForeground(cntrlMain.getThemeApp().getFONT());
        this.editNotePanel.getLblPriority().setForeground(cntrlMain.getThemeApp().getFONT());
        
        if(cntrlMain.getSettingsUser().isThemeDark()){
           this.editNotePanel.getTxtTitulo().setBackground(new Color(48, 49, 52));
           this.editNotePanel.getTxtDescripcion().setBackground(new Color(48, 49, 52));
           this.editNotePanel.getCmbPriority().setBackground(new Color(48, 49, 52));
        }
        
       

        this.editNotePanel.getOptionDate().setOpaque(false);
    }

}
