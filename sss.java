package project4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class sss extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sss frame = new sss();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public sss() {
		setTitle("HALMA");
		setIconImage(Toolkit.getDefaultToolkit().getImage(/*C:\\Users\\Asus\\Desktop\\project4\\*/ "2528009.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 613);
		setBackground(Color.GRAY);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		  
	  
		 
		//make a panel for board of the game
		
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 25, 608, 528);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel label = new JLabel("");
		panel.add(label);
		
		JProgressBar progressBar = new JProgressBar();
		panel.add(progressBar);
		
		JList list = new JList();
		panel.add(list);
		
		JList list_1 = new JList();
		panel.add(list_1);
		
		table = new JTable();
		panel.add(table);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JProgressBar progressBar_1 = new JProgressBar();
		panel.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		panel.add(progressBar_2);
		
	}
}
