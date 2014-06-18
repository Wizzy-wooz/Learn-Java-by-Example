/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author VodzianovaE
 */
public class StandardColorSelector extends JPanel  
{  
    private String names[] = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",  
                              "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};    
    private Color colors[] = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green, Color.lightGray,  
                              Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};    
    private JComboBox selector = new JComboBox(names);  
      
    /** Creates a new instance of StandardColorSelector */  
    public StandardColorSelector()  
    {  
        selector.setEditable(false);  
        selector.setSelectedIndex(0);   // Default selection is black  
        add(selector);  
    }  
      
    public Color getSelectedColor()  
    {  
        return colors[selector.getSelectedIndex()];  
    }  
  
    // Requires an integer parameter between 0 and 12 inclusive  
    public void setDefaultSelection(int selection)  
    {  
        selector.setSelectedIndex(selection);  
    }  
      
}   

