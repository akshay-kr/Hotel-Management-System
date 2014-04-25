package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FinalBillAdd 
{

	   ArrayList<FinalBillData> list1;
		
		public FinalBillAdd(FinalBillData fbilld)
		{
			try
			{
			   FileInputStream fin=new FileInputStream("GuestBillData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list1=(ArrayList<FinalBillData>)oin.readObject();
			}catch(Exception e)
			 {
				 list1=new ArrayList<FinalBillData>();
			 }
			
			 list1.add(fbilld);
			 
			 try	
			 {
			       FileOutputStream fout=new FileOutputStream("GuestBillData.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(list1);
			}catch(Exception e){}
		
		}
	}
	
