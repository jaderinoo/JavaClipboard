import java.awt.datatransfer.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import java.awt.*;

public class Main extends JFrame {
	public static void main(String[] args)throws Exception
    {
		Console console = new Console();
	    console.init();
	    Main launcher = new Main();
	    launcher.setVisible(false);
	    console.getFrame().setLocation(
	    launcher.getX() + launcher.getWidth() + launcher.getInsets().right,
	    launcher.getY());
		clippy();
		
    }
	

	
	public static void clippy() throws UnsupportedFlavorException, IOException {
		String[] clippy = new String[10];
		int counter = 0;
	        // Create a Clipboard object using getSystemClipboard() method
	        Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
	        
	        // Set Clipboard to current clippy
	        String current = (String) (c.getData(DataFlavor.stringFlavor));
	        
	        // Pushes the current to clippy and moves the previous to next
	        	clippy[counter] = current;

	        
	        
	        // Get data stored in the clipboard that is in the form of a string (text)
	        for (int i = 0; i < 10; i++) {
	        System.out.println("Clippy " + (i+1) + ": \n" + clippy[i] + "\n");
        }
	       while(current != clippy[0]){
	    	   try {
	    		   TimeUnit.SECONDS.sleep(1);
	    		   counter++;
	    		   clippy();
	    	   } catch (Exception e) {}
	       }
	}
}
