/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class Exercise13 extends Applet implements Runnable {

    int x, y, dx, dy, sx;
    Thread t = new Thread(this);

    public void init() {
        x = this.getWidth() / 2;
        dx = 0;
        dy = this.getHeight();
        y = 0;
        sx = 10;
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Font f = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(f);
        g.setColor(Color.magenta);
        g.drawString("Welcome", x, y);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void run() {
        while (true) {
            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            y = y + sx;
            x = x + sx;

            if (y == dy || x == dx) {
                sx = -sx;
            } else if (y == 0 || x == 0) {
                 sx = Math.abs(sx);
            }
        }
    }
}
