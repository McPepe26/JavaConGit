/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ja-za
 */
public class ElementoListaLabel extends JLabel implements ListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i, boolean bln, boolean bln1) {
        setIcon(new ImageIcon(getClass().getResource("/Img/document.png")));
        setBackground(jlist.getBackground());
        setFont(jlist.getFont());
        setForeground(jlist.getForeground());
        setEnabled(jlist.isEnabled());
        setOpaque(true);
        setText((String)e);
        
        if(bln){
            setBackground(new Color(75,110,175));
            setForeground(new Color(187,187,187));
        }
        
        
        return this;
    }
    
}
