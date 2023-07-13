package project4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.io.*;
 

public class game extends JFrame {

 	static int m,n,counter=0,x0,y0,y1,x1,mohre1=0,mohre2=0,turn=0,count,Count; 
							    
	boolean harekat=false,nobat=false ;
	 static String p1,p2;
	public  ImageIcon u = new ImageIcon(new ImageIcon( /*C:\\Users\\Asus\\Desktop\\project4\\*/"1067463.png").getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
	public	 ImageIcon q = new ImageIcon(new ImageIcon( /*C:\\Users\\Asus\\Desktop\\project4\\*/"1067458.png").getImage().getScaledInstance(43, 43, java.awt.Image.SCALE_SMOOTH));
		

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game(  n,  m ,p1,p2);
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
	public game( int n,int m,String p1,String p2) {
		this.n=n;
		this.m=m;
		
		//set title and icon 
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
		panel.setBounds(28, 89, 590, 464);
		contentPane.add(panel);
		
//a button for play again 
		JButton btnNewButton = new JButton("New Game");
		
		
	 
		btnNewButton  .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//it make new object 
				game ng=new game(n,m,p1,p2);
				setVisible(false);
			ng.setVisible(true);
				
			}});
		// set icon,size,font
		ImageIcon img= new ImageIcon(new ImageIcon(/*C:\\Users\\Asus\\Desktop\\project4\\*/   "reload.png").getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
		btnNewButton .setIcon(img);
		btnNewButton.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.setBackground(new Color(216, 191, 216));
		btnNewButton.setBounds(171, 13, 144, 37);
		 contentPane  .add(btnNewButton);
		
		 
		 
		 
		 //a button for back to main menu
		JButton btnNewButton_1 = new JButton("Main Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				setVisible(false);
			 	new frame();
				
			}
		});
		
		// set icon,size,font
		ImageIcon img1= new ImageIcon(new ImageIcon( /*C:\\Users\\Asus\\Desktop\\project4\\*/  "menu.png").getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
		btnNewButton_1 .setIcon(img1);
		btnNewButton_1.setForeground(new Color(128, 0, 128));
		btnNewButton_1.setFont(new Font("Dubai Medium", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(216, 191, 216));
		btnNewButton_1.setBounds(346, 13, 150, 37);
		 contentPane .add(btnNewButton_1);
		 
		 
		 //we should write the name of players at the two sides of board
		 JLabel lblNewLabel_1 = new JLabel("*"+p2+"*");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setForeground(new Color(128, 0, 128));
			lblNewLabel_1.setBounds(5, 55, 150, 29);
			contentPane .add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("*"+p1+"*");
			lblNewLabel_2.setForeground(new Color(128, 0, 128));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_2.setBounds(613, 55, 150, 29);
			contentPane .add(lblNewLabel_2);
		
			
			//we make a textfield for write whoes turn is
		  JTextField  text = new JTextField( );
		  text.setBounds(250, 55, 150, 29);
	      contentPane.add(text);
		  
		  
		 panel.setLayout(null);
			
		 
		 //for the board of game we make button for every home
			JButton[][] btn=new JButton[n][n]; 
			//we use gridlayout to have all button in same size
			panel.setLayout(new GridLayout(n,n,0,0 ) );
			
			
			//for have a board like chess game we print all button in 2 color gray and white
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
				if((i==j)|| ((i-j)%2==0)||((j-i)%2==0) ) {
					
					btn[i][j]=new JButton( );
					 
	            	btn[i][j].setBounds(0,0,100,100);
					btn[i][j].setBackground(new Color(105, 105, 105)); 
					btn[i][j].setBounds(0,0,100,100);
					panel.add(btn [i][j]);}
					else   {
						btn[i][j]=new JButton( );
						 
						btn[i][j].setBounds(0,0,100,100);
						btn[i][j].setBackground(new Color(211,211 ,211));
						
						btn[i][j].setBounds(0,0,100,100);
						panel.add(btn [i][j]);}
				//and at the end we add it into panel
				
				}}
			
		
			
			
			
			//set icon for some home as a game piece
			int k=m;
			int o=m;
			//for all homes in right -down
			 for(int z=0;z<k ;z++) {  

				 
				 for(int f=0;f<o;f++) {
					 
					 
						btn[z][f] .setIcon(q);	 
						 
					 
				 }o--;
				  
				 }
			//for all homes in left -up
			int  y=m;
			 int d=n-m;

			 
				for(int p=n-1;p >=d  ;p--) {
				 
				 for(int l=n-1;l>=(n-y);l--) {
					 
					 
						btn[p][l] .setIcon(u);	 
					 
				 } y--;	
				
			 } 
				
				
				
			
			//for first time we think is player1's turn
			
			text.setText(p1+"'s turn");	
			
			
			
			
			
			
			
		//for the all button we should add actionlistener to know what should  do if we click to a button	
 		for(int i=0;i<n;i++) {
 				for(int j=0;j<n;j++) {
		btn[i][j].addActionListener(new ActionListener(){
						 public void actionPerformed(ActionEvent e) {	
							
								 	//we take a variable for calculate when we click is for first time or second time (for chose or for move game piece)
							 
							 
							//we take even number of count for first click and chose
								 if (counter % 2 == 0 &&harekat==false ) {//this is for first move
									 for(int i1=0;i1<n;i1++) {
											for(int j2=0;j2<n;j2++) {
												if(e.getSource().equals(btn[i1][j2])) {
													//we save i & j of first home
													x0=i1;
													  y0 = j2;
													  
										//counter after chose piece should++	
										counter++;
									 
										}}}}	
								//we take odd number of count for second click and move
									else if (counter % 2 == 1) {//this is for second move
										
										 
										  for(int i1=0;i1<n;i1++) {
												for(int j2=0;j2<n;j2++) {
													if(e.getSource().equals(btn[i1][j2])) {
														//we save i & j of second home
														x1=i1;
														  y1 = j2;}}}
													 
										  //when we want to move game piece we should know it is for first player or second ad we define it by their icon
										  //we check icon for first player
													 	  if(  btn[x0][y0].getIcon().equals(u) /*&& nobat==false*/   ) {
													  	//for simple move to all 8 direction we should check the destination is null or no
															   if(((((x1==x0)&&(y1==y0+1))||((x1==x0+1)&&(y1==y0+1))  || ((x1==x0-1)&&(y1==y0+1))  ||
																	   ((x1==x0+1)&&(y1==y0)) ||((x1==x0-1)&&(y1==y0))|| 
																	   ((x1==x0-1)&&(y1==y0-1))||((x1==x0)&&(y1==y0-1)) ||((x1==x0+1)&&(y1==y0-1)))&&(btn[x1][y1].getIcon()==null) )
																	     ) {
															//after we should pick up game piece of first home and set it on second home	   
														  btn[x1][y1].setIcon(u); 
													 
														  btn[x0][y0].setIcon(null);  
													  
													 
														  
														  /////?
														   harekat=true;
														   
														   
														  //we change the turn after one move
														   turn++;
														 	 
														    if(turn%2==0) {text.setText(p1+"'s turn");}
															 else if(turn%2==1) {text.setText(p2+"'s turn");}
															
															 
															 
															 //calculate the number of movement
															    mohre1++;
															
															    /////?
															nobat=true;
															
															
															//after every movement we should call win method to check if one player win the game make it finish
 														 	  winner(btn,u,q,p1,p2,m  ); 
// 														   int w = winner(btn,u,q,p1,p2,m);
// 															   JOptionPane.showMessageDialog(null, w  ); 
//		 								 		                if(w==1) {
//		 								 		                	JOptionPane.showMessageDialog(null, p1+"  win:))");
//		 								 		
//		 								 		                                                     try { 
//		 																								 FileWriter f=new FileWriter("score.txt" ,true );
//		 																								 
//		 																								   f.write  ("{  "+p1+" ==> "+mohre1 +"  }\n");
//		 																								  
//		 																								  
//		 																								   f.close();
//		 																								    } 
//		 																									 catch (IOException e3) {
//		 																								     
//		 																								      e3.printStackTrace();
//		 																								    }	 }
//		 								 		                
//		 								 		                
//		 								 		                
//		 								 		               
//		 								 		                else {           if(w==2) {
//		 								 		
//		 								 		                	JOptionPane.showMessageDialog(null, p2+"  win:))");
//		 								 		                                                     try { 
//		 																								 FileWriter f=new FileWriter("score.txt" ,true );
//		 																								 
//		 																								   f.write  ("{  "+p2+" ==> "+mohre2 +"  }\n");
//		 																								  
//		 																								  
//		 																								   f.close();
//		 																								    } 
//		 																									 catch (IOException e2) {
//		 																								     
//		 																								      e2.printStackTrace();
//		 																								    }	 }}
											                 
															
															 
															 
								//counter after move piece should++				 
										counter++;
									 	 }
 															  // if after check 8 direction one of them was not null we should jump from that home  
  															   else   if((  (((x1==x0)&&(y1==y0+2))&&(btn[x1][y1-1].getIcon()!=null))  ||  (((x1==x0+2)&&(y1==y0+2))&&(btn[x1-1][y1-1].getIcon()!=null))  || 
  																	  (((x1==x0-2)&&(y1==y0+2))&&(btn[x1+1][y1-1].getIcon()!=null))  ||
 																	  (((x1==x0+2)&&(y1==y0))&&(btn[x1-1][y1].getIcon()!=null)) || (((x1==x0-2)&&(y1==y0))&&(btn[x1+1][y1].getIcon()!=null))  || 
 																	   (((x1==x0-2)&&(y1==y0-2))&&(btn[x1+1][y1+1].getIcon()!=null))  ||  (((x1==x0)&&(y1==y0-2))&&(btn[x1][y1+1].getIcon()!=null)) ||
 																	   (((x1==x0+2)&&(y1==y0-2))&&(btn[x1-1][y1+1]!=null))  )
  																	   &&(btn[x1][y1].getIcon()==null)  ) {
  																   
  																//after we should pick up game piece of first home and set it on second home
 																   
 														  btn[x1][y1].setIcon(u); 
 													 
 														  btn[x0][y0].setIcon(null);  
 													  
 													 
 														  
 														  ////?
 														   harekat=true;
 														 
 														   
 														   //calculate the number of movement
 														   mohre1++;
 														   
 													 
 					 															   
 					 															   
 														/*   move(btn,x1,y1,n,u,q);*/ 
 														   
 														  //we change the turn after one move
  														   turn++;
 														 	 
 														   
 															 if(turn%2==0) {text.setText(p1+"'s turn");}
 															 else if(turn%2==1) {text.setText(p2+"'s turn");}
//															 
//															 
//															////? 
 														    nobat=true;
                                                           
 														    
 														 //after every movement we should call win method to check if one player win the game make it finish
 															    winner(btn,u,q,p1,p2,m  ); 
// 															  int w = winner(btn,u,q,p1,p2,m);
//// 															   JOptionPane.showMessageDialog(null, w  ); 
// 															 JOptionPane.showMessageDialog(null, w  ); 
// 		 								 		                if(w==1) {
// 		 								 		                	JOptionPane.showMessageDialog(null, p1+"  win:))");
// 		 								 		
// 		 								 		                                                     try { 
// 		 																								 FileWriter f=new FileWriter("score.txt" ,true );
// 		 																								 
// 		 																								   f.write  ("{  "+p1+" ==> "+mohre1 +"  }\n");
// 		 																								  
// 		 																								  
// 		 																								   f.close();
// 		 																								    } 
// 		 																									 catch (IOException e3) {
// 		 																								     
// 		 																								      e3.printStackTrace();
// 		 																								    }	 }
// 		 								 		                
// 		 								 		                
// 		 								 		                
// 		 								 		               
// 		 								 		                else {     if(w==2) {
// 		 								 		
// 		 								 		                	JOptionPane.showMessageDialog(null, p2+"  win:))");
// 		 								 		                                                     try { 
// 		 																								 FileWriter f=new FileWriter("score.txt" ,true );
// 		 																								 
// 		 																								   f.write  ("{  "+p2+" ==> "+mohre2 +"  }\n");
// 		 																								  
// 		 																								  
// 		 																								   f.close();
// 		 																								    } 
// 		 																									 catch (IOException e2) {
// 		 																								     
// 		 																								      e2.printStackTrace();
// 		 																								    }	 }}
  											                 
 														 
 															 
 															 
 														 
 															 
  									counter++; 
									 	 } }
 	  
													 	  
													 	  
													 	  
														 	  
													 	  
													 	  
										 //when we want to move game piece we should know it is for first player or second ad we define it by their icon
											  //we check icon for first player
														   else if(  btn[x0][y0].getIcon().equals(q) /*&&nobat==true*/ ) {
															   
														 //for simple move to all 8 direction we should check the destination is null or no
														  if((((x1==x0)&&(y1==y0+1))||((x1==x0+1)&&(y1==y0+1))  ||
																   ((x1==x0-1)&&(y1==y0+1))  ||  ((x1==x0+1)&&(y1==y0)) ||((x1==x0-1)&&(y1==y0))||
																   ((x1==x0-1)&&(y1==y0-1))||((x1==x0)&&(y1==y0-1)) ||((x1==x0+1)&&(y1==y0-1)))&&(btn[x1][y1].getIcon()==null)  ) {
															 
															//after we should pick up game piece of first home and set it on second home
															  btn[x1][y1].setIcon(q);  
															 
															  btn[x0][y0].setIcon(null); 
															  
															  ////?
															   harekat=true;
															  
															 //we change the turn after one move 
										 					   turn++;
										                 if(turn%2==0) {text.setText(p1+"'s turn");}
							                            else if(turn%2==1) {text.setText(p2+"'s turn");}
										                 
										                 
										                 //calculate the number of movement for scores
										               mohre2++;
										               
										               
										               ////?
										               nobat=false;
										               
										               
										               //after every movement we should call win method to check if one player win the game make it finish
										                winner(btn,u,q,p1,p2,m  );
 //									                 int w = winner(btn,u,q,p1,p2,m);
//										                 JOptionPane.showMessageDialog(null, w  ); 
// 									                JOptionPane.showMessageDialog(null, w  ); 
//	 								 		                if(w==1) {
//	 								 		                	JOptionPane.showMessageDialog(null, p1+"  win:))");
//	 								 		
//	 								 		                                                     try { 
//	 																								 FileWriter f=new FileWriter("score.txt" ,true );
//	 																								 
//	 																								   f.write  ("{  "+p1+" ==> "+mohre1 +"  }\n");
//	 																								  
//	 																								  
//	 																								   f.close();
//	 																								    } 
//	 																									 catch (IOException e3) {
//	 																								     
//	 																								      e3.printStackTrace();
//	 																								    }	 }
//	 								 		                
//	 								 		                
//	 								 		                
//	 								 		               
//	 								 		                else {   if(w==2) {
//	 								 		                	JOptionPane.showMessageDialog(null, p2+"  win:))");
//	 								 		
//	 								 		                                                     try { 
//	 																								 FileWriter f=new FileWriter("score.txt" ,true );
//	 																								 
//	 																								   f.write  ("{  "+p2+" ==> "+mohre2 +"  }\n");
//	 																								  
//	 																								  
//	 																								   f.close();
//	 																								    } 
//	 																									 catch (IOException e2) {
//	 																								     
//	 																								      e2.printStackTrace();
//	 																								    }	 }}
									                 
										 //counter after move piece should++                   
										counter++;
											}
														  // if after check 8 direction one of them was not null we should jump from that home  
														  else   if((  (((x1==x0)&&(y1==y0+2))&&(btn[x1][y1-1].getIcon()!=null))  ||  (((x1==x0+2)&&(y1==y0+2))&&(btn[x1-1][y1-1].getIcon()!=null))  || 
																	  (((x1==x0-2)&&(y1==y0+2))&&(btn[x1+1][y1-1].getIcon()!=null))  ||
																	  (((x1==x0+2)&&(y1==y0))&&(btn[x1-1][y1].getIcon()!=null)) || (((x1==x0-2)&&(y1==y0))&&(btn[x1+1][y1].getIcon()!=null))  || 
																	   (((x1==x0-2)&&(y1==y0-2))&&(btn[x1+1][y1+1].getIcon()!=null))  ||  (((x1==x0)&&(y1==y0-2))&&(btn[x1][y1+1].getIcon()!=null)) ||
																	   (((x1==x0+2)&&(y1==y0-2))&&(btn[x1-1][y1+1]!=null))  )
																	   &&(btn[x1][y1].getIcon()==null)  ) {
														
															//after we should pick up game piece of first home and set it on second home
 															  btn[x1][y1].setIcon(q);  
//																 
 															  btn[x0][y0].setIcon(null); 
//															  
 															  ////?
  															   harekat=true;
  															   
  															   
  															   
  															   //calculate the number of movement for scores
 															   mohre2++; 
  											     
 															  /*     move(btn,x1,y1,n,u,q); */
 															   
 															   
 															   // we change the turn after one move
 										 					   turn++;
 										                 if(turn%2==0) {text.setText(p1+"'s turn");}
  							                            else if(turn%2==1) {text.setText(p2+"'s turn");}
//										                 
//										                 
//										               
//														////? 
 										              nobat=false;
 										           
 										           //after every movement we should call win method to check if one player win the game make it finish
 										                winner(btn,u,q,p1,p2,m  );
 //									                int w  = winner(btn,u,q,p1,p2,m);
// 										              
// 									               JOptionPane.showMessageDialog(null, w  ); 
// 								 		                if(w ==1) {
// 								 		                	JOptionPane.showMessageDialog(null, p1+"  win:))");
// 								 		
// 								 		                                                     try { 
// 																								 FileWriter f=new FileWriter("score.txt" ,true );
// 																								 
// 																								   f.write  ("{  "+p1+" ==> "+mohre1 +"  }\n");
// 																								  
// 																								  
// 																								   f.close();
// 																								    } 
// 																									 catch (IOException e0) {
// 																								     
// 																								      e0.printStackTrace();
// 																								    }	 }
// 								 		             
// 								 		                else {    if(w ==2) {
//								 		
// 								 		                	JOptionPane.showMessageDialog(null, p2+"  win:))");
//								 		                                                     try { 
//																								 FileWriter f=new FileWriter("score.txt" ,true );
//																								 
//																								   f.write  ("{  "+p2+" ==> "+mohre2 +"  }\n");
//																								  
//																								  
//																								   f.close();
//																								    } 
//																									 catch (IOException e1) {
//																								     
//																								      e1.printStackTrace();
//																								    }	 }
// 								 		                }
									                   
 										counter++;
											 } }
													 	   
														   
														  	   
								 	 
											 }			 
														  
													 	   						   
							 	
								///?? 
								 
							  harekat=false;
						  
				}
				 } );
				
			 	}} 
 		
 		 
 		///write in file
 		
 		
 		
  
 		   try { 
 				 FileWriter f=new FileWriter("score.txt" ,true );
 			 
 			   f.write  ("{  "+p1+" ==> "+mohre1+" & "+p2+" ==> " +mohre2+" }\n");
 				  
 				  
 				   f.close();
 				    } 
  					 catch (IOException e1) {
 				     
 				      e1.printStackTrace();
 				    }	 
 		                
 		                
 		                
 		                
		
	
			
			
	}
 
 //a return type method for checking who win the game(if they goes to each other home they win)
	public  static void   winner(JButton[][] btn,ImageIcon im ,ImageIcon Im,String p1,String p2,int m  )  {
		int w1=0;
		 
		int total=(((m)*(m+1))/2);//the number of game piece or icon for each player 
		int k=m;
		int o=m;
		int count=0;
		int Count=0;
		 //check if all of homes in right- down have second player icon or game piece, second player win
	for(int z=0;z<k ;z++) {
		 
		 for(int f=0;f<o;f++) {
			 if(btn[z][f].getIcon()==null) {}
			 else if(	 btn[z][f] .getIcon().equals (im))  {count++;}
			 
		 
		 }o--;
		  
		 }
	
		
	   
	int  y=m;
	 int d=n-m;

	 //check if all of homes in left- up have first player icon, first player win
		for(int p=n-1;p >=d  ;p--) {
		 
		 for(int l=n-1;l>=(n-y);l--) {
			  
			 if(btn[p][l].getIcon()==null) {}
			 else if(	 btn[p][l] .getIcon().equals (Im))  {Count++;} 
			 
		 } y--;	
		
	 } 
		
		
		if(Count==total) {
			 //show massage who win
		   JOptionPane.showMessageDialog(null,p2+ "  win:))");
			  btn[n][n].setEnabled(false); 
			  
			 
		 }
			  
		else { if(count==total) {
		 //show massage who win
		  JOptionPane.showMessageDialog(null, p1+"  win:))");
		  btn[n][n].setEnabled(false);
		  
	 }	   
		}
	 
		 }
	  
	 
	//a return type method for checking who win the game(if they goes to each other home they win)
	/*	public  int  winner(JButton[][] btn,ImageIcon im ,ImageIcon Im,String p1,String p2,int m  )  {
			int w1=0;
			 
			int total=(((m)*(m+1))/2);//the number of game piece or icon for each player 
			int k=m;
			int o=m;
			int count=0;
			int Count=0;
			 //check if all of homes in right- down have second player icon or game piece, second player win
		for(int z=0;z<k ;z++) {
			 
			 for(int f=0;f<o;f++) {
				 if(btn[z][f].getIcon()==null) {}
				 else if(	 btn[z][f] .getIcon().equals (im))  {count++;}
				 
			 
			 }o--;
			  
			 }
		
			
		   
		int  y=m;
		 int d=n-m;

		 //check if all of homes in left- up have first player icon, first player win
			for(int p=n-1;p >=d  ;p--) {
			 
			 for(int l=n-1;l>=(n-y);l--) {
				  
				 if(btn[p][l].getIcon()==null) {}
				 else if(	 btn[p][l] .getIcon().equals (Im))  {Count++;} 
				 
			 } y--;	
			
		 } 
			
			
			if(Count==total) {
			 
			 
				  btn[n][n].setEnabled(false); 
				  
			 
				  w1=2;
			 return w1;
			 }
				  
			else { if(count==total) {
			 
			  btn[n][n].setEnabled(false);
			 
			  w1=1;
			   return w1;
		 }	   
			else {return w1;}}
			 
			 }*/
		  
	
	
	
	
	
	
	
//a recursive function for chain jump ,i think its algorithm is ok but it doesn't work correct 
	
 /*	public static  void move  ( JButton[][] btn,int x0,int y0,int n,ImageIcon i1,ImageIcon i2 ) {
		 
	    for(int i=0;i<n;i++) {
             for(int j=0;j<n;j++) {
              if(i!=x0&&j!=y0) {   btn[i][j].setEnabled(false);}}}
              
							 
		 if(btn[x0][y0].getIcon().equals(i2)) {
				if((btn[x0-1][y0+1].getIcon()!=null)&&(btn[x0-2][y0+2].getIcon()==null)) {
					 
					btn[x0-2][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0+2].setIcon(i2);
					move(btn,x0-2,y0+2,n,i1,i2);
		      }
				
				else if((btn[x0 ][y0+1].getIcon()!=null)&&(btn[x0  ][y0+2].getIcon()==null)) {
					 
					btn[x0 ][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0][y0+2].setIcon(i2);
					move(btn,x0 ,y0+2,n,i1,i2);
		      }
				
				else if((btn[x0+1][y0+1].getIcon()!=null)&&(btn[x0+2][y0+2].getIcon()==null)) {
					 
					btn[x0+2][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0+2].setIcon(i2);
					move(btn,x0+2,y0+2,n,i1,i2);
		      }
					
				else 	if((btn[x0+1][y0].getIcon()!=null)&&(btn[x0+2][y0].getIcon()==null)) {
					 
					btn[x0+2][y0 ].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0].setIcon(i2);
					
					move(btn,x0+2,y0,n,i1,i2 );
		      }
				
				
				else if((btn[x0+1][y0-1].getIcon()!=null)&&(btn[x0+2][y0-2].getIcon()==null)) {
					 
					btn[x0+2][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0-2].setIcon(i2);
					move(btn,x0+2,y0-2,n,i1,i2);
		      }
				
				
				
				
				else if((btn[x0 ][y0-1].getIcon()!=null)&&(btn[x0 ][y0-2].getIcon()==null)) {
					 
					btn[x0 ][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0][y0-2].setIcon(i2);
					move(btn,x0  ,y0-2,n,i1,i2);
		      }
				
			
				
				
				else	if((btn[x0-1][y0-1].getIcon()!=null)&&(btn[x0-2][y0-2].getIcon()==null)) {
					 
					btn[x0-2][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0-2].setIcon(i2);
					move(btn,x0-2,y0-2,n,i1,i2);
		      }
				
				
				
				else 	if((btn[x0-1][y0 ].getIcon()!=null)&&(btn[x0-2][y0 ].getIcon()==null)) {
					 
					btn[x0-2 ][y0 ].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0].setIcon(i2);
					move(btn,x0-2,y0,n,i1,i2 );
		      }
				 }
									 					
		 if(btn[x0][y0].getIcon().equals(i1)) {
				if((btn[x0-1][y0+1].getIcon()!=null)&&(btn[x0-2][y0+2].getIcon()==null)) {
					 
					btn[x0-2][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0+2].setIcon(i1);
					move(btn,x0-2,y0+2,n,i1,i2);
		      }
				
				else if((btn[x0 ][y0+1].getIcon()!=null)&&(btn[x0  ][y0+2].getIcon()==null)) {
					 
					btn[x0 ][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0][y0+2].setIcon(i1);
					move(btn,x0 ,y0+2,n,i1,i2);
		      }
				
				else if((btn[x0+1][y0+1].getIcon()!=null)&&(btn[x0+2][y0+2].getIcon()==null)) {
					 
					btn[x0+2][y0+2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0+2].setIcon(i1);
					move(btn,x0+2,y0+2,n,i1,i2);
		      }
					
				else 	if((btn[x0+1][y0].getIcon()!=null)&&(btn[x0+2][y0].getIcon()==null)) {
					 
					btn[x0+2][y0 ].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0].setIcon(i1);
					
					move(btn,x0+2,y0,n,i1,i2 );
		      }
				
				
				else if((btn[x0+1][y0-1].getIcon()!=null)&&(btn[x0+2][y0-2].getIcon()==null)) {
					 
					btn[x0+2][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0+2][y0-2].setIcon(i1);
					move(btn,x0+2,y0-2,n,i1,i2);
		      }
				
				
				
				
				else if((btn[x0 ][y0-1].getIcon()!=null)&&(btn[x0 ][y0-2].getIcon()==null)) {
					 
					btn[x0 ][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0][y0-2].setIcon(i1);
					move(btn,x0  ,y0-2,n,i1,i2);
		      }
				
			
				
				
				else	if((btn[x0-1][y0-1].getIcon()!=null)&&(btn[x0-2][y0-2].getIcon()==null)) {
					 
					btn[x0-2][y0-2].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0-2].setIcon(i1);
					move(btn,x0-2,y0-2,n,i1,i2);
		      }
				
				
				
				else 	if((btn[x0-1][y0 ].getIcon()!=null)&&(btn[x0-2][y0 ].getIcon()==null)) {
					 
					btn[x0-2 ][y0 ].setEnabled(true);
					btn[x0][y0].setIcon(null);
					btn[x0-2][y0].setIcon(i1);
					move(btn,x0-2,y0,n,i1,i2 );
		      }
				 }
									 					 
		 
							 
						 
						 
						 
						 
						 
						 
						 
 	}*/
	 
		 		 
		 				 
						 
						 
						 
						 
			
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

