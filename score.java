package project4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

 
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.io.*
;public class score extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					score frame = new score();
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
	public score() {//set title and icon
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("HALMA");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Desktop\\project4\\2528009.png"));
		setBounds( 100, 100, 678, 613);
		setBackground(new Color(128, 128, 128));
		setBackground(Color.GRAY);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//make a textarea to print scores
		JTextArea textArea = new JTextArea();
		textArea.setBounds(123, 68, 412, 412);
		contentPane.add(textArea);
		
		
		//we should have back button to back to main menu
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			 	new frame();
			}
		});
		ImageIcon img= new ImageIcon(new ImageIcon( /*C:\\Users\\Asus\\Desktop\\project4\\*/ "undo.png").getImage().getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH));
		btnNewButton .setIcon(img);
		btnNewButton.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setBackground(new Color(216, 191, 216));
		 
		btnNewButton.setBounds(501, 506, 97, 33);
		contentPane.add(btnNewButton);
		
		
		 //read file and print its all line  
		   BufferedReader r=null;
			 try { 
			 FileReader s=new FileReader("score.txt"  );
			  r=new BufferedReader(s);
				String line;
				String st="";
				while((line=r.readLine())!=null) {
					//it read all line and put it into null string
				st=st+line;
				st+="\n";
					
						
				
		   
			} 
			//	and we set that string to text area
				 textArea.setText(st);
			 }
			 
			 
				 catch (IOException e) {
			     
			      e.printStackTrace();
			    } 
 
			 
		
		
		
		
		
		
		
		
		
		
	}
}
