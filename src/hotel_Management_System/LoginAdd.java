package hotel_Management_System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LoginAdd
{
   ArrayList<LoginData> list1;
	
	public LoginAdd(LoginData logd)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("LoginData.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list1=(ArrayList<LoginData>)oin.readObject();
		}catch(Exception e)
		 {
			 list1=new ArrayList<LoginData>();
		 }
		
		 list1.add(logd);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("LoginData.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list1);
		}catch(Exception e){}
	
	}
}