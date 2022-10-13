package Control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;



import view.PendingNotes.SearchPanel;


public class CntrlSearchPanel implements ActionListener, MouseListener {

   
    
    private CntrlMain cntrlMain;
    private SearchPanel searchPanelView;
    private CntrlPendingNotesItem cntrlPendingNotesItem;
    
    
    

    public CntrlSearchPanel(CntrlMain cntrlMain, SearchPanel searchPanelView) {
        System.out.println("Controlador CntrlSearchPanel inicializado");
        
        this.cntrlMain = cntrlMain;
        this.searchPanelView = searchPanelView;
        
        searchPanelView.getBtnBack().addMouseListener(this);
        //Nuevo
        
        
        if(cntrlMain.getSettingsUser().isThemeDark()){
            searchPanelView.getBtnBack().setIcon(new ImageIcon(getClass().getResource("/resources/arrow_white.png")));
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        
    }

   

    

  

    @Override
    public void mouseClicked(MouseEvent e) {
         if (searchPanelView.getBtnBack() == e.getSource()) {
                cntrlMain.switchPanels(cntrlMain.getPendingNotesPanel());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

   

}
