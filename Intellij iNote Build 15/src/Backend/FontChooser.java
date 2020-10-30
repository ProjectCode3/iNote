package Backend;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;

public class FontChooser {

	//Objects
	Component comp = new Component();
	
	
	//Frame components	
	public JComboBox<String> fonts = new JComboBox<>();
	public JComboBox<String> style = new JComboBox<>();
	public JComboBox<String> fontSize = new JComboBox<>();	
	
	private JLabel font = new JLabel("Fonts");
	private JLabel font_Style = new JLabel("Font Style");
	private JLabel font_Size = new JLabel("Size");
	private JLabel effect = new JLabel("Effects");
	private JLabel samples = new JLabel("Sample");
	private JLabel sampleCap = new JLabel("Sample");
	
	private JButton Ok = new JButton("OK");
	private JButton cancel = new JButton("Cancel");
	
	private JPanel back = new JPanel();
	private JPanel effects = new JPanel();
	private JPanel sample = new JPanel();
	
	private JCheckBox strikeOut = new JCheckBox("StrikeOut");
	private JCheckBox underline = new JCheckBox("Underline");
	

	

	@SuppressWarnings({ "unchecked", "static-access" })
	public void draw() {			
		//Create Frame Object
		JFrame frame = new JFrame("Font");		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//Assign Values to frame
		frame.setSize(380, 350);
								
		font.setBounds(15, 5, 250, 25);
		fonts.addItem("Abadi MT Condensed Light");
		fonts.addItem("Albertus Extra Bold");
		fonts.addItem("Ablertus Medium");
		fonts.addItem("Antique Olive");
		fonts.addItem("Arial");
		fonts.addItem("Arial Black");
		fonts.addItem("Arial MT");
		fonts.addItem("Arial Narrow");
		fonts.addItem("Bazooka");
		fonts.addItem("Book Antiqua");
		fonts.addItem("Bookman Old Style");
		fonts.addItem("Boulder");
		fonts.addItem("Calisto");
		fonts.addItem("Calligrapher");
		fonts.addItem("Courier New");
		fonts.setBounds(15, 25, 100, 25);
		back.add(font);
		back.add(fonts);
		
		font_Style.setBounds(120, 5, 250, 25);
		style.addItem("Bold");
		style.addItem("Regular");
		style.addItem("Italic");
		style.setBounds(120, 25, 100, 25);
		back.add(font_Style);
		back.add(style);
		
		font_Size.setBounds(225, 5, 250, 25);
		fontSize.addItem("8");
		fontSize.addItem("9");
		fontSize.addItem("10");
		fontSize.addItem("11");
		fontSize.addItem("12");
		fontSize.addItem("14");
		fontSize.addItem("16");
		fontSize.addItem("18");
		fontSize.addItem("20");
		fontSize.addItem("22");
		fontSize.addItem("24");
		fontSize.addItem("26");
		fontSize.addItem("28");
		fontSize.addItem("36");
		fontSize.addItem("48");
		fontSize.addItem("72");
		fontSize.setBounds(225, 25, 50, 25);
		back.add(font_Size);
		back.add(fontSize);
		
		Ok.setBounds(280, 25, 75, 25);
		back.add(Ok);			
		
		cancel.setBounds(280, 55, 75, 25);
		back.add(cancel);
		
		effect.setBounds(60, 147, 150, 25);
		effect.setFont(effect.getFont().deriveFont(14f));
		back.add(effect);
		effects.setLayout(null);
		effects.setBounds(15, 165, 150, 115);
		effects.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		strikeOut.setBounds(5, 10, 100, 25);
		Font font = new Font("arial", Font.PLAIN, 12);		
		Map fontAttr = font.getAttributes();
		fontAttr.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
		Font myFont = new Font(fontAttr);
		strikeOut.setFont(myFont);
		underline.setBounds(5, 30, 100, 25);
		Map newAttr = font.getAttributes();
		newAttr.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Font newFont = new Font(newAttr);
		underline.setFont(newFont);
		effects.add(underline);
		effects.add(strikeOut);		
		back.add(effects);
		
		samples.setFont(samples.getFont().deriveFont(14f));
		samples.setBounds(220, 147, 150, 25);
		sampleCap.setFont(sampleCap.getFont().deriveFont(14f));
		sampleCap.setBounds(215, 101, 150, 115);
		back.add(sampleCap);
		back.add(samples);			
		sample.setLayout(null);
		sample.setBounds(175, 165, 150, 115);
		sample.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		samples.setBounds(30, 40, 100, 25);
		samples.setFont(samples.getFont().deriveFont(24f));				
		sample.add(samples);
		back.add(sample);		
		
		back.setLayout(null);	
		frame.add(back);
		frame.setResizable(false);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);			
		frame.setVisible(true);
		
		
		
		
		Ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				/*
				 * Handles OK button click event
				 * :param:: Font Settings
				 * :return: Font
				 */			
					
				/*
				 * Decision Structure to handle the font style
				 */										
										
				comp.font = new Font(String.valueOf(fonts.getSelectedIndex()), style.getSelectedIndex(), fontSize.getSelectedIndex());
				comp.textArea.setFont(comp.font);
				frame.dispose();
				fonts.removeAll();
				style.removeAll();
				fontSize.removeAll();
						
			}
		});
		
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * Hides Frame if button is clicked
				 * :return: None
				 */
				
				frame.setVisible(false);		
				System.out.println(fontSize.getItemCount());
			}
		});
				
	}	
}
