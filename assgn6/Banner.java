package Assgn6;


import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" width=1000 height=500>
</applet>
*/

//use run configure to set applet window size
public class Banner extends Applet implements Runnable {
	String msg = "Life would be tragic, if it weren’t funny. ";
	Thread t = null;
	int state;
	boolean stopFlag;
	// Set colors and initialize thread.
	public void init() {
		setBackground(Color.magenta);
		setForeground(Color.orange);
	}
	// Start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}
	// Entry point for the thread that runs the banner.
	public void run() {
		char ch;
		// Display banner
		for( ; ; ) {
		try {
			repaint();
			Thread.sleep(250);
			ch = msg.charAt(0);
			msg = msg.substring(1, msg.length());
			msg += ch;
			if(stopFlag)
				break;
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		}
	}
	// Pause the banner.
	public void stop() {
		stopFlag = true;
		t = null;
	}
	// Display the banner.
	public void paint(Graphics g) {
		Font f = new Font("Arial", Font.ITALIC,30);
		g.setFont(f);
		g.drawString(msg, 50, 100);
	}
}

