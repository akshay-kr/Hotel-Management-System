package hotel_Management_System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class RestaurantMenuUpdate1 extends JFrame implements ActionListener
{
	JPanel pan;   
	private JTextField itemid1,itemprce;
	private JComboBox itemnam,itemcat,itemsubcat;
	private JButton update,delete,cancel,searchagain;
	private JButton edit1,edit2,edit3;
	private JLabel l2,l3;
	private String msgbox;

	
	public void RestaurantMenuUpdat(String itmcat ,String itmsubcat)
	{
	 
	    pan = new JPanel();   
	    pan.setLayout(null);   
		
	    Font f1=new Font("Verdana",Font.BOLD,14);
	    Font f33=new Font("Verdana",Font.BOLD,13);
	    
	    l2 = new JLabel("Invalid Item Id");
	    
	      l2.setFont(f33);
	      l2.setForeground(Color.RED);
	     l2.setVisible(false);
	      
	    l3 = new JLabel("Invalid Item Price");
	      l3.setFont(f33);
	      l3.setForeground(Color.RED);
	    l3.setVisible(false);
	    
		itemnam= new JComboBox();;
		itemnam.setFont(f1);
		itemnam.setToolTipText("Select the Item Name"); 
		itemnam.addActionListener(this);
	       
		itemid1=new JTextField();
		itemid1.setFont(f1);
		itemid1.setToolTipText("Please enter the Item Id");
		itemid1.setEditable(false);
	       
		itemprce=new JTextField();
		itemprce.setFont(f1);
		itemprce.setToolTipText("Please enter the Item Price In Rs."); 
		itemprce.setEditable(false);
		
		String ctvalue[]={"Breakfast","Lunch","Snacks","Dinner"};
		itemcat=new JComboBox(ctvalue);
		itemcat.setFont(f1);
		itemcat.setBackground(Color.WHITE);
		itemcat.setToolTipText("Please select Menu Course");
		itemcat.setEnabled(false);
		
		
		String ctvalue1[]={"Veg","Non-Veg"};
		itemsubcat=new JComboBox(ctvalue1);
		itemsubcat.setFont(f1);
		itemsubcat.setBackground(Color.WHITE);
		itemsubcat.setToolTipText("Please select Menu Type");
		itemsubcat.setEnabled(false);
		
		update=new JButton();
		   ImageIcon img = new ImageIcon("images\\updatered.png");
		   update.setIcon(img);
		   update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   update.addActionListener(this);
		   update.setToolTipText("Click to Add Menu");
		   
		   delete=new JButton();
		   ImageIcon img1 = new ImageIcon("images\\deletered.png");
		   delete.setIcon(img1);
		   delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   delete.addActionListener(this);
		   delete.setToolTipText("Click to Clear Fields");
		   
		   cancel=new JButton();
		   ImageIcon img2 = new ImageIcon("images\\cancelred.png");
		   cancel.setIcon(img2);
		   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   cancel.addActionListener(this);
		   cancel.setToolTipText("Click to Cancel");
		   
		   searchagain=new JButton();
		   ImageIcon img3 = new ImageIcon("images\\cancelred.png");
		   searchagain.setIcon(img3);
		   searchagain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   searchagain.addActionListener(this);
		   searchagain.setToolTipText("Click to Search Again");
		   
		   edit1=new JButton();
		   ImageIcon img4 = new ImageIcon("images\\editred.png");
		   edit1.setIcon(img4);
		   edit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   edit1.addActionListener(this);
		   edit1.setToolTipText("Click To Edit Item Id");
		   
		   edit2=new JButton();
		   edit2.setIcon(img4);
		   edit2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   edit2.addActionListener(this);
		   edit2.setToolTipText("Click To Edit Item Category");
		   
		   edit3=new JButton();
		   edit3.setIcon(img4);
		   edit3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   edit3.addActionListener(this);
		   edit3.setToolTipText("Click To Item Price Per Plate In Rs.");
		   
		   
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
				if((list8.get(i).getItemcategory().equals(itmcat)) && ((list8.get(i).getItemsubcategory()).equals(itmsubcat)))
					
						{
					       
					itemnam.addItem(list8.get(i).getItemname());
							  
					   }
			}
		
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		JLabel background=new JLabel(new ImageIcon("images\\restaurantmenu.jpg"));
		background.setLayout(new FlowLayout());
		
		itemnam.setBounds(655,172,220,30);  
		itemid1.setBounds(655,224,100,30); 
		
		itemprce.setBounds(790,400,134,30);  
		itemcat.setBounds(655,279,134,30);  
		
		itemsubcat.setBounds(655,341,100,30);  
		update.setBounds(760,495,134,35); 
		
		edit1.setBounds(830,225,60,28);  
		edit2.setBounds(830,279,60,28); 
		edit3.setBounds(960,401,60,28);
		l2.setBounds(655,196,220,30);
		l3.setBounds(790,370,220,30);
		delete.setBounds(915,495,134,35);  
		cancel.setBounds(1070,495,134,35); 
		searchagain.setBounds(1070,495,134,35);
		
		background.setBounds(0,0,1366,768);  
		
	    pan.add(itemnam);
	    pan.add(itemid1);
	    pan.add(itemprce);
	    pan.add(itemcat);
	    pan.add(itemsubcat);
	    pan.add(edit1);
	    pan.add(edit2);
	    pan.add(edit3);
	    pan.add(update);
	    pan.add(delete);
	    pan.add(cancel);
	    pan.add(searchagain);
	    pan.add(l2);
	    pan.add(l3);
	    
	    pan.add(background);

	    getContentPane().add(pan);   

	    setSize(1366,768);   
	    setLocation(0,0);   
	    setVisible(true);   

	    setDefaultCloseOperation(EXIT_ON_CLOSE);    
 
	    
		
	}

	public void actionPerformed(ActionEvent e) 
	{int flag1 =0;
		
		String itd = itemid1.getText().trim();
		 String  itpr= itemprce.getText().trim();

		String itemidpattern = "^[0-9]" ; 
		 Scanner   scan1  =  new Scanner(itd) ;
		 String   matched1  =  scan1.findInLine(itemidpattern) ;
		 if ( matched1 == null )
		 {
			 
		l2.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
		 {
			 
			 l2.setVisible(false);
			 
		 }
		 
		 String itempricepattern = "^[0-9]" ; 
		 Scanner   scan2  =  new Scanner(itpr) ;
		 String   matched2  =  scan2.findInLine(itempricepattern) ;
		 if ( matched2 == null )
		 {
			 
		l3.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
		 {
			 
			 l3.setVisible(false);
			 
		 }

		
		
		String itmnm1,itmnm,itmid,itmcat,itmsubcat,itmprice;
		
		RestaurantMenuAddData restaurantd;
		
		if(e.getSource() == itemnam)
		{
			itmnm1 = (String)itemnam.getSelectedItem();
			ArrayList<RestaurantMenuAddData> list18;
			
			try
			{
			   FileInputStream fin=new FileInputStream("RestaurantData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list18=(ArrayList<RestaurantMenuAddData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list18=new ArrayList<RestaurantMenuAddData>();
			 }
			
			for(int i=0;i<list18.size();i++)
			{
				if (list18.get(i).getItemname().equals(itmnm1))
				{
			
					itemid1.setText(list18.get(i).getItemid());
	                itemcat.setSelectedItem(list18.get(i).getItemcategory());
	                itemsubcat.setSelectedItem(list18.get(i).getItemsubcategory());
	                itemprce.setText(list18.get(i).getItemprice());

					l2.setVisible(false);
					l3.setVisible(false);
				}
		}
		}
		
		if(e.getSource() == edit1)
		{
			
			itemid1.setEditable(true);
			l2.setVisible(false);
			
		}
		
		if(e.getSource() == edit2)
		{
			
			itemcat.setEnabled(true);
			
		}
		
		if(e.getSource() == edit3)
		{
			
			itemprce.setEditable(true);
			l3.setVisible(false);
			
		}
		
		
		if(e.getSource() == update)
			
		{
			if(flag1==0)
			{
			
			itmnm =(String) itemnam.getSelectedItem();
			itmid =itemid1.getText().trim();
			
			itmcat=(String) itemcat.getSelectedItem();
			itmsubcat =(String) itemsubcat.getSelectedItem();
			itmprice =itemprce.getText().trim();
		
		
		
		ArrayList<RestaurantMenuAddData> list25;
		
		try
		{FileInputStream fin=new FileInputStream("RestaurantData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list25=(ArrayList<RestaurantMenuAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list25=new ArrayList<RestaurantMenuAddData>();
		 }
		 
		
		for(int i=0;i<list25.size();i++)
		{
			if (list25.get(i).getItemname().equals(itmnm))
			{
        		
				list25.get(i).setItemname(itmnm);
				list25.get(i).setItemid(itmid);
				list25.get(i).setItemcategory(itmcat);
				list25.get(i).setItemsubcategory(itmsubcat);
				list25.get(i).setItemprice(itmprice);
	
				}
			}
		
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("RestaurantData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list25);
		}catch(Exception ee){}
		
		itemnam.setSelectedItem(1);
		itemid1.setText("");
		itemcat.setSelectedItem(1);
		itemsubcat.setSelectedItem(1);
		itemprce.setText("");
		
		
		
		itemid1.setEditable(false);
		  itemcat.setEnabled(false);
		   itemsubcat.setEditable(false);  
		   itemprce.setEnabled(false);
	    
		   msgbox = "Item Updated Successfully";
           new MsgBox1(msgbox);
		}
		
		
		}
	if(e.getSource() == delete)
	{
		
ArrayList<RestaurantMenuAddData> list26;
		
                    itmnm = (String)itemnam.getSelectedItem();

		try
		{FileInputStream fin=new FileInputStream("RestaurantData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list26=(ArrayList<RestaurantMenuAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list26=new ArrayList<RestaurantMenuAddData>();
		 }
		 
		
		for(int i=0;i<list26.size();i++)
		{
			if (list26.get(i).getItemname().equals(itmnm))
			{
        		
					list26.remove(i);
					itemnam.removeItem(itmnm);
		
				}
			}

		
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("RestaurantData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list26);
		}catch(Exception ee){}
		
		itemnam.setSelectedItem(1);
		itemid1.setText("");
		itemcat.setSelectedItem(1);
		itemsubcat.setSelectedItem(1);
		itemprce.setText("");
		
		
		
		itemid1.setEditable(false);
		  itemcat.setEnabled(false);
		   itemsubcat.setEditable(false);  
		   itemprce.setEnabled(false);

           msgbox = "Item Deleted Successfully";
           new MsgBox1(msgbox);
		   
	}
	       
	if(e.getSource() == cancel)
	{
		dispose();
		new AdminMenu1();
	
	}
	
	if(e.getSource() == searchagain)
	{
		
		new RestaurantMenuSearch1();
		
	}

		
	}
	
}
	public class RestaurantMenuUpdate 
	{
	
	public static void main(String[] args) 
	{
	
		RestaurantMenuUpdate1 rm1 = new RestaurantMenuUpdate1();
		rm1.RestaurantMenuUpdat(null, null);

	}

}
