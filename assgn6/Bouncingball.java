package Assgn6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Bouncingball extends Applet implements Runnable {
	
	// x,y coordinates and radius of the circle.
	int x = 30, y = 30, r=20;   
	int dx = 11, dy = 7;
	Thread t = null;
	boolean stopFlag;
	
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.blue);
	}
	
	// Start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	
	public void run() 
	{
		while(true)
		{
			try
			{	
				repaint();
				Thread.sleep(100);
				// Bounce if hit an edge.
				if ((x - r + dx < 0) || (x + r + dx > getWidth())) 
					  	dx = -dx;
				if ((y - r + dy < 0) || (y + r + dy > getHeight())) 
						dy = -dy;
				// Move the circle.
				x += dx; 
				y += dy;				
				if(stopFlag)
					break;
			}
			catch(Exception e)
			{
				System.out.println(e);
			};
			
			
		}
	}
	
	public void stop() {
		stopFlag = true;
		t = null;
	}
	
	public void paint(Graphics g) {
		g.fillOval(x-r, y-r, r*2, r*2);
	}
	
}
