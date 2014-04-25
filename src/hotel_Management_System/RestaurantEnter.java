package hotel_Management_System;

import java.awt.Color;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;


class RestaurantEnter1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JButton enter;
	private JTextField  name;
	private JTextField  rumnumbr; 
	private String nme;
	private String rno;
	private JLabel l1,l2;

	private String msgbox;
	
	public RestaurantEnter1()
	{
		
		super("Enter Restaurant");
		pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    Font f33=new Font("Verdana",Font.BOLD,11);
	    
        l1 =new JLabel("Invalid Name");
        l1.setFont(f33);
	    l1.setForeground(Color.WHITE);
	    l1.setVisible(false);
    
        l2 =new JLabel("Invalid Room No.");
        l2.setFont(f33);
	    l2.setForeground(Color.RED);
	    l2.setVisible(false);
		
	    enter = new JButton();
	    ImageIcon img2 = new ImageIcon("images\\entergreen.png");
	    enter.setIcon(img2);
	    enter.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    enter.addActionListener(this);
	    enter.setToolTipText("Click To Enter");
	    
	    Font f23=new Font("Verdana",Font.BOLD,12);    
		
	    
	    name=new JTextField();
	    name.setToolTipText("Enter the name");    
	   name.setFont(f23);
	    
	    rumnumbr=new JTextField();
	    rumnumbr.setToolTipText("Enter the room number");
	   rumnumbr.setFont(f23);
	   
        setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\restaurantenter.jpg"));
    	background.setLayout(new FlowLayout());
    	
    	name.setBounds(490,160,160,30); 
    	rumnumbr.setBounds(490,218,125,30); 
		enter.setBounds(360,290,150,35);
		l1.setBounds(490,100,265,15);
		l2.setBounds(490,200,265,15);
		background.setBounds(0,0,750,445);  
		
		
		pan.add(name);  
		pan.add(rumnumbr);   
		 pan.add(enter);  
		 pan.add(background);
		 pan.add(l1);
		 pan.add(l2);
		 
		 
		 getContentPane().add(pan);   
		    
		    setSize(750,445);   
		    setLocation(308,161);   
		    setVisible(true);   

		    
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{int flag1=0;
		int flag=0;
		
		String na = name.getText().trim();
	    String ps = rumnumbr.getText().trim();
		
		String namepattern = "^[a-zA-z]" ; 
		 Scanner   scan  =  new Scanner( na ) ;
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
		 
		 
		 String roomnopattern = "^[0-9]" ; 
		 Scanner   scan1  =  new Scanner( ps ) ;
		 String   matched1  =  scan1.findInLine( roomnopattern ) ;
		 if ( matched1 == null )
		 {
			l2.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l2.setVisible(false);
			 
		 }
		 
		
		
		
		String gname,roomno,firstName,lastName;
		
		nme = name.getText().trim();
		
		rno = rumnumbr.getText().trim();
		
		gname = name.getText().trim();
		      
		roomno = rumnumbr.getText().trim();
	
		if(e.getSource() == enter)
		{
			int flag2=0;
			
			if(flag1==0)
			{
			
			ArrayList<GuestDetailData> list6;
			
			try
			{
			   FileInputStream fin=new FileInputStream("GuestData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list6=(ArrayList<GuestDetailData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list6=new ArrayList<GuestDetailData>();
			 }
			
			
			for(int i=0;i<list6.size();i++)
				
			{
				
				
				if(list6.get(i).getName().equals(gname))
					{
						if(list6.get(i).getRoomnm().equals(roomno))	
						{
							
							flag=1;
							
							if(list6.get(i).getCheckoutdate()==null)
							{
							
							
							
							flag2=1;
							
						}
							
							else
							{
								
								flag2=2;
								
							}
						
						}	
					}
					
					
						
				}
			
			if(flag2==1)
			{
				dispose();
			
				
				RestaurantBill1 r1 = new RestaurantBill1();
				r1.GenerateRestaurantBill(nme,rno);
				
			}
			
			if(flag2==2)
			{
				
				msgbox = "No Entry For Checked Out Guests";	
				new MsgBox1(msgbox);
				
			}
			
			}
			
			 		
		}
		
		
		if(flag==0)
		{
			
			msgbox = "Guest Record Not Found";
			
			new MsgBox1(msgbox);
			
		}
		
		}
		
	}
	
	

public class RestaurantEnter {

	
	public static void main(String[] args) 
	
	{
	
		new RestaurantEnter1();
		
	}

}
