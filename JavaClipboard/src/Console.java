import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Console {
	final JFrame frame = new JFrame();
	
	public Console() {
		JTextArea textArea = new JTextArea(24, 80);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setForeground(Color.black);
		textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 15));
		System.setOut(new PrintStream(new OutputStream() {
    	@Override
    	public void write(int b) throws IOException {
    		textArea.append(String.valueOf((char) b));
    	}
    }));
    	frame.add(textArea);
  }
	public void init() {
		frame.pack();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);

	}
	public JFrame getFrame() {
		return frame;
	}
}