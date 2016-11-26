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
	//insert bullshit here
		
		frame.setVisible(true);
	}
	
	private void frameception()
	{
		//top of the frame
		frameT = new JInternalFrame();
		frameT.setSize(500, 250);
		label = new JLabel("test");
		frameT.add(label);
		frameT.setBorder(null);
		frame.add(frameT);
		frameT.setVisible(true);
		
		// bottom of the frame starts here
		frameB = new JInternalFrame();
		frameB.setSize(500, 250);
		frameB.setLayout(new GridLayout(1,10));
		JButton test1 = new JButton("Test1");
		JButton test2 = new JButton("Test2");
		
		frameB.add(test1);
		frameB.add(test2);
		
		frameB.setBorder(null);
		frame.add(frameB);
		frameB.setVisible(true);
	}
	private JFrame frame;
	private JInternalFrame frameT;
	private JInternalFrame frameB;
	private JLabel label;
}
