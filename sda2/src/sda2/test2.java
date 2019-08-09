package sda2;

import java.awt.Color;

import javax.swing.JFrame;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Drawing 2D shape");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyCanvasDemo_1 test2JPanel = new MyCanvasDemo_1();
		frame.add(test2JPanel);
		frame.setBackground(Color.WHITE);
		frame.setSize(315,330);
		frame.setVisible(true);
	}

}
