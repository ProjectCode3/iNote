package Backend;

import javax.swing.*;
import java.awt.Font;

public class Component {
	
	public Font font;
	
	public JFrame frame = new JFrame();
	public JMenuBar menubar = new JMenuBar();
	public JTextArea textArea = new JTextArea(10, 30);
	
	//File Menu Items
	public JMenu file = new JMenu("File");
	public JMenuItem newFile = new JMenuItem("New File");
	public JMenuItem openFile = new JMenuItem("Open File");
	public JMenuItem newWindow = new JMenuItem("New Window");
	public JMenuItem save = new JMenuItem("Save");
	public JMenuItem saveAs = new JMenuItem("Save As");
	public JMenuItem prefer = new JMenuItem("Preferences");
	public JMenuItem quit = new JMenuItem("Quit");
	
	//View Menu Items
	public JMenu view = new JMenu("View");
	public JMenuItem find = new JMenuItem("Find");
	public JMenuItem delete = new JMenuItem("Delete");
	
	//Format Menu Items
	public JMenu format = new JMenu("Format");
	public JMenuItem Font = new JMenuItem("Font");

	//About MenuItems
	public JMenu about = new JMenu("About");
	public JMenuItem aboutiNote = new JMenuItem("About iNote");
	public JMenuItem updates = new JMenuItem("Check For Update");
	public JMenuItem Feedback = new JMenuItem("Feedback");
	public JMenuItem Account = new JMenuItem("Account");
	public JMenuItem register = new JMenuItem("Register");
	public JMenuItem regdisc = new JMenuItem("Test Disconnect");
}
