package test;


import Control.CntrlMain;
import Control.CntrlSplashScreen;
import view.MainView;
import view.SplashScreen.Splash;


public class Test {

    public static void main(String[] args) {
       MainView mainView = new MainView();
       CntrlMain cntrlMain = new CntrlMain(mainView);
       Splash splash = new Splash();
       CntrlSplashScreen cntrlSplash = new CntrlSplashScreen(splash, cntrlMain);
       
       
    }
    
}
