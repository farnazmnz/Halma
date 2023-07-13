package project4;
import java.util.Stack;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JList;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import java.util.Stack; 
public class fr {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblOperator;
	private JTextField txtA;
	private JLabel lblResult;
    static String exp;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fr window = new fr();
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
	public fr() {
		
		Scanner s=new Scanner(System.in);
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 405, 71, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(12, 346, 71, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(12, 315, 71, 31);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(12, 290, 71, 31);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(12, 258, 71, 31);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(12, 374, 71, 31);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(126, 405, 71, 31);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(126, 378, 71, 31);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(126, 346, 71, 31);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(126, 319, 71, 31);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(126, 290, 71, 31);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(126, 258, 71, 31);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(245, 409, 71, 31);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(245, 378, 71, 31);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(245, 350, 71, 31);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(245, 319, 71, 31);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(245, 294, 71, 31);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(245, 262, 71, 31);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(360, 409, 71, 31);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(360, 378, 71, 31);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(360, 350, 71, 31);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(360, 319, 71, 31);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(360, 294, 71, 31);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(360, 262, 71, 31);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(475, 409, 71, 31);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(475, 378, 71, 31);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(475, 346, 71, 31);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(475, 319, 71, 31);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(475, 294, 71, 31);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(475, 262, 71, 31);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(602, 409, 71, 31);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(602, 378, 71, 31);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(602, 350, 71, 31);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(602, 319, 71, 31);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(602, 290, 71, 31);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(602, 262, 71, 31);
		frame.getContentPane().add(textField_35);
		
		txtB = new JTextField();
		txtB.setText(s.next());
		txtB.setBounds(192, 35, 301, 38);
		frame.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		//txtC.setText("c");
		txtC.setBounds(269, 172, 116, 22);
		frame.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		JLabel lblPostfixExpere = new JLabel("postfix experession");
		lblPostfixExpere.setBounds(26, 46, 134, 16);
		frame.getContentPane().add(lblPostfixExpere);
		
		JButton btnNewButton = new JButton(" ");
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBounds(475, 164, 54, 38);
		frame.getContentPane().add(btnNewButton);
		
		lblOperator = new JLabel("operator");
		lblOperator.setBounds(126, 175, 56, 16);
		frame.getContentPane().add(lblOperator);
		
		txtA = new JTextField();
		//txtA.setText("a");
		txtA.setBounds(192, 93, 134, 31);
		frame.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		lblResult = new JLabel("result");
		lblResult.setBounds(76, 100, 56, 16);
		frame.getContentPane().add(lblResult);
		 
		
		
		btnNewButton.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e) {	
		
		
		
				  
		
		   Stack<Integer> stack=new Stack<>(); 
		          
		        // Scan all characters one by one 
		        for(int i=0;i< txtB.getText().length();i++) 
		        { 
		            char c=txtB.getText().charAt(i); 
		              
		            // If the scanned character is an operand (number here), 
		            // push it to the stack. 
		            if(Character.isDigit(c)) {
		            stack.push(c - '0'); 
		           int num= c - '0' ;
		           String sr="";
		           sr+=num;
		           if(i==0) {
		            textField.setText(sr);}
		            if(i==1) {
		            	  textField_5.setText(sr);}
		            if(i==2) {
		            	  textField_1.setText(sr);}
		            
		            
		            
		            }
		            //  If the scanned character is an operator, pop two 
		            // elements from stack apply the operator 
		            else
		            { 
		                int val1 = stack.pop(); 
		                int val2 = stack.pop();
		                
		                textField_7.setText(""); 
		           
		            	  textField_8.setText(""); 
		            	  int num= c - '0' ;
				           String sr="";
				           sr+=num;
				           if(i==0) {
				            textField.setText(sr);}
		                switch(c) 
		                { 
		                    case '+': 
		                    stack.push(val2+val1);  txtC.setText("+");
		                  //  System.out.println(stack.peek()); 
		                    break; 
		                      
		                    case '-': 
		                    stack.push(val2- val1); txtC.setText("-");
		                   // System.out.println(stack.peek()); 
		                    break; 
		                      
		                    case '/': 
		                    stack.push(val2/val1); txtC.setText("/");
		                   // System.out.println(stack.peek()); 
		                    break; 
		                      
		                    case '*': 
		                    stack.push(val2*val1); txtC.setText("*");
		                   // System.out.println(stack.peek()); 
		                    break; 
		              } 
		            }
		        } 
			 int nn=stack.pop();
			 String str=" ";
			 str+=nn;
			 txtA.setText(str);
		        
			 }
				 
		 } );
		
		
		
		
		
		
		
	}}
		   
		
		
	 

	/**
	 * Initialize the contents of the frame.
	 */
	 
		
		 
	 
