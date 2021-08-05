
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Exercise10 extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        int w, h;
        int x=20;
        w = h = 800;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.pink);
                g.fillRect(x * i, x * i, 800 - (x * i), 800 - (x * i));
            } else {
                g.setColor(Color.white);
                g.fillRect(x * i, x * i, 800 - (x * i), 800 - (x * i));
            }
        }
    }
}
