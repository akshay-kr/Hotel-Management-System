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


public class LoginDisplay extends JFrame 
{
	public LoginDisplay()
	{
		super("Display All");
		String heading[]={"Name","Addess","Contact No.","Email Id","Date Of Joining","Gender","Post","Username","Password"};
		String data[][]=new String[70][9];
		ArrayList<LoginData> list=new ArrayList<LoginData>();
		try
		{
			FileInputStream fin=new FileInputStream("LoginData.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<LoginData>)oin.readObject();
			
			int r=0;
			for(LoginData re : list)
			{
				data[r][0]=re.getStaffname();
				data[r][1]=re.getStaffaddress();
				data[r][2]=re.getStaffcontact();
				data[r][3]=re.getEmailid();
				data[r][4]=re.getDojth();
				data[r][5]=re.getGender();
				data[r][6]=re.getPost();
				data[r][7]=re.getId();
				data[r][8]=re.getPass();
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

