package Ques2;

import java.awt.Canvas;
import java.awt.Graphics;

public class DrawPanel extends Canvas {

	int width;
	int length;
	public DrawPanel(int width, int length) {
		super();
		this.width=width;
		this.length= length;
	}
	public void paint(Graphics g) {
		g.drawLine(0, 0, width, length);
		g.drawLine(width, 0, 0, length);
		g.drawLine(width/2, 0, width/2, length);
		g.drawLine(0, length/2, width, length/2);
	}
}
