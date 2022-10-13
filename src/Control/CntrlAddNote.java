package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import view.AddNote.AddNote;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import view.PendingNotes.PendingNotesPanel;
import com.mysql.cj.jdbc.exceptions.MysqlDataTruncation;
public class CntrlAddNote implements ActionListener {
    
    private Note note;
    private DAONote DaoNote = new DAONote();
    private CntrlMain cntrlMain;
    private CntrlPendingPanel cntrlPendingPanel;
    private AddNote addNotePanel;
    
    public CntrlAddNote (CntrlPendingPanel cntrlPendingPanel, CntrlMain cntrlMain){
        
        System.out.println("Controlador CntrlAddNote inicializado");
        this.cntrlMain = cntrlMain;
        this.cntrlPendingPanel = cntrlPendingPanel;
        this.addNotePanel = cntrlPendingPanel.getAddNotePanel();
        setTheme();
        
        addNotePanel.getBtnCancelar().addActionListener(this);
        addNotePanel.getBtnGuardar().addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(addNotePanel.getBtnCancelar() == e.getSource()){
            
            cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
            //System.out.println("Acción Cancelar - Cambio a pantalla Home");
            
            
            addNotePanel.getTxtDescripcion().setText(null);
            addNotePanel.getTxtTitulo().setText(null);
            addNotePanel.getOptionDate().setDate(null);
            addNotePanel.getCmbPriority().setSelectedIndex(0);
            addNotePanel.getTxtErrTitleField().setText(null);
            addNotePanel.getTxtErrDescriptionField().setText(null);
            addNotePanel.getTxtErrDateField().setText(null);
            
      }
      if(addNotePanel.getBtnGuardar() == e.getSource()){
          validateFields(addNotePanel);
           
      }
    }
    
    
    public void validateFields(AddNote addNotePanel){
        
        int prioritySelected =  addNotePanel.getCmbPriority().getSelectedIndex();
        
          
          
          
            //Validate Title
            boolean hasTitle = false;
            String title = "";

            if (addNotePanel.getTxtTitulo().getText().equals("")) {
                addNotePanel.getTxtErrTitleField().setText("Rellenar campo");
                hasTitle = false;
            } else {
                title = addNotePanel.getTxtTitulo().getText();
                addNotePanel.getTxtErrTitleField().setText(null);
                hasTitle = true;
            }

            //ValidateDescription
            boolean hasDescription = false;
            String description = "";

            if (addNotePanel.getTxtDescripcion().getText().equals("")) {
                addNotePanel.getTxtErrDescriptionField().setText("Rellenar campo");
                hasDescription = false;
            } else {
                description = addNotePanel.getTxtDescripcion().getText();
                addNotePanel.getTxtErrDescriptionField().setText(null);
                hasDescription = true;
            }

            //ValidateDate
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String date = "";
            Calendar cal = Calendar.getInstance();
            Date actualDate;
            Date realDate = new Date();
           
            
            boolean hasDeadLine = false;

            try {
                actualDate = addNotePanel.getOptionDate().getDate();
                date = dateFormat.format(addNotePanel.getOptionDate().getDate());
                hasDeadLine = true;
                if (date != null) {
                    addNotePanel.getTxtErrDateField().setText("");
                }
                if(actualDate.compareTo(realDate) < 0){
                    hasDeadLine = false;
                    addNotePanel.getTxtErrDateField().setText("No ingrese fechas antes de la actual");
                 }
            } catch (NullPointerException ex) {
                addNotePanel.getTxtErrDateField().setText("Rellenar campo");
                hasDeadLine = false;
            }
            
            //Validar que no se ponga una fecha antes de la actual.
            
            
            

           //System.out.println(date);
           
           if(hasTitle && hasDescription && hasDeadLine){
               note = new Note(title, description, date, prioritySelected, false);
               try{
                    DaoNote.add(note);
                    
                    PendingNotesPanel newPendingNotesPanel = new PendingNotesPanel();
                    cntrlPendingPanel = new CntrlPendingPanel(cntrlMain, newPendingNotesPanel);
                    
                    cntrlMain.setPendingNotesView(newPendingNotesPanel);
                    cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
                    
               }catch(MysqlDataTruncation ex){
                   JOptionPane.showMessageDialog(addNotePanel, "El titulo ingresado es demasiado largo");
               }catch(SQLException ex){
                   JOptionPane.showMessageDialog(addNotePanel, "Hubo un error con el guardado de la nota");
               }
               
           }
    }
    
    
    private void setTheme(){
        this.addNotePanel.getRoundedInnerPanel().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        this.addNotePanel.getLblDate().setForeground(cntrlMain.getThemeApp().getFONT());
        this.addNotePanel.getLblTitle().setForeground(cntrlMain.getThemeApp().getFONT());
        this.addNotePanel.getLblDescription().setForeground(cntrlMain.getThemeApp().getFONT());
        this.addNotePanel.getLblPriority().setForeground(cntrlMain.getThemeApp().getFONT());
        
        if(cntrlMain.getSettingsUser().isThemeDark()){
            this.addNotePanel.getTxtTitulo().setBackground(new Color(48, 49, 52));
            this.addNotePanel.getTxtDescripcion().setBackground(new Color(48, 49, 52));
            this.addNotePanel.getCmbPriority().setBackground(new Color(48, 49, 52));
        }
       
       
        this.addNotePanel.getOptionDate().setOpaque(false);
    }
    
    
    
    
}


