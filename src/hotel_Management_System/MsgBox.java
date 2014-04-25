package hotel_Management_System;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class MsgBox1 extends JFrame implements ActionListener
{
	 JPanel pan;
	private JLabel msg;
	private JButton ok;
	
	public MsgBox1(String msgbox)
	{
		super("Message Box");
		pan= new JPanel();   
	    pan.setLayout(null);
	
	    Font f1=new Font("Modern No. 20",Font.BOLD,20);
	    
	    msg = new JLabel(msgbox,JLabel.CENTER);
	    msg.setFont(f1);
	    msg.setForeground(Color.BLUE);
		
		ok = new JButton();
		
		ImageIcon img = new ImageIcon("images\\okblue.png");
		ImageIcon img1 = new ImageIcon("images\\okgreen.png");
		ok.setIcon(img);
		ok.setRolloverIcon(img1);
		
		msg.setBounds(10,10,450,80);
		ok.setBounds(175,100,130,35);
		ok.addActionListener(this);
		
		pan.add(msg);
		pan.add(ok);
		
		
           setLayout(new BorderLayout());
		
		JLabel background=new JLabel(new ImageIcon("images\\msgbox.png"));
    	background.setLayout(new FlowLayout());
		background.setBackground(Color.WHITE);
		
    	 pan.add(background);
    	 background.setBounds(0,0,1366,768);  
    	
		 getContentPane().add(pan);   

		    setSize(500,200);   
		    setLocation(400,270);   
		    setVisible(true);   

		   		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == ok)
		{
			
			dispose ();
           

			
		}
		
	}
	
	
}


public class MsgBox {

	
	public static void main(String[] args)
	
	{
		
		new MsgBox1(null);

	}

}
