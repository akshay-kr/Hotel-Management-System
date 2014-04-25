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
import java.io.ObjectInputStream;

import javax.swing.*;

class BillSearch1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JTextField gstname,rmno;
	private JButton generatebill;
	private String ggname,rrno;
	private JLabel l1,l2;
	private String msgbox;
	
	
	
	
	public BillSearch1()
	{
		super("Generate Bill");
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
	    
	   Font f23=new Font("Verdana",Font.BOLD,12);    
		
	   
gstname = new JTextField();
gstname.setToolTipText("Enter Guest name");
gstname.setFont(f23);

		
		rmno = new JTextField();
		rmno.setToolTipText("Enter room number");
		rmno.setFont(f23);
		
		generatebill = new JButton(); 
		 ImageIcon img2 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\generatebillicon.png");
	    generatebill.setIcon(img2);
		generatebill.addActionListener(this);
		
setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\akki\\Desktop\\project\\billsearch.png"));
    	background.setLayout(new FlowLayout());

		
    	gstname.setBounds(290,109,140,30); 
    	rmno.setBounds(290,170,90,30);
    	generatebill.setBounds(230,242,136,46);
    	l1.setBounds(290,85,140,30);
    	l2.setBounds(290,148,140,30);
	    
		background.setBounds(0,0,600,335);  
		
		 pan.add(gstname);  
		 pan.add(rmno);   
		 pan.add(generatebill);   
		 pan.add(l1);
		 pan.add(l2);
		 
		 pan.add(background);

		
		 getContentPane().add(pan);   
		    
		    setSize(610,373);   
		    setLocation(350,200);   
		    setVisible(true);   

		    
		    
		}
	
	
	public void actionPerformed(ActionEvent e) 
	
	{
		int flag1=0;
		String na = gstname.getText().trim();
	    String rm = rmno.getText().trim();
		
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
		 Scanner   scan1  =  new Scanner( rm ) ;
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
		 
		
		

         String gname,rno;
		
		
		
		if(e.getSource() == generatebill)
			
		{    int flag3 =0;
			int flag2=0;
			
			
			int flag=0;
			
			if(flag1==0)
			{
		
			ggname = gstname.getText().trim();
			rrno = rmno.getText().trim();
			
			gname = gstname.getText().trim();
			rno = rmno.getText().trim();
					
			
			
			
			ArrayList<FinalBillData> list17;
			
			try
			{
			   FileInputStream fin=new FileInputStream("GuestBillData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list17=(ArrayList<FinalBillData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list17=new ArrayList<FinalBillData>();
			 }
		    
			for(int i=0;i<list17.size();i++)
			{
				if (list17.get(i).getGstnme().equals(gname))
				{
					if (list17.get(i).getRomno().equals(rno))
					{
				
					
					
					flag3=1;
					
				}
						
			}
			}	
			
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
					{
					
						flag=1;
						
						if(list8.get(i).getCheckoutdate()==null)
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
					
					msgbox = "Guest Has Not Been Checked Out";
					new MsgBox1(msgbox);
					
				}
					
				
			
			if(flag==0)
			{
				
				
				msgbox = "No Guest Record Found";
				new MsgBox1(msgbox);
				
				
			}
			if(flag3==1)
			{
				
				msgbox = "Bill Has Already Been Generated";
				new MsgBox1(msgbox);
				
				
			}
			
			
			if(flag3==0)
			{
			
			if(flag2==2)
			{
				
				dispose();
				
				FinalBill1 f1 = new FinalBill1();		  
				
				f1.bill(ggname,rrno);
				
				
			}
			}
			
			if(flag2==1)
			{
				
				
				
				
			}
	}
						   
		}			   
							
	}				   
						
						
	
	
	}

	public class BillSearch
	{
		
public static void main(String[] args) 
{
     new BillSearch1();

}
}


