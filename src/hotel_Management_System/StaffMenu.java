package hotel_Management_System;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


 class StaffMenu1 extends JFrame implements MouseListener
{
	 JPanel panel;   
		private JLabel generateBill;
		private JLabel enterRestaurant;
		private JLabel checkOut;
		private JLabel checkAvail;
		private JLabel roomBook;
		private JLabel logout;
		private JLabel leftArrow1;
		private JLabel rightArrow1;
		private JLabel leftArrow2;
		private JLabel rightArrow2;
		private JLabel leftArrow3;
		private JLabel rightArrow3;
		private JLabel leftArrow4;
		private JLabel rightArrow4;
		private JLabel leftArrow5;
		private JLabel rightArrow5;
		public StaffMenu1()
		{
			super("");
			
			panel = new JPanel();   
		    panel.setLayout(null);  
			  
		    
		    Font f1=new Font("The Times Roman",Font.BOLD,30);
		    
		    generateBill=new JLabel("");
		    ImageIcon img1 = new ImageIcon("images\\generateBill.png");
		    generateBill.setIcon(img1);
		    generateBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			generateBill.setFont(f1);
			generateBill.setForeground(Color.BLUE);
			generateBill.setToolTipText("Generate Bill "); 
			generateBill.addMouseListener(this);
		       
			
			logout=new JLabel("");
		    ImageIcon img23 = new ImageIcon("images\\logoutblue.png");
		    logout.setIcon(img23);
		   
		    logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		    logout.setFont(f1);
		    logout.setForeground(Color.BLUE);
		    logout.setToolTipText("Click To Log Out "); 
		    logout.addMouseListener(this);
		       
			
			
			
			enterRestaurant=new JLabel("");
			ImageIcon img2 = new ImageIcon("images\\enterrestaurant.png");
			enterRestaurant.setIcon(img2);
			enterRestaurant.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			enterRestaurant.setFont(f1);
			enterRestaurant.setForeground(Color.BLUE);
			enterRestaurant.setToolTipText("Enter Restaurant"); 
			enterRestaurant.addMouseListener(this);   	
			
			checkOut=new JLabel("");
			ImageIcon img3 = new ImageIcon("images\\checkingout.png");
			checkOut.setIcon(img3);
			checkOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			checkOut.setFont(f1);
	        checkOut.setForeground(Color.BLUE);
			checkOut.setToolTipText("Check Out"); 
			checkOut.addMouseListener(this);  
			
			checkAvail=new JLabel("");
			ImageIcon img4= new ImageIcon("images\\checkavail.png");
			checkAvail.setIcon(img4);
			checkAvail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			checkAvail.setFont(f1);
			checkAvail.setForeground(Color.BLUE);
			checkAvail.setToolTipText("Check Avail");
			checkAvail.addMouseListener(this);
						
			roomBook=new JLabel("");	
			ImageIcon img5 = new ImageIcon("images\\roombook.png");
			roomBook.setIcon(img5);
			roomBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			roomBook.setFont(f1);
			roomBook.setForeground(Color.pink);
			roomBook.setToolTipText("Room Book");
			roomBook.addMouseListener(this);
			
			leftArrow1=new JLabel("");
			ImageIcon img6 = new ImageIcon("images\\leftarrow.png");
			leftArrow1.setIcon(img6);
			leftArrow1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			leftArrow1.setFont(f1);
			leftArrow1.setForeground(Color.pink);
			leftArrow1.setToolTipText("leftArrow1");
			leftArrow1.setVisible(false);
			
			
					
			rightArrow1=new JLabel("");
			ImageIcon img7 = new ImageIcon("images\\rightarrow.png");
			rightArrow1.setIcon(img7);
			rightArrow1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			rightArrow1.setFont(f1);
			rightArrow1.setForeground(Color.pink);
			rightArrow1.setToolTipText("rightArrow1"); 
			rightArrow1.setVisible(false);
			
			
			leftArrow2=new JLabel("");
			ImageIcon img8 = new ImageIcon("images\\leftarrow.png");
			leftArrow2.setIcon(img8);
			leftArrow2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			leftArrow2.setFont(f1);
			leftArrow2.setForeground(Color.pink);
			leftArrow2.setToolTipText("leftArrow2");
			leftArrow2.setVisible(false);
			
					
			rightArrow2=new JLabel("");
			ImageIcon img9 = new ImageIcon("images\\rightarrow.png");
			rightArrow2.setIcon(img9);
			rightArrow2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			rightArrow2.setFont(f1);
			rightArrow2.setForeground(Color.pink);
			rightArrow2.setToolTipText("rightArrow2"); 
			rightArrow2.setVisible(false);
			
			leftArrow3=new JLabel("");
			ImageIcon img10 = new ImageIcon("images\\leftarrow.png");
			leftArrow3.setIcon(img10);
			leftArrow3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			leftArrow3.setFont(f1);
			leftArrow3.setForeground(Color.pink);
			leftArrow3.setToolTipText("leftArrow3");
			leftArrow3.setVisible(false);
			
					
			rightArrow3=new JLabel("");
			ImageIcon img11 = new ImageIcon("images\\rightarrow.png");
			rightArrow3.setIcon(img11);
			rightArrow3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			rightArrow3.setFont(f1);
			rightArrow3.setForeground(Color.pink);
			rightArrow3.setToolTipText("rightArrow3"); 
			rightArrow3.setVisible(false);
			
			leftArrow4=new JLabel("");
			ImageIcon img12 = new ImageIcon("images\\leftarrow.png");
			leftArrow4.setIcon(img12);
			leftArrow4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			leftArrow4.setFont(f1);
			leftArrow4.setForeground(Color.pink);
			leftArrow4.setToolTipText("leftArrow4");
			leftArrow4.setVisible(false);
			
					
			rightArrow4=new JLabel("");
			ImageIcon img13= new ImageIcon("images\\rightarrow.png");
			rightArrow4.setIcon(img13);
			rightArrow4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			rightArrow4.setFont(f1);
			rightArrow4.setForeground(Color.pink);
			rightArrow4.setToolTipText("rightArrow4"); 
			rightArrow4.setVisible(false);
			
			leftArrow5=new JLabel("");
			ImageIcon img14 = new ImageIcon("images\\leftarrow.png");
			leftArrow5.setIcon(img14);
			leftArrow5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			leftArrow5.setFont(f1);
			leftArrow5.setForeground(Color.pink);
			leftArrow5.setToolTipText("leftArrow5");
			leftArrow5.setVisible(false);
			
					
			rightArrow5=new JLabel("");
			ImageIcon img15 = new ImageIcon("images\\rightarrow.png");
			rightArrow5.setIcon(img15);
			rightArrow5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
			rightArrow5.setFont(f1);
			rightArrow5.setForeground(Color.pink);
			rightArrow5.setToolTipText("rightArrow5"); 
			rightArrow5.setVisible(false);
			
			
			
			setLayout(new BorderLayout());
			JLabel background=new JLabel(new ImageIcon("images\\pp.png"));
			background.setLayout(new FlowLayout());
			
			
			generateBill.setBounds(908,469,335,220);  
	        enterRestaurant.setBounds(549,268,335,220);  
			checkOut.setBounds(908,87,335,220);  
			checkAvail.setBounds(158,87,335,220);  
			roomBook.setBounds(165,469,335,220);  
			logout.setBounds(595,650,335,60);

			 leftArrow1.setBounds(0,155,350,85);  
				rightArrow1.setBounds(439,155,328,85);  
				 leftArrow2.setBounds(730,155,340,85);  
					rightArrow2.setBounds(1180,155,330,85);  
					 leftArrow3.setBounds(380,340,340,85);  
						rightArrow3.setBounds(826,340,340,85);  
						 leftArrow4.setBounds(0,537,340,85);  
							rightArrow4.setBounds(444,535,350,85);  
							 leftArrow5.setBounds(730,535,350,85);  
								rightArrow5.setBounds(1180,535,350,85);  
		
		background.setBounds(0,0,1366,768);  
		
		
		 panel.add(generateBill);   
		 panel.add(enterRestaurant); 
		 panel.add(checkOut);   
		 panel.add(checkAvail);   
		 panel.add(roomBook);   
         panel.add(logout);
		 panel.add(leftArrow1);
		 panel.add(rightArrow1); 
		 panel.add(leftArrow2);
		 panel.add(rightArrow2); 
		 panel.add(leftArrow3);
		 panel.add(rightArrow3); 
		 panel.add(leftArrow4);
		 panel.add(rightArrow4); 
		 panel.add(leftArrow5);
		 panel.add(rightArrow5); 
		 panel.add(background);

		    getContentPane().add(panel);  
		 
		    setSize(1366, 768);
			setLocation(0,0);
			setResizable(false);
		
			setVisible(true);
			
			 setDefaultCloseOperation(EXIT_ON_CLOSE);    
		}
		@Override
		public void mouseClicked(MouseEvent e) 
		{
			
			if(e.getSource() == checkAvail)
			{
				
				new QuickRoomSearch1();
				
			}
			
			if(e.getSource() == roomBook)
			{
				
				new RoomSearch1();
				
			}
			
			if(e.getSource() == enterRestaurant)
			{
				
				new RestaurantEnter1();
			}
			
			if(e.getSource() == checkOut)
			{
				
				new CheckOut1();
			}
			
			if(e.getSource()==generateBill)
			{
				
				new BillSearch1();
				
			}
			if(e.getSource() == logout)
			{
				ImageIcon img24 = new ImageIcon("images\\logoutgreen.png");
				logout.setIcon(img24);
				
				new Login_Select();

				
			}
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e)
		{
			if(e.getSource() == checkAvail)
			{
				
				leftArrow1.setVisible(true);
				
				rightArrow1.setVisible(true);
			}


			if(e.getSource() == roomBook)
			{
				
				leftArrow4.setVisible(true);
				
				rightArrow4.setVisible(true);
			}
			
			if(e.getSource() == enterRestaurant)
			{
				
				leftArrow3.setVisible(true);
				
				rightArrow3.setVisible(true);
			}
			
			if(e.getSource() == checkOut)
			{
				
				leftArrow2.setVisible(true);
				
				rightArrow2.setVisible(true);
			}
			
			if(e.getSource() == generateBill)
			{
				
				leftArrow5.setVisible(true);
				
				rightArrow5.setVisible(true);
			}
			
			
			if(e.getSource() == logout)
			{
				
			 ImageIcon img24 = new ImageIcon("images\\logoutgreen.png");
				logout.setIcon(img24);
				
			}
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if(e.getSource() == checkAvail)
			{
				
				leftArrow1.setVisible(false);
				
				rightArrow1.setVisible(false);
			}
			
			if(e.getSource() == roomBook)
			{
				
				leftArrow4.setVisible(false);
				
				rightArrow4.setVisible(false);
			}
			
			
			if(e.getSource() == enterRestaurant)
			{
				
				leftArrow3.setVisible(false);
				
				rightArrow3.setVisible(false);
			}
			
			if(e.getSource() == checkOut)
			{
				
				leftArrow2.setVisible(false);
				
				rightArrow2.setVisible(false);
			}
			
			if(e.getSource() == generateBill)
			{
				
				leftArrow5.setVisible(false);
				
				rightArrow5.setVisible(false);
			}
			
			if(e.getSource()==logout)
			{
			ImageIcon img24 = new ImageIcon("images\\logoutblue.png");
			logout.setIcon(img24);
			
			}
		}
		
}
 


 class StaffMenu
 {

 			
 			public static void main(String args[])
 			{																
 				new StaffMenu1();
 			}

 }																

 		   
 	
 	
