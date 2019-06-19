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
		/*
		Console console = new Console();
	    console.init();
	    Main launcher2 = new Main();
	    launcher2.setVisible(false);
	    console.getFrame().setLocation(launcher2.getX() + launcher2.getWidth() + launcher2.getInsets().right, launcher2.getY());
		*/
		clippy(0);
		
    }
	

	
	public static void clippy(int x) throws UnsupportedFlavorException, IOException, InterruptedException {
		
		String[] clippyArray = new String[20]; 
		clippyArray[0] = "Initialization";
		System.out.println(clippyArray[0]);
	    Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard(); 

	        while(x == 0) {
	        	Toolkit.getDefaultToolkit().getSystemClipboard().addFlavorListener(new FlavorListener() { 
	        		@Override
	        		public void flavorsChanged(FlavorEvent e) {
						try {
							clippyArray[0] = (String) (c.getData(DataFlavor.stringFlavor));
						} catch (UnsupportedFlavorException | IOException e1) {
							e1.printStackTrace();
						}
						ClippyFace.initialize(clippyArray[0]);
						// System.out.println(clippyArray[0]);
	        			
	        			} 
	        		}); 
	        	
	    		ClippyFace ClippyFace = new ClippyFace(clippyArray[0]);
	    		ClippyFace.init();
	    	    Main launcher = new Main();
	    	    launcher.setVisible(false);
	    	    ClippyFace.getFrame();
	    	    
	        	Thread.sleep(2000000L); 
	        	clippy(0);
	        }
	}
}

