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


public class RestaurantBillDisplay extends JFrame 
{
	public RestaurantBillDisplay()
	{
		super("Restaurant Bill");
		String heading[]={"Guest Name","Room Number","Bill"};
		String data[][]=new String[70][3];
		
		ArrayList<RestaurantBillData> list4=new ArrayList<RestaurantBillData>();
		try
		{
			FileInputStream fin=new FileInputStream("RestaurantBillData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list4=(ArrayList<RestaurantBillData>)oin.readObject();
			
			int r=0;
			for(RestaurantBillData rn : list4)
			{
				data[r][0]=rn.getGuestname();
				data[r][1]=rn.getRoomnumbr();
				data[r][2]=rn.getRestaurantbill();
				
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Restaurant Bill"),BorderLayout.NORTH);
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


