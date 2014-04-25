package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RestaurantBillAdd
{
   ArrayList<RestaurantBillData> list33;
	
	public RestaurantBillAdd(RestaurantBillData rbilld)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("RestaurantBillData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list33=(ArrayList<RestaurantBillData>)oin.readObject();
		}catch(Exception e)
		 {
			 list33=new ArrayList<RestaurantBillData>();
		 }
		
		 list33.add(rbilld);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("RestaurantBillData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list33);
		}catch(Exception e){}
	
	}
}