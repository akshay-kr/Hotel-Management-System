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

class QuickRoomSearch1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JLabel l1;
	private JComboBox<String> bed,actype;
	private JButton bsearch;
	private String msgbox;
	
	
	public QuickRoomSearch1()
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

	    bsearch = new JButton();
	    ImageIcon img2 = new ImageIcon("images\\searchblue.png");
		bsearch.setIcon(img2);
		bsearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		bsearch.addActionListener(this);
		bsearch.setToolTipText("Click To Search");
		
		
	    setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\quickroomsearch.jpg"));
    	background.setLayout(new FlowLayout());

		//rumnm.setBounds(400,428,125,30); 
		bed.setBounds(252,180,85,30); 
		actype.setBounds(252,136,85,30);
	    bsearch.setBounds(200,230,100,35);
	    
		background.setBounds(0,0,500,300);  
		// pan.add(noRooms);   
		 pan.add(bed);  
		 pan.add(actype);   
		 pan.add(bsearch);   
		 
		 pan.add(background);

		
		 getContentPane().add(pan);   
		    
		    setSize(500,340);   
		    setLocation(350,200);   
		    setVisible(true);   
   
		    
		}
	
	public void actionPerformed(ActionEvent e) 
	
	{
		
		String rumtyp,rumbed;
		
		RoomAddData roomd3;
		
		if(e.getSource() == bsearch)
			
		{  int flag=0;
			
			rumtyp=(String) actype.getSelectedItem();
			rumbed =(String) bed.getSelectedItem();
			
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
				if((list8.get(i).getRoomtypes().equals(rumtyp)) && ((list8.get(i).getRoomcapacity().equals(rumbed)) && ((list8.get(i).getAvaibility().equals("Yes")))))
					
						{
					       
					
					
							flag=1;
					   }
						
			}
			
			if(flag ==0)
			{
				
				msgbox = "Room Not Available";
				 new MsgBox1(msgbox);
						
				
			}
			
			if(flag==1)
			{
				dispose();
				msgbox = "Room Available";
				 new MsgBox1(msgbox);
				
			}
		}
		
		
	
	}
		
	
	
	
}
	public class QuickRoomSearch
	{
		
public static void main(String[] args) 
{
new QuickRoomSearch1();

}
}


