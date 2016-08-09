/*
 * Author: Tessa Jensen
 * August 7th, 2016
 * Google Code U Project
 * This is property of the author
 * 
 */

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.util.*;
import java.io.*;

/*************************************************************************
 * Variable Dictionary:
 *  - JFrame open --> Main Frame
 *  - JPanel back1 --> Background panel, used in main frame
 *  - JPanel bPanel --> Search button panel, used in main frame
 *  - JLabel title --> Display title
 *  - JLabel res1-res5 --> Result labels, display search results
 *  - JTextField sf --> Search bar, used in main frame 
 *  - JButton sb --> Search button, used in main frame 
 *  - Color LB
 *  - Color LG
 *  - Color W
 *
 */

public class SearchDraw implements ActionListener {

	JFrame open = new JFrame("Wikisearch");
	JPanel back = new JPanel();
	JPanel bPanel = new JPanel();
	JPanel sPanel = new JPanel();
	JPanel buttonPan = new JPanel();
	
	JLabel title = new JLabel("Wikisearch");
	JLabel fill = new JLabel("aaaaaaaaa");
	JLabel fill2 = new JLabel("aaaaaaaaa");
	JLabel fill3 = new JLabel("aaaaaaaaa");
	JLabel fill4 = new JLabel("aaaaaaaaa");
	JLabel res1 = new JLabel();
	JLabel res2 = new JLabel();
	JLabel res3 = new JLabel();
	
	JTextField sf = new JTextField(60);
	JButton sb = new JButton("Search");
	JButton shButton = new JButton("History");
	
	Color W = Color.white;
	Color LG = new Color(160,160,160);
	Color DG = new Color(96,96,96);
	Color LB = new Color(135,206,235);
	
	String srchTerm = "";
	
	PrintWriter history = OpenFile.openToWrite("history.txt");
	
	public SearchDraw(){
		
		//Set background panel
		back.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		back.setLayout(new GridLayout(8,1));
		back.setBackground(LB);
		
		//Update label fonts
		lb_font(title, "Copperplate", 70, W);
		lb_font(fill, "Copperplate", 20, LB);
		lb_font(fill2, "Copperplate", 20, LB);
		lb_font(fill3, "Copperplate", 20, LB);
		lb_font(fill4, "Copperplate", 20, LB);
		
		//Set Action Listener to search bar & button
		sf.addActionListener(this);
		shButton.addActionListener(this);
		
		sPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		sPanel.setLayout(new GridLayout(1,3));
		sPanel.setBackground(LB);
		sPanel.add(fill);
		sPanel.add(sf);
		sPanel.add(fill);
		
		buttonPan.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonPan.setLayout(new GridLayout(1,5));
		buttonPan.setBackground(LB);
		
		buttonPan.add(fill2);
		buttonPan.add(fill3);
		buttonPan.add(fill4);
		buttonPan.add(fill);
		buttonPan.add(shButton);
		
		back.add(fill);
		back.add(title);
		back.add(sPanel);
		back.add(res1);
		back.add(res2);
		back.add(res3);
		back.add(buttonPan);
		
		open.add(back);
		
		//Open screen
		open.setSize(625, 500);
		open.setResizable(true);
		open.setVisible(true);
		open.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*
	 * Processes all Action Events that occur on screen
	 * @param ActionEvent beta --> Action that occurred
	 */
	public void actionPerformed(ActionEvent beta){
		if (beta.getSource() == sf){
			
			srchTerm = sf.getText();
			history.println(srchTerm);
			
			//Run search protocol
			//Fill in returning text
			res1.setText(srchTerm);
			res2.setText("Waiting");
			res3.setText("Waiting");

		}
		
		if (beta.getSource() == shButton){
			
			history.close();
			Scanner hisRead = OpenFile.openToRead("history.txt");
			History(hisRead);
			history.close();
		}
	}
	 public void History(Scanner reader)
	  {
		JFrame hist = new JFrame();
		JPanel giant4 = new JPanel();
		
		JLabel his1 = new JLabel();
		JLabel his2 = new JLabel();
		JLabel his3 = new JLabel();
		JLabel his4 = new JLabel();
		JLabel his5 = new JLabel();
		
	    //giant4 has a 10 by 10 border, border layout and is white
	    giant4.setLayout(new GridLayout(5,1));
	    giant4.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	    giant4.setBackground(W);
	    
	    
	    //Add history to each label
	    if (reader.hasNextLine()){
	    	his1.setText(reader.nextLine());
	    }
	    if (reader.hasNextLine()){
	    	his2.setText(reader.nextLine());
	    }
	    if (reader.hasNextLine()){
	    	his3.setText(reader.nextLine());
	    }
	    if (reader.hasNextLine()){
	    	his4.setText(reader.nextLine());
	    }
	    if (reader.hasNextLine()){
	    	his5.setText(reader.nextLine());
	    }
	    
	    //Add to frames
	    giant4.add(his1);
	    giant4.add(his2);
	    giant4.add(his3);
	    giant4.add(his4);
	    giant4.add(his5);;
	    hist.add(giant4);
	    
	    //hist is 500 by 500, visible, not resizeable and closes on command
	    hist.setLocation(700,0);
	    hist.setSize(300,200); 
	    hist.setResizable(false);
	    hist.setVisible(true);
	    hist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }//end hist()
	
	/*
	 * Sets the font and alignment of a JLabel to the specified  
	 * @param JLabel label --> the label that needs to be changed
	 * @param String font --> String name of the desired font
	 * @param int size --> the size the text should be set to
	 * @param Color color --> the color the text should be set to
	 */
	public void lb_font(JLabel label, String font, int size, Color color)
	{
		label.setFont(new Font(font,Font.PLAIN, size));
		label.setForeground(color);
		label.setHorizontalAlignment(JLabel.CENTER);
	}//end lb_font
	
	
	public static void main(String[] args) {
		new SearchDraw();
	}

}
