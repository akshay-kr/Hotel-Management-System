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


public class FinalBillDisplay extends JFrame 
{
	public FinalBillDisplay()
	{
		super("Guest Bill");
		String heading[]={"Guest Name","Room No.","Check In Date","Check Out Date","Hotel Charge","Extra Facility Charge","Restaurant Charge","Total Amount","Paid"};
		String data[][]=new String[70][9];
		ArrayList<FinalBillData> list35=new ArrayList<FinalBillData>();
		try
		{
			FileInputStream fin=new FileInputStream("GuestBillData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list35=(ArrayList<FinalBillData>)oin.readObject();
			
			int r=0;
			for(FinalBillData re : list35)
			{
				data[r][0]=re.getGstnme();
				data[r][1]=re.getRomno();
				data[r][2]=re.getChkindte();
				data[r][3]=re.getChkoutdte();
				data[r][4]=re.getHtelchrge();
				data[r][5]=re.getExtrachrge();
				data[r][6]=re.getRestcharge();
				data[r][7]=re.getTotal();
				data[r][8]=re.getPaid();
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
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

