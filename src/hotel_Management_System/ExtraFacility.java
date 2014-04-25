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
import java.util.ArrayList;
 class ExtraFacility1 extends JFrame implements ActionListener,MouseListener
{
	JPanel panel;  
	private String msgbox;
	private JLabel luggage,banquet,swimmingpool,laundry,medical,fitness,wifi,spa,citytour,pc,parking,carRent;
	private JButton submit,cancel,uncheckall;
	private int lug,ban,swim,laun,med,fit,wif,spaa,city,wheel,park,car;
	private String nam1,addre1,cty1,stte1,countr1,adult1,ident1,bdtyp1,rmtyp1,chkindate1,chkintime1,rmno1,idnm1,pincd1,cntnm1,avai1;
	public ExtraFacility1(String nam, String addre, String cty, String stte, String countr, String adult, String ident, String bdtyp, String rmtyp, String chkindate, String chkintime, String rmno, String idnm, String pincd, String cntnm, String avai)
	{
		super("SERVICES FOR YOU");
		
		panel = new JPanel();   
	    panel.setLayout(null);  
		   
	    
	    
	    Font f1=new Font("The Times Roman",Font.BOLD,30);
	    
	    submit = new JButton();
	    ImageIcon img13 = new ImageIcon("images\\submit.png");
	    submit.setIcon(img13);	    
	    submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    submit.addActionListener(this);
	    submit.setToolTipText("Click To Submit Booking Details");
	    
	    cancel = new JButton();
	    ImageIcon img14 = new ImageIcon("images\\cancel2.png");
	    cancel.setIcon(img14);	    
	    cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    cancel.addActionListener(this);
	    cancel.setToolTipText("Click To Cancel Booking");
	    
	    uncheckall = new JButton();
	    ImageIcon img15 = new ImageIcon("images\\uncheckall.png");
	    uncheckall.setIcon(img15);	    
	    uncheckall.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    uncheckall.addActionListener(this);
	    uncheckall.setToolTipText("Click To Unselect All");
	    
	    luggage=new JLabel("");
	    ImageIcon img1 = new ImageIcon("images\\lugagestorage1.png");
	    luggage.setIcon(img1);	    
	    luggage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		luggage.setFont(f1);
		luggage.setForeground(Color.BLUE);
		luggage.setToolTipText("Check for airport facilities "); 
		luggage.addMouseListener(this);
	  
		
		banquet=new JLabel("");
		ImageIcon img2 = new ImageIcon("images\\banquet1.png");
		banquet.setIcon(img2);
		banquet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		banquet.setFont(f1);
		banquet.setForeground(Color.BLUE);
		banquet.setToolTipText("Check for banquet facilities"); 
		banquet.addMouseListener(this);   	
		
		swimmingpool=new JLabel("");
		ImageIcon img3 = new ImageIcon("images\\swimingpool1.png");
		swimmingpool.setIcon(img3);
		swimmingpool.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		swimmingpool.setFont(f1);
		swimmingpool.setForeground(Color.BLUE);
		swimmingpool.setToolTipText("Check for swimmingpool facilities"); 
		swimmingpool.addMouseListener(this);   
		
		laundry=new JLabel("");
		ImageIcon img4= new ImageIcon("images\\laundry1.png");
		laundry.setIcon(img4);
		laundry.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		laundry.setFont(f1);
		laundry.setForeground(Color.BLUE);
		laundry.setToolTipText("Check for laundry facilities");
		laundry.addMouseListener(this);
					
		medical=new JLabel("");	
		ImageIcon img5 = new ImageIcon("images\\medicalcentre1.png");
		medical.setIcon(img5);
		medical.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		medical.setFont(f1);
		medical.setForeground(Color.pink);
		medical.setToolTipText("Check for medical service");
		medical.addMouseListener(this);
		
		fitness=new JLabel("");
		ImageIcon img6 = new ImageIcon("images\\fitness1.png");
		fitness.setIcon(img6);
		fitness.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		fitness.setFont(f1);
		fitness.setForeground(Color.pink);
		fitness.setToolTipText("Check for facilities for fitness centre");
		fitness.addMouseListener(this);
		
				
		wifi=new JLabel("");
		ImageIcon img7 = new ImageIcon("images\\wifiaccess1.png");
		wifi.setIcon(img7);
		wifi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		wifi.setFont(f1);
		wifi.setForeground(Color.pink);
		wifi.setToolTipText("Check for wifiaccess facilities"); 
		wifi.addMouseListener(this);
		
		spa=new JLabel("");
		ImageIcon img8 = new ImageIcon("images\\spa1.png");
		spa.setIcon(img8);
		spa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		spa.setFont(f1);
		spa.setForeground(Color.pink);
		spa.setToolTipText("check for facilities for spa"); 
		spa.addMouseListener(this);
	       
		
		citytour=new JLabel("");
		ImageIcon img9 = new ImageIcon("images\\citytour1.png");
		citytour.setIcon(img9);
		citytour.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		citytour.setFont(f1);
		citytour.setForeground(Color.orange);
		citytour.setToolTipText("Check for city tour facilities"); 
		citytour.addMouseListener(this);
		
		pc=new JLabel("");
		ImageIcon img10 = new ImageIcon("images\\wheelchair1.png");
		pc.setIcon(img10);
		pc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		pc.setFont(f1);
		pc.setForeground(Color.orange);
		pc.setToolTipText("Check for facilities for wheel chair accessibility"); 
		pc.addMouseListener(this);
		
		parking=new JLabel("");
		ImageIcon img11 = new ImageIcon("images\\vehicleparking1.png");
	    parking.setIcon(img11);
		parking.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		parking.setFont(f1);
		parking.setForeground(Color.orange);
		parking.setToolTipText("Check for parking facilities"); 
		parking.addMouseListener(this);
		
		carRent=new JLabel("");
		ImageIcon img12 = new ImageIcon("images\\carrental1.png");
		carRent.setIcon(img12);
		carRent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		carRent.setFont(f1);
		carRent.setForeground(Color.orange);
		carRent.setToolTipText("Check for car rent facilities"); 
		carRent.addMouseListener(this);
		

		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("images\\extrafacilities.png"));
		background.setLayout(new FlowLayout());
		
		luggage.setBounds(1015,430,350,85);  
		banquet.setBounds(1015,528,350,85);  
         swimmingpool.setBounds(170,528,350,85);  
		laundry.setBounds(170,330,350,85);  
		medical.setBounds(590,230,350,85);  
		  fitness.setBounds(590,330,350,85);  
	        wifi.setBounds(590,430,350,85);  
		  spa.setBounds(590,528,350,85);  
		citytour.setBounds(1015,230,350,85);
		    pc.setBounds(1015,330,350,85);
		parking.setBounds(170,230,350,85);
		carRent.setBounds(170,430,350,85);
		
		submit.setBounds(817,650,130,44);  
		cancel.setBounds(1160,650,130,44); 
		uncheckall.setBounds(975,650,160,44); 
		
		background.setBounds(0,0,1366,768);  
		
		
		 panel.add(luggage);   
		 panel.add(banquet); 
		 panel.add(swimmingpool);   
		 panel.add(laundry);   
		 panel.add(medical);   
		 panel.add(fitness);
		 panel.add(wifi);   
		 panel.add(spa); 
		 panel.add(citytour); 
		 panel.add(pc);
		 panel.add(parking);
		 panel.add(carRent);
		 panel.add(submit);
		 panel.add(uncheckall);
		 panel.add(cancel);
		 
		
		 
		 panel.add(background);

		    getContentPane().add(panel);  
		 
		    setSize(1366, 768);
			setLocation(0,0);
			setResizable(false);
		
			setVisible(true);
			
			 setDefaultCloseOperation(EXIT_ON_CLOSE);    
			 
			nam1 = nam;
			addre1 = addre;
			cty1 = cty;
			stte1 =stte;
			countr1 = countr;
			adult1 = adult;
			ident1 = ident;
			bdtyp1 = bdtyp;
			rmtyp1 = rmtyp;
			chkindate1 = chkindate;
			chkintime1 = chkintime;
			rmno1 = rmno;
			idnm1 = idnm;
			pincd1 = pincd;
			cntnm1 = cntnm;
			avai1 = avai;
			
			
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == luggage)
		{
			lug++;
		}
		
		if(e.getSource() == banquet)
		{
			ban++;
		}
		
		if(e.getSource() == swimmingpool)
		{
			swim++;
		}
		
		if(e.getSource() == laundry)
		{
			laun++;
		}
		
		if(e.getSource() == medical)
		{
			med++;
		}
		
		if(e.getSource() == fitness)
		{
			fit++;
		}
		
		if(e.getSource() == wifi)
		{
			wif++;
		}
		
		if(e.getSource() == spa)
		{
			spaa++;
		}
		
		if(e.getSource() == citytour)
		{
			city++;
		}
		
		if(e.getSource() == pc)
		{
			wheel++;
		}
		
		if(e.getSource() == parking)
		{
			park++;
		}
		
		if(e.getSource() == carRent)
		{
			car++;
		}
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
		
	
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == luggage)
		{
			ImageIcon img1 = new ImageIcon("images\\lugagestorage.png");
		    luggage.setIcon(img1);
		}
		
		if(e.getSource() == banquet)
		{
			ImageIcon img2 = new ImageIcon("images\\banquet.png");
			banquet.setIcon(img2);
		}
		
		if(e.getSource() == swimmingpool)
		{
			ImageIcon img3 = new ImageIcon("images\\swimingpool.png");
			swimmingpool.setIcon(img3);
		}
		
		if(e.getSource() == laundry)
		{
			ImageIcon img4= new ImageIcon("images\\laundry.png");
			laundry.setIcon(img4);
		}
		
		if(e.getSource() == medical)
		{
			ImageIcon img5 = new ImageIcon("images\\medicalcentre.png");
			medical.setIcon(img5);
		}
		
		if(e.getSource() == fitness)
		{
			ImageIcon img6 = new ImageIcon("images\\fitness.png");
			fitness.setIcon(img6);
		}
		
		if(e.getSource() == wifi)
		{
			ImageIcon img7 = new ImageIcon("images\\wifiaccess.png");
			wifi.setIcon(img7);
		}
		
		if(e.getSource() == spa)
		{
			ImageIcon img8 = new ImageIcon("images\\spa.png");
			spa.setIcon(img8);
		}
		
		if(e.getSource() == citytour)
		{
			ImageIcon img9 = new ImageIcon("images\\citytour.png");
			citytour.setIcon(img9);
		}
		
		if(e.getSource() == pc)
		{
			ImageIcon img10 = new ImageIcon("images\\wheelchair.png");
			pc.setIcon(img10);
		}
		
		if(e.getSource() == parking)
		{
			ImageIcon img11 = new ImageIcon("images\\vehicleparking.png");
		    parking.setIcon(img11);
		}
		
		if(e.getSource() == carRent)
		{
			ImageIcon img12 = new ImageIcon("images\\carrental.png");
			carRent.setIcon(img12);
		}
		
		
	}

	
	public void mouseExited(MouseEvent e) 
	{
		
		
		if(lug % 2 == 0)
		{
			ImageIcon img1 = new ImageIcon("images\\lugagestorage1.png");
		    luggage.setIcon(img1);
		}
		
		else
		{
			
			ImageIcon img1 = new ImageIcon("images\\lugagestorage.png");
		    luggage.setIcon(img1);
			
		}
		
		if(ban % 2 == 0)
		{
			ImageIcon img2 = new ImageIcon("images\\banquet1.png");
			banquet.setIcon(img2);
		}
		
		else
		{
			
			ImageIcon img2 = new ImageIcon("images\\banquet.png");
			banquet.setIcon(img2);
			
		}
		
		if(swim % 2 == 0)
		{
			ImageIcon img3 = new ImageIcon("images\\swimingpool1.png");
			swimmingpool.setIcon(img3);
		}
		
		else
		{
			
			ImageIcon img3 = new ImageIcon("images\\swimingpool.png");
			swimmingpool.setIcon(img3);
			
		}
		
		if(laun % 2 == 0)
		{
			ImageIcon img4= new ImageIcon("images\\laundry1.png");
			laundry.setIcon(img4);
		}
		
		else
		{
			
			ImageIcon img4= new ImageIcon("images\\laundry.png");
			laundry.setIcon(img4);
			
		}
		
		if(med % 2 == 0)
		{
			ImageIcon img5 = new ImageIcon("images\\medicalcentre1.png");
			medical.setIcon(img5);
		}
		
		else
		{
			
			ImageIcon img5 = new ImageIcon("images\\medicalcentre.png");
			medical.setIcon(img5);
			
		}
		
		if(fit % 2 == 0)
		{
			ImageIcon img6 = new ImageIcon("images\\fitness1.png");
			fitness.setIcon(img6);
		}
		
		else
		{
			
			ImageIcon img6 = new ImageIcon("images\\fitness.png");
			fitness.setIcon(img6);
			
		}
		
		if(wif % 2 == 0)
		{
			ImageIcon img7 = new ImageIcon("images\\wifiaccess1.png");
			wifi.setIcon(img7);
		}
		
		else
		{
			
			ImageIcon img7 = new ImageIcon("images\\wifiaccess.png");
			wifi.setIcon(img7);
			
		}
		
		if(spaa % 2 == 0)
		{
			ImageIcon img8 = new ImageIcon("images\\spa1.png");
			spa.setIcon(img8);
		}
		
		else
		{
			
			ImageIcon img8 = new ImageIcon("images\\spa.png");
			spa.setIcon(img8);
			
		}
		
		if(city % 2 == 0)
		{
			ImageIcon img9 = new ImageIcon("images\\citytour1.png");
			citytour.setIcon(img9);
		}
		
		else
		{
			
			ImageIcon img9 = new ImageIcon("images\\citytour.png");
			citytour.setIcon(img9);
			
		}
		
		if(wheel % 2 == 0)
		{
			ImageIcon img10 = new ImageIcon("images\\wheelchair1.png");
			pc.setIcon(img10);
		}
		
		else
		{
			
			ImageIcon img10 = new ImageIcon("images\\wheelchair.png");
			pc.setIcon(img10);
			
		}
		
		if(park % 2 == 0)
		{
			ImageIcon img11 = new ImageIcon("images\\vehicleparking1.png");
		    parking.setIcon(img11);
		}
		
		else
		{
			
			ImageIcon img11 = new ImageIcon("images\\vehicleparking.png");
		    parking.setIcon(img11);
			
		}
		
		if(car % 2 == 0)
		{
			ImageIcon img12 = new ImageIcon("images\\carrental1.png");
			carRent.setIcon(img12);
		}
		
		else
		{
			
			ImageIcon img12 = new ImageIcon("images\\carrental.png");
			carRent.setIcon(img12);
			
		}
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String lug1,ban1,swim1,laun1,spaa1,wheel1,wif1,med1,fit1,city1,park1,car1;
		
		GuestDetailData guestd;
		
		if(e.getSource()== submit)
		{	
		
		   if(lug % 2 != 0)
		    {
			
			lug1 = "Yes";
			
		      }
		
		else
		{
			
			lug1 = "No";
			
		}
		
		if(ban % 2 != 0)
		{
			
			ban1 = "Yes";
			
		}
		
		else
		{
			
			ban1 = "No";
			
		}
		
		if(swim % 2 != 0)
		{
			swim1 = "Yes";
		}
		
		else
		{
			
			swim1 = "No";
			
		}
		
		if(laun % 2 != 0)
		{
			laun1 = "Yes";
		}
		
		else
		{
			
			laun1 = "No";
			
		}
		
		if(med % 2 != 0)
		{
			med1 = "Yes";
		}
		
		else
		{
			
			med1 = "No";
			
		}
		
		if(fit % 2 != 0)
		{
			fit1 = "Yes";
		}
		
		else
		{
			
			fit1 = "No";
			
		}
		
		if(wif % 2 != 0)
		{
			wif1 = "Yes";
		}
		
		else
		{
			
			wif1 = "No";
			
		}
		
		if(spaa % 2 != 0)
		{
			spaa1 = "Yes";
		}
		
		else
		{
			
			spaa1 = "No";
			
		}
		
		if(city % 2 != 0)
		{
			city1 = "Yes";
		}
		
		else
		{
			
			city1 = "No";
			
		}
		
		if(wheel % 2 != 0)
		{
			wheel1 = "Yes";
		}
		
		else
		{
			
			wheel1 = "No";
			
		}
		
		if(park % 2 != 0)
		{
			park1 = "Yes";
		}
		
		else
		{
			
			park1 = "No";
			
		}
		
		if(car % 2 != 0)
		{
			car1 = "Yes";
		}
		
		else
		{
			
			car1 = "No";
			
		}
		
		guestd = new GuestDetailData();
		
		
		guestd.setName(nam1);
		guestd.setAddres(addre1);
		guestd.setCit(cty1);
		guestd.setStat(stte1);
		guestd.setCount(countr1);
		guestd.setNoofadults(adult1);
		guestd.setIdentproof(ident1);
		guestd.setBedtype(bdtyp1);
		guestd.setRoomtyp(rmtyp1);
		guestd.setRoomnm(rmno1);
		guestd.setIdno(idnm1);
		guestd.setPin(pincd1);
		guestd.setContactnm(cntnm1);
		guestd.setCheckindate(chkindate1);
		guestd.setCheckintime(chkintime1);
		
		guestd.setParking(park1);
		guestd.setLaundry(laun1);
		guestd.setCarrental(car1);
		guestd.setSwimingpool(swim1);
		guestd.setMedical(med1);
		guestd.setFitness(fit1);
		guestd.setWifi(wif1);
		guestd.setSpa(spaa1);
		guestd.setCitytour(city1);
		guestd.setWheelchair(wheel1);
		guestd.setLuggage(lug1);
		guestd.setBanquet(ban1);
		
		new GuestDetailAdd(guestd);
		
		ArrayList<RoomAddData> list6;
		
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list6=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception ee)
		 {
			 list6=new ArrayList<RoomAddData>();
		 }
		
		
		for(int i=0;i<list6.size();i++)
		{
			if(list6.get(i).getRoomno().equals(rmno1))
				{
				
				list6.get(i).setAvaibility("No");
					
				}
		}
		
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("RoomData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list6);
		}catch(Exception ee){}
	
		
		
		msgbox = "Room Booked";
		new MsgBox1(msgbox);
				
		
	}	
		
		if(e.getSource() == uncheckall)
			
		{
			
			park =0;
			ImageIcon img11 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\vehicleparking.png");
		    parking.setIcon(img11);
		    
			laun = 0;
			ImageIcon img4= new ImageIcon("C:\\Users\\akki\\Desktop\\project\\laundry1.png");
			laundry.setIcon(img4);
			
			car =0;
			ImageIcon img12 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\carrental1.png");
			carRent.setIcon(img12);
			
			swim =0;
			ImageIcon img3 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\swimingpool1.png");
			swimmingpool.setIcon(img3);
			
			med =0;
			ImageIcon img5 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\medicalcentre1.png");
			medical.setIcon(img5);
			
			fit=0;
			ImageIcon img9 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\fitness.png");
			fitness.setIcon(img9);
			
			wif =0;
			ImageIcon img7 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\wifiaccess1.png");
			wifi.setIcon(img7);
			
			spaa =0;
			ImageIcon img8 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\spa1.png");
			spa.setIcon(img8);
			
			city =0;
			ImageIcon img6 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\fitness1.png");
			fitness.setIcon(img6);
			
			wheel =0;
			ImageIcon img10 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\wheelchair.png");
			pc.setIcon(img10);
			
			lug=0;		
			ImageIcon img1 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\lugagestorage1.png");
		    luggage.setIcon(img1);
		    		    
			ban =0;
			ImageIcon img2 = new ImageIcon("C:\\Users\\akki\\Desktop\\project\\banquet1.png");
			banquet.setIcon(img2);
			
			
			
		}
		
		
		if(e.getSource() == cancel)
		{
			dispose();
			new StaffMenu1();
			
		}
}
}
	public class ExtraFacility
	{								
			public static void main(String args[])
			{																
				new ExtraFacility1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
			}

}																

																	

																		
																		
																
														
												
										
								
						
				
		
	

