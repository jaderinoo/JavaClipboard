import java.awt.datatransfer.*;
import java.io.IOException;
import java.awt.*;

public class Main {
	public static void main(String[] args)throws Exception
    {
		clippy();
		
    }
	public static void clippy() throws UnsupportedFlavorException, IOException {
		String[] clippy = new String[10];
	        // Create a Clipboard object using getSystemClipboard() method
	        Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
	        
	        // Set Clipboard to current clippy
	        String current = (String) (c.getData(DataFlavor.stringFlavor));
	        
	        // Pushes the current to clippy and moves the previous to next
	        for (int i = 0; i < 10; i++) {
	        if(clippy[i] != null) {
	        	clippy[i+1] = current;
	        	break;
	        }else {
	        	clippy[i] = current;
	        	break;
	        }
	        }
	        
	        
	        // Get data stored in the clipboard that is in the form of a string (text)
	        for (int i = 0; i < 10; i++) {
	        System.out.println("Clippy " + (i+1) + ": \n" + clippy[i] + "\n");
        }
	        if()
	        clippy();
	}
}
