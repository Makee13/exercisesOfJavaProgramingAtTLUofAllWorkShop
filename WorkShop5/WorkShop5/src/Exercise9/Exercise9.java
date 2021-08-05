/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise9;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author LENOVO
 */
public class Exercise9 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.blue); 
        
        
        g.drawLine(200, 0, 200, 400);
        g.drawLine(0, 200, 400, 200);
        
        
        g.drawLine(123, 15, 200, 200);
        
        g.drawLine(58, 58, 200, 200);

        g.drawLine(15, 123, 200, 200); 
 
        
        g.drawLine(15, 276, 200, 200);     
        
        g.drawLine(58, 342, 200, 200);
        
        g.drawLine(123, 385, 200, 200);
        
        
        g.drawLine(276, 15, 200, 200);
        
        g.drawLine(342, 58, 200, 200);

        g.drawLine(385, 123, 200, 200);  
        
      
        g.drawLine(385, 276, 200, 200);     
        
        g.drawLine(342, 342, 200, 200);
        
        g.drawLine(276, 385, 200, 200);

    }

}
