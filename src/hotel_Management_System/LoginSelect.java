package hotel_Management_System;

import javax.imageio.ImageIO;
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
import java.io.IOException;

class Login_Select extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton badmin,bstaff;

public Login_Select()
{
	super("Select Login");   
    pan = new JPanel();   
    pan.setLayout(null);   
	

	badmin=new JButton();
	badmin.setBackground(Color.WHITE);
    ImageIcon img = new ImageIcon("images\\login_icon.png");
    badmin.setIcon(img);
    badmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    badmin.setToolTipText("Login as Admin"); 
    badmin.addActionListener(this);
    
			
	bstaff=new JButton();
	bstaff.setBackground(Color.WHITE);
    ImageIcon img1 = new ImageIcon("images\\Staff-Icons-Staffing1.png");
    bstaff.setIcon(img1);
    bstaff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bstaff.setToolTipText("Enter as Staff"); 
    bstaff.addActionListener(this);
    
	
	setLayout(new BorderLayout());
	JLabel background=new JLabel(new ImageIcon("images\\sky_abstract_1366x768.jpg"));
	background.setLayout(new FlowLayout());
	
	badmin.setBounds(300,250,230,270);  
	bstaff.setBounds(900,250,230,270);  
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(badmin);   
    pan.add(bstaff);   
 
    
    pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
}

public void actionPerformed(ActionEvent e) 
{
	
	
	if(e.getSource() == badmin)
	{
		
          new Login_Admin();
          setVisible(false);
          
	}
	
	if(e.getSource() == bstaff)		
	{		
		
		new Login_Staff();
		setVisible(false);
		
	}
	
	
	}
}

public class LoginSelect 
{

	
	public static void main(String[] args) 
	{
	
		new Login_Select();
		
	}

}
