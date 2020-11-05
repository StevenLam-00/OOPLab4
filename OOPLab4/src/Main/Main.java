package Main;

import java.util.Scanner;

import javax.swing.JFrame;

import Ques1.InputDialog;
import Ques2.DrawPanel;
import Ques3.LineFanning;
import Ques4.LineArt;
import Ques5.SquareShapedSpiral;
import Ques5.CircleSpiral;
import Ques6.BarChart;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) {

		//Question 1
		System.out.println("Question 1:");
		InputDialog  InputName = new InputDialog ();
		InputName.InputName();
		

		//Question 2
		System.out.println("Question 2:");
		System.out.println("Width of the box:");
		int InputWidth=scanner.nextInt();
		System.out.println("Length of the box");
		int InputLength= scanner.nextInt();
		DrawPanel display= new DrawPanel(InputWidth, InputLength);
		JFrame f=new JFrame("Question 2");  
		f.add(display);  
		f.setSize(InputWidth+200,InputLength+500);
		f.setResizable(false);
		f.setLocationRelativeTo(null);  
		f.setVisible(true); 
	

		//Question 3
		System.out.println("Question 3:");
	    System.out.print("Width of the box: ");
		int InputWidth2=scanner.nextInt();
		System.out.print("Length of the box: ");
		int InputLength2= scanner.nextInt();
		LineFanning linefanning= new LineFanning(InputWidth2, InputLength2);
		JFrame f2=new JFrame("Question 3");  
		f2.add(linefanning);  
		f2.setSize(InputWidth2+200, InputLength2+500);
		f2.setResizable(false);
		f2.setLocationRelativeTo(null);  
		f2.setVisible(true); 

		//Question 4
		System.out.println("Question 4: ");
		System.out.print("Width of the box: ");
		int InputWidth3 = scanner.nextInt(); 
		System.out.print("Length of the box: ");
		int InputLength3 = scanner.nextInt();
		LineArt lineart = new LineArt (InputWidth3, InputLength3);
		JFrame f3=new JFrame("Question 4");  
		f3.add(lineart);
		f3.setSize(InputWidth3 +200, InputLength3 +500);
		f3.setResizable(false);
		f3.setLocationRelativeTo(null);  
		f3.setVisible(true);   
	       
		//Question 5
		//Square-Shaped Spiral
		System.out.println("Question 5- draw a square-shaped spiral: ");
		System.out.print("Width of the box:");
		int widthSquare =scanner.nextInt();
		System.out.print("Length of the box");
		int lengthSquare = scanner.nextInt();
		SquareShapedSpiral squareshapedspiral= new SquareShapedSpiral (widthSquare, lengthSquare);
		JFrame f4Square=new JFrame("QUestion 5 - Square Shaped Spiral");  
		f4Square.add(squareshapedspiral);  
		f4Square.setSize(widthSquare+200 ,lengthSquare+500);
		f4Square.setResizable(false);
	    f4Square.setLocationRelativeTo(null); 
		f4Square.setVisible(true); 
		        
		//Circle Spiral
		System.out.println("question 5 - draw a circle spiral: ");
		System.out.print("Width of the box: ");
		int widthCircle =scanner.nextInt();
		System.out.print("Length of the box: ");
		int lengthCircle= scanner.nextInt();
		CircleSpiral circlespiral= new CircleSpiral(widthCircle, lengthCircle);
		JFrame f4Circle=new JFrame("Question 5 - Circle Spiral");  
		f4Circle.add(circlespiral);  
		f4Circle.setSize(widthCircle+200, lengthCircle+500);
		f4Circle.setResizable(false);
		f4Circle.setLocationRelativeTo(null); 
		f4Circle.setVisible(true); 
		
		//QUestion 6
		System.out.println("Question 6:");
        BarChart barchart= new BarChart();
		JFrame f5=new JFrame("Question 6");  
	        f5.add(barchart);  
	        f5.setSize(600,300);
	        f5.setResizable(true);
	        f5.setLocationRelativeTo(null);
	        f5.setVisible(true); 
		      
		        
	}
}

