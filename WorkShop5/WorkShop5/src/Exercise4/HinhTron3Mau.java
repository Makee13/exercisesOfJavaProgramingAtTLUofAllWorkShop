package Exercise4;
import java.awt.*;
import java.applet.*;

public class HinhTron3Mau extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
//      x,y,w,h,Tọa độ lúc bắt đầu, Số độ mở rộng
        g.fillArc(100, 100, 80, 80, 0, 100);
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 80, 80, 100, 120);
        g.setColor(Color.blue);
        g.fillArc(100, 100, 80, 80, 220, 140);

    }
}
