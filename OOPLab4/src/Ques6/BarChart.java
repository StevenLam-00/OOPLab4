package Ques6;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;


public class BarChart extends Canvas{
	int width=20;
	int length;
	public BarChart() {
		
	}
	public void paint(Graphics g) {
		for(int i=1;i<=5;i++) {
			String inputLength= JOptionPane.showInputDialog("Length of the bar  "+i);
				try {
					 length = Integer.parseInt(inputLength); 
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Ivalid number");
					
				}
				if(i==1) g.setColor(Color.BLACK);
				if(i==2) g.setColor(Color.GRAY);
				if(i==3) g.setColor(Color.MAGENTA);
				if(i==4) g.setColor(Color.GREEN);
				if(i==5) g.setColor(Color.CYAN);
				
				g.fillRect(0, width, length, 20);
				width=width+ 40;
		}
	}
}	
