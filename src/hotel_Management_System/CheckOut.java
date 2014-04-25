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


class CheckOut1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JTextField gstname,rmno;
	private JButton checkout;
	private String sysdate,systime;
	private JLabel l1,l2;

	private String msgbox;
	
	public CheckOut1()
	{
		super("Check Out");
		pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    Font f33=new Font("Verdana",Font.BOLD,11);
	    

	    l1 =new JLabel("Invalid Guest Name");
	    l1.setFont(f33);
	    l1.setForeground(Color.RED);
	    l1.setVisible(false);
	    
	    l2 =new JLabel("Invalid Room No.");
	    l2.setFont(f33);
	    l2.setForeground(Color.RED);
	   l2.setVisible(false);

	   Font f23=new Font("Verdana",Font.BOLD,14);
	   
         gstname = new JTextField();
         gstname.setToolTipText("Enter Guest Name");
         gstname.setFont(f23);

		
		rmno = new JTextField();
		rmno.setToolTipText("Enter Room No");
		rmno.setFont(f23);
		
		checkout = new JButton(); 
		ImageIcon img3 = new ImageIcon("images\\chkoutgreen.png");
	    checkout.setIcon(img3);
		checkout.addActionListener(this);
		
        setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\checkout.png"));
    	background.setLayout(new FlowLayout());

		//rumnm.setBounds(400,428,125,30); 
    	gstname.setBounds(280,147,180,30); 
    	rmno.setBounds(280,205,90,30);
    	checkout.setBounds(225,269,180,44);
    	
    	l1.setBounds(280,124,180,30);
    	l2.setBounds(280,182,180,30);
	    
		background.setBounds(0,0,600,375);  
		// pan.add(noRooms);   
		 pan.add(gstname);  
		 pan.add(rmno);   
		 pan.add(checkout);   
		 pan.add(l1);
		 pan.add(l2);
		 
		 pan.add(background);
		 
		 Calendar cal = Calendar.getInstance();
			
			String cday = ""+cal.get(Calendar.DATE);
			int x =cal.get(Calendar.MONTH);
			String cmonth = ""+(x+1);
			String cyear =""+cal.get(Calendar.YEAR);
			sysdate = cday+"/"+cmonth+"/"+cyear;
			
			String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
			String cmin = ""+cal.get(Calendar.MINUTE);
			String csec =""+cal.get(Calendar.SECOND);
			systime = chr+":"+cmin+":"+csec;

		
		 getContentPane().add(pan);   
		    
		    setSize(610,400);   
		    setLocation(350,200);   
		    setVisible(true);   

	  
		    
		}

	@Override
	public void actionPerformed(ActionEvent e) 
	

	{	 int flag1=0;
		String na = gstname.getText().trim();
	    String ps = rmno.getText().trim();
		
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
		 
		
		
		
		
         if(e.getSource() == checkout)
			
		{
        	 int flag=0;
        	 int flag2=0;
		String gname,rno;
        	 
        	 if(flag1==0)
        	 {
        	 gname = gstname.getText().trim();
		     rno = rmno.getText().trim();
			

 			
			
			ArrayList<GuestDetailData> list8;
			
			try
			{
			   FileInputStream fin=new FileInputStream("GuestData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list8=(ArrayList<GuestDetailData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list8=new ArrayList<GuestDetailData>();
			 }
			
			for(int i=0;i<list8.size();i++)
			{
				if(list8.get(i).getName().equals(gname))
						{
						if(list8.get(i).getRoomnm().equals(rno))
					
						{          flag=1;
						
						 
							if(list8.get(i).getCheckoutdate()==null)
							{
									
						  list8.get(i).setCheckoutdate(sysdate);
						  list8.get(i).setCheckouttime(systime);
						  flag2=1;
						  
					  }
				
						}
						}
			}
			 try	
			 {
			       FileOutputStream fout=new FileOutputStream("GuestData.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(list8);
			}catch(Exception ee){}
			 
			
			 if(flag ==0)
			 {
				 
				 msgbox = "Guest Record Not Found";
				 new MsgBox1(msgbox);
				 
			 }
			 
			
				 if(flag2==0)
				 {
				 msgbox = "Guest Has Already Been Checked Out";
				 new MsgBox1(msgbox);
				 
			
			 } 
				 
				 if(flag2==1)
				 {
					 
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
						
					 for(int j=0;j<list14.size();j++)
						{
							if(list14.get(j).getRoomno().equals(rno))
									{
				        		
								list14.get(j).setAvaibility("Yes");
					
								}
							}
						
						try	
						 {
						       FileOutputStream fout=new FileOutputStream("RoomData.dat");
						       ObjectOutputStream oout=new ObjectOutputStream(fout);
						       oout.writeObject(list14);
						}catch(Exception ee){}
						
					 
					 dispose();
					  msgbox = "Checked Out Succesfully";
						 new MsgBox1(msgbox);
					 
				 }
		}
	}
					
	}					   
				   
							
		
	}
	



public class CheckOut
{
	
	public static void main(String [] args)
	{
		
		new CheckOut1();
		
	}
}
