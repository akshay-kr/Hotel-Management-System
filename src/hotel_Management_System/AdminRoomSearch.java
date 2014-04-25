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

class AdminRoomSearch1<a> extends JFrame implements ActionListener
{
	JPanel pan;
	private JLabel l1;
	private JComboBox bed,actype,rumnm;
	private JButton bsearch;
	private String a[];
	private String rmtyp;
	private String bdtyp;
	private String msgbox;
	
	public AdminRoomSearch1()
	{
		super("Room Search");
		pan = new JPanel();   
	    pan.setLayout(null); 

	    String bedtyp[]={"Single Bed","Double Bed"};
	    bed = new JComboBox(bedtyp);
	    bed.setBackground(Color.white);
	    
	    String acRoom[]={"A.C." ,"Non A.C."};
	    actype=new JComboBox(acRoom);
	    actype.setBackground(Color.white);
    
	    bsearch = new JButton("LOGIN");
	    ImageIcon img2 = new ImageIcon("images\\search.png");
		bsearch.setIcon(img2);
		bsearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		bsearch.addActionListener(this);
		bsearch.setToolTipText("Click To Search");
	    
		
	    setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\roomsearch2.jpg"));
    	background.setLayout(new FlowLayout());

		//rumnm.setBounds(400,428,125,30); 
		bed.setBounds(325,158,90,30); 
		actype.setBounds(325,108,90,30);
	    bsearch.setBounds(250,222,130,46);
	    
		background.setBounds(0,0,600,335);  
		// pan.add(noRooms);   
		 pan.add(bed);  
		 pan.add(actype);   
		 pan.add(bsearch);   
		 
		 pan.add(background);

		
		 getContentPane().add(pan);   
		    
		    setSize(610,373);   
		    setLocation(350,200);   
		    setVisible(true);   

	 
		    
		}
	
	
	public void actionPerformed(ActionEvent e) 
	
	{
		
		int flag=0;
		

         String rumno,rumtyp,rumbed;
		
		//RoomAddData roomd3;
		
		if(e.getSource() == bsearch)
			
		{
			//rumnm.removeAllItems();
			rmtyp = (String) actype.getSelectedItem();
			bdtyp = (String) bed.getSelectedItem();
			
			rumtyp=(String) actype.getSelectedItem();
			rumbed =(String) bed.getSelectedItem();
			
			ArrayList<RoomAddData> listt1;
			
			listt1 = new ArrayList<RoomAddData>();
			
			ArrayList<RoomAddData> list8;
			
			try
			{
			   FileInputStream fin=new FileInputStream("RoomData.dat");
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list8=(ArrayList<RoomAddData>)oin.readObject();
			}catch(Exception ee)
			 {
				 list8=new ArrayList<RoomAddData>();
			 }
			
			for(int i=0;i<list8.size();i++)
			{
				if((list8.get(i).getRoomtypes().equals(rumtyp)) && ((list8.get(i).getRoomcapacity().equals(rumbed))))
					
						{
					
					
							
						
							
							flag=1;
					   }
				
						
			}
			
			if(flag==1)
			{
				dispose();
				
				

				RoomUpdate1  r2 = new RoomUpdate1();
						  
				
				r2.roomUpdat(rmtyp,bdtyp);
				
			}
		
				
				if(flag==0)
				{
					
					msgbox = "Room Not Found";
					new MsgBox1(msgbox);
					
					
				}
				
				
			}
			
		}
		
						   }
						   
						 

	public class AdminRoomSearch
	{
		
public static void main(String[] args) 
{
new AdminRoomSearch1();

}
}


