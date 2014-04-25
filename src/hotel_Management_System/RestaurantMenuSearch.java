package hotel_Management_System;
import java.awt.Color;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.*;

class RestaurantMenuSearch1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JLabel l1;
	private JComboBox<String> itemcateg,itemsubcateg;
	private JButton bsearch;
	private String itmcat;
	private String itmsubcat;
	private String msgbox;
	
	public RestaurantMenuSearch1()
	{
		super("Restaurant Item Search");
		pan = new JPanel();   
	    pan.setLayout(null); 

	    String bedtyp[]={"Breakfast","Lunch","Snacks","Dinner"};
	    itemcateg = new JComboBox(bedtyp);
	    itemcateg.setBackground(Color.white);
	    
	    String acRoom[]={"Veg","Non-Veg"};
	    itemsubcateg=new JComboBox(acRoom);
	    itemsubcateg.setBackground(Color.white);

	    bsearch = new JButton();
	    ImageIcon img2 = new ImageIcon("images\\search.png");
		bsearch.setIcon(img2);
		bsearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		bsearch.addActionListener(this);
		bsearch.setToolTipText("Click To Search");
		
	    setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\itemsearch.jpg"));
    	background.setLayout(new FlowLayout());

    	itemcateg.setBounds(400,150,100,30); 
    	itemsubcateg.setBounds(400,202,100,30);
	    bsearch.setBounds(285,270,130,46);

		background.setBounds(0,0,720,451);  
		
		 pan.add(itemcateg);  
		 pan.add(bsearch);   
		 pan.add(itemsubcateg);   
		 
		 pan.add(background);

		
		 getContentPane().add(pan);   
		    
		    setSize(720,471);   
		   
		    setLocation(350,160);   
		    setVisible(true);   

		    
		    
		}
	
	public void actionPerformed(ActionEvent e) 
	
	{
		
		String itmct,itmsubct;
		
		RoomAddData roomd3;
		
		if(e.getSource() == bsearch)
			
		{
			int flag=0;
			itmcat = (String) itemcateg.getSelectedItem();
			itmsubcat =(String) itemsubcateg.getSelectedItem();
		
			itmct=(String) itemcateg.getSelectedItem();
			itmsubct =(String) itemsubcateg.getSelectedItem();
			
			ArrayList<RestaurantMenuAddData> list8;
			
			try
			{
			   FileInputStream fin=new FileInputStream("RestaurantData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list8=(ArrayList<RestaurantMenuAddData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list8=new ArrayList<RestaurantMenuAddData>();
			 }
			
			for(int i=0;i<list8.size();i++)
			{
				if((list8.get(i).getItemcategory().equals(itmct)) && ((list8.get(i).getItemsubcategory()).equals(itmsubct)))
					
						{
					       	
 							 flag=1;
					   }
				
					
				
			}
			
			
			if(flag==1)
			{
				
				 RestaurantMenuUpdate1 rm2 = new RestaurantMenuUpdate1();
					rm2.RestaurantMenuUpdat(itmcat,itmsubcat);
			}
			
			
			if(flag==0)
			{
				
				msgbox="No Items Found";
				new MsgBox1(msgbox);
				
			}
		}
		
               
		
	
	}
		
	
	
	
}
	public class RestaurantMenuSearch
	{
		
public static void main(String[] args) 
{
new RestaurantMenuSearch1();

}
}


