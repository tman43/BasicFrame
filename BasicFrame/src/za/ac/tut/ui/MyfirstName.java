/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class MyfirstName extends JFrame{

    private Color Blue;
    private boolean True;

    public MyfirstName()
    {
        setTitle("My first GUI");
        setSize(700,400);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Blue);
        setVisible(True);
    }
    
    
    
}
