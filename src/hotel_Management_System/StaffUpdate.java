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
import java.awt.GraphicsConfiguration;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class StaffUpdate1 extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton update,delete,cancel,searchagain,edit1,edit2,edit3,edit4,edit5,edit6,edit7;


private JComboBox day,month,year;

private JTextField name,contactNo,emailId,post,userName, password;
private JTextArea address;
private JRadioButton male,female;
private String user2;
private String dojjth;
private JLabel l1,l2,l3,l4,l5,l6;
private String msgbox;


public void staffUpd(String user1, String dojj,String date1, String month1,String year1) 
{
	
	pan = new JPanel();   
    pan.setLayout(null);   
	
    Font f1=new Font("Verdana",Font.BOLD,11);
    
    Font f33=new Font("Verdana",Font.BOLD,10);
    

    l2 =new JLabel("Invalid  Contact No. (10 Digits)");
    l2.setFont(f33);
    l2.setForeground(Color.RED);
    l2.setVisible(false);
    
    l3 =new JLabel("Invalid  Email Id");
    l3.setFont(f33);
    l3.setForeground(Color.RED);
    l3.setVisible(false);
    
    l4 =new JLabel("Invalid  Post");
    l4.setFont(f1);
    l4.setForeground(Color.RED);
    l4.setVisible(false);
    
    l5 =new JLabel("Invalid  Username");
    l5.setFont(f33);
    l5.setForeground(Color.RED);
    l5.setVisible(false);
    
    l6 = new JLabel("Password Should be Atleast 6 Characters");
    l6.setFont(f33);
    l6.setForeground(Color.RED);
    l6.setVisible(false);
      male=new JRadioButton("Male");
      male.setForeground(Color.darkGray);
      male.setBackground(Color.white);

	  female=new JRadioButton("Female");
	  female.setForeground(Color.darkGray);
	  female.setBackground(Color.white);
    
	  name=new JTextField();
	  name.setFont(f1);
	  name.setToolTipText("Please enter the Name");
	  
    
	  address=new JTextArea(5,10);
	  address.setFont(f1);
      address.setToolTipText("Please enter the Address");
    
	  JScrollPane scroll =new JScrollPane(address);
	  scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.setVisible(true);
      scroll.setBackground(Color.white);
      
      contactNo=new JTextField();
      contactNo.setFont(f1);
      contactNo.setToolTipText("Please enter the Contact No.");
	
       emailId=new JTextField();
       emailId.setFont(f1);
       emailId.setToolTipText("Please enter the Email Id"); 
       
       
       post=new JTextField();
       post.setFont(f1);
       post.setToolTipText("Please enter the Post");
	   
       userName=new JTextField();
       userName.setFont(f1);
       userName.setToolTipText("Please enter the User Name"); 

	   password=new JPasswordField();
	   password.setFont(f1);
	   password.setToolTipText("Please enter the Password"); 
	   
	  
	   
	   String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		day=new JComboBox(dvalue);
		day.setBackground(Color.white);
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		month.setBackground(Color.white);
		
		String yvalue[]=new String[36];
		int cnt=0;
		for(int i=1980;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		year.setBackground(Color.white);
		
	   
	   update=new JButton();
	   ImageIcon img = new ImageIcon("images\\update.png");
	   update.setIcon(img);
	   update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   update.addActionListener(this);
	   update.setToolTipText("Click To Update Information");
	
	   cancel=new JButton();
	   ImageIcon img1 = new ImageIcon("images\\cancel3.png");
	   cancel.setIcon(img1);
	   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   cancel.addActionListener(this);
	   cancel.setToolTipText("Click To Cancel");
	   
	   delete=new JButton();
	   ImageIcon img2 = new ImageIcon("images\\delete.png");
	   delete.setIcon(img2);
	   delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   delete.addActionListener(this);
	   delete.setToolTipText("Click To Delete Information");
	   
	   searchagain=new JButton();
	   ImageIcon img4 = new ImageIcon("images\\searchagain.png");
	   searchagain.setIcon(img4);
	   searchagain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   searchagain.addActionListener(this);
	   
	   
	edit1=new JButton();
	ImageIcon img3 = new ImageIcon("images\\edit.png");
	edit1.setIcon(img3);
	edit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	edit1.addActionListener(this);
	edit1.setToolTipText("Click To Edit Address");
	
    edit2=new JButton();
    edit2.setIcon(img3);
    edit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    edit2.addActionListener(this);
    edit2.setToolTipText("Click To Contact No.");
   	
    edit3=new JButton();
    edit3.setIcon(img3);
    edit3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    edit3.addActionListener(this);
    edit3.setToolTipText("Click To Email Id");
   	
  
    edit5=new JButton();
    edit5.setIcon(img3);
	edit5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	edit5.addActionListener(this);
	edit5.setToolTipText("Click To Edit Post");
   	
    edit6=new JButton();
    edit6.setIcon(img3);
	edit6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	edit6.addActionListener(this);
	edit6.setToolTipText("Click To Edit Username");
	
    edit7=new JButton();
    edit7.setIcon(img3);
	edit7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	edit7.addActionListener(this);
	edit7.setToolTipText("Click To Edit Password");
   	
	setLayout(new BorderLayout());
	setBackground(Color.WHITE);
	JLabel background=new JLabel(new ImageIcon("images\\staffupdate.png"));
	background.setLayout(new FlowLayout());
	
	update.setBounds(460,542,130,35);  
	delete.setBounds(620,542,130,35);
	cancel.setBounds(780,542,130,35); 
	searchagain.setBounds(603,595,165,35); 
	
	
	name.setBounds(593,118,210,30);  
	scroll.setBounds(593,167,210,50);
	contactNo.setBounds(593,245,210,30);
	
	l2.setBounds(593,230,265,15);
	l3.setBounds(593,273,265,15);
	l4.setBounds(593,393,265,15);
	l5.setBounds(593,434,265,15);
	l6.setBounds(565,472,270,15);
	
	emailId.setBounds(593,288,210,30);  
	post.setBounds(593,407,210,30);
	userName.setBounds(593,446,210,30);
	password.setBounds(593,485,210,30); 
	
	male.setBounds(593,372,80,24);  
	female.setBounds(720,372,80,24); 
	
	day.setBounds(593,334,50,24);  
	month.setBounds(656,334,50,24); 
	year.setBounds(720,334,80,24); 
	
	edit1.setBounds(844,174,70,30);  
	edit2.setBounds(844,242,70,30); 
	edit3.setBounds(844,290,70,30); 
	
	edit5.setBounds(844,406,70,30); 
	edit6.setBounds(844,445,70,30); 
	edit7.setBounds(844,485,70,30); 
	
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(update);
    pan.add(cancel);
    pan.add(delete);
    pan.add(searchagain);
    pan.add(name);
    pan.add(scroll);
    pan.add(contactNo);
    pan.add(emailId);
    pan.add(post);
    pan.add(male);
    pan.add(female);
    pan.add(userName);
    pan.add(password);
    pan.add(day);
	pan.add(month);
	pan.add(year);
	pan.add(edit1);
	pan.add(edit2);
	pan.add(edit3);	
	pan.add(edit5);
	pan.add(edit6);
	pan.add(edit7);
	
	pan.add(l2);
	pan.add(l3);
	pan.add(l4);
	pan.add(l5);
	pan.add(l6);
	
  address.setFocusable(true)  ;
   pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
  
    
    
    
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
		if (list10.get(i).getId().equals(user1))
		{
			if (list10.get(i).getDojth().equals(dojj))
			
				{
				  
				
				name.setText(list10.get(i).getStaffname());
				address.setText(list10.get(i).getStaffaddress());
				contactNo.setText(list10.get(i).getStaffcontact());
				emailId.setText(list10.get(i).getEmailid());  
				contactNo.setText(list10.get(i).getStaffcontact());
				day.setSelectedItem(date1);
				month.setSelectedItem(month1);
				year.setSelectedItem(year1);
				
				if (list10.get(i).getGender().equals("Male"))
				{
					male.setSelected(true);	
					female.setVisible(false);
					
				}
				
				else
				{
					
					female.setSelected(true);	
					male.setVisible(false);
					
				}
				
				post.setText(list10.get(i).getPost());
				userName.setText(list10.get(i).getId()); 
				password.setText(list10.get(i).getPass());
				
				   }
				   
				   
					
			   }
	}		
				



	
	name.setEditable(false);
	address.setEditable(false);
	contactNo.setEditable(false);
	emailId.setEditable(false);  
    day.setEnabled(false);
    month.setEnabled(false);
    year.setEnabled(false);
    male.setEnabled(false);
    female.setEnabled(false);
	post.setEditable(false);
	userName.setEditable(false); 
	password.setEditable(false);
	
	user2 = user1;
	dojjth = dojj;
}   
public void actionPerformed(ActionEvent e) 

{
	
	int flag2=0;
	
	 String co = contactNo.getText().trim();
	 String us = userName.getText().trim();
	 String ps = password.getText().trim();
	 String em = emailId.getText().trim();
	 String po = post.getText().trim();
	 
	 String emailpattern = "^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$" ; 
	 Scanner   scan1  =  new Scanner( em ) ;
	 String   matched1  =  scan1.findInLine( emailpattern ) ;
	 if ( matched1 == null )
	 {
			l3.setVisible(true);
			flag2=1;
			
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
			flag2=1;
			
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
				flag2=1;
				
			 }
			 
			 else
				 
			 {
				 
				 l5.setVisible(false);
				 
			 }
	 
	String passwordpattern = "{6}" ; 
	 Scanner   scan5  =  new Scanner( ps ) ;
	 String   matched5=  scan5.findInLine( passwordpattern ) ;
	if ( matched5 == null )
		
		{
			l6.setVisible(true);
			flag2=1;
			
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
			flag2=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l4.setVisible(false);
			 
		 }
	 
	 
	 
	String nam,addr,cont,usname,pass,email,doj,gn,pos;
	
	if(e.getSource() == edit1)
	{
		
		address.setEditable(true);
		
	}
	
	if(e.getSource() == edit2)
	{
		
		contactNo.setEditable(true);
		l2.setVisible(false);
		
		
		
	}
	
	if(e.getSource() == edit3)
	{
		
		emailId.setEditable(true);
		l3.setVisible(false);	
		
		
	}
	
	if(e.getSource() == edit5)
	{
		
		post.setEditable(true);
		l4.setVisible(false);
	
		
	}
	
	if(e.getSource() == edit6)
	{
		
		userName.setEditable(true);
		
		l5.setVisible(false);
	
		
	}
	
	if(e.getSource() == edit7)
	{
		
		password.setEditable(true);
		l6.setVisible(false);
		
	}
	
	if(e.getSource() == update)
		
	{
		if(flag2==0)
		{
		
		nam =name.getText().trim();
		addr=address.getText().trim();
		cont =contactNo.getText().trim();
		usname =userName.getText().trim();
		pass=password.getText().trim();
		email =emailId.getText().trim();
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
		
		ArrayList<LoginData> list11;
		
		try
		{
		   FileInputStream fin=new FileInputStream("LoginData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list11=(ArrayList<LoginData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list11=new ArrayList<LoginData>();
		 }
		
		for(int i=0;i<list11.size();i++)
		{
			if (list11.get(i).getId().equals(user2))
			{
				if (list11.get(i).getDojth().equals(doj))
				{
        

		
		list11.get(i).setStaffname(nam);
		list11.get(i).setStaffaddress(addr);
		list11.get(i).setStaffcontact(cont);
		list11.get(i).setId(usname);
		list11.get(i).setPass(pass);
		list11.get(i).setEmailid(email);
		list11.get(i).setPost(pos);
		list11.get(i).setGender(gn);
		list11.get(i).setDojth(doj);
		
		l2.setVisible(false);
		l3.setVisible(false);	
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		
		
				}
			}
		}
		
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("LoginData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list11);
		}catch(Exception ee){}
		
		name.setText("");
		address.setText("");
		contactNo.setText("");
		userName.setText("");
		password.setText("");
		emailId.setText("");
		post.setText("");
		male.setSelected(true);
		male.setVisible(true);
		female.setVisible(true);
		day.setSelectedItem(1);
		month.setSelectedItem(1);
		year.setSelectedItem(1);
		
		
		
		name.setEditable(false);
		address.setEditable(false);
		contactNo.setEditable(false);
		emailId.setEditable(false);  
	    day.setEnabled(false);
	    month.setEnabled(false);
	    year.setEnabled(false);
	    male.setEnabled(false);
	    female.setEnabled(false);
		post.setEditable(false);
		userName.setEditable(false); 
		password.setEditable(false);
		
		msgbox = "Staff Information Succesfully Updated";
		new MsgBox1(msgbox);
		}	
	}
	

if(e.getSource() == delete)
{
	
	ArrayList<LoginData> list12;
	
	try
	{
	   FileInputStream fin=new FileInputStream("LoginData.dat");
	   ObjectInputStream oin=new ObjectInputStream(fin);
	   list12=(ArrayList<LoginData>)oin.readObject();
	}catch(Exception ee)
	 {
		 list12=new ArrayList<LoginData>();
	 }
	
	for(int i=0;i<list12.size();i++)
	{
		if (list12.get(i).getId().equals(user2))
		{
			if (list12.get(i).getDojth().equals(dojjth))
			{
    
				list12.remove(i);
	
			}
		}
	}
	
	try	
	 {
	       FileOutputStream fout=new FileOutputStream("LoginData.dat");
	       ObjectOutputStream oout=new ObjectOutputStream(fout);
	       oout.writeObject(list12);
	}catch(Exception ee){}

                       name.setText("");
                       address.setText("");
                       contactNo.setText("");
                       userName.setText("");
                       password.setText("");
                       emailId.setText("");
                       post.setText("");
                       male.setSelected(true);
                       male.setVisible(true);
                       female.setVisible(true);
                       day.setSelectedItem(1);
                       month.setSelectedItem(1);
                       year.setSelectedItem(1);



                       name.setEditable(false);
                       address.setEditable(false);
                       contactNo.setEditable(false);
                       emailId.setEditable(false);  
                       day.setEnabled(false);
                       month.setEnabled(false);
                       year.setEnabled(false);
                       male.setEnabled(false);
                       female.setEnabled(false);
                       post.setEditable(false);
                       userName.setEditable(false); 
                       password.setEditable(false);
                       
                       
                    l2.setVisible(false);
                   	l3.setVisible(false);	
                   	l4.setVisible(false);
                   	l5.setVisible(false);
                   	l6.setVisible(false);
                   	


                   	msgbox = "Staff Information Deleted";
            		new MsgBox1(msgbox);
            		

}
              if(e.getSource() == searchagain)
             {
            	  dispose();
            	  new StaffInfoSearch();
            	  l2.setVisible(false);
                 	l3.setVisible(false);	
                 	l4.setVisible(false);
                 	l5.setVisible(false);
                 	l6.setVisible(false);
            	  
             }
              
              if(e.getSource() == cancel)
      			
      		{
            	  dispose();
            	  
            	  new AdminMenu1();
            	  
      		}
}

}

public class StaffUpdate 
{

	public static void main(String[] args)
	{
		
		StaffUpdate1 su1 = new StaffUpdate1();
		su1.staffUpd(null, null, null, null, null);

		
	}

	
	}


