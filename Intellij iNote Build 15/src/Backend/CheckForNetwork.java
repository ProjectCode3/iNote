/*package Backend;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class CheckForNetwork {

    public JFrame frame = new JFrame();
    public Connection conn = new Connection();
    public Register register = new Register();

    //Components
    public JPanel panel = new JPanel();
    public JLabel currNode = new JLabel();
    public JProgressBar progBar = new JProgressBar(0,100);
    public JButton btnCheck = new JButton("Check Connection");

    public Timer timer;
    //public variables
    public int ONE_SECOND = 1000;
    public int n = 0;

   

    public void main(){
        frame.setSize(450, 180);
        frame.setTitle("Connecting To Server: Port-8080");        
        currNode.setText("Checking Data....");        
        currNode.setBounds(60, 45, 250, 25);
        progBar.setBounds(60, 65, 300, 18);       
        progBar.setValue(0);     
        progBar.setStringPainted(true);         
        btnCheck.setBounds(155, 95, 75, 25);
        panel.add(currNode);
        panel.add(progBar);      
        panel.add(btnCheck);

        panel.setLayout(null);
        frame.add(panel);       

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        ActionListener updateProBar = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
              int val = progBar.getValue();
              if (val >= 100) {
                if (conn.main()){
                    // timer.stop();     
                    frame.dispose();     
                    register.drawConnection();
                }else {
                    register.drawDisconnect();
                }                
                return;
              } 
              progBar.setValue(++val);
            }
          };
      
        
        timer = new Timer(50, updateProBar);
        btnCheck.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              if (timer.isRunning()) {
                timer.stop();
                btnCheck.setText("Start");
              } else if (btnCheck.getText() != "End") {
                timer.start();
                btnCheck.setText("Stop");
              }
            }
          });
    }
    
}
*/