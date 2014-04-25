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


class RestaurantBill1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JButton save,cancel,add;
	private JTextField  name;
	private JTextField  rumnumbr; 
	private JTextField  plates; 
	private JComboBox  itemname; 
	private JLabel l1;
	private String msgbox;
	private int itmprice;
	private int bill =0;

	
	public void GenerateRestaurantBill(String nme, String rno)
	{
				
		pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    Font f33=new Font("Verdana",Font.BOLD,13);
	    l1 =new JLabel("Invalid Entry");
        l1.setFont(f33);
	    l1.setForeground(Color.RED);
	    l1.setVisible(false);
		
	    save = new JButton();
	    ImageIcon img2 = new ImageIcon("images\\savebrown.png");
	    save.setIcon(img2);
	    save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    save.addActionListener(this);
	    save.setToolTipText("Click To Save Bill");
	    
	    cancel = new JButton();
	    ImageIcon img3 = new ImageIcon("images\\cancelbrown.png");
	    cancel.setIcon(img3);
	    cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    cancel.addActionListener(this);
	    cancel.setToolTipText("Click To Cancel");
	    
	    add = new JButton();
	    ImageIcon img4 = new ImageIcon("images\\addbrown.png");
	    add.setIcon(img4);
	    add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    add.addActionListener(this);
	    add.setToolTipText("Click To Add Item");
	    
Font f23=new Font("Verdana",Font.BOLD,16);
	    
	    name=new JTextField();
	    name.setText(nme);
	    name.setEditable(false);
	    name.setFont(f23);
	    
	    rumnumbr=new JTextField();
        rumnumbr.setText(rno);
        rumnumbr.setEditable(false);
        rumnumbr.setFont(f23);
	    
	    plates=new JTextField();
	    plates.setToolTipText("Number of plates");
	    plates.setFont(f23);
	 
	    
	    itemname = new JComboBox();
	    itemname.setToolTipText("Item name");
	    itemname.setBackground(Color.WHITE);
	 
	    ArrayList<RestaurantMenuAddData> list8;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RestaurantData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list8=(ArrayList<RestaurantMenuAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list8=new ArrayList<RestaurantMenuAddData>();
		 }
		
		for(int i=0;i<list8.size();i++)
		{
				       
				itemname.addItem(list8.get(i).getItemname());
						  
				   }

        setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\restaurantbill.png"));
    	background.setLayout(new FlowLayout());
    	
    	name.setBounds(657,210,250,35); 
    	rumnumbr.setBounds(700,299,150,35);
    	itemname.setBounds(590,393,180,35);
		add.setBounds(860,550,80,30);
		save.setBounds(860,610,150,40);
		cancel.setBounds(1040,610,150,40);
		plates.setBounds(777,484,125,35);
		l1.setBounds(777,456,125,35);
		background.setBounds(0,0,1366,768);  
		
		 pan.add(name);  
		 pan.add(rumnumbr);   
		 pan.add(itemname);
		 pan.add(plates);
		 pan.add(save);  
		 pan.add(cancel);
		 pan.add(add);
		 pan.add(l1);
		 pan.add(background);
		 
		 
		 getContentPane().add(pan);   
		    
		    setSize(1366,768);   
		    setLocation(0,0);   
		    setVisible(true);   
		    setDefaultCloseOperation(EXIT_ON_CLOSE);    
		     
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int flag1 =0;
		String pl = plates.getText().trim();
		
		 String usernamepattern = "^[0-9]" ; 
		 Scanner   scan  =  new Scanner( pl ) ;
		 String   matched  =  scan.findInLine( usernamepattern ) ;
		 if ( matched == null )
		 {
			l1.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
			 
		 {
			 
			 l1.setVisible(false);
			 
		 }
		
		
		
		String itemnam,gname,rumno;
	
		
		if(e.getSource() == add)
			
		{
			
			if(flag1==0)
		{
				
			int itmprce;
			int quantity;
			
			itemnam = (String) itemname.getSelectedItem();
			String quant = plates.getText().trim();
			quantity = Integer.parseInt(quant);
			
			ArrayList<RestaurantMenuAddData> list17;

			
			try
			{
			   FileInputStream fin=new FileInputStream("RestaurantData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list17=(ArrayList<RestaurantMenuAddData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list17=new ArrayList<RestaurantMenuAddData>();
			 }
		    
			for(int i=0;i<list17.size();i++)
			{	
						if(list17.get(i).getItemname().equals(itemnam))
						{
							String price = list17.get(i).getItemprice().trim();
							
							itmprce = Integer.parseInt(price);
							
							bill = bill +(quantity *itmprce );
							
							
						}
						
	        }
			
			itemname.setSelectedItem(1);
			plates.setText("");
			
			
					
		}
		
		}	
		if(e.getSource() == save)
			
		{
			
			l1.setVisible(false);
			int flag = 0;
				
		
			String bill1,bill4;
			int bill2,bill3;
			gname = name.getText().trim();
			rumno = rumnumbr.getText().trim();
			String gbill = Integer.toString(bill);
			
			RestaurantBillData rbilld;
			
			ArrayList<RestaurantBillData> list8;
			
			try
			{
			   FileInputStream fin=new FileInputStream("RestaurantBillData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list8=(ArrayList<RestaurantBillData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list8=new ArrayList<RestaurantBillData>();
			 }
			
			for(int i=0;i<list8.size();i++)
			{
					       
					if(list8.get(i).getGuestname().equals(gname))
					{
						if(list8.get(i).getRoomnumbr().equals(rumno))	
							
						{
							bill1 = list8.get(i).getRestaurantbill();
							bill2 = Integer.parseInt(bill1);
							bill3 = bill2 +bill;							
						    bill4 = Integer.toString(bill3);
							list8.get(i).setRestaurantbill(bill4);							
							
							
							try	
							 {
							       FileOutputStream fout=new FileOutputStream("RestaurantBillData.dat");
							       ObjectOutputStream oout=new ObjectOutputStream(fout);
							       oout.writeObject(list8);
							}catch(Exception ee){}
							
							flag=1;
						
						}
						
						
					   }
			}
					
					if(flag==0)
					{
						
						String nam,rmno,billl;
						nam=name.getText().trim();
						rmno = rumnumbr.getText().trim();
						billl = Integer.toString(bill);
						
						rbilld = new RestaurantBillData();
						
						rbilld.setGuestname(nam);
						rbilld.setRoomnumbr(rmno);
						rbilld.setRestaurantbill(billl);
						
						new RestaurantBillAdd(rbilld);
						
						msgbox = "Bill Saved Successfully";
						new MsgBox1(msgbox);
						
					}
						
			
			
			
			name.setText("");
			rumnumbr.setText("");
			itemname.removeAllItems();
			plates.setText("");
			l1.setVisible(false);
			}			
			
		
		
		if(e.getSource() == cancel)
		{
			dispose();
			new StaffMenu1();
			
		}
		
	}
}

	public class RestaurantBill {

		
		public static void main(String[] args) 
		
		{
		
			RestaurantBill1 rb1 =new RestaurantBill1();
			rb1.GenerateRestaurantBill(null, null);
			
		}

	}
