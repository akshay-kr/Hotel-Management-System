package hotel_Management_System;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

class RoomAdd1 extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton submit;
private JButton clear;
private JButton cancel;
private JLabel l1,l2;
private String msgbox;


private JComboBox roomtype,roomcap,avail;

private JTextField roomnumber ,fare;

public RoomAdd1()
{
	super("Room Addition");   
    pan = new JPanel();   
    pan.setLayout(null);   
	
    Font f1=new Font("Verdana",Font.BOLD,14);
    Font f33=new Font("Verdana",Font.BOLD,13);
      roomnumber=new JTextField();
      roomnumber.setFont(f1);
      roomnumber.setToolTipText("Enter the Room Number");
    
      l1 = new JLabel("Invalid Room Number");
      l1.setFont(f33);
      l1.setForeground(Color.RED);
     l1.setVisible(false);
      
      l2 = new JLabel("Invalid Fare");
      l2.setFont(f33);
      l2.setForeground(Color.RED);
      l2.setVisible(false);
      
      fare=new JTextField();
      fare.setFont(f1);
      fare.setToolTipText("Enter the Fare");
      
	   
	    String rtvalue[]={"A.C.", "Non A.C."};
		roomtype=new JComboBox(rtvalue);
		roomtype.setFont(f1);
		roomtype.setToolTipText("Select Room Type");
		roomtype.setBackground(Color.WHITE);
		
		String rcvalue[]={"Single Bed","Double Bed"};
		roomcap=new JComboBox(rcvalue);
		roomcap.setFont(f1);
		roomcap.setToolTipText("Select Room Capacity");
		roomcap.setBackground(Color.WHITE);
		
		String avvalue[]={"Yes", "No"};
		avail=new JComboBox(avvalue);
		avail.setFont(f1);
		avail.setToolTipText("Select Room Avaibility");
		avail.setBackground(Color.WHITE);
	   
	   submit=new JButton("Submit");
	   ImageIcon img = new ImageIcon("images\\submit.png");
	   submit.setIcon(img);
	   submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   submit.addActionListener(this);
	   submit.setToolTipText("Click To Submit Room Information");
	
	   cancel=new JButton("Cancel");
	   ImageIcon img1 = new ImageIcon("images\\cancel2.png");
	   cancel.setIcon(img1);
	   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   cancel.addActionListener(this);
	   cancel.setToolTipText("Click To Cancel");
	   
	   clear=new JButton("Clear");
	   ImageIcon img2 = new ImageIcon("images\\clear2.png");
	   clear.setIcon(img2);
	   clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   clear.addActionListener(this);
	   clear.setToolTipText("Click To Clear Information");
	
	setLayout(new BorderLayout());
	setBackground(Color.WHITE);
	JLabel background=new JLabel(new ImageIcon("images\\roomadd.png"));
	background.setLayout(new FlowLayout());
	
	submit.setBounds(700,488,130,44);  
	cancel.setBounds(1040,488,130,44); 
	clear.setBounds(870,488,130,44); 
	l1.setBounds(783,130,200,30);
	roomnumber.setBounds(783,155,200,30);
	l2.setBounds(783,295,200,30);
	fare.setBounds(783,320,200,30);
	
	roomtype.setBounds(783,217,145,30);  
	roomcap.setBounds(783,269,145,30);
	avail.setBounds(783,371,145,30);
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(submit);
    pan.add(cancel);
    pan.add(clear);
    pan.add(roomnumber);
    pan.add(fare);
    pan.add(roomtype);
    pan.add(roomcap);
    pan.add(avail);
    pan.add(l1);
    pan.add(l2);
   pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   

    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
}

public void actionPerformed(ActionEvent e) 

{ int flag1=0;
	
	 String ro = roomnumber.getText().trim();
	 String fa = fare.getText().trim();
	
	 String roomnumberpattern = "^[0-9]" ; 
	 Scanner   scan  =  new Scanner(ro) ;
	 String   matched  =  scan.findInLine( roomnumberpattern ) ;
	 if ( matched == null )
	 {
		 
	l1.setVisible(true);
		flag1=1;
		
	 }
	 
	 else
	 {
		 
		 l1.setVisible(false);
		 
	 }
	 String farepattern = "^[0-9]" ; 
	 Scanner   scan1  =  new Scanner(fa) ;
	 String   matched1  =  scan1.findInLine( farepattern ) ;
	 if ( matched1 == null )
	 {
		 
	l2.setVisible(true);
		flag1=2;
		
	 }
	 
	 else
	 {
		 
		 l2.setVisible(false);
		 
	 }
	 
	String rno,type,cap,cost,avaib;
	int flag=0;
	
	RoomAddData roomd;
	
	if(e.getSource() == submit)
		
	{
		if(flag1==0)
		{
		
		
		rno =roomnumber.getText().trim();
		type=(String) roomtype.getSelectedItem();
		cap =(String) roomcap.getSelectedItem();
		cost =fare.getText().trim();
		avaib=(String) avail.getSelectedItem();
		
		ArrayList<RoomAddData> list17;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list17=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list17=new ArrayList<RoomAddData>();
		 }
	    
		for(int i=0;i<list17.size();i++)
		{
			if (list17.get(i).getRoomno().equals(rno))
			{
				
				msgbox = "Room Already Has Already Been Added";
				new MsgBox1(msgbox);
				
				flag=1;
				
			}
					
		}
        
		if(flag==0)
		{
		roomd = new RoomAddData();
		
		roomd.setRoomno(rno);
		roomd.setRoomtypes(type);
		roomd.setRoomcapacity(cap);
		roomd.setRoomfare(cost);
		roomd.setAvaibility(avaib);
		
		
		new RoomAddition(roomd);
		
		msgbox = "Room Information Succesfully Added";
		new MsgBox1(msgbox);
		
		
		}
		roomnumber.setText("");
		roomtype.setSelectedItem(1);
		roomcap.setSelectedItem(1);
		fare.setText("");
		avail.setSelectedItem(1);
		
	}
	}

if(e.getSource() == clear)
{
	roomnumber.setText("");
	roomtype.setSelectedItem(1);
	roomcap.setSelectedItem(1);
	fare.setText("");
	avail.setSelectedItem(1);
	l1.setVisible(false);
	l2.setVisible(false);
	
	
	
}

if(e.getSource() == cancel)
{
           dispose();
	new AdminMenu1();
	
}
}

}
public class RoomAdd 
{

	
	public static void main(String[] args) 
	{

		new RoomAdd1();
		
	}
}
