/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javase7.drawmultistar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Masud
 */
class DrawStar extends JPanel {

    int x;
    int y;
    Color color;

    DrawStar(int i, int i0, Color color) {
        this.x = i;
        this.y = i0;
        this.color = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int[] cX = new int[]{x, x + 5, x + 20, x + 8, x + 16, x, x - 16, x - 8, x - 20, x - 5, x};
        int[] cY = new int[]{y, y + 14, y + 14, y + 22, y + 39, y + 29, y + 39, y + 22, y + 14, y + 14, y};
        Polygon pol = new Polygon(cX, cY, 11);
        g2.setColor(this.color);
        g2.draw(pol);
        g2.fillPolygon(pol);
    }

}
