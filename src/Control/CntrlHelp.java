
package Control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URISyntaxException;


public class CntrlHelp implements MouseListener{
    
    CntrlMain cntrlMain;
    
    public CntrlHelp(CntrlMain cntrlMain){
        System.out.println("Controlador CntrlHelp inicializado");
        this.cntrlMain = cntrlMain;
        
        
        cntrlMain.getHelpView().getBtnVideo().addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(cntrlMain.getHelpView().getBtnVideo() == e.getSource()){
            
            if(java.awt.Desktop.isDesktopSupported()){
                java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
                
                if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                    
                    try{
                        java.net.URI uri = new java.net.URI("https://www.youtube.com/watch?v=aeETyNTebnA&feature=youtu.be");
                        desktop.browse(uri);
                    }catch(URISyntaxException | IOException ex){}
                    
                }
                
            }
            
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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
