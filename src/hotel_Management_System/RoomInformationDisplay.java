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


public class RoomInformationDisplay extends JFrame 
{
	public RoomInformationDisplay()
	{
		super("Room Information");
		String heading[]={"Room Number","Room Type","Bed Type","Cost","Avaibility"};
		String data[][]=new String[70][5];
		ArrayList<RoomAddData> list4=new ArrayList<RoomAddData>();
		try
		{
			FileInputStream fin=new FileInputStream("RoomData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list4=(ArrayList<RoomAddData>)oin.readObject();
			
			int r=0;
			for(RoomAddData ro : list4)
			{
				data[r][0]=ro.getRoomno();
				data[r][1]=ro.getRoomtypes();
				data[r][2]=ro.getRoomcapacity();
				data[r][3]=ro.getRoomfare();
				data[r][4]=ro.getAvaibility();
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

