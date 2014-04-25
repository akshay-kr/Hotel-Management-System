package hotel_Management_System;
import java.awt.Color;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.*;



class StaffInfoSearch<user1> extends JFrame implements ActionListener
{
	JPanel pan;  
	private JTextField username;
	private JComboBox date,month,year;
	private JButton search;
	private String user1;
	private String date1;
	private String month1;
	private String year1;
	private String dojj;
	private String msgbox;
	
	private JLabel l1;

	
	StaffInfoSearch()
	{
		super("STAFF INFORMATION SEARCH");
		pan = new JPanel();   
	    pan.setLayout(null); 
	    
	    
	    Font f33=new Font("Verdana",Font.BOLD,13);
	    

	    l1 =new JLabel("Invalid Username");
	    l1.setFont(f33);
	    l1.setForeground(Color.RED);
	    l1.setVisible(false);

	    username=new JTextField();
	    username.setFont(f33);
	  
	    
	    search = new JButton();
	    ImageIcon img = new ImageIcon("images\\search.png");
	    search.setIcon(img);
	    search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    search.addActionListener(this);
	    search.setToolTipText("Click To Search Staff");
	    
	    
	    String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		date=new JComboBox(dvalue);
		date.setBackground(Color.white);
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		month.setBackground(Color.white);
		

		
		String yvalue[]=new String[34];
		int cnt=0;
		for(int i=1980;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		year.setBackground(Color.white);
		
		
		JPanel cpanel=new JPanel();
		cpanel.add(date);
		cpanel.add(month);
		cpanel.add(year);
		cpanel.add(search);
	    
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images\\clean_quick_search_pack.jpg"));
	    
		
		username.setBounds(333,210,230,30);
		date.setBounds(333,280,50,30);
		month.setBounds(413,280,50,30);
		year.setBounds(493,280,70,30);
		search.setBounds(280,355,150,40);
		l1.setBounds(333,185,230,30);
		
		
		background.setBounds(0,0,703,636);  
		
		 pan.add(username);   
		 pan.add(date);   
		 pan.add(month);   
		 pan.add(year);
		 pan.add(search);
		 pan.add(l1);
		 
		 
		  pan.add(background);

		    getContentPane().add(pan);   
		    setSize(703,550);   
		    setLocation(350,105);  
		    setVisible(true);   

		      
		    
		}


	public void actionPerformed(ActionEvent e)
	{
		int flag1 =0;
		String us = username.getText().trim();
		
		 String usernamepattern = "^[a-zA-z]" ; 
		 Scanner   scan  =  new Scanner( us ) ;
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
		
		String usernme,dojt;
		
		if(e.getSource() == search)
			
		{
			int flag=0;
			
			if(flag1==0)
			{
			usernme = username.getText().trim();

			String d=(String)date.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dojt=d + "-" + m + "-" + y;
			
			user1 = usernme;
            dojj = dojt;
            date1 = d;
            month1 = m;
            year1 = y;
			
            
			ArrayList<LoginData> list9;
			
			try
			{
			   FileInputStream fin=new FileInputStream("LoginData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list9=(ArrayList<LoginData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list9=new ArrayList<LoginData>();
			 }
			
			for(int i=0;i<list9.size();i++)
			{
				if (list9.get(i).getId().equals(usernme))
				{
					if (list9.get(i).getDojth().equals(dojt))
					
						{

                               flag=1;
						   				       
					       
					       
						   }
						   
						   
							
					   }
						
						
	
	}
			
			if(flag ==1)
			{
				dispose();
				
				
				StaffUpdate1 su2 = new StaffUpdate1();
		           su2.staffUpd(user1,dojj,date1,month1,year1);
				
			}
			
			if(flag==0)
			{
				
				msgbox = "Staff Information Not Found";
				new MsgBox1(msgbox);
				
			}
			
	}
	}
	}
}		
  
public class StaffSearch
{	 
	
		
	public static void main(String[] args) 
	{
		new StaffInfoSearch();

	}

}


