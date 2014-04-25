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

class RestaurantSelect1 extends JFrame implements ActionListener
{
	JPanel pan;   
	private JButton menuUpdate;
	private JButton menuAdd;
	private JButton menuView;	
	private JButton restBill;
	public RestaurantSelect1()
	{
            super("");
		
	    pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    menuUpdate = new JButton();

	    ImageIcon img1 = new ImageIcon("images\\updateitem.png");
	    menuUpdate.setIcon(img1);	    
	    menuUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    menuUpdate.setToolTipText("Click To Update Restaurant Item");
	    menuUpdate.addActionListener(this);
		   
	    menuAdd = new JButton();	    
	    ImageIcon img2 = new ImageIcon("images\\additem.png");	    
	    menuAdd.setIcon(img2);
	    menuAdd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    menuAdd.setToolTipText("Click To Add Restaurant Item");
	    menuAdd.addActionListener(this);
		   
	    menuView = new JButton();	   
	    ImageIcon img3 = new ImageIcon("images\\viewitem.png");	   
	    menuView.setIcon(img3);
	    menuView.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    menuView.setToolTipText("Click To View Restaurant Item");
	    menuView.addActionListener(this);
	    
	    restBill = new JButton();

	    ImageIcon img17= new ImageIcon("images\\viewrestautrantbill.png");
	    restBill.setIcon(img17);	    
	    restBill.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    restBill.setToolTipText("Click To view Restaurant Bill");
	    restBill.addActionListener(this);
	    
	    setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images\\restaurantselect.jpg"));
		
		 menuUpdate.setBounds(232,200,210,40);  
		 menuAdd.setBounds(7,200,210,40); 
		 menuView.setBounds(7,254,210,40);
		 restBill.setBounds(232,254,210,40);
		
		 background.setBounds(0,0,450,445);
			
			pan.add( menuUpdate);
		    pan.add( menuAdd);
		    pan.add( menuView);
		    pan.add(restBill);
		    
		    pan.add(background);
		    
		    getContentPane().add(pan);    

		    setSize(465,460);   
		    setLocation(458,161);   
		    setVisible(true);   

		  
		
	}


		public void actionPerformed(ActionEvent e)
		{
			
	if(e.getSource() == menuAdd)
				
			{
			
				new RestaurantMenuAdd1();
				dispose();
		}
			
	         if(e.getSource() ==menuUpdate)
				
			{
			
				new RestaurantMenuSearch1();
				dispose();
		}
			
	         if(e.getSource() == menuView)
	 			
	 		{
	 		
	 			new RestaurantMenuDisplay();
	 			dispose();
			
		}
	         
	         if(e.getSource() == restBill)
		 			
		 		{
		 		
		 			new RestaurantBillDisplay();
		 			
				
			}
		
	}
         
}


public class RestaurantSelect
{

	
	public static void main(String[] args) 
	{
		new RestaurantSelect1();

	}

}
