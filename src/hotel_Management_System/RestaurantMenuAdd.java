package hotel_Management_System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

class RestaurantMenuAdd1 extends JFrame implements ActionListener
{
	JPanel pan;   
	private JTextField itemnam,itemid1,itemprce;
	private JComboBox itemcat,itemsubcat;
	private JButton submit,clear,cancel;
	private JLabel l1,l2,l3;
	private String msgbox;

	public RestaurantMenuAdd1()
	{
		super("Select Login");   
	    pan = new JPanel();   
	    pan.setLayout(null);   
	   
	    Font f1=new Font("Verdana",Font.BOLD,14);
	    Font f33=new Font("Verdana",Font.BOLD,13);
	    l1 = new JLabel("Invalid Item Name");
	      l1.setFont(f33);
	      l1.setForeground(Color.RED);
	    l1.setVisible(false);
	      
	      
	    l2 = new JLabel("Invalid Item Id");
	    
	      l2.setFont(f33);
	      l2.setForeground(Color.RED);
	     l2.setVisible(false);
	      
	    l3 = new JLabel("Invalid Item Price");
	      l3.setFont(f33);
	      l3.setForeground(Color.RED);
	    l3.setVisible(false);
	    
		itemnam=new JTextField();
		itemnam.setFont(f1);
		itemnam.setToolTipText("Please enter the Item Name"); 
	       
		itemid1=new JTextField();
		itemid1.setFont(f1);
		itemid1.setToolTipText("Please enter the Item Id"); 
	       
		itemprce=new JTextField();
		itemprce.setFont(f1);
		itemprce.setToolTipText("Please enter the Item Price In Rs."); 
		
		String ctvalue[]={"Breakfast","Lunch","Snacks","Dinner"};
		itemcat=new JComboBox(ctvalue);
		itemcat.setFont(f1);
		itemcat.setBackground(Color.WHITE);
		itemcat.setToolTipText("Please select Menu Course");
		
		
		String ctvalue1[]={"Veg","Non-Veg"};
		itemsubcat=new JComboBox(ctvalue1);
		itemsubcat.setFont(f1);
		itemsubcat.setBackground(Color.WHITE);
		itemsubcat.setToolTipText("Please select Menu Type");
		
		   submit=new JButton();
		   ImageIcon img = new ImageIcon("images\\submitred.png");
		   submit.setIcon(img);
		   submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   submit.addActionListener(this);
		   submit.setToolTipText("Click to Add Menu");
		   
		   clear=new JButton();
		   ImageIcon img1 = new ImageIcon("images\\clearred.png");
		   clear.setIcon(img1);
		   clear.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   clear.addActionListener(this);
		   clear.setToolTipText("Click to Clear Fields");
		   
		   cancel=new JButton();
		   ImageIcon img2 = new ImageIcon("images\\cancelred.png");
		   cancel.setIcon(img2);
		   cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		   cancel.addActionListener(this);
		   cancel.setToolTipText("Click to Cancel");
		
		setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		JLabel background=new JLabel(new ImageIcon("images\\restaurantmenu.jpg"));
		background.setLayout(new FlowLayout());
		
		itemnam.setBounds(655,172,220,30);  
		itemid1.setBounds(655,224,100,30); 
		l1.setBounds(655,146,220,30); 
		l2.setBounds(655,196,220,30);
		itemprce.setBounds(790,400,134,30);  
		itemcat.setBounds(655,279,134,30);  
		l3.setBounds(790,370,220,30);
		itemsubcat.setBounds(655,341,100,30);  
		submit.setBounds(760,495,134,35); 
		
		clear.setBounds(915,495,134,35);  
		cancel.setBounds(1070,495,134,35);  
		
		background.setBounds(0,0,1366,768);  
		
	    pan.add(itemnam);
	    pan.add(itemid1);
	    pan.add(itemprce);
	    pan.add(itemcat);
	    pan.add(itemsubcat);
	    pan.add(submit);
	    pan.add(clear);
	    pan.add(cancel);
	    pan.add(l1); 
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
	{
		int flag1 =0;
		
		 String itm = itemnam.getText().trim();
		 String itd = itemid1.getText().trim();
		 String  itpr= itemprce.getText().trim();
		
		 String itemnamepattern = "^[a-zA-z]" ; 
		 Scanner   scan  =  new Scanner(itm) ;
		 String   matched  =  scan.findInLine(itemnamepattern) ;
		 if ( matched == null )
		 {
			 
		l1.setVisible(true);
			flag1=1;
			
		 }
		 
		 else
		 {
			 
			 l1.setVisible(false);
			 
		 }
		 
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

		String itmnm,itmid,itmcat,itmsubcat,itmprice;
		int flag=0;
		
		RestaurantMenuAddData restaurantd;
		
		if(e.getSource() == submit)
			
		{
			
			if(flag1 ==0)
			{
			
			
			itmnm =itemnam.getText().trim();
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
					msgbox = "Item Has Already Been Added";
					new MsgBox1(msgbox);
					
					flag=1;
				}
			}
			
			if(flag == 0)
			{
					
			restaurantd = new RestaurantMenuAddData();
			
			restaurantd.setItemname(itmnm);
			restaurantd.setItemid(itmid);
			restaurantd.setItemcategory(itmcat);
			restaurantd.setItemsubcategory(itmsubcat);
			restaurantd.setItemprice(itmprice);
			
			
			new RestaurantMenuAddition(restaurantd);
			
			msgbox = "Item Added Successfully";
			new MsgBox1(msgbox);
			
			
			}
			
			itemnam.setText("");
			itemid1.setText("");
			itemcat.setSelectedItem(1);
			itemsubcat.setSelectedItem(1);
			itemprce.setText("");
			
			
		}
		
		}
	if(e.getSource() == clear)
	{
		itemnam.setText("");
		itemid1.setText("");
		itemcat.setSelectedItem(1);
		itemsubcat.setSelectedItem(1);
		itemprce.setText("");
		
          l1.setVisible(false);
          l2.setVisible(false);
          l3.setVisible(false);
		
	}

	if(e.getSource() == cancel)
	{	
	dispose();
		new AdminMenu1();

	}
	
	}
}
	public class RestaurantMenuAdd 
	{
	
	public static void main(String[] args) 
	{
	
		new RestaurantMenuAdd1();

	}

}
