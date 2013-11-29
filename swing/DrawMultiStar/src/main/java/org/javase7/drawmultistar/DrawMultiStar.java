/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase7.drawmultistar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Masud
 */
public class DrawMultiStar{

    public DrawMultiStar() throws HeadlessException {
    }
    
    public static void main(String[] args) {
    JFrame starsframe = new JFrame();
    starsframe.setTitle("Random stars...");
    starsframe.setLayout(new GridLayout( 1,2));
    DrawStar star1 = new DrawStar(300, 200, Color.red);
    starsframe.add(star1);
    DrawStar star2 = new DrawStar(400, 300, Color.blue);
    starsframe.add(star2);
    
    starsframe.setSize(1000,700);
    starsframe.setLocationRelativeTo(null);
    starsframe.setVisible(true);
    starsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
