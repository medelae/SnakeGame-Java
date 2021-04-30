/** 
 *  Snake.java
 *  Author: medelae on GitHub
 *  Last Edited: April 2021 (previous edit: April 8th, 2012)
 *  
 *  Purpose: Creates and displays the main program UI.
 * 
 */

import java.awt.*;
import javax.swing.*;

public class Snake {
	
	public static void main(String[] args) {

		// Building Main Content Frame
		
		// Game Window Title
		JFrame frame = new JFrame (" S N A K E ");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);		
		frame.setLayout(new BorderLayout());
		
		// Fill in Background Color and Add Panels
		frame.setBackground(Color.BLACK);
		
		GamePanel snakePanel = new GamePanel();
		frame.getContentPane().add ( snakePanel, BorderLayout.PAGE_END );
		
		// Formatting
		frame.setResizable(false);
		frame.setSize(500, 30);
		frame.pack();
		frame.setVisible(true);		
		
		snakePanel.setFocusable(true);
		
	}
	
}
