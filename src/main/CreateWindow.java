package src.main;

import java.awt.Color;

import javax.swing.JFrame;

public class CreateWindow {
	JFrame window;
	
	
	public JFrame GUICreation() {
		window = new JFrame();
		window.setResizable(false);
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		return window;
	}
}
