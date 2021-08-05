/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author LENOVO
 */
public class CirCleWithText extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.black);
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

//      Khai báo phông chữ
        int r=150;
        double musty=0;
        double PI = Math.PI;
        double temp= 0;
        int ColorMove = 255;

        Font f = new Font("SansSerif", Font.BOLD, 20);
//      Xét phông chữ cho Đối tượng đồ họa g  
        g.setFont(f);

        for (int i = 1; i <=20; i++) {
            
            
//          Color Moving
            if(i<=5)
                g.setColor(new Color(ColorMove,50*i,0));
            else   if(i>5 && i<=10)
                g.setColor(new Color(ColorMove-=50,255,0));
            else   if(i>10 && i<=15) {
                g.setColor(new Color(0,255,ColorMove+=50));
            }
            else
                g.setColor(new Color(0,ColorMove-=50,255));

//            Run
            g.drawString("Java", (int)Math.round(300 + r*Math.cos(temp)), (int)Math.round(300 + r*Math.sin(temp)));   
            if(temp == PI/2 || temp == 3*PI/2) {
                temp+=(PI/6);
            }
            else
                temp+=(PI/12);
            if(i%5 == 0 && i<=15) {
                 musty += (PI/2);
                 temp = musty;
            }
        }
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(0)), (int)Math.round(300 + r*Math.sin(0)));                
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI/12)), (int)Math.round(300 + r*Math.sin(PI/12)));                     
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI/6)), (int)Math.round(300 + r*Math.sin(PI/6)));          
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI/4)), (int)Math.round(300 + r*Math.sin(PI/4)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI/3)), (int)Math.round(300 + r*Math.sin(PI/3)));
//            
//            
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI/2)), (int)Math.round(300 + r*Math.sin(PI/2)));                                                                                          
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(2*PI/3)), (int)Math.round(300 + r*Math.sin(2*PI/3)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(3*PI/4)), (int)Math.round(300 + r*Math.sin(3*PI/4)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(5*PI/6)), (int)Math.round(300 + r*Math.sin(5*PI/6)));  
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(11*PI/12)), (int)Math.round(300 + r*Math.sin(11*PI/12))); 
//            
//            
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(PI)), (int)Math.round(300 + r*Math.sin(PI)));  
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(13*PI/12)), (int)Math.round(300 + r*Math.sin(13*PI/12)));  
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(7*PI/6)), (int)Math.round(300 + r*Math.sin(7*PI/6)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(5*PI/4)), (int)Math.round(300 + r*Math.sin(5*PI/4)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(4*PI/3)), (int)Math.round(300 + r*Math.sin(4*PI/3)));  
//            
//            
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(3*PI/2)), (int)Math.round(300 + r*Math.sin(3*PI/2)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(5*PI/3)), (int)Math.round(300 + r*Math.sin(5*PI/3)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(7*PI/4)), (int)Math.round(300 + r*Math.sin(7*PI/4)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(11*PI/6)), (int)Math.round(300 + r*Math.sin(11*PI/6)));                                           
//            g.drawString("Java", (int)Math.round(300 + r*Math.cos(23*PI/12)), (int)Math.round(300 + r*Math.sin(23*PI/12)));                                                                                 
//                                         
//                                  
                                       
                                           
    }
}
