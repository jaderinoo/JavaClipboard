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
        frame.setTitle("JavaClipboard"); 
        
        //Table Creation
        DefaultTableModel model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("Col1");
        model.addRow(new Object[] { "r1" });
        model.addRow(new Object[] { "r2" });
        model.addRow(new Object[] { "r3" });
        
        Vector data = model.getDataVector();
        Vector row = (Vector) data.elementAt(1);
        
        int mColIndex = 0;
        List colData = new ArrayList(table.getRowCount());
        for (int i = 0; i < table.getRowCount(); i++) {
          row = (Vector) data.elementAt(i);
          colData.add(row.get(mColIndex));
        }
        
        
		table.setBackground(Color.LIGHT_GRAY);
		table.setCellSelectionEnabled(true);
		frame.getContentPane().add(table, BorderLayout.CENTER);
        

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane, BorderLayout.EAST);
		

	}

	public JFrame getFrame() {
		return frame;
	}
	
	public static void addRow(String clippyArray) {
		//Work on this
		//model.addRow(new Object[] { clippyArray });
	}
	
	public void init() {
		frame.pack();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
	}
}
