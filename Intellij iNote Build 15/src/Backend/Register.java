package Backend;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Color;

public class Register {

	public Function function = new Function();

	// frame components
	private JFrame frame = new JFrame();

	private JLabel userName = new JLabel("Full Name");
	private JLabel passWord = new JLabel("Password");
	private JLabel confirmPass = new JLabel("Confirm Password");
	private JLabel email = new JLabel("Email");
	private JLabel disconnect = new JLabel();
	private JLabel reason = new JLabel("Check That your device is connect to a network");

	private JTextField fullName = new JTextField();
	private JTextField mail = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JPasswordField cnfrm_pass = new JPasswordField();

	private JPanel back = new JPanel();
	private JPanel form = new JPanel();

	private JButton register = new JButton("Register");
	private JButton cancel = new JButton("Cancel");
	private JButton signin = new JButton("Login");

	public void drawConnection() {
		/**
		 * Add data to frame Title, Size and Default Close Operation
		 */
		frame.setTitle("Register");
		frame.setSize(500, 650);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		/**
		 * set form panel information position and bounds x, y,
		 */
		form.setLayout(null);
		form.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		form.setBounds(50, 100, 360, 400);
		back.add(form);

		/**
		 * Add TextField to form frame with relative bounds y-axis relation + 65 pixels
		 * Add labels to form panel above + center for textfield
		 */
		userName.setFont(userName.getFont().deriveFont(14f));
		userName.setBounds(138, 17, 100, 50);
		fullName.setBounds(80, 50, 200, 25);
		email.setFont(email.getFont().deriveFont(14f));
		email.setBounds(152, 72, 100, 50);
		mail.setBounds(80, 105, 200, 25);
		passWord.setFont(passWord.getFont().deriveFont(14f));
		passWord.setBounds(142, 123, 100, 50);
		password.setBounds(80, 155, 200, 25);
		confirmPass.setFont(confirmPass.getFont().deriveFont(14f));
		confirmPass.setBounds(122, 173, 200, 50);
		cnfrm_pass.setBounds(80, 205, 200, 25);
		form.add(userName);
		form.add(fullName);
		form.add(email);
		form.add(mail);
		form.add(passWord);
		form.add(password);
		form.add(confirmPass);
		form.add(cnfrm_pass);

		/**
		 * Register, sign in and cancel Buttons
		 */
		register.setBounds(136, 240, 85, 25);
		signin.setBounds(136, 280, 85, 25);
		cancel.setBounds(136, 320, 85, 25);
		form.add(register);
		form.add(signin);
		form.add(cancel);

		back.setLayout(null);
		frame.add(back);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
		frame.setVisible(true);

		/**
		 * All button action events functions called from Function() Class
		 */
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				function.ValidateName(fullName.getText());

			}
			
		});
	}

	public void drawDisconnect(){
		/**
		 * Add data to frame
		 * Title, Size and Default Close Operation
		 */
		frame.setTitle("Register");
		frame.setSize(500, 650);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		/**
		 * set form panel information 
		 * position 
		 * and bounds x, y, 
		 */
		disconnect.setText("No Network Access");
		disconnect.setFont(disconnect.getFont().deriveFont(22f));
		disconnect.setBounds(80,20, 215,25);

		reason.setFont(reason.getFont().deriveFont(12f));
		reason.setBounds(50, 45, 280, 25);

		form.add(disconnect);
		form.add(reason);

		form.setLayout(null);
		form.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		form.setBounds(50, 100, 360, 400);
		back.add(form);

		back.setLayout(null);				

		
		frame.add(back);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);			
		frame.setVisible(true);



	}
	
	
	
}
