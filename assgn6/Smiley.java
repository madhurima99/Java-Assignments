package Assgn6;

import java.applet.*;
import java.awt.*;
/* <applet code = "Smiley" width = 300 height = 300> </applet> */
public class Smiley extends Applet
{ 
	public void paint(Graphics g) 
	{      
		 g.setColor(Color.yellow);
		 g.fillOval(50, 50, 150, 150);
		 g.setColor(Color.black);
		 g.fillOval(85, 95, 20, 30);//left eye
		 g.fillOval(145, 95, 20, 30);//
		 g.fillArc(95, 125, 60, 50, 0, -180);
		 Font f = new Font("Arial", Font.ITALIC,20);
		 g.setFont(f);
		 g.drawString("Keep Smiling!", 230, 135);
	}
} 