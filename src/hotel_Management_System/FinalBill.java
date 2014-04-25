package hotel_Management_System;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



class FinalBill1 extends JFrame implements ActionListener
{
	String msgbox;
	
	JPanel pan;  
	private JLabel gstname,rmno,chkindate,chkoutdate,hotelcharge,extrafacility,restaurantcharge,total;
	private JButton paid,save,print,exit;
	private int rumprice;
	private int extraamount;
	private int htlcharge;
	private int rescharge;
	private String indate;
	private String outdate;
	private int totalcharge;
	private int noOfDays;

	Date fromdate;
	Date todate;
	
	public void bill(String ggname, String rrno)
	{
		
	
		pan= new JPanel();   
	    pan.setLayout(null); 
		
		 Font f1=new Font("Modern No. 20",Font.BOLD,30);
				  	
		 gstname = new JLabel();
		 gstname.setFont(f1);
	     gstname.setForeground(Color.BLUE);
	     gstname.setToolTipText("Guest Name"); 
	     
	     rmno = new JLabel();			
			rmno.setFont(f1);
			rmno.setForeground(Color.BLUE);
			rmno.setToolTipText("Room No");
			
			chkindate = new JLabel();				
			chkindate.setFont(f1);
			chkindate.setForeground(Color.BLUE);
			chkindate.setToolTipText("Check In Date");
		
		
		
		restaurantcharge = new JLabel();
		
		restaurantcharge.setFont(f1);
		restaurantcharge.setForeground(Color.BLUE);
		restaurantcharge.setToolTipText("Restaurant Charge"); 
		
		chkoutdate = new JLabel();
		chkoutdate.setFont(f1);
		chkoutdate.setForeground(Color.BLUE);
		chkoutdate.setToolTipText("Check Out Date"); 
		
		hotelcharge = new JLabel();	
		hotelcharge.setFont(f1);
		hotelcharge.setForeground(Color.BLUE);
		hotelcharge.setToolTipText("Hotel Charge");
		  	
		 extrafacility = new JLabel();
			extrafacility.setFont(f1);
			extrafacility.setForeground(Color.BLUE);
			extrafacility.setToolTipText("Extra Facilities Availed"); 
		
		
		paid = new JButton();
	    ImageIcon img1 = new ImageIcon("images\\paidblue.png");
	    paid.setIcon(img1);	    
	    paid.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    paid.addActionListener(this);
	    paid.setToolTipText("Click When Bill Paid");
	    
	
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
		
		for(int j=0;j<list8.size();j++)
		{
			if((list8.get(j).getName().equals(ggname)) && ((list8.get(j).getRoomnm().equals(rrno))))
			{
				
				gstname.setText(list8.get(j).getName());			
				
				
				rmno.setText(list8.get(j).getRoomnm());			
				 
				
				indate = list8.get(j).getCheckindate();
				outdate = list8.get(j).getCheckoutdate() ;
				
				chkindate.setText(list8.get(j).getCheckindate());				
				 
				
				chkoutdate.setText(list8.get(j).getCheckoutdate());
				
				try
				{
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		        fromdate = (Date) sdf.parse(indate);
				todate = (Date) sdf.parse(outdate);
				}catch(Exception e){}
				Calendar fromcal = Calendar.getInstance();
				Calendar tocal = Calendar.getInstance();


				    fromcal.setTime(fromdate);
				    tocal.setTime(todate);


				    noOfDays=(int)(todate.getTime()-fromdate.getTime())/(3600*24*1000);
				
			}
		}
		
		
ArrayList<GuestDetailData> list12;
		
		try
		{
		   FileInputStream fin=new FileInputStream("GuestData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list12=(ArrayList<GuestDetailData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list12=new ArrayList<GuestDetailData>();
		 }
		
		for(int g=0;g<list12.size();g++)
		{
				
			if(list12.get(g).getBanquet().equals("Yes"))
			{
				
				extraamount = extraamount+25000;
				
			}
			
			if(list12.get(g).getCarrental().equals("Yes"))
			{
				
				extraamount = extraamount+(1500 *noOfDays );
				
			}
			
			if(list12.get(g).getCitytour().equals("Yes"))
			{
				
				extraamount = extraamount+(2500 *  (Integer.parseInt(list8.get(g).getNoofadults())));
				
			}
			
			if(list12.get(g).getFitness().equals("Yes"))
			{
				
				extraamount = extraamount+(200 * noOfDays);
				
			}
			
			if(list12.get(g).getLaundry().equals("Yes"))
			{
				
				extraamount = extraamount+(100 * noOfDays);
				
			}
			
			
			if(list12.get(g).getLuggage().equals("Yes"))
			{
				
				extraamount = extraamount+(200 * noOfDays);
				
			}
			
			if(list12.get(g).getMedical().equals("Yes"))
			{
				
				extraamount = extraamount+(500);
				
			}
			
			if(list12.get(g).getSpa().equals("Yes"))
			{
				
				extraamount = extraamount+(300 * noOfDays);
				
			}
			
			if(list12.get(g).getParking().equals("Yes"))
			{
				
				extraamount = extraamount+(300 * noOfDays);
				
			}
			
			if(list12.get(g).getSwimingpool().equals("Yes"))
			{
				
				extraamount = extraamount+(600 * noOfDays);
				
			}
			
			if(list12.get(g).getWheelchair().equals("Yes"))
			{
				
				extraamount = extraamount+(100 * noOfDays);
				
			}
			
			if(list12.get(g).getWifi().equals("Yes"))
			{
				
				extraamount = extraamount+(150 * noOfDays);
				
			}
			
		}
			
			
		
        extrafacility.setText(Integer.toString(extraamount));
		
		   	
		
		
		ArrayList<RoomAddData> list9;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list9=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list9=new ArrayList<RoomAddData>();
		 }
		
		for(int k=0;k<list9.size();k++)
		{
			if(list9.get(k).getRoomno().equals(rrno))
				
					{
				String s = list9.get(k).getRoomfare();
				rumprice = Integer.parseInt(s);	
				
				int hotlcharge  = rumprice * noOfDays;
				String hotelchrge = Integer.toString(hotlcharge);
				htlcharge = hotlcharge;
				
				hotelcharge.setText(hotelchrge);	
				
					}
				       
	
		}
	
		
		ArrayList<RestaurantBillData> list21;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RestaurantBillData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list21=(ArrayList<RestaurantBillData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list21=new ArrayList<RestaurantBillData>();
		 }
		
		for(int i=0;i<list21.size();i++)
		{
				       
				if(list21.get(i).getGuestname().equals(ggname))
				{
					if(list21.get(i).getRoomnumbr().equals(rrno))	 
					{
						rescharge = Integer.parseInt(list21.get(i).getRestaurantbill());
						restaurantcharge.setText(list21.get(i).getRestaurantbill());
						
					
						
					}
				}
				
		}
		
		
		totalcharge = rescharge +extraamount+htlcharge;
		
        total = new JLabel(Integer.toString(totalcharge));
		
		total.setFont(f1);
		total.setForeground(Color.BLUE);
		total.setToolTipText("Total Amount"); 
		  	
		
		
	 	
		
	    save = new JButton();
	    ImageIcon img2 = new ImageIcon("images\\saveblue.png");
	    save.setIcon(img2);	    
	    save.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    save.addActionListener(this);
	    save.setToolTipText("Click To Save Bill");
	    
	    print = new JButton();
	    ImageIcon img3 = new ImageIcon("images\\printblue.png");
	    print.setIcon(img3);	    
	    print.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    print.addActionListener(this);
	    print.setToolTipText("Click To Print Bill");
	    
	    exit = new JButton();
	    ImageIcon img4 = new ImageIcon("images\\exitblue.png");
	    exit.setIcon(img4);	    
	    exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    exit.addActionListener(this);
	    exit.setToolTipText("Click To Close Bill");  
	    
	    setLayout(new BorderLayout());
		setBackground(Color.WHITE);
		JLabel background=new JLabel(new ImageIcon("images\\finalbill.png"));
		background.setLayout(new FlowLayout());
		
		  gstname.setBounds(630,115,350,35);  
			rmno.setBounds(630,183,250,35); 
			
			chkindate.setBounds(630,252,250,30);  
			chkoutdate.setBounds(630,305,250,50);
			hotelcharge.setBounds(630,380,250,30);
			
			extrafacility.setBounds(630,440,250,30);  
			restaurantcharge.setBounds(630,507,250,30);
			total.setBounds(630,570,200,30);
			
			
			paid.setBounds(1040,600,70,30);  
			save.setBounds(950,600,70,30);
			print.setBounds(1130,600,70,30);
			exit.setBounds(1220,600,70,30);
			
			
			background.setBounds(0,0,1366,768);  
			
			
			pan.add(gstname);
			pan.add(rmno);
			pan.add(chkindate);
			pan.add(chkoutdate);
			pan.add(hotelcharge);
		    pan.add(extrafacility);
		    pan.add(restaurantcharge);
			pan.add(total);
			pan.add(paid);
			pan.add(save);
		    pan.add(print);
		    pan.add(exit);
			
		    pan.add(background);

		   getContentPane().add(pan);   

		    setSize(1366,768);   
		    setLocation(0,0);   
		    setVisible(true);   

		 
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e)
	
	{
		int flag1=0;
		String gnam,rmnum,idate,odate,htelchrge,exfacility,restcharge,tot,paidd;
		
		FinalBillData finald ;

		
		gnam = gstname.getText().trim();
		rmnum = rmno.getText().trim();
		idate = chkindate.getText().trim();
		odate = chkoutdate.getText().trim();
		htelchrge = hotelcharge.getText().trim();
		exfacility = extrafacility.getText().trim();
		restcharge = restaurantcharge.getText().trim();
		tot = total.getText().trim();
		
		if(e.getSource() == save)
		{
			  
		finald = new FinalBillData();
		
		finald.setGstnme(gnam);
		finald.setRomno(rmnum);
		finald.setChkindte(idate);
		finald.setChkoutdte(odate);
		finald.setHtelchrge(htelchrge);
		finald.setExtrachrge(exfacility);
		finald.setRestcharge(restcharge);
		finald.setTotal(tot);
		finald.setPaid("No");

		
		
		new FinalBillAdd(finald);
		msgbox = "Bill Saved Successfully";
		new MsgBox1(msgbox);
		flag1=1;
		
		}		


		if(e.getSource() == paid)
		{
			int flag2=0;
			
			ArrayList<FinalBillData> list18;
			
			try
			{
			   FileInputStream fin=new FileInputStream("GuestBillData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list18=(ArrayList<FinalBillData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list18=new ArrayList<FinalBillData>();		
			 }
	
			for(int i=0;i<list18.size();i++)
			{
				if (list18.get(i).getGstnme().equals(gnam))
				{
					if (list18.get(i).getRomno().equals(rmnum))
					{
						
						list18.get(i).setPaid("Yes");
						flag2=1;
						
					}
				}
				}
					 try	
					 {
					       FileOutputStream fout=new FileOutputStream("GuestBillData.dat");
					       ObjectOutputStream oout=new ObjectOutputStream(fout);
					       oout.writeObject(list18);
			}catch(Exception ee){}
			
					
					 
					 if(flag2==0)
					 {
						 
						 msgbox = "Bill is paid";
		               		new MsgBox1(msgbox);
						 
					 }
					 
	
}
	
	
	if(e.getSource() == exit)
	{
		dispose();
		new StaffMenu1();
		
	}

		
	}
}

public class FinalBill
{

	
	public static void main(String[] args) 
	{
		
		FinalBill1 f1 = new FinalBill1();
		     f1.bill(null, null);

	}

}
