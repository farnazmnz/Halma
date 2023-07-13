package project4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class frame2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 window = new frame2();
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
	public frame2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//we set icon and name for game
		frame = new JFrame("HALMA");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(/*C:\\Users\\Asus\\Desktop\\project4\\*/ "2528009.png"));
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		//by label we write the game rules and set font ,color and size
		JLabel lblNewLabel = new JLabel("Rules:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dubai Medium", Font.BOLD, 21));
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBounds(237, 43, 188, 83);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("pieces can move  in all directions horizontally and vertically and other direction  .");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setBounds(24, 156, 624, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" the goal of game is to move all your pieces to the opponent's side .");
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(24, 214, 526, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" the player who is the first to place all his pieces on the opponent's side, is winner.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(128, 0, 128));
		lblNewLabel_3.setBounds(12, 260, 623, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		
		
		
		
		
		 //we should made a button to back to main menu
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new frame();
			}
			
		});
		
		ImageIcon img= new ImageIcon(new ImageIcon(/*C:\\Users\\Asus\\Desktop\\project4\\*/  "undo.png").getImage().getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH));
		btnNewButton .setIcon(  img) ;
		btnNewButton.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.setBounds(493, 346, 116, 38);
		frame.getContentPane().add(btnNewButton);
		
		
		//and we print a photo of game rules
		JLabel lblNewLabel_4 = new JLabel(new ImageIcon("C:\\Users\\Asus\\Desktop\\project4\\halma.jpg"));
		lblNewLabel_4.setBounds(34, 299, 379, 164);
		frame.getContentPane().add(lblNewLabel_4);
	 
		frame.setBounds(100, 100, 678, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
}
