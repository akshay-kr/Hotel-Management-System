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

class RoomUpdate1 extends JFrame implements ActionListener
{
	JPanel pan;   
private JButton update;
private JButton delete;
private JButton cancel;
private JButton searchagain;
private JLabel l2;
private JButton edit1,edit2,edit3,edit4;
private String msgbox;
 

private JComboBox roomNumber,roomType,bedType,avail;

private JTextField  fareInRs;

public void roomUpdat(String rmtyp, String bdtyp)
{
 
    pan = new JPanel();   
    pan.setLayout(null);   
	
    Font f1=new Font("Verdana",Font.BOLD,14);
    
    roomNumber = new JComboBox();
    
    Font f33=new Font("Verdana",Font.BOLD,13);
    
    
    l2 = new JLabel("Invalid Fare");
    l2.setFont(f33);
    l2.setForeground(Color.RED);
    l2.setVisible(false);
    
       edit1=new JButton();
	   ImageIcon img3 = new ImageIcon("images\\edityellow.png");
	   edit1.setIcon(img3);
	   edit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   edit1.addActionListener(this);
	   edit1.setToolTipText("Click To Edit Room Type");
	   
	   edit2=new JButton();
	   edit2.setIcon(img3);
	   edit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   edit2.addActionListener(this);
	   edit2.setToolTipText("Click To Edit Bed Type");
	   
	   edit3=new JButton();
	   edit3.setIcon(img3);
	   edit3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   edit3.addActionListener(this);
	   edit3.setToolTipText("Click To Edit Room Fare");
	   
    
       edit4=new JButton();
	   edit4.setIcon(img3);
	   edit4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   edit4.addActionListener(this);
	   edit4.setToolTipText("Click To Edit Room Avaibility");
	   edit4.setVisible(true);
	   
    
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
		if ((list17.get(i).getRoomtypes().equals(rmtyp)) && (list17.get(i).getRoomcapacity().equals(bdtyp)))

		{
			
			
				
				roomNumber.addItem(list17.get(i).getRoomno());
				l2.setVisible(false);
				
				
			}
		
    	 
      
      
      
    }
	
	
		
		
      roomNumber.setFont(f1);
      roomNumber.setToolTipText("Select Room Number");
      roomNumber.setBackground(Color.WHITE);
      roomNumber.addActionListener(this);
      
      
      fareInRs=new JTextField();
      fareInRs.setFont(f1);
      fareInRs.setToolTipText("Enter the Fare");
      
	   
	    String rtvalue[]={"A.C.", "Non A.C."};
		roomType=new JComboBox(rtvalue);
		roomType.setFont(f1);
		roomType.setToolTipText("Select Room Type");
		roomType.setBackground(Color.WHITE);
		
		String rcvalue[]={"Single Bed","Double Bed"};
		bedType=new JComboBox(rcvalue);
		bedType.setFont(f1);
		bedType.setToolTipText("Select B");
		bedType.setBackground(Color.WHITE);
		
		String avvalue[]={"Yes", "No"};
		avail=new JComboBox(avvalue);
		avail.setFont(f1);
		avail.setToolTipText("Select Room Avaibility");
		avail.setBackground(Color.WHITE);
	   
	   update=new JButton();
	   ImageIcon img = new ImageIcon("images\\updateyellow.png");
	   update.setIcon(img);
	   update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   update.addActionListener(this);
	   update.setToolTipText("Click To Update Room Information");
	   
	   delete=new JButton();
	   ImageIcon img1 = new ImageIcon("images\\deleteyellow.png");
	   delete.setIcon(img1);
	   delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   delete.addActionListener(this);
	   delete.setToolTipText("Click To Delete Information");
	
	   cancel=new JButton();
	   ImageIcon img2 = new ImageIcon("images\\cancel2.png");
	   cancel.setIcon(img2);
	   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   cancel.addActionListener(this);
	   cancel.setToolTipText("Click To Cancel");
	   
	   searchagain=new JButton();
	   ImageIcon img4 = new ImageIcon("images\\searchagainblue.png");
	   searchagain.setIcon(img4);
	   searchagain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	   searchagain.addActionListener(this);
	   searchagain.setToolTipText("Click To Search Again");
	   
	   
	   
	   
	   
	   
	setLayout(new BorderLayout());
	setBackground(Color.WHITE);
	JLabel background=new JLabel(new ImageIcon("images\\roomadd.png"));
	background.setLayout(new FlowLayout());
	
	update.setBounds(700,488,130,44);  
	delete.setBounds(870,488,130,44); 
	cancel.setBounds(1040,488,130,44);
	searchagain.setBounds(860,570,160,44);
	edit1.setBounds(1035,217,75,30);
	
	edit2.setBounds(1035,270,75,30);
	l2.setBounds(783,295,200,30);
	edit3.setBounds(1035,320,75,30);
	edit4.setBounds(1035,370,75,30);
	roomType.setBounds(783,217,200,30);  
	bedType.setBounds(783,269,200,30);
	avail.setBounds(783,371,200,30);
	
	roomNumber.setBounds(783,155,200,30);  
	fareInRs.setBounds(783,320,200,30);
	
	
	
	background.setBounds(0,0,1366,768);  
	
    pan.add(update);
    pan.add(delete);
    pan.add(cancel);
    pan.add(edit1);
    pan.add(edit2);
    pan.add(edit3);
    pan.add(edit4);
    pan.add(searchagain);
    pan.add(roomType);
    pan.add(bedType);
    pan.add(avail);
    pan.add(roomNumber);
    pan.add(fareInRs);
   
    pan.add(l2);
    
    
	   roomType.setEnabled(false);
	   bedType.setEnabled(false);
	   fareInRs.setEditable(false);  
	   avail.setEnabled(false);
    
    
   pan.add(background);

    getContentPane().add(pan);   

    setSize(1366,768);   
    setLocation(0,0);   
    setVisible(true);   
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);    
    
}

public void actionPerformed(ActionEvent e) 

{int flag1=0;
	String fa = fareInRs.getText().trim();
	
	String farepattern = "^[0-9]" ; 
	 Scanner   scan1  =  new Scanner(fa) ;
	 String   matched1  =  scan1.findInLine( farepattern ) ;
	 if ( matched1 == null )
	 {
		 
	l2.setVisible(true);
		flag1=1;
		
	 }
	 
	 else
	 {
		 
		 l2.setVisible(false);
		 
	 }
	
	String rno,type,cap,cost,avaib;
	
	
	
	if(e.getSource() == roomNumber)
	{
		
		rno = (String)roomNumber.getSelectedItem();
		ArrayList<RoomAddData> list18;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list18=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list18=new ArrayList<RoomAddData>();
		 }
		
		for(int i=0;i<list18.size();i++)
		{
			if (list18.get(i).getRoomno().equals(rno))
			{
		         
				roomType.setSelectedItem(list18.get(i).getRoomtypes());
                bedType.setSelectedItem(list18.get(i).getRoomcapacity());
                fareInRs.setText(list18.get(i).getRoomfare());
                avail.setSelectedItem(list18.get(i).getAvaibility());

				l2.setVisible(false);
			}
	}
		
		for(int i=0;i<list18.size();i++)
		{
			if (list18.get(i).getAvaibility().equals("No"))

			{
				
				edit4.setVisible(false);
				
			}
			
		}
		
	}
	
	if(e.getSource() == edit1)
	{
		
		roomType.setEnabled(true);
	
	}
	
	if(e.getSource() == edit2)
	{
		
		bedType.setEnabled(true);
		
	}
	
	if(e.getSource() == edit3)
	{
		l2.setVisible(false);
		fareInRs.setEditable(true);
		
	}
	
	if(e.getSource() == edit4)
	{
		
		avail.setEnabled(true);
		
	}
	
	
	
	if(e.getSource() == update)
		
	{
		
		if(flag1 == 0)
		{
		
		rno =(String) roomNumber.getSelectedItem();
		type=(String) roomType.getSelectedItem();
		cap =(String) bedType.getSelectedItem();
		cost =fareInRs.getText().trim();
		avaib=(String) avail.getSelectedItem();
		
		
		
		
		ArrayList<RoomAddData> list14;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list14=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list14=new ArrayList<RoomAddData>();
		 }
		
		for(int i=0;i<list14.size();i++)
		{
			if (list14.get(i).getRoomno().equals(rno))
			{
        		
				list14.get(i).setRoomno(rno);
				list14.get(i).setRoomtypes(type);
				list14.get(i).setRoomcapacity(cap);
				list14.get(i).setRoomfare(cost);
				list14.get(i).setAvaibility(avaib);
	
				}
			}
		
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("RoomData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list14);
		}catch(Exception ee){}
		
		roomNumber.setSelectedItem(1);
		roomType.setSelectedItem(1);
		bedType.setSelectedItem(1);
		fareInRs.setText("");
		avail.setSelectedItem(1);
		
		
		
		roomType.setEnabled(false);
		   bedType.setEnabled(false);
		   fareInRs.setEditable(false);  
		   avail.setEnabled(false);
	    
		   msgbox = "Room Succesfully Updated";
			new MsgBox1(msgbox);
		}	
		
	}
	

if(e.getSource() == delete)
{
	String rn = (String) roomNumber.getSelectedItem();
	
	if(flag1==0)
	{
	ArrayList<RoomAddData> list12;
	
	try
	{
	   FileInputStream fin=new FileInputStream("RoomData.dat");
	   ObjectInputStream oin=new ObjectInputStream(fin);
	   list12=(ArrayList<RoomAddData>)oin.readObject();
	}catch(Exception ee)
	 {
		 list12=new ArrayList<RoomAddData>();
	 }
	
	for(int i=0;i<list12.size();i++)
	{
		if (list12.get(i).getRoomno().equals(rn))
		{
    
				list12.remove(i);
				roomNumber.removeItem(rn);
	
			}
		}

	
	try	
	 {
	       FileOutputStream fout=new FileOutputStream("RoomData.dat");
	       ObjectOutputStream oout=new ObjectOutputStream(fout);
	       oout.writeObject(list12);
	}catch(Exception ee){}

	                       roomNumber.setSelectedItem(1);
	                       roomType.setSelectedItem(1);
	                       bedType.setSelectedItem(1);
	                       fareInRs.setText("");
	                       avail.setSelectedItem(1);


	                       roomType.setEnabled(false);
	                	   bedType.setEnabled(false);
	                	   fareInRs.setEditable(false);  
	                	   avail.setEnabled(false);

	                	   msgbox = "Room Deleted Successfully";
	               		new MsgBox1(msgbox);
	}           		
}
              
	if(e.getSource() == searchagain)
             {
            	dispose();
            	  new AdminRoomSearch1();
            	  
             }
              
              
              if(e.getSource() == cancel)
              {
            	  
            	  dispose();
            	  new AdminMenu1();
            	
            	  
              }
              
}

}

public class RoomUpdate 
{

	
	public static void main(String[] args) 
	{

		RoomUpdate1 r1 = new RoomUpdate1();
		r1.roomUpdat(null, null);
		
	}
}
