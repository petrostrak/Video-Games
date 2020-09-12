/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithjava;

import javax.swing.JFrame;

/**
 *
 * @author petros
 */

public class Snake extends JFrame{
    
    public Snake() {
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        /*
            The setResizable() method affects the insets of the JFrame container 
            on some platforms. Therefore, it is important to call it before the 
            pack() method. Otherwise, the collision of the snake's head with the 
            right and bottom borders might not work correctly.
        */
        setResizable(false);
        pack();
        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
