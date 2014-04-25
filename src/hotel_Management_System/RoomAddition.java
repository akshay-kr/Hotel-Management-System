package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomAddition
{
   ArrayList<RoomAddData> list2;
	
	public RoomAddition(RoomAddData roomd)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("RoomData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list2=(ArrayList<RoomAddData>)oin.readObject();
		}catch(Exception e)
		 {
			 list2=new ArrayList<RoomAddData>();
		 }
		
		 list2.add(roomd);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("RoomData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list2);
		}catch(Exception e){}
	
	}
}