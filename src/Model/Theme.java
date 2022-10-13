/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class Theme {

    private Color BG;
    private Color TITLE;
    private Color FONT;
    private Color TITLE_APP;
    private Color HEADER_PANEL;
    private Color LOW_STATUS;
    private Color MEDIUM_STATUS;
    private Color HIGHT_STATUS;
    private Color MENU_BG;
    private Color NOTE_BG;
    private Color DARK = new Color(0, 0, 0);
    private Color WHITE = new Color(255, 255, 255);

    public Theme(Color BG, Color TITLE, Color FONT, Color TITLE_APP, Color HEADER_PANEL, Color LOW_STATUS, Color MEDIUM_STATUS, Color HIGHT_STATUS, Color MENU_BG, Color NOTE_BG) {
        this.BG = BG;
        this.TITLE = TITLE;
        this.FONT = FONT;
        this.TITLE_APP = TITLE_APP;
        this.HEADER_PANEL = HEADER_PANEL;
        this.LOW_STATUS = LOW_STATUS;
        this.MEDIUM_STATUS = MEDIUM_STATUS;
        this.HIGHT_STATUS = HIGHT_STATUS;
        this.MENU_BG = MENU_BG;
        this.NOTE_BG = NOTE_BG;
    }

    public Color getBG() {
        return BG;
    }

    public Color getTITLE() {
        return TITLE;
    }

    public Color getFONT() {
        return FONT;
    }

    public Color getTITLE_APP() {
        return TITLE_APP;
    }

    public Color getHEADER_PANEL() {
        return HEADER_PANEL;
    }

    public Color getLOW_STATUS() {
        return LOW_STATUS;
    }

    public Color getMEDIUM_STATUS() {
        return MEDIUM_STATUS;
    }

    public Color getHIGHT_STATUS() {
        return HIGHT_STATUS;
    }

    public Color getMENU_BG() {
        return MENU_BG;
    }

    public Color getNOTE_BG() {
        return NOTE_BG;
    }

    public Color getDARK() {
        return DARK;
    }

    public Color getWHITE() {
        return WHITE;
    }
    
}
