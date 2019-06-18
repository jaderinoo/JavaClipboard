import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;

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
					ClippyFace window = new ClippyFace(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public ClippyFace(String current) {
		initialize(current);
	}

	/**
	 * Initialize the contents of the frame.
	 * @return 
	 */
	static DefaultTableModel model = new DefaultTableModel();
	static int check = 0;
	static JFrame initialize(String clippyArray) {
		

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JavaClipboard"); 
        
        //Table Creation
        
        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
        table.setFont(new Font("Tahoma", Font.PLAIN, 15));
        if(check == 0) {
        	model.addColumn("Col1");
        	check = 1;
        }
        
        if(check == 1) {
        	model.insertRow(0, new String[] { clippyArray });
        }
        
		table.setBackground(Color.LIGHT_GRAY);
		table.setCellSelectionEnabled(true);
		frame.getContentPane().add(table, BorderLayout.CENTER);
        
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane, BorderLayout.EAST);

		return frame;

	}

	public JFrame getFrame() {
		return frame;
	}
	
	public static void test(String current) {
		System.out.println(current);
	}
	
	public void init() {
		frame.pack();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
	}
}
