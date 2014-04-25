package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RestaurantMenuAddition
{
   ArrayList<RestaurantMenuAddData> list22;
	
	@SuppressWarnings("resource")
	public RestaurantMenuAddition(RestaurantMenuAddData restaurantd)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("RestaurantData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list22=(ArrayList<RestaurantMenuAddData>)oin.readObject();
		}catch(Exception e)
		 {
			 list22=new ArrayList<RestaurantMenuAddData>();
		 }
		
		 list22.add(restaurantd);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("RestaurantData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list22);
		}catch(Exception e){}
	
	}
}
