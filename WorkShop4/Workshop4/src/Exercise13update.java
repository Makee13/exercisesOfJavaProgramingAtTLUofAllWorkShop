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
public class Exercise13update extends Applet implements Runnable{

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
//        Font f = new Font("SansSerif", Font.BOLD, 32);
//        g.setFont(f);
        g.setColor(Color.magenta);
        g.fillOval(x, y, 50, 50);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void run() {
        boolean t = true;
        while (true) {
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            if (t == true) {
                y = y + sx;
                if (y == dy) {
                    y = dy;
                    t = false;
                }
            } else {
                y = y - sx;
                if (y == 0) {
                    y = 0;
                    t = true;
                }
            }
        }
    }
}
