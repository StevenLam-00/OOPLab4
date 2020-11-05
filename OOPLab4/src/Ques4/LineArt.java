package Ques4;
import java.awt.Canvas;
import java.awt.Graphics;

public class LineArt extends Canvas{
	 int length, width;

	public LineArt(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public void paint (Graphics g) {
		int width2 = width;
		int length2 = length;
		for(int i=0;i<=length;i=i+20) {
			g.drawLine(0, i, i+20, length);
			g.drawLine(i, 0, width, i+20);
			g.drawLine(0, length-i, i+20,0);
			g.drawLine(width, i, width-i,length);
		}
	}

}
