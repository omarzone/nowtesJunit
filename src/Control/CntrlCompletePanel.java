package Control;

import DAONote.DAONote;
import Model.Note;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.CompletedNotes.CompleteNotesItem;
import view.CompletedNotes.CompleteNotesPanel;
import view.PendingNotes.PendingNotesItem;
import view.components.CustomScrollBar;
import view.components.NoData;


public class CntrlCompletePanel {
    private CompleteNotesPanel completeNotesView;
    private CntrlMain cntrlMain;
    private CntrlPendingNotesItem cntrlPendingNotesItem;
    private ArrayList<Note> notesList = new ArrayList<Note>();
    

    public CntrlCompletePanel(CntrlMain cntrlMain, CompleteNotesPanel completeNotesView) {
        System.out.println("Controlador CntrlPendingPanel inicializado");
        this.completeNotesView = completeNotesView;
        this.cntrlMain = cntrlMain;

        //Nuevo
        generateData();
        
    }


    public void generateData() {
        //Realizamos la consulta a la base de datos
        DAONote daoNote = new DAONote();
        try {
            if(cntrlMain.getSettingsUser().isPriorityOrder()){
                notesList = daoNote.queryDate("status = true");
            }else{
                notesList = daoNote.query("status = true");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Creamos el scroll y seteamos propiedades
        JScrollPane scrollListNotes = new JScrollPane();
        scrollListNotes.setOpaque(false);
        scrollListNotes.getViewport().setOpaque(false);
        scrollListNotes.setViewportBorder(null);
        scrollListNotes.setBorder(null);
        scrollListNotes.setVerticalScrollBar(new CustomScrollBar());
        scrollListNotes.getVerticalScrollBar().setUnitIncrement(16);

        //Creamos el Panel y el gridLayout  que estara dentro del scroll
        JPanel gridNotePanel = new JPanel();
        gridNotePanel.setOpaque(false);
        GridLayout gridLayoutNotes = new GridLayout();
        gridLayoutNotes.setColumns(1);
        gridLayoutNotes.setVgap(15);

        //Validacion para evitar que las notas se hagan muy grandes cuando son pocas
        if (notesList.size() < 5) {
            gridLayoutNotes.setRows(notesList.size() + 3);
            scrollListNotes.setHorizontalScrollBarPolicy(scrollListNotes.HORIZONTAL_SCROLLBAR_NEVER);
            scrollListNotes.setVerticalScrollBarPolicy(scrollListNotes.VERTICAL_SCROLLBAR_NEVER);
        } else {
            gridLayoutNotes.setRows(notesList.size());
        }

        gridNotePanel.setLayout(gridLayoutNotes);

        //Por cada item en el arraylist, agregamos un row al gridNotePanel
        for (Note note : notesList) {

            CompleteNotesItem completeNoteItemView = new CompleteNotesItem();
            completeNoteItemView.setBackground(cntrlMain.getThemeApp().getNOTE_BG());
            CntrlCompleteNotesItem cntrlPendingNotesItem = new CntrlCompleteNotesItem(cntrlMain, completeNoteItemView, note);
            gridNotePanel.add(completeNoteItemView);

        }

        //seteamos la vista que estara dentro del scroll
        scrollListNotes.setViewportView(gridNotePanel);

        //Agregamos el scroll al ContentPanel
        if (notesList.size() < 1) {
            NoData noDataPanel = new NoData();
            setNoDataTheme(noDataPanel, "No se han encontrado notas");
            completeNotesView.getContentPanel().add(noDataPanel);

        } else {
            completeNotesView.getContentPanel().add(scrollListNotes);
        }

    }

    public void setCompleteNotesView(CompleteNotesPanel pendingNotesView) {
        this.completeNotesView = pendingNotesView;
    }

   

    public void setNoDataTheme(NoData noDataPanel, String message) {

        noDataPanel.setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        noDataPanel.getRoundedBorders1().setBackground(cntrlMain.getThemeApp().getNOTE_BG());
        noDataPanel.getLblMessage().setText(message);
        noDataPanel.getLblMessage().setForeground(cntrlMain.getThemeApp().getFONT());
    }
}
