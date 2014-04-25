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


public class RestaurantMenuDisplay extends JFrame 
{
	public RestaurantMenuDisplay()
	{
		super("Reastaurant Menu Information");
		String heading[]={"Item Name","Item Id","Item Category","Item Sub-Category","Item Price"};
		String data[][]=new String[70][5];
		ArrayList<RestaurantMenuAddData> list4=new ArrayList<RestaurantMenuAddData>();
		try
		{
			FileInputStream fin=new FileInputStream("RestaurantData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list4=(ArrayList<RestaurantMenuAddData>)oin.readObject();
			
			int r=0;
			for(RestaurantMenuAddData ro : list4)
			{
				data[r][0]=ro.getItemname();
				data[r][1]=ro.getItemid();
				data[r][2]=ro.getItemcategory();
				data[r][3]=ro.getItemsubcategory();
				data[r][4]=ro.getItemprice();
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

