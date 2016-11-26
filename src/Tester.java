import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.border.EmptyBorder;

public class Tester extends JFrame
{
	public Tester()
	{
		initUI();
	}
	private void initUI()
	{
		setTitle("Insert title here");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton aButton = new JButton("Alliance");
		aButton.addActionListener((ActionEvent event) -> 
		{
			faction = true;
		});
		
		JButton hButton = new JButton("Horde");
		hButton.addActionListener((ActionEvent event) -> 
		{
			faction = false;
		});
		
		createAllianceLayout(aButton, hButton);
	}
	private void createAllianceLayout(JComponent... arg)
	{
//		Container pane = getContentPane();
//		GroupLayout g1 = new GroupLayout(pane);
//		pane.setLayout(g1);
//		
//		g1.setAutoCreateContainerGaps(true);
//		g1.setHorizontalGroup(g1.createSequentialGroup().addComponent(arg[0]));
//		g1.setVerticalGroup(g1.createSequentialGroup().addComponent(arg[0]));
		
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.setBorder(new EmptyBorder(new Insets(40, 60, 40, 60)));

        panel.add(arg[0]);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(arg[1]);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));

        add(panel);

        pack();

        setTitle("RigidArea");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
		
	}
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() -> 
		{
			Tester a = new Tester();
			a.setVisible(true);
		});
	}
	// true == Alliance and false == Horde
	private boolean faction;
	private String race;
}
