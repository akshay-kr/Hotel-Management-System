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

class Login_Admin extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton login;
private JButton cancel;
private JLabel lbl1;
private JLabel lbl2;
private String msgbox;


private JTextField loginid, password;

public Login_Admin()
{
	super("Select Login");   
    pan = new JPanel();   
    pan.setLayout(null);   
	
    Font f1=new Font("Verdana",Font.BOLD,11);
    
    lbl1 = new JLabel("Invalid Username");
    lbl1.setFont(f1);
    lbl1.setForeground(Color.RED);
   lbl1.setVisible(false);
    
    lbl2 = new JLabel("Password Should Be Of Minimum 6 Characters");
    lbl2.setFont(f1);
    lbl2.setForeground(Color.RED);
   lbl2.setVisible(false);
    
       loginid=new JTextField();
       loginid.setFont(f1);
       loginid.setToolTipText("Please enter the Username"); 
       loginid.addActionListener(this);
       
	   password=new JPasswordField();
	   password.setFont(f1);
	   password.setToolTipText("Please enter the Password"); 
	   password.addActionListener(this);
	  
	   
	   login=new JButton();
	   ImageIcon img = new ImageIcon("images\\login.png");
	   login.setIcon(img);
	   login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   login.addActionListener(this);
	   
	
	   cancel=new JButton();
	   ImageIcon img1 = new ImageIcon("images\\cancel.png");
	   cancel.setIcon(img1);
	   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   cancel.addActionListener(this);
	
	setLayout(new BorderLayout());
	setBackground(Color.WHITE);
	JLabel background=new JLabel(new ImageIcon("images\\AdminLoginPage.png"));
	background.setLayout(new FlowLayout());
	
	lbl1.setBounds(848,205,228,20); 
	lbl2.setBounds(810,272,350,20); 
	login.setBounds(810,366,90,40);  
	cancel.setBounds(1000,366,90,40); 
	
	loginid.setBounds(848,226,228,40);  
	password.setBounds(848,292,228,40);  
	
	background.setBounds(0,0,1366,768);  
	
	pan.add(lbl1);
	pan.add(lbl2);
    pan.add(login);
    pan.add(cancel);
    pan.add(loginid);
    pan.add(password);
    
    
    pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
}

public void actionPerformed(ActionEvent e) 
{int flag1=0;
	
	String n = loginid.getText().trim();
	 String ps = password.getText().trim();
	
	 String loginidpattern = "^[a-z0-9_-]{6,15}$";

	 Scanner   scan  =  new Scanner(n) ;
	 String   matched  =  scan.findInLine( loginidpattern ) ;
	 if ( matched == null )
	 {
		 lbl1.setVisible(true);
		 flag1 =1;
	 }
	 else
	 {
		 
	     lbl1.setVisible(false);
		    
	 }
	 
	 String passwordpattern = "^.{6,50}$" ; 
	 Scanner   scan2  =  new Scanner( ps ) ;
	 String   matched2=  scan2.findInLine( passwordpattern ) ;
	if ( matched2 == null )
		
		{
			lbl2.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 lbl2.setVisible(false);
			 
		 }
	 
	 
	 
	 
	 
	
	String id = null, pass = null;
	LoginData Logd;
	
	
	if(e.getSource() == login)
	{
		int flag=0;

		if(flag1==0)
		{
		id =loginid.getText().trim();
		pass=password.getText().trim();
		
		
		
		if(id.equals("admin1234"))
		{
				if(pass.equals("12345678"))
					{
				dispose();
					new AdminMenu1();
					flag=1;
					
				}
		
		}
       
		
		if(flag==0)
		{
			
			msgbox ="Wrong User Name or Password"; 
			new MsgBox1(msgbox);
			
		}
	}
	
	}
	if(e.getSource() == cancel)		
	{		
		
		new Login_Select();
		setVisible(false);

		
	}
	
	
	}


}



public class AdminLogin 
{

	public static void main(String[] args) 
	{

		 new Login_Admin();
		
	}

}

