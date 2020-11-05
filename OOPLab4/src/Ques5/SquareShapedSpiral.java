package Ques5;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class SquareShapedSpiral extends Canvas{
	int width, length;

	public SquareShapedSpiral (int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	
	public void paint (Graphics g) {
		int xCenter = width/2;
		int yCenter = length/2;
		g.setColor (Color.black);
		for (int i=0; i <=3; i++) {
			int a = i*20;
			g.drawLine(xCenter+a, yCenter-a, xCenter + a, yCenter+a+20);
			if(i==3)break;
			g.drawLine(xCenter+a, yCenter+20+a, xCenter-20-a, yCenter+20+a);
			g.drawLine(xCenter-20-a, yCenter+20+a,xCenter-20-a ,yCenter-20-a);
			g.drawLine(xCenter-20-a, yCenter-20-a, xCenter+20+a,yCenter-20-a);
		}
	}
	
	
}
