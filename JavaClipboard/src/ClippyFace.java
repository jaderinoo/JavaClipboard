import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ClippyFace {

	private static JFrame frame;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClippyFace window = new ClippyFace();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClippyFace() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"Time", "Clipboard"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(75);
		table.getColumnModel().getColumn(0).setMinWidth(10);
		table.getColumnModel().getColumn(0).setMaxWidth(75);
		table.setBackground(Color.LIGHT_GRAY);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		frame.getContentPane().add(table, BorderLayout.CENTER);

	}

	public JFrame getFrame() {
		return frame;
	}
	
	public void init() {
		frame.pack();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
	}
}
