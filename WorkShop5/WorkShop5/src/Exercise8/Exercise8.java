package Exercise8;

/*Java Applet to Print Concentric Circles using Applet*/
import java.applet.*;
import java.awt.*;
public class Exercise8 extends Applet
{
    //Initialize the applet
    public void init()
    {
    }
    //Draw cocentric circle
    public void paint(Graphics g)
    {
	int rad=25;
	int dia=50;
	for(int i=8;i>=0;i--)
	{
                    if(i%2==0)
                        g.setColor(Color.red);
                    else
                        g.setColor(Color.white);
	    g.fillOval(250-(i*rad),250-(i*rad),(i+1)*dia,(i+1)*dia);
	}
            g.setColor(Color.black);
            g.drawLine(275, 50, 275, 500);
            
            g.setColor(Color.black);
            g.drawLine(50, 275, 500, 275);
    }
}