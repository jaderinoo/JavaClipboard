import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.*;

public class Main extends JFrame {
	public static void main(String[] args)throws Exception
    {
		//Legacy Test code
		ClippyFace ClippyFace = new ClippyFace();
	    ClippyFace.init();
	    Main launcher = new Main();
	    launcher.setVisible(false);
	    
		clippy();
		
    }
	

	
	public static void clippy() throws UnsupportedFlavorException, IOException, InterruptedException {
		
		String[] clippyArray = new String[20]; 
	    Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();  

	    int x = 0;
	        while(x == 0) {
	        	Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() { 
	        		@Override
	        		public void flavorsChanged(FlavorEvent e) {
						try {
							clippyArray[0] = (String) (c.getData(DataFlavor.stringFlavor));
						} catch (UnsupportedFlavorException | IOException e1) {
							e1.printStackTrace();
						}
						
						ClippyFace.addRow(clippyArray[0]);
	        			//System.out.println("Clipboard Updated: \n" + clippyArray[0] + "\n");
	        			
	        			} 
	        		}); 
	        	Thread.sleep(200000L); 
	        	clippy();
	        }
	}
}

