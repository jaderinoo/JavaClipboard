import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
	

	
	public static void clippy() throws UnsupportedFlavorException, IOException, InterruptedException {
		
	        Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();  
	        String current = (String) (c.getData(DataFlavor.stringFlavor));
	        System.out.println(current);

	        int x = 0;
	        while(x == 0) {
	        	Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() { 
	        		@Override
	        		public void flavorsChanged(FlavorEvent e) {
	        			System.out.println("Clipboard Updated: \n" + current);
	        			} 
	        		}); 
	        	Thread.sleep(100000L); 
	        	clippy();
	        }
	}
}

