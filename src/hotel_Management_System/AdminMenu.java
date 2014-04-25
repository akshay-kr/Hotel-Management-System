package hotel_Management_System;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


import java.awt.Color;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

class AdminMenu1 extends JFrame implements ActionListener,MouseListener
{
	JPanel pan;   
	private JButton staffUpdate;
	private JButton staffAdd;
	private JButton staffView;
	private JButton roomUpdate;
	private JButton roomAdd;
	private JButton roomView;
	private JButton guestDetails;
	private JButton restaurantArea;
	private JLabel logout;
	
	public AdminMenu1()
	{
		super("");   
	    pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    staffUpdate = new JButton();
	    
	    logout=new JLabel("");
	    ImageIcon img23 = new ImageIcon("images\\logoutblue.png");
	    logout.setIcon(img23);
	   
	    logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   
	    logout.setForeground(Color.BLUE);
	    logout.setToolTipText("Click To Log Out "); 
	    logout.addMouseListener(this);
	       

	    ImageIcon img1 = new ImageIcon("images\\updatestaff1.png");
	    ImageIcon img2 = new ImageIcon("images\\updatestaff.png");
	    staffUpdate.setIcon(img1);
	    staffUpdate.setRolloverIcon(img2);
	    staffUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    staffUpdate.setToolTipText("Click To Update Staff Information");
	    staffUpdate.addActionListener(this);
		   
	    staffAdd = new JButton();
	    ImageIcon img3 = new ImageIcon("images\\addstaff1.png");
	    ImageIcon img4 = new ImageIcon("images\\addstaff.png");
	    staffAdd.setIcon(img3);
	    staffAdd.setRolloverIcon(img4);
	    staffAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    staffAdd.setToolTipText("Click To Add Staff Information");
	    staffAdd.addActionListener(this);
		   
	    staffView = new JButton();
	    ImageIcon img5 = new ImageIcon("images\\viewstaff1.png");
	    ImageIcon img6 = new ImageIcon("images\\viewstaff.png");
	    staffView.setIcon(img5);
	    staffView.setRolloverIcon(img6);
	    staffView.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    staffView.setToolTipText("Click To View Staff Information");
	    staffView.addActionListener(this);
	    
	    roomUpdate = new JButton();
	    ImageIcon img7 = new ImageIcon("images\\updateroom1.png");
	    ImageIcon img8 = new ImageIcon("images\\updateroom.png");
	    roomUpdate.setIcon(img7);
	    roomUpdate.setRolloverIcon(img8);
	    roomUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    roomUpdate.setToolTipText("Click To Update Room Information");
	    roomUpdate.addActionListener(this);
		   
	    roomAdd = new JButton();
	    ImageIcon img9 = new ImageIcon("images\\addroom1.png");
	    ImageIcon img10 = new ImageIcon("images\\addroom.png");
	    roomAdd.setIcon(img9);
	    roomAdd.setRolloverIcon(img10);
	    roomAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    roomAdd.setToolTipText("Click To Add Room Information");
	    roomAdd.addActionListener(this);
		   
	    roomView = new JButton();
	    ImageIcon img11 = new ImageIcon("images\\viewroom1.png");
	    ImageIcon img12 = new ImageIcon("images\\viewroom.png");
	    roomView.setIcon(img11);
	    roomView.setRolloverIcon(img12);
	    roomView.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    roomView.setToolTipText("Click To View Room Information");
	    roomView.addActionListener(this);
		   
	    guestDetails = new JButton();
	    ImageIcon img13 = new ImageIcon("images\\viewguest1.png");
	    ImageIcon img14 = new ImageIcon("images\\viewguest.png");
	    guestDetails.setIcon(img13);
	    guestDetails.setRolloverIcon(img14);
	    guestDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    guestDetails.setToolTipText("Click To View Guest Details");
	    guestDetails.addActionListener(this);
	    
	    restaurantArea = new JButton();
	    ImageIcon img15 = new ImageIcon("images\\restaurantarea1.png");
	    ImageIcon img16 = new ImageIcon("images\\restaurantarea.png");
	    restaurantArea.setIcon(img15);
	    restaurantArea.setRolloverIcon(img16);
	    restaurantArea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    restaurantArea.setToolTipText("Click To Enter Restaurant Area");
	    restaurantArea.addActionListener(this);
	    
	    
	    Font f1=new Font("Verdana",Font.BOLD,14);
	    
	  
		
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images\\adminmenu.png"));
		
		staffUpdate.setBounds(80,356,323,40);  
		staffAdd.setBounds(80,125,322,40); 
		staffView.setBounds(80,595,322,40);
		roomUpdate.setBounds(940,356,323,40);
		roomAdd.setBounds(936,125,322,40);  
		roomView.setBounds(939,593,322,40); 
		guestDetails.setBounds(513,358,323,40);
		restaurantArea.setBounds(513,596,323,40);
		logout.setBounds(575,230,200,30);
		
		background.setBounds(0,0,1366,768);
		
		pan.add(staffUpdate);
	    pan.add(staffAdd);
	    pan.add(staffView);
	    pan.add(roomUpdate);
	    pan.add(roomAdd);
	    pan.add(roomView);
	    pan.add(guestDetails);
	    pan.add(restaurantArea);
	    pan.add(logout);
	    
	    pan.add(background);
	    
	    getContentPane().add(pan);   

	    setSize(1366,768);   
	    setLocation(0,0);   
	    setVisible(true);   

	    setDefaultCloseOperation(EXIT_ON_CLOSE);     
	   
	    

}

	public void actionPerformed(ActionEvent e) 
	
	{
		

		if(e.getSource() == staffAdd)
			
		{
		
			dispose();
			new AdminPart();
			
	}
		
         if(e.getSource() == staffUpdate)
			
		{
		       
        	
			new StaffInfoSearch();
			
	}
		
         if(e.getSource() == staffView)
 			
 		{
 		
 			new LoginDisplay();
 			
 	}
         
         if(e.getSource() == roomAdd)
 			
 		{
 		
        	 dispose();
 			new RoomAdd1();
 			
 	}
        
         if(e.getSource() == roomUpdate)
 			
 		{
        	
      
 		
 			new AdminRoomSearch1();
 			
 	}
         
         if(e.getSource() == roomView)
 			
 		{
 		
 			new RoomInformationDisplay();
 			
 	}
         
         if(e.getSource() == guestDetails)
 			
 		{
 		
 			new GuestDetailsSelect1();
 			
 	}
         
         if(e.getSource() == restaurantArea)
  			
  		{
  		
  			new RestaurantSelect1();
  			
  	}
         
}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == logout)
		{
			
		 ImageIcon img24 = new ImageIcon("images\\logoutgreen.png");
			logout.setIcon(img24);
			
			dispose();
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
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == logout)
		{
			
		 ImageIcon img24 = new ImageIcon("images\\logoutgreen.png");
			logout.setIcon(img24);
			
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == logout)
		{
			
		 ImageIcon img24 = new ImageIcon("images\\logoutblue.png");
			logout.setIcon(img24);
			
		}
		
	}
}


public class AdminMenu
{

	
	public static void main(String[] args) 
	{
		
		new AdminMenu1();

	}

}
