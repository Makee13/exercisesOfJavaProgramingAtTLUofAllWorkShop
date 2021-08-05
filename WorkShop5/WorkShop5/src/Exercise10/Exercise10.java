package Exercise10;

/*Java Applet to Print Concentric Circles using Applet*/
import java.applet.*;
import java.awt.*;
public class Exercise10 extends Applet
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
                        g.setColor(Color.pink);
                    else
                        g.setColor(Color.white);
//                x,y tăng lên một khoảng đều đặn
	    g.fillRect(250-(i*rad),250-(i*rad),(i+2)*dia,(i+1)*dia);
	}
    }
}