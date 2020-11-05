package Ques3;
import java.awt.Canvas;
import java.awt.Graphics;
public class LineFanning extends Canvas{
	int width, length;

	public LineFanning(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public void paint(Graphics g) {
		int width2=width;
		int length2=length;
		for(int i=0;i<=length;i=i+20) {
			g.drawLine(0, 0, width2, i);
			g.drawLine(width, length, width2, i);
			g.drawLine(0, length, width2,length2);
			g.drawLine(width, 0, width2,length2);
			length2=length2-20;
			width2=width2-20;
		}
	}
}
