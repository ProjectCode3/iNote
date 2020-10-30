package Backend;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;


import javax.swing.*;

public class Editor {

	//Objects
	Component comp = new Component();
	
	
	//global variables
	
	
	public void draw(JFrame frame, boolean visible) {
		/*
		 * Draw the frame
		 */
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1280, 720);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		frame.setTitle("iNote Editor");						
		
		frame.setVisible(visible);		
	}
	
	public void addMenuBarToFrame(JMenuBar bar, JFrame frame) {
		frame.setJMenuBar(bar);
	}
	
	public void addMenu(JMenuBar menubar, JMenu menu) {
		menubar.add(menu);
	}
	
	public void addItemToMenu(JMenu menu, JMenuItem item) {
		menu.add(item);
	}
	
	public void addTextArea(JFrame frame, JTextArea text) {
		frame.getContentPane().add(text, BorderLayout.CENTER);
	}
}
