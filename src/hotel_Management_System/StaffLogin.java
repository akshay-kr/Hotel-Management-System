package hotel_Management_System;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import java.awt.Color;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.io.IOException;

class Login_Staff extends JFrame implements ActionListener
{
	JPanel pan;   
	private JLabel lbl1,lbl2;
private JButton login;
private JButton cancel;

private JTextField loginid, password;
private int p=0;
private String id1;
private String id2;

private String msgbox;

public Login_Staff()
{
	super("Select Login");   
    pan = new JPanel();   
    pan.setLayout(null);   
	
    Font f1=new Font("Verdana",Font.BOLD,14);
    
Font f20=new Font("Verdana",Font.BOLD,10);
    
    lbl1 = new JLabel("Invalid Username");
    lbl1.setFont(f20);
    lbl1.setForeground(Color.RED);
    lbl1.setVisible(false);
    
    lbl2 = new JLabel("Password Should Be Minimum Of 6 Characters");
    lbl2.setFont(f20);
    lbl2.setForeground(Color.RED);
    lbl2.setVisible(false);
    
       loginid=new JTextField();
       loginid.setFont(f1);
       loginid.setToolTipText("Please enter the Username"); 
       
	   password=new JPasswordField();
	   password.setFont(f1);
	   password.setToolTipText("Please enter the Password"); 
	   
	   login=new JButton();
	   ImageIcon img = new ImageIcon("images//login.png");
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
	JLabel background=new JLabel(new ImageIcon("images\\Untitled.png"));
	background.setLayout(new FlowLayout());
	
	login.setBounds(650,362,100,30);  
	cancel.setBounds(782,362,90,30); 
	
	loginid.setBounds(713,279,134,28);  
	password.setBounds(713,316,134,28);  

	lbl1.setBounds(713,260,228,20); 
	lbl2.setBounds(650,300,300,20); 
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(login);
    pan.add(cancel);
    pan.add(loginid);
    pan.add(password);
    pan.add(lbl1);
	pan.add(lbl2);
    
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
	
	 String loginidpattern = "^[a-zA-Z0-9]{6,}$" ; 
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
	 Scanner   scan5  =  new Scanner( ps ) ;
	 String   matched5=  scan5.findInLine( passwordpattern ) ;
	if ( matched5 == null )
		
		{
			lbl2.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 lbl2.setVisible(false);
			 
		 }
	 
	 
	 
	 
	
	String id, pass;
	
	
	if(e.getSource() == login)
	{int flag=0;
		
		if(flag1==0)
		{
		id =loginid.getText().trim();
		pass=password.getText().trim();
		
		ArrayList<LoginData> list;
		
		try
		{
		   FileInputStream fin=new FileInputStream("LoginData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list=(ArrayList<LoginData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list=new ArrayList<LoginData>();
		 }
		LoginData logd2 = new LoginData();
		
		list.add(logd2);
		
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).getId().equals(id)) && (list.get(i).getPass().equals(pass)))
				{
							dispose();
				new StaffMenu1();
				flag=1;
					
				}
			
				
				
			}
		
		if(flag==0)
		{
			
			
			msgbox = "Wrong Username or Password";
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

public class StaffLogin 
{

	public static void main(String[] args) 
	{

		 new Login_Staff();
		
	}

}
