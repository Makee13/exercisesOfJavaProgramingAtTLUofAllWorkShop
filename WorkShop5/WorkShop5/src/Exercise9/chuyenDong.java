package Exercise9;

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
public class chuyenDong extends Applet implements Runnable {

    int x, y, dx, dy, sx, sy;
    Thread t = new Thread(this);

    public void init() {
        x = 0;
        dx = this.getWidth();
        dy = this.getHeight();
        y = 0;
        sx = 10;
        sy = 10;
        setBackground(Color.BLACK);
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        Font f = new Font("Arial", Font.BOLD, 32);
        g.setFont(f);
        g.setColor(Color.blue);
        g.drawString("Ngân hàng Vietcombank!", x, y);
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

            y = y + sy;
            x = x + sx;

            if (y == dy) {
                sy = -sy;
            } else if (y == 0) {
                sy = Math.abs(sy);
            }
            if (x == dx) {
                sx = -sx;
            } else if (x == 0) {
                sx = Math.abs(sx);
            }
        }
    }
}
