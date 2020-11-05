package Ques5;

import java.awt.Canvas;
import java.awt.Graphics;

public class CircleSpiral extends Canvas{
	int width, length;

	public CircleSpiral(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public void paint (Graphics g) {
		int xCenter=width/2;
		int yCenter=length/2;
		int arcWidth=20;
		int arGrowDelta=30;
		for(int i=0;i<=10;i++) {
			g.drawArc(xCenter-arcWidth, yCenter-arcWidth, 2*arcWidth, 2*arcWidth, 0, 180);
			arcWidth=arcWidth+arGrowDelta;
			g.drawArc(xCenter-arcWidth, yCenter-arcWidth, 2*arcWidth-arGrowDelta, 2*arcWidth, 180, 180);
		}
	}
}

