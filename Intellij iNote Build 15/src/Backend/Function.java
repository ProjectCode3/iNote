package Backend;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javafx.stage.FileChooser;

public class Function {

	public Editor editor = new Editor();
	public Component comp = new Component();
	public FontChooser Font = new FontChooser();
	public Connection conn = new Connection();
	//public CheckForNetwork networking = new CheckForNetwork();
	
	public FileChooser fc = new FileChooser();
	
	
	public void newProject() {			
		editor.addMenuBarToFrame(comp.menubar, comp.frame); // Add menubar to frame
		//addComponents To Frame
		editor.addTextArea(comp.frame, comp.textArea);
		
		//Add File Menu and MenuItem to MenuBar
		editor.addMenu(comp.menubar, comp.file); 
		editor.addItemToMenu(comp.file, comp.newFile);
		editor.addItemToMenu(comp.file, comp.openFile);
		editor.addItemToMenu(comp.file, comp.newWindow);
		comp.file.addSeparator();
		editor.addItemToMenu(comp.file, comp.save);
		editor.addItemToMenu(comp.file, comp.saveAs);
		editor.addItemToMenu(comp.file, comp.prefer);
		comp.file.addSeparator();
		editor.addItemToMenu(comp.file, comp.quit);
		
		//add View Menu and MenuItems To MenuBar
		editor.addMenu(comp.menubar, comp.view);
		editor.addItemToMenu(comp.view, comp.find);
		editor.addItemToMenu(comp.view, comp.delete);
		
		//Add Format Menu and MenuItems to MenuBar
		editor.addMenu(comp.menubar, comp.format);
		editor.addItemToMenu(comp.format, comp.Font);

		//Add About Menu and MenuItems to MenuBar
		editor.addMenu(comp.menubar, comp.about);
		editor.addItemToMenu(comp.about, comp.aboutiNote);
		comp.about.addSeparator();
		editor.addItemToMenu(comp.about, comp.updates);
		editor.addItemToMenu(comp.about, comp.Feedback);
		editor.addItemToMenu(comp.about, comp.Account);
		comp.about.addSeparator();
		editor.addItemToMenu(comp.about, comp.register);	

		
		//Draw the frame
		editor.draw(comp.frame, true); 
		
		comp.Font.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/**
				 * Draws the font chooser frame
				 * :param: ActionEvent 
				 * :return:: Frame
				 */
				Font.draw();
			}
		});

		comp.register.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				/**
				 * Draws the register frame
				 * :param: ActionEvent 
				 * :return:: Frame
				 */				
				//networking.main();

			}
		});
		
	}
	
	public void RegisterAccount(JTextField userName, JTextField mail, JPasswordField pass, JPasswordField cnfrm_Pass){
		
		String $fullName = userName.getText();
		String $email = mail.getText();
		char[] $pass = pass.getPassword();
		char[] $firm_pass = cnfrm_Pass.getPassword();

		/**
		 * Decision structure to check if name 
		 * has a whitespace 
		*/
			
	}

	public boolean ValidateName(String s){
		if (!s.isEmpty()){
			for (int i=0; i > s.length(); ++i){
				if (Character.isWhitespace(s.charAt(i))){
					return true;
				}
			}	
		}
		return false;
	}

	public boolean ValidateMail(String $value){
		for (int i=0; i > $value.length(); ++i){
			if ($value.charAt(i) == '@'){
				return true;
			}
		}
		return false;
	}

	public boolean ValidatePassword(String $pass){

		return false;
	}



}
