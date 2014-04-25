package hotel_Management_System;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;


public class GuestInformationDisplay extends JFrame 
{
	public GuestInformationDisplay()
	{
		super("Guest Information");
		String heading[]={"Guest Name","Address","City","State","Country","Pin Code","Contact No.","No. Of Adults","Identification Proof Type","Identification No.","Room Type","Room Capacity","Room No.","Vehicle Parking","Laundry","Car Rental","Swimming Pool","Medical Centre","Fitness Centre","Wifi Access","Spa Centre","City Tour","Wheel Chair","Luggage Storage","Banquet","Check In Date","Check In Time", "Check Out Date","Check Out Time"};
		String data[][]=new String[70][30];
		ArrayList<GuestDetailData> list4=new ArrayList<GuestDetailData>();
		try
		{
			FileInputStream fin=new FileInputStream("GuestData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list4=(ArrayList<GuestDetailData>)oin.readObject();
			
			int r=0;
			for(GuestDetailData rg : list4)
			{
				data[r][0]=rg.getName();
				data[r][1]=rg.getAddres();
				data[r][2]=rg.getCit();
				data[r][3]=rg.getStat();
				data[r][4]=rg.getCount();
				data[r][5]=rg.getPin();
				data[r][6]=rg.getContactnm();
				data[r][7]=rg.getNoofadults();
				data[r][8]=rg.getIdentproof();
				data[r][9]=rg.getIdno();
				data[r][10]=rg.getRoomtyp();
				data[r][11]=rg.getBedtype();
				data[r][12]=rg.getRoomnm();
				data[r][13]=rg.getParking();
				data[r][14]=rg.getLaundry();
				data[r][15]=rg.getCarrental();
				data[r][16]=rg.getSwimingpool();
				data[r][17]=rg.getMedical();
				data[r][18]=rg.getFitness();
				data[r][19]=rg.getWifi();
				data[r][20]=rg.getSpa();
				data[r][21]=rg.getCitytour();
				data[r][22]=rg.getWheelchair();
				data[r][23]=rg.getLuggage();
				data[r][24]=rg.getBanquet();
				data[r][25]=rg.getCheckindate();
				data[r][26]=rg.getCheckintime();
				data[r][27]=rg.getCheckoutdate();
				data[r][28]=rg.getCheckouttime();
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Guest Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(1366, 768);
			
			setLocation(0, 0);
			setVisible(true);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

