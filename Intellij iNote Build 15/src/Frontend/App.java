package Frontend;

import Backend.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class App {
    
	//global objects
	public static Board board = new Board();
	public static Function func = new Function();
	public static Editor editor = new Editor();
	public static Component comp = new Component();
	
	//global Components
	public static JFrame frame = new JFrame();
	public static JPanel panel = new JPanel();
	public static JLabel name = new JLabel("iNote Editor");
	public static JLabel version = new JLabel("Version 2020.0.1 Build 15");
	public static JLabel newProject = new JLabel("New Project");
	public static JLabel openProject = new JLabel("Open Project");
	public static JLabel settings = new JLabel("Settings");
	public static JLabel quit = new JLabel("Exit");

	public static void main(String[] args) {				
		/*
		 * Create the Main
		 * Relation Frame
		 */
		
		//Assign Values To frame, Title, Width, visible and Height
		board.setTitle("Welcome To iNote");
		board.setWidth(618);
		board.setHeight(500);
		board.isVisible(true);
		
		name.setFont(name.getFont().deriveFont(28f));
		name.setBounds(210, 45, 450, 25);
		panel.add(name);
		
		version.setFont(version.getFont().deriveFont(18f));
		version.setForeground(Color.gray);
		version.setBounds(180, 65, 450, 25);
		panel.add(version);
		
		newProject.setFont(newProject.getFont().deriveFont(20f));
		newProject.setForeground(Color.BLACK);
		newProject.setBounds(220, 180, 140, 25);
		panel.add(newProject);
		
		newProject.addMouseListener(new MouseListener() {					
			
			@Override
			public void mousePressed(MouseEvent e) {
						
				func.newProject();
				frame.setVisible(false);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				newProject.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
							
				Color clr = new Color(253, 106, 2);
				newProject.setForeground(clr);
				
				newProject.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
		});
		
		openProject.setFont(openProject.getFont().deriveFont(20f));
		openProject.setForeground(Color.BLACK);
		openProject.setBounds(214, 215, 140, 25);
		panel.add(openProject);
		
		openProject.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				openProject.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Color clr = new Color(253, 106, 2);
				openProject.setForeground(clr);				
				openProject.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
			}
		});
		
		settings.setFont(settings.getFont().deriveFont(20f));
		settings.setForeground(Color.BLACK);
		settings.setBounds(235, 250, 105, 25);
		panel.add(settings);
		
		settings.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				settings.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Color clr = new Color(253, 106, 2);
				settings.setForeground(clr);
				
				settings.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		quit.setFont(quit.getFont().deriveFont(20f));
		quit.setForeground(Color.BLACK);
		quit.setBounds(255, 280, 105, 25);
		panel.add(quit);
		
		quit.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				System.exit(0);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				quit.setForeground(Color.BLACK);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				Color clr = new Color(253, 106, 2);
				quit.setForeground(clr);
				
				quit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		//Remove custom layout.
		panel.setLayout(null);
		frame.add(panel); // add panel to frame
		
		//retrieve values given as required data types
		frame.setTitle(board.getTitle());
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(board.getWidth(), board.getHeight());
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
		frame.setVisible(board.getVisible());
		
		
		
		
	}
}