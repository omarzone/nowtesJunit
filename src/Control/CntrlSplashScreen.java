/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainView;
import view.SplashScreen.Splash;
import Control.CntrlMain;

/**
 *
 * @author PC GOOSE
 */
public class CntrlSplashScreen implements Runnable{
    
    private Thread tiempo = null;
    private Splash splashScreen;
    private CntrlMain cntrlMain;
    
    public CntrlSplashScreen(Splash splashScreen, CntrlMain cntrlMain){
        this.splashScreen = splashScreen;
        this.cntrlMain = cntrlMain;
        splashScreen.setLocationRelativeTo(null);
        splashScreen.setVisible(true);
        tiempo = new Thread(this);
        tiempo.start();
    }

    @Override
    public void run() {
       try {
                Thread.sleep(2500);
                
                cntrlMain.getMainView().setVisible(true);
                cntrlMain.getMainView().setLocationRelativeTo(null);
                this.splashScreen.dispose();
            } catch (InterruptedException ex) {
                Logger.getLogger(CntrlSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
