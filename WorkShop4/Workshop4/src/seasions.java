
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class seasions extends Applet {

    public void init() {

    }

    public void seasions() {
//        seasions s = new seasions();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int x, y, w, h, sx;
        x = y = 0;
        w = h = 300;
        int h2 = h/2;
        sx = 10;
        Font f = new Font("SansSerif", Font.BOLD, 32);
        g.setFont(f);
//     HCN1
        g.setColor(Color.red);
        g.fillRect(x, y, w, h);
//      HT1
        g.setColor(Color.gray);
        g.fillOval(x, y, w, h);
//        F1
        g.setColor(Color.orange);
        g.drawString("XUÂN", x + sx, h / 2);
//       HCN2
        g.setColor(Color.blue);
        g.fillRect(x + w, y, w, h);
//       HT2
        g.setColor(Color.gray);
        g.fillOval(x + w, y, w, h);
//        F2
        g.setColor(Color.orange);
        g.drawString("HẠ", x + w+ sx, h / 2);
//       HCN3
        g.setColor(Color.pink);
        g.fillRect(x, y + h, w, h);
//       HT3
        g.setColor(Color.gray);
        g.fillOval(x, y + h, w, h);
//        F3
        g.setColor(Color.orange);
        g.drawString("THU", x + sx, (h+h2));
//       HCN4
        g.setColor(Color.green);
        g.fillRect(x + w, y + h, w, h);
//       HT4
        g.setColor(Color.gray);
        g.fillOval(x + w, y + h, w, h);
//        F4
        g.setColor(Color.orange);
        g.drawString("ĐÔNG", x + w + sx, (h+h2));
    }
}
