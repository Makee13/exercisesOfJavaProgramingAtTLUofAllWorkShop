package GGV;

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

    int x, y, dx, dy, sx;
    Thread t = new Thread(this);

    public void init() {
        dx = this.getWidth();
        x = 0;
        dy = this.getHeight();
        y = 0;
        sx = 10;
        t.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        Font f = new Font("Calibri", Font.BOLD, 34);
        g.setFont(f);
        g.setColor(Color.black);
        g.drawString("Trường Đại học Thủy Lợi", x, y);
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    public void run() {
        while (true) {
            repaint();

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }

            y = y + sx;
            x = x + sx;

            if (x == dx) {
                sx = -10;
            }else if(x==0)
                sx = 10;
        }
    }
}
