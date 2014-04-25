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

class RoomSearch1 extends JFrame implements ActionListener
{
	JPanel pan;
	private JLabel l1;
	private JComboBox<String> bed,actype,rCapacity,rumnm;
	private JButton bsearch,bbooknow;
	private String rno;
	private String rtype;
	private String rbed;
	private String msgbox;
	
	public RoomSearch1()
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
		
		rumnm = new JComboBox();
	    rumnm.setBackground(Color.white);
		rumnm.setBounds(400,428,125,30);
	    
		bbooknow = new JButton("LOGIN");
	    ImageIcon img1 = new ImageIcon("images\\booknow.png");
	    bbooknow.setIcon(img1);
	    bbooknow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    bbooknow.addActionListener(this);
	    bbooknow.setToolTipText("Click To Book Room");
	    bbooknow.setVisible(false);
		
	    setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\roomsearch.jpg"));
    	background.setLayout(new FlowLayout());

		//rumnm.setBounds(400,428,125,30); 
		bed.setBounds(355,285,125,30); 
		actype.setBounds(355,229,125,30);
	    bsearch.setBounds(282,346,130,46);
	    bbooknow.setBounds(258,490,170,50);

		background.setBounds(0,0,703,636);  
		// pan.add(noRooms);   
		 pan.add(bed);  
		 pan.add(actype);   
		 pan.add(bsearch);   
		 pan.add(bbooknow); 
		 pan.add(rumnm);
		 pan.add(background);

		
		 getContentPane().add(pan);   
		    
		    setSize(703,636);   
		    setLocation(350,50);   
		    setVisible(true);   

		  
		    
		}
	
	public void actionPerformed(ActionEvent e) 
	
	{
		
		String rumno,rumtyp,rumbed;
		
		RoomAddData roomd3;
		
		if(e.getSource() == bsearch)
			
		{   
			
			int flag =0;
			rumnm.removeAllItems();
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
					       
					
							  
							rumnm.addItem(list8.get(i).getRoomno());
									  bbooknow.setVisible(true);
									  flag=1;
							
					   }
						
			}
			
			
			if(flag==0)
			{
				
				
				msgbox = "Room Not Available";
				new MsgBox1(msgbox);
				
				
			}
			
			
		}
		
                if(e.getSource() == bbooknow)
			
		        {           dispose();
		
                	rno = (String) rumnm.getSelectedItem();
                	rtype = (String) actype.getSelectedItem();
                	rbed = (String) bed.getSelectedItem();
                	
                	new BookingForm1(rno,rtype,rbed);
                	
		        }
		
	
	}
		
	
	
	
}
	public class RoomSearch
	{
		
public static void main(String[] args) 
{
new RoomSearch1();

}
}


