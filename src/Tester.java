import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tester
{
	public static void main(String[] args)
	{
		Tester a = new Tester();
	}
	
	public Tester()
	{
		setupGUI();
	}
	
	private void setupGUI()
	{
		frame = new JFrame("WoW");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 1));
		frameception();
		frame.setVisible(true);
	
		//here we start the game
		startgame();
		
	}
	
	private void frameception()
	{
		//top of the frame
		frameT = new JInternalFrame();
		frameT.setSize(500, 250);
		frameT.add(topWindowText);
		frameT.setBorder(null);
		frame.add(frameT);
		frameT.setVisible(true);
		
		// bottom of the frame starts here
		frameB = new JInternalFrame();
		frameB.setSize(500, 250);
		frameB.setLayout(new GridLayout(1,10));
		frameB.setBorder(null);
		frame.add(frameB);
		frameB.setVisible(true);
	}
	private JFrame frame;
	private JInternalFrame frameT;
	private JInternalFrame frameB;
	private JLabel label;

	// in this method you can add buttons and do actual game logic along with the Button event Listener
	//should get called from setupGUI
	private void startgame()
	{
	 topWindowText.setText("Whats your name");
 nameField = new JTextField();
	 
	 //text that gets put in the ActionEvent when button is pressed
	 nameField.setActionCommand("nameField");
	 frameB.add(nameField);
	 nameField.addActionListener(new ButtonEventListener());
	 refresh();
	 
	}
	
	//call this method after any changes to buttons or fields due to shitty Swing
	private void refresh()
	{

		frame.validate();
		frame.repaint();
	}
	
	
	
	// class within a class
	// WITHIN TESTER CLASS NOT EXTERIOR
	class ButtonEventListener implements ActionListener
	{

		
		//This method gets called when any button is pressed in any frame
		//it gets passed an action event variable which we use to figure out what button was pressed
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			
			
		if (arg0.getActionCommand().equals("nameField"))
		{
			playerName = nameField.getText();
			frameB.remove(nameField);
			topWindowText.setText("hello: " + playerName + " Chose a class");
			button1.setText("Rogue");
			button2.setText("Mage");
			button1.setActionCommand("rogue");
			button2.setActionCommand("mage");
			button1.addActionListener(new ButtonEventListener());
			button2.addActionListener(new ButtonEventListener());
			frameB.add(button1);
			frameB.add(button2);
			refresh();
			
		}
		
		if (arg0.getActionCommand().equals("rogue"))
		{
			
			//insert code here
		}
		
		if (arg0.getActionCommand().equals("mage"))
		{
			
			//insert code here
		}
		
			
		}
		
		
	}
	//every single button you want to use has to be defined as an instance field or it will not be usable
	private JLabel topWindowText = new JLabel("WoW");
	private String playerName = "";
	JTextField nameField;
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
}




