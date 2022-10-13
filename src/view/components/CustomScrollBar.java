/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
/**
 *
 * @author PC
 */
public class CustomScrollBar extends JScrollBar {

    public CustomScrollBar() {
        setUI(new ScrollBarUI());
        setPreferredSize(new Dimension(10, 10));
        setForeground(new Color(63, 109, 217, 100));
        setOpaque(false);
    }
}
