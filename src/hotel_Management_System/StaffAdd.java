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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class AdminPart extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton submit;
private JButton clear;
private JButton cancel;
private String msgbox;

private JComboBox day,month,year;
private JLabel l1,l2,l3,l4,l5,l6,l7;
private JTextField title,contact,username, password,post,emailid,doj;
private JTextArea address;
private JRadioButton male,female;

public AdminPart()
{
	super("Select Login");   
    pan = new JPanel();   
    pan.setLayout(null);   
	
   Font f1=new Font("Verdana",Font.BOLD,12);
   
   Font f33=new Font("Verdana",Font.BOLD,11);
    
        l1 =new JLabel("Invalid Name");
        l1.setFont(f33);
	    l1.setForeground(Color.RED);
	    l1.setVisible(false);
    
        l2 =new JLabel("Invalid Contact No.");
        l2.setFont(f33);
	    l2.setForeground(Color.RED);
	    l2.setVisible(false);
        
        l3 =new JLabel("Invalid Email Id");
        l3.setFont(f33);
	    l3.setForeground(Color.RED);
	    l3.setVisible(false);
        
        l4 =new JLabel("Invalid Post");
        l4.setFont(f1);
	    l4.setForeground(Color.RED);
	    l4.setVisible(false);
        
        l5 =new JLabel("Invalid Username");
        l5.setFont(f33);
	    l5.setForeground(Color.RED);
	    l5.setVisible(false);
        
        l6 = new JLabel("Password Should be Atleast 6 Characters");
        l6.setFont(f33);
	    l6.setForeground(Color.RED);
	    l6.setVisible(false);
	    
	    l7 = new JLabel("Invalid Address");
        l7.setFont(f33);
	    l7.setForeground(Color.RED);
	    l7.setVisible(false);
    
      male=new JRadioButton("Male");
      male.setForeground(Color.darkGray);
	  male.setSelected(true);
	  male.setBackground(Color.WHITE);
		 

	  female=new JRadioButton("Female");
	  female.setForeground(Color.darkGray);
	  female.setBackground(Color.WHITE);
		 
    
	  title=new JTextField();
	  title.setFont(f1);
	  title.setToolTipText("Please enter the Name");
	
	  
	  
    
	  address=new JTextArea(5,10);
	  address.setFont(f1);
      address.setToolTipText("Please enter the Address");
    
    
	  JScrollPane scroll =new JScrollPane(address);
	  scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.setVisible(true);
      
      contact=new JTextField();
      contact.setFont(f1);
      contact.setToolTipText("Please enter the Contact No.");
   
	
       username=new JTextField();
       username.setFont(f1);
       username.setToolTipText("Please enter the Username"); 
   
       
       
	   password=new JPasswordField();
	   password.setFont(f1);
	   password.setToolTipText("Please enter the Password"); 
	 

	   post=new JTextField();
	   post.setFont(f1);
	   post.setToolTipText("Please enter the Post"); 
	  
	   
	   emailid=new JTextField();
	   emailid.setFont(f1);
	   emailid.setToolTipText("Please enter the Email Id"); 
	  
	   
	   String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		day=new JComboBox(dvalue);
		 day.setBackground(Color.WHITE);
		 
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		 month.setBackground(Color.WHITE);
		 
		
		String yvalue[]=new String[36];
		int cnt=0;
		for(int i=1980;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		year.setBackground(Color.WHITE);
		 
		
	   
	   submit=new JButton("Submit");
	   ImageIcon img = new ImageIcon("images\\register1.png");
	   submit.setIcon(img);
	   submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   submit.addActionListener(this);
	   
	
	   cancel=new JButton("Cancel");
	   ImageIcon img1 = new ImageIcon("images\\cancel1.png");
	   cancel.setIcon(img1);
	   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   cancel.addActionListener(this);
	   
	   clear=new JButton("Clear");
	   ImageIcon img2 = new ImageIcon("images\\register.png");
	   clear.setIcon(img2);
	   clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   clear.addActionListener(this);
	   
	
	setLayout(new BorderLayout());
	setBackground(Color.WHITE);
	JLabel background=new JLabel(new ImageIcon("images\\admin1.png"));
	background.setLayout(new FlowLayout());
	
	submit.setBounds(450,555,170,35);  
	cancel.setBounds(810,555,130,35); 
	clear.setBounds(665,555,106,35); 
	
	
	title.setBounds(593,118,310,30);  
	scroll.setBounds(593,167,310,50);
	contact.setBounds(593,245,310,30);
	
	username.setBounds(593,446,310,30);  
	password.setBounds(593,485,310,30);
	emailid.setBounds(593,288,310,30);
	post.setBounds(593,405,310,30);  
	
	l1.setBounds(593,103,265,15);
	l2.setBounds(593,230,265,15);
	l3.setBounds(593,273,265,15);
	l4.setBounds(593,391,265,15);
	l5.setBounds(593,432,265,15);
	l6.setBounds(593,472,270,15);
	l7.setBounds(593,153,270,15);
	
	male.setBounds(593,368,100,24);  
	female.setBounds(730,368,100,24); 
	
	day.setBounds(593,334,70,24);  
	month.setBounds(680,334,73,24); 
	year.setBounds(773,334,128,24); 
	
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(submit);
    pan.add(cancel);
    pan.add(clear);
    pan.add(title);
    pan.add(scroll);
    pan.add(contact);
    pan.add(username);
    pan.add(password);
    pan.add(male);
    pan.add(female);
    pan.add(post);
    pan.add(emailid);
    pan.add(day);
	pan.add(month);
	pan.add(year);
	pan.add(l1);
    pan.add(l2);
	pan.add(l3);
	pan.add(l4);
	pan.add(l5);
	pan.add(l6);
	pan.add(l7);
	
    
   pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   

    setDefaultCloseOperation(EXIT_ON_CLOSE);     
    
}

public void actionPerformed(ActionEvent e) 

{   int flag1=0;
	
	String ti = title.getText().trim();
	 String ad = address.getText().trim();
	 String co = contact.getText().trim();
	 String us = username.getText().trim();
	 String ps = password.getText().trim();
	 String em = emailid.getText().trim();
	 String po = post.getText().trim();
	
	 String namepattern = "^[a-zA-z]" ; 
	 Scanner   scan  =  new Scanner( ti ) ;
	 String   matched  =  scan.findInLine( namepattern ) ;
	 if ( matched == null )
	 {
		l1.setVisible(true);
		flag1=1;
		
	 }
	 
	 else
		 
	 {
		 
		 l1.setVisible(false);
		 
	 }
	 
	 String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$" ; 
	 Scanner   scan1  =  new Scanner( em ) ;
	 String   matched1  =  scan1.findInLine( emailpattern ) ;
	 if ( matched1 == null )
	 {
			l3.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l3.setVisible(false);
			 
		 }
	 
	 
	 String contactnumberpattern = "^[0-9]{10,10}$" ; 
	 Scanner   scan2  =  new Scanner( co ) ;
	 String   matched2  =  scan2.findInLine( contactnumberpattern ) ;
	 if ( matched2 == null )
	 {
			l2.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l2.setVisible(false);
			 
		 }
	 
	 
	 String usernamepattern = "^[a-z0-9_-]{6,15}$" ; 
	 Scanner   scan4  =  new Scanner( us ) ;
	 String   matched4 =  scan4.findInLine( usernamepattern ) ;
	 if ( matched4 == null )
		 {
				l5.setVisible(true);
				flag1=1;
				
			 }
			 
			 else
				 
			 {
				 
				 l5.setVisible(false);
				 
			 }
	 
	String passwordpattern = "^.{6,50}$" ; 
	 Scanner   scan5  =  new Scanner( ps ) ;
	 String   matched5=  scan5.findInLine( passwordpattern ) ;
	if ( matched5 == null )
		
		{
			l6.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l6.setVisible(false);
			 
		 }
	 
	 String postpattern = "^[a-zA-z]" ; 
	 Scanner   scan6  =  new Scanner( po ) ;
	 String   matched6=  scan6.findInLine( postpattern ) ;
	 if ( matched6 == null )
	 {
			l4.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l4.setVisible(false);
			 
		 }
	 
	 String addrs = address.getText().trim();
	
	 if ( addrs.length()<1 )
	 {
			l7.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l7.setVisible(false);
			 
		 }
	 
	 
	
	String name,addr,cont,usname,pass,email,doj,gn,pos;
	
	
	LoginData logd;
	
	if(e.getSource() == submit)
	{	
		
		int flag=0;
	int flag2=0;
	int flag3=0;
		
if(flag1 ==0)
{
	
		name =title.getText().trim();
		addr=address.getText().trim();
		cont =contact.getText().trim();
		usname =username.getText().trim();
		pass=password.getText().trim();
		email =emailid.getText().trim();
		pos=post.getText().trim();
		
		String d=(String)day.getSelectedItem();
		String m=(String)month.getSelectedItem();
		String y=(String)year.getSelectedItem();
		doj=d + "-" + m + "-" + y;
		
		gn="";
		
		if(male.isSelected())
		{
			
			gn="Male";
			
		}
		else if(female.isSelected())
		{
			
			gn="Female";
			
		}
		
		
		ArrayList<LoginData> list10;
		
		try
		{
		   FileInputStream fin=new FileInputStream("LoginData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list10=(ArrayList<LoginData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list10=new ArrayList<LoginData>();
			 
		 }
		
		
		
		
		for(int i=0;i<list10.size();i++)
		{
			
			
				
			if (list10.get(i).getId().equals(usname))
			{
					
					
					flag=1;
			}
					
			if(list10.get(i).getStaffcontact().equals(cont))
			{
				
				flag3=1;
				
				
			}	
				if (list10.get(i).getEmailid().equals(email))
				{
					flag2=1;
				
				
			}
			
			
		}
		
		
		
		
		if(flag==1)
		{
			
			msgbox = "Username Already Exist";
			new MsgBox1(msgbox);
			
		}
		
		if(flag2==1)
		{
			
			msgbox = "Email Already Exist";
			new MsgBox1(msgbox);
			
			
		}
		
		
		
		if(flag3==1)
		{
			
			msgbox = "Contact No. Already Exist";
			new MsgBox1(msgbox);
			
		}
		
		if(flag2==1)
		{
			if(flag==1)
			{
				if(flag3==1)
				{
			msgbox = "Staff Has Aleady Been Added";
			new MsgBox1(msgbox);
			
		}
		
}
		}
		if(flag==0)
		{
			if(flag2==0)
			{
				if(flag3==0)
				{
        
		logd = new LoginData();
		
		logd.setStaffname(name);
		logd.setStaffaddress(addr);
		logd.setStaffcontact(cont);
		logd.setId(usname);
		logd.setPass(pass);
		logd.setEmailid(email);
		logd.setPost(pos);
		logd.setGender(gn);
		logd.setDojth(doj);
		
		new LoginAdd(logd);
		
		msgbox = "Staff Information Succesfully Added";
		new MsgBox1(msgbox);
		
		
		title.setText("");
		address.setText("");
		contact.setText("");
		username.setText("");
		password.setText("");
		emailid.setText("");
		post.setText("");
		}
			}
	}
	}	
	}

if(e.getSource() == clear)
{
	title.setText("");
	address.setText("");
	contact.setText("");
	username.setText("");
	password.setText("");
	emailid.setText("");
	post.setText("");
	male.setSelected(true);
	female.setSelected(false);
	l1.setVisible(false);
	l2.setVisible(false);
	l3.setVisible(false);	
	l4.setVisible(false);
	l5.setVisible(false);
	l6.setVisible(false);
	l7.setVisible(false);
	
	
}


if (e.getSource() == cancel)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
{
	dispose();
	new AdminMenu1();

}

}


}
public class StaffAdd
{

	public static void main(String[] args)
	{
		
		new AdminPart();

	}

}
