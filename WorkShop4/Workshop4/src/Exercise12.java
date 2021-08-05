/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
public class Exercise12 extends Applet implements Runnable {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int x, y, dx, dy, sx;
    Thread t = new Thread(this);

    public void init() {
        x = 0;
        dx = this.getWidth();
        dy = this.getHeight();
        y = dy/2;
        sx = 10;
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Font f = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(f);
        g.setColor(Color.BLUE);
        g.drawString("Java Applet", x, y);
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
            x = x + sx;
            if (x == dx) {
                x = 0;
            }
        }
    }
}
