/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Model.Theme;
import java.awt.Color;

/**
 *
 * @author PC
 */
public class ThemeData {

    private static final Color DARK = new Color(0, 0, 0);
    private static final Color WHITE = new Color(255, 255, 255);

    private static final Color LIGHT_BG = new Color(130, 156, 188);
    private static final Color LIGHT_FONT_TITLE = new Color(255, 255, 255);
    private static final Color LIGHT_FONT = new Color(31, 72, 126);
    private static final Color LIGHT_TITLE_APP = new Color(255, 255, 255);
    private static final Color LIGHT_HEADER_PANEL = new Color(98, 144, 200);
    private static final Color LIGHT_LOW_STATUS = new Color(153, 212, 172);
    private static final Color LIGHT_MEDIUM_STATUS = new Color(245, 223, 83);
    private static final Color LIGHT_HIGHT_STATUS = new Color(226, 26, 26);
    private static final Color LIGHT_MENU_BG = new Color(255, 255, 255);
    private static final Color LIGHT_NOTE_BG = new Color(255, 255, 255);

    private static final Color DARK_BG = new Color(18, 18, 18);
    private static final Color DARK_FONT_TITLE = new Color(29, 52, 97);
    private static final Color DARK_FONT = new Color(177, 177, 177);
    private static final Color DARK_TITLE_APP = new Color(227, 176, 36);
    private static final Color DARK_HEADER_PANEL = new Color(0, 0, 0);
    private static final Color DARK_LOW_STATUS = new Color(232, 170, 236);
    private static final Color DARK_MEDIUM_STATUS = new Color(255, 145, 0);
    private static final Color DARK_HIGHT_STATUS = new Color(229, 69, 69);
    private static final Color DARK_MENU_BG = new Color(0, 0, 0);
    private static final Color DARK_NOTE_BG = new Color(32, 32, 32);

    static Theme lightTheme = new Theme(LIGHT_BG, LIGHT_FONT_TITLE, LIGHT_FONT, LIGHT_TITLE_APP, LIGHT_HEADER_PANEL, LIGHT_LOW_STATUS, LIGHT_MEDIUM_STATUS, LIGHT_HIGHT_STATUS,LIGHT_MENU_BG,LIGHT_NOTE_BG);

    static Theme darkTheme = new Theme(DARK_BG, DARK_FONT_TITLE, DARK_FONT, DARK_TITLE_APP, DARK_HEADER_PANEL, DARK_LOW_STATUS, DARK_MEDIUM_STATUS, DARK_HIGHT_STATUS,DARK_MENU_BG,DARK_NOTE_BG);

    public Theme getLightTheme() {
        return lightTheme;
    }

    public Theme getDarkTheme() {
        return darkTheme;
    }

}
