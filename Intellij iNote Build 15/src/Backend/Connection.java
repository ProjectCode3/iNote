package Backend;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Connection {

    Component comp = new Component();

    public static int socket, min, max;    

    public boolean main(){      
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();                        
            return true;
         } catch (MalformedURLException e) {
            JOptionPane.showMessageDialog(comp.frame, "Internet Not Connected");           
         } catch (IOException e) {
            JOptionPane.showMessageDialog(comp.frame, "Internet Not Connected");        
         }                      

        return false;
    }

    public int getSocket(){
        max=8080;
        min=5050;
        Random rand = new Random();
        socket = rand.nextInt((max - min) + max);

        return socket;
    }

    public String getHost(){
        InetAddress ip;        
        String hostname = "";
        try {
            ip = InetAddress.getLocalHost();          
            hostname = ip.getHostName();           
 
        } catch (UnknownHostException e) {
 
            e.printStackTrace();
        }

        return hostname;
    }
 
    
}
