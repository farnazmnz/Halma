package project4;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;
import java.awt.SystemColor;
import java.awt.Toolkit;
public class frame  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame window = new frame();
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
	public frame() {
		initialize();
	}

	/** 
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HALMA");
		//put icon for game and set size
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\project4\\2528009.png"));
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.getContentPane().setForeground(new Color(204, 204, 255));
		frame.setVisible(true);
		frame.setBounds(100, 100, 678, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create button for start palying game 
		JButton btnStartGame = new JButton(" Start ");
		//set icon
		ImageIcon img2= new ImageIcon(new ImageIcon( "C:\\Users\\Asus\\Desktop\\project4\\149125.png" ).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
		btnStartGame.setIcon(img2);
		//set size and color and font
		btnStartGame.setBounds(188, 175, 247, 75);
		btnStartGame.setBackground(new Color(216, 191, 216));
		btnStartGame.setForeground(new Color(128, 0, 128));
		btnStartGame.setFont(new Font("Dubai Medium", Font.BOLD, 20));
		//for the function of button we should add actionlistener
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				//when we click it get the size of board and name of players
				
				int n= Integer.parseInt(JOptionPane.showInputDialog(null, "inter n"));
				int m=Integer.parseInt(JOptionPane.showInputDialog(null, "inter m") ); 
				 if(m<1&&m>n-1) {//it check the limitation of number of mohre
					 int M=Integer.parseInt(JOptionPane.showInputDialog(null, "m should be between m>=1 && m<=n-1") );
					 m=M;
					 }
				 
				
				String p1=JOptionPane.showInputDialog(null,"enter first player name...");
				String p2=JOptionPane.showInputDialog(null,"enter second player name...");
				
			 game g=new game(n,m,p1,p2);
			 frame.dispose();
			 //open new frame
			 g.setVisible(true);
			 
		  
		
			
			}
		});
		//at the end we should add button to frame
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnStartGame);
		
		
		// button for exit
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//we should ask are u sure to exit
				int a=JOptionPane.showConfirmDialog(null, "are you sure?");
				if(a==JOptionPane.YES_OPTION) {
				System.exit(0);}
			}
		});
		ImageIcon img3= new ImageIcon(new ImageIcon( /*C:\\Users\\Asus\\Desktop\\project4\\*/"1828427.png").getImage().getScaledInstance(24, 24, java.awt.Image.SCALE_SMOOTH));
		btnNewButton_1.setIcon(img3);
		btnNewButton_1.setBounds(252, 457, 133, 62);
		btnNewButton_1.setFont(new Font("Dubai Medium", Font.BOLD, 19));
		btnNewButton_1.setForeground(new Color(128, 0, 128));
		btnNewButton_1.setBackground(new Color(216, 191, 216));
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		//label at the top of game board
		JLabel lblNewLabel = new JLabel(" **Welcome To Halma**");
		lblNewLabel.setBounds(135, 37, 363, 87);
		lblNewLabel.setFont(new Font("Script MT Bold", Font.BOLD, 28));
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		
		//button for know how to play
		JButton btnNewButton_2 = new JButton("Game Rules");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//we should open another frame
				frame.dispose();
				new frame2();
			}
			
		});
		ImageIcon img1= new ImageIcon(new ImageIcon(/* C:\\Users\\Asus\\Desktop\\project4\\*/"2817841.png").getImage().getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH));
		btnNewButton_2.setIcon(img1);
		btnNewButton_2.setBackground(new Color(216, 191, 216));
		btnNewButton_2.setForeground(new Color(128, 0, 128));
		btnNewButton_2.setFont(new Font("Dubai Medium", Font.BOLD, 20));
		btnNewButton_2.setBounds(218, 270, 194, 75);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		//button for show scores
		JButton btnNewButton = new JButton("Records");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				score s=new score();
				 frame.dispose();
				 s.setVisible(true);
			}
		});
		
				ImageIcon img= new ImageIcon(new ImageIcon(/*C:\\Users\\Asus\\Desktop\\project4\\*/"115778.png").getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
				btnNewButton.setIcon( img);
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.setFont(new Font("Dubai Medium", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setBounds(242, 364, 151, 69);
		frame.getContentPane().add(btnNewButton);
	}
}
