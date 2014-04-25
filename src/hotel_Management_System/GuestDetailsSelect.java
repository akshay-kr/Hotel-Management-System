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

class GuestDetailsSelect1 extends JFrame implements ActionListener
{
	JPanel pan;   
	private JButton bookingdetail;
	private JButton billdetail;
	private JButton goback;	
	
	public GuestDetailsSelect1()
	{
            super("");
		
	    pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    bookingdetail = new JButton();

	    ImageIcon img1 = new ImageIcon("images\\guestbooking.png");
	    bookingdetail.setIcon(img1);	    
	    bookingdetail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    bookingdetail.setToolTipText("Click To Update Restaurant Item");
	    bookingdetail.addActionListener(this);
		   
	    billdetail = new JButton();	    
	    ImageIcon img2 = new ImageIcon("images\\guestbill.png");	    
	    billdetail.setIcon(img2);
	    billdetail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    billdetail.setToolTipText("Click To Add Restaurant Item");
	    billdetail.addActionListener(this);
		   
	    goback = new JButton();	   
	    ImageIcon img3 = new ImageIcon("images\\goback.png");	   
	    goback.setIcon(img3);
	    goback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    goback.setToolTipText("Click To View Restaurant Item");
	    goback.addActionListener(this);
	    
	    setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images\\guestdetailsselect.png"));
		
		 bookingdetail.setBounds(35,200,215,40);  
		 billdetail.setBounds(258,200,215,40); 
		 goback.setBounds(185,254,150,40);
		
		 background.setBounds(0,0,530,348);
			
			pan.add( bookingdetail);
		    pan.add( billdetail);
		    pan.add( goback);
		    
		    pan.add(background);
		    
		    getContentPane().add(pan);    

		    setSize(530,370);   
		    setLocation(458,161);   
		    setVisible(true);   

		   
		
	}


		public void actionPerformed(ActionEvent e)
		{
			
	if(e.getSource() == bookingdetail)
				
			{
			
				new GuestInformationDisplay();
				
		}
			
	         if(e.getSource() ==billdetail)
				
			{
			
				new FinalBillDisplay();
				
		}
			
	         if(e.getSource() == goback)
	 			
	 		{
	 		dispose();
	 			new AdminMenu1();
	 			
			
		}
		
	}
         
}


public class GuestDetailsSelect
{

	
	public static void main(String[] args) 
	{
		new GuestDetailsSelect1();

	}

}
