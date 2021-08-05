/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
public class BonMua extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
//      Khai báo đối tượng
        int x,y,w,h,sx;
        x=y=0;
        w=h=300;
        sx=10;
        
        
//      Khai báo phông chữ
        Font f = new Font("SansSerif",Font.BOLD,32);
//      Xét phông chữ cho Đối tượng đồ họa g  
        g.setFont(f);
        
//      Hình chữ nhật
//      Thiết lập màu
        g.setColor(Color.red);
//      Vẽ hình
        g.fillRect(x, y, w, h);
        
        
//      Hình tròn
//      Thiết lập màu
        g.setColor(Color.green);
//      Vẽ hình
        g.fillOval(x, y, w, h);
        
//       Chữ
//       Thiết lập màu
        g.setColor(Color.PINK);
        g.drawString("XUÂN", w/2-32, h/2);
        
//      Hình chữ nhật2
//      Thiết lập màu
        g.setColor(Color.blue);
//      Vẽ hình
        g.fillRect(w, y, w, h);
        
        
//      Hình tròn
//      Thiết lập màu
        g.setColor(Color.green);
//      Vẽ hình
        g.fillOval(w, y, w, h);
        
//       Chữ
//       Thiết lập màu
        g.setColor(Color.PINK);
        g.drawString("HẠ", w + w/2-32, h/2);
        
//      Hình chữ nhật3
//      Thiết lập màu
        g.setColor(Color.green);
//      Vẽ hình
        g.fillRect(x, h, w, h);
        
        
//      Hình tròn
//      Thiết lập màu
        g.setColor(Color.pink);
//      Vẽ hình
        g.fillOval(x, h, w, h);
        
//       Chữ
//       Thiết lập màu
        g.setColor(Color.black);
        g.drawString("THU", w/2-32,h + h/2);
        
//      Hình chữ nhật4
//      Thiết lập màu
        g.setColor(Color.black);
//      Vẽ hình
        g.fillRect(w, h, w, h);
        
        
//      Hình tròn
//      Thiết lập màu
        g.setColor(Color.white);
//      Vẽ hình
        g.fillOval(w, h, w, h);
        
//       Chữ
//       Thiết lập màu
        g.setColor(Color.black);
        g.drawString("ĐÔNG", w + w/2-32,h + h/2);
    }
}
    
    

