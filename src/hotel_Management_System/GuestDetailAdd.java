package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GuestDetailAdd
{
   ArrayList<GuestDetailData> list5;
	
	public GuestDetailAdd(GuestDetailData guestd)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("GuestData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list5=(ArrayList<GuestDetailData>)oin.readObject();
		}catch(Exception e)
		 {
			 list5=new ArrayList<GuestDetailData>();
		 }
		
		 list5.add(guestd);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("GuestData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list5);
		}catch(Exception e){}
	
	}
}
