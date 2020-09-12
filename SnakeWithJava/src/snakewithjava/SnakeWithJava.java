/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakewithjava;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author petros
 */
public class SnakeWithJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater((() -> {
            JFrame snake = new Snake();
            snake.setVisible(true);
        }));
    }
    
}
