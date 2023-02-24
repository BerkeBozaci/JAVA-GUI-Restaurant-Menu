package RunPackage;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener{
	
	JButton MenuButton = new JButton("Menu");
	JButton ExitButton = new JButton("Exit");

	static double totalPrice = 0.0;
	static ArrayList<String> Orders;
	static JFrame LaunchFrame = new JFrame("Launch Page");
	
	LaunchPage() {
		Orders = new ArrayList<>();
		
		MenuButton.setBounds(350,250,200,40);
		MenuButton.setFocusable(false);
		MenuButton.addActionListener(this);
		
		ExitButton.setBounds(400,750,100,40);
		ExitButton.setFocusable(false);
		ExitButton.addActionListener(this);
	
		LaunchFrame.add(MenuButton);
		LaunchFrame.add(ExitButton);		
				
		LaunchFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LaunchFrame.setSize(900,900);
		LaunchFrame.setResizable(false);
		LaunchFrame.setLayout(null);
		LaunchFrame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == MenuButton) {
			MenuPage Menu = new MenuPage();
			LaunchFrame.setVisible(false);	
		}
		else if (e.getSource() == ExitButton) {
			System.exit(0);
		}
	}

}