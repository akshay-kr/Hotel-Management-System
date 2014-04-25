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

class BookingForm1 extends JFrame implements ActionListener
{
	
		JPanel pan;  
	    private JLabel l11,l12,l1,l2,l3,l4,l5,l6,l7,l8,l9;
		private JTextField firstnme,secondnme;
		private JTextArea address;
		private JComboBox city,state,country,numberAdults,identificationProof,bed,actype;
		private  JTextField roomnum,identificationnum,pincode,contactnum;
		private JButton next,clear,cancel;
		private String sysdate,systime;
		private String nam,addre,cty,stte,countr,adult,ident,bdtyp,rmtyp,chkindate,chkintime,rmno,idnm,pincd,cntnm,avai;

		public BookingForm1(String rno,String rtype,String rbed)
		{
			super("Bookin Form");
			pan = new JPanel();   
		    pan.setLayout(null);   
		    
		    
		    
		    Font f33=new Font("Verdana",Font.BOLD,10);
		    l1 = new JLabel("Invalid Name");
		      l1.setFont(f33);
		      l1.setForeground(Color.RED);
		    l1.setVisible(false);
		      
		      
		    l2 = new JLabel("Invalid Name");
		    
		      l2.setFont(f33);
		      l2.setForeground(Color.RED);
		     l2.setVisible(false);
		      
		    l3 = new JLabel("Invalid Pin Code");
		      l3.setFont(f33);
		      l3.setForeground(Color.RED);
		    l3.setVisible(false);
		    
		   l4 = new JLabel("Invalid Contact No. (10 Digits)");
		   l4.setFont(f33);
		   l4.setForeground(Color.RED);
		   l4.setVisible(false);
		      
		      
		    l5 = new JLabel("Invalid Identification Number");		    
		    l5.setFont(f33);
		    l5.setForeground(Color.RED);
		    l5.setVisible(false);
		    
		    l9 = new JLabel("Invalid Address");		    
		    l9.setFont(f33);
		    l9.setForeground(Color.RED);
		    l9.setVisible(false);
		      
		    
		    Font f23=new Font("Verdana",Font.BOLD,12);    
			
		    firstnme=new JTextField();
		    firstnme.setFont(f23);
		    firstnme.setToolTipText("Enter First Name");
		    
		    secondnme=new JTextField();
		    secondnme.setFont(f23);
		    secondnme.setToolTipText("Enter Second Name");
		    
		    roomnum=new JTextField();
		    roomnum.setText(rno);	
		    roomnum.setEditable(false);
		    roomnum.setFont(f23);
	
		    
		    identificationnum =new JTextField();
		    identificationnum.setFont(f23);
		    identificationnum.setToolTipText("Enter The Identification Number");
		    
		    pincode =new JTextField();
		    pincode.setFont(f23);
		    pincode.setToolTipText("Enter The Pincode Name");
		    
		    contactnum =new JTextField();
		    contactnum.setFont(f23);
		    contactnum.setToolTipText("Enter Contact Number");
		    
		    address=new JTextArea(5,20);
		    JScrollPane tapan=new JScrollPane(address);
		    address.setFont(f23);
		    address.setToolTipText("Enter First Name");
		    
		    String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore","Lucknow",};
		    city=new JComboBox(ctvalue);
		    city.setBackground(Color.WHITE);
		    
		    String stvalue[]={"Andhra Pradesh","Hydrabad","Arunachal Pradesh","Assam","Bihar","Chhatisgarh","Goa","Gujarat","Haryana"};
		    state=new JComboBox(stvalue);
		    state.setBackground(Color.WHITE);
		    
		    String countryvalue[]={"India","Bangladesh","Singapore","Malaysia","Thailand","China","U.S.A","U.K","Bhutan","Nepal","Sri Lanka"};
		    country=new JComboBox(countryvalue);
		    country.setBackground(Color.WHITE);
		    
		    String proofOfYourIdentity[]={"Voter ID","Pan Card","Driving License","Passport"};
		    identificationProof=new JComboBox(proofOfYourIdentity);
		    identificationProof.setBackground(Color.WHITE);
		    
		    bed=new JComboBox();
		    bed.setBackground(Color.WHITE);
		    bed.addItem(rbed);
		    bed.setEnabled(false);
		    
		    actype=new JComboBox();
		    actype.setBackground(Color.WHITE);
		    actype.addItem(rtype);
		    actype.setEnabled(false);
		    
		    
		    String numberOfAdults[]={"1","2","3","4"};
		    numberAdults=new JComboBox(numberOfAdults);
		    numberAdults.setBackground(Color.WHITE);
		    
		    Font f1=new Font("Modern No. 20",Font.BOLD,18);
		    
		    Calendar cal = Calendar.getInstance();
			
			String cday = ""+cal.get(Calendar.DATE);
			int x =cal.get(Calendar.MONTH);
			String cmonth = ""+(x+1);
			String cyear =""+cal.get(Calendar.YEAR);
			sysdate = cday+"/"+cmonth+"/"+cyear;
			l11=new JLabel(sysdate);	
			l11.setFont(f1);
			
		    String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
			String cmin = ""+cal.get(Calendar.MINUTE);
			String csec =""+cal.get(Calendar.SECOND);
			systime = chr+":"+cmin+":"+csec;
			
			l12=new JLabel(systime);	
			l12.setFont(f1);

		    
				
				next=new JButton();
				ImageIcon img = new ImageIcon("images\\next.png");
				next.setIcon(img);
				next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
				next.addActionListener(this);
				next.setToolTipText("Click To Submit Guest Information");
				
				cancel=new JButton();
				ImageIcon img1 = new ImageIcon("images\\cancel2.png");
				cancel.setIcon(img1);
				cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
				cancel.addActionListener(this);
				cancel.setToolTipText("Click To Cancel");
				   
				clear=new JButton();
				ImageIcon img2 = new ImageIcon("images\\clear2.png");
				clear.setIcon(img2);
				clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
				clear.addActionListener(this);
				clear.setToolTipText("Click To Clear Information");
		    
				setLayout(new BorderLayout());
				JLabel background=new JLabel(new ImageIcon("images\\Bookin Form.png"));
				background.setLayout(new FlowLayout());
				
				firstnme.setBounds(365,210,265,30); 
				secondnme.setBounds(365,250,265,30); 
				tapan.setBounds(365,290,265,30);
				city.setBounds(365,335,265,30); 
				state.setBounds(365,375,265,30); 
				country.setBounds(365,415,265,30); 
				pincode.setBounds(365,455,265,30); 
				contactnum.setBounds(365,495,265,30); 
				numberAdults.setBounds(365,530,265,30); 
				identificationProof.setBounds(365,570,265,30);
				identificationnum.setBounds(365,620,265,30);
				bed.setBounds(1040,256,100,30);
				actype.setBounds(1040,210,100,30);
				roomnum.setBounds(1040,300,170,30);
				l11.setBounds(1050,467,100,30);
				l12.setBounds(1050,512,100,30);
				l1.setBounds(365,193,265,15);
				l2.setBounds(365,238,265,15);
				l3.setBounds(365,443,265,15);
				l4.setBounds(365,482,265,15);
				l5.setBounds(365,605,265,15);
				l9.setBounds(365,277,265,15);
				
				
				next.setBounds(820,638,130,44);  
				cancel.setBounds(1160,638,130,44); 
				clear.setBounds(990,638,130,44); 
				
				background.setBounds(0,0,1366,768);  
				
				 pan.add(firstnme);   
				 pan.add(secondnme);   
				 pan.add(tapan);   
				 pan.add(city); 
				 pan.add(state);   
				 pan.add(country); 
				 pan.add(pincode);   
				 pan.add(contactnum); 
				 pan.add(numberAdults);   
				 pan.add(identificationProof); 
				 pan.add(identificationnum);   
				 pan.add(bed); 
				 pan.add(actype);   
				 pan.add(roomnum);  
				 pan.add(l11);   
				 pan.add(l12); 
				 pan.add(l1);
				 pan.add(l2);
				 pan.add(l3);
				 pan.add(l4);
				 pan.add(l5);
				 pan.add(l9);
				 				 
				 pan.add(next);   
				 pan.add(clear);   
				 pan.add(cancel);  
				    
				 pan.add(background);

				getContentPane().add(pan);   
				    
				setSize(1366,768);   
				setLocation(0,0);   
				setVisible(true);   

				 setDefaultCloseOperation(EXIT_ON_CLOSE);    	
				    
		}
		
				public void actionPerformed(ActionEvent e) 

				{ 	int flag1 =0;
					String fe = firstnme.getText().trim();
					 String  se= secondnme.getText().trim();
					 String pi = pincode.getText().trim();
					 String co = contactnum.getText().trim();
					 String id = identificationnum.getText().trim();

					String firstnamepattern = "^[a-zA-z]" ; 
					 Scanner   scan  =  new Scanner(fe) ;
					 String   matched  =  scan.findInLine(firstnamepattern) ;
					 if ( matched == null )
					 {
						 
					l1.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l1.setVisible(false);
						 
					 }
					 
					 String secondnamepattern = "^[a-zA-z]" ; 
					 Scanner   scan1  =  new Scanner(se) ;
					 String   matched1  =  scan1.findInLine(secondnamepattern) ;
					 if ( matched1 == null )
					 {
						 
					l2.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l2.setVisible(false);
						 
					 }

					
					 String pincodepattern = "^[0-9]" ; 
					 Scanner   scan2  =  new Scanner(pi) ;
					 String   matched2  =  scan2.findInLine(pincodepattern) ;
					 if ( matched2 == null )
					 {
						 
					l3.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l3.setVisible(false);
						 
					 }

					
					 String contactnopattern = "^[0-9]{10,10}$" ; 
					 Scanner   scan3  =  new Scanner(co) ;
					 String   matched3  =  scan3.findInLine(contactnopattern) ;
					 if ( matched3 == null )
					 {
						 
					l4.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l4.setVisible(false);
						 
					 }

					 
					 String identificationnopattern = "^[0-9]" ; 
					 Scanner   scan4  =  new Scanner(id) ;
					 String   matched4 =  scan4.findInLine(identificationnopattern) ;
					 if ( matched4 == null )
					 {
						 
					l5.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l5.setVisible(false);
						 
					 }
					 
					
					 String addres = address.getText().trim();
					 
					 if(addres.length()<1)
					 {
						 
					l9.setVisible(true);
						flag1=1;
						
					 }
					 
					 else
					 {
						 
						 l9.setVisible(false);
						 
					 }
					 
					
					 
					String fnam,snam;
					
					avai = "No";
					
					GuestDetailData guestd;
					
					if(e.getSource() == next)
						
					{
					
						if(flag1 ==0)
						{
						
						
						

						fnam =firstnme.getText().trim();
						snam =secondnme.getText().trim();
						
						nam = fnam +" "+ snam;
						addre =address.getText().trim();
						cty =(String) city.getSelectedItem();
						stte =(String) state.getSelectedItem();
						countr =(String) country.getSelectedItem();
						adult =(String) numberAdults.getSelectedItem();
						ident =(String) identificationProof.getSelectedItem();
						bdtyp =(String) bed.getSelectedItem();
						rmtyp =(String) actype.getSelectedItem();
						
						chkindate = l11.getText().trim();
						chkintime = l12.getText().trim();
						rmno =roomnum.getText().trim();
						idnm =identificationnum.getText().trim();
						pincd =pincode.getText().trim();
						cntnm =contactnum.getText().trim();
				        
						
						
						

						firstnme.setText("");
						secondnme.setText("");
						address.setText("");
						roomnum.setText("");
						identificationnum.setText("");
						pincode.setText("");
						contactnum.setText("");
						
						city.setSelectedItem(1);
						state.setSelectedItem(1);
						country.setSelectedItem(1);
						numberAdults.setSelectedItem(1);
						identificationProof.setSelectedItem(1);
						bed.setSelectedItem(1);
						actype.setSelectedItem(1);
						
						new ExtraFacility1(nam,addre,cty,stte,countr,adult,ident,bdtyp,rmtyp,chkindate,chkintime,rmno,idnm,pincd,cntnm,avai);
						dispose();
					}
					
					}
				if(e.getSource() == clear)
				{
					firstnme.setText("");
					secondnme.setText("");
					address.setText("");
					
					identificationnum.setText("");
					pincode.setText("");
					contactnum.setText("");
					
					city.setSelectedItem(1);
					state.setSelectedItem(1);
					country.setSelectedItem(1);
					numberAdults.setSelectedItem(1);
					identificationProof.setSelectedItem(1);
					
					
					l1.setVisible(false);
					l2.setVisible(false);	
					l3.setVisible(false);
					l4.setVisible(false);	
					l5.setVisible(false);
					l6.setVisible(false);
					l7.setVisible(false);
					l8.setVisible(false);
					l9.setVisible(false);
					
					
				}
				
				if(e.getSource()== cancel)
				
				{
				dispose();
					new StaffMenu1();
					
				}

				}

				    
				    
				    
}

		
public class BookingForm
{
	
	public static void main(String[] args) 
	{
		new BookingForm1(null,null,null);

	}

}
