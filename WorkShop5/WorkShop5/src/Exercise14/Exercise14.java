package Exercise14;

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
public class Exercise14 extends Applet implements Runnable{

    int x, y, dx, dy, sx;
    Thread t = new Thread(this);

    public void init() {
        x = this.getWidth();
        dx = 0;
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
        g.drawString("Khoa Công Nghệ Thông Tin", x, y);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void run() {
        while (true) {
//           Vẽ lại đối tượng
            repaint();
            try {
//           Thiết lập trạng thái delay/sleep
                Thread.sleep(100);
            } catch (Exception e) {
            }
//          Thay đổi tọa độ
            x = x - sx;
//          Khống chế vùng biên
            if (x == dx) {
                x = this.getWidth();
            }
        }
    }
}
