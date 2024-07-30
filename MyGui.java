/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.library;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author sifis
 */
public class MyGui extends JFrame{

    public MyGui() {
        setTitle("Gui application");
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setLocationRelativeTo(null);
        setSize(800, 600);
        setVisible(true);
        setBackground(Color.CYAN);
    }
    
    
}
