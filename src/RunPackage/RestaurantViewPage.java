package RunPackage;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RestaurantViewPage extends JFrame implements ActionListener{

	JButton BackButton = new JButton("Back");
	
	static JLabel WarningText = new JLabel();
	
	JLabel newRezervationText = new JLabel();
	static String table_name = "";
	static JButton a;
	
	RestaurantViewPage(){
		
		ButtonCreator(WelcomePage.Table1_with_2, "2 people", 100,110, 100,80);
		ButtonCreator(WelcomePage.Table2_with_2, "2 people", 100,200, 100,80);
		ButtonCreator(WelcomePage.Table3_with_2, "2 people", 100,290, 100,80);
		ButtonCreator(WelcomePage.Table4_with_4, "4 people", 250,110, 100,80);
		ButtonCreator(WelcomePage.Table5_with_4, "4 people", 250,200, 100,80);
		ButtonCreator(WelcomePage.Table6_with_4, "4 people", 250,290, 100,80);
		ButtonCreator(WelcomePage.Table7_with_6, "6 people", 400,110, 100,80);
		ButtonCreator(WelcomePage.Table8_with_6, "6 people", 400,200, 100,80);
		ButtonCreator(WelcomePage.Table9_with_8, "8 people", 550,110, 100,80);
		ButtonCreator(WelcomePage.Table10_with_8, "8 people", 550,200, 100,80);
		
		newRezervationText.setText("Hello, please select your table.");
		newRezervationText.setBounds(100, 20, 700, 100);
		newRezervationText.setVisible(true);
		newRezervationText.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		WarningText.setText("Sorry, this table is not suitable for your person number.");
		WarningText.setBounds(100, 400, 700, 100);
		WarningText.setVisible(false);
		WarningText.setFont(new Font("Verdana", Font.PLAIN, 15));	
		
		BackButton.setBounds(0,0,100,20);
		BackButton.setFocusable(false);
		BackButton.addActionListener(this);
		
		this.add(BackButton);
		this.add(newRezervationText);
		this.add(WarningText);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,600);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);		
	}
	
	
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		this.add(name); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BackButton) {
			WelcomePage WelcomePageFramea = new WelcomePage();
			this.setVisible(false);
		}
		else if (e.getSource() == WelcomePage.Table1_with_2) {
			a = WelcomePage.Table1_with_2;
			if (WelcomePage.comboBox.getSelectedItem() == "1" || WelcomePage.comboBox.getSelectedItem() == "2"){
				
				WelcomePage.Table1_with_2.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);		
			}
		}
		else if (e.getSource() == WelcomePage.Table2_with_2) {
			a = WelcomePage.Table2_with_2;
			if (WelcomePage.comboBox.getSelectedItem() == "1" ||WelcomePage.comboBox.getSelectedItem() == "2") {
				
				WelcomePage.Table2_with_2.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table3_with_2) {
			a = WelcomePage.Table3_with_2;
			if (WelcomePage.comboBox.getSelectedItem() == "1" ||WelcomePage.comboBox.getSelectedItem() == "2") {
				
				WelcomePage.Table3_with_2.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table4_with_4) {
			a = WelcomePage.Table4_with_4;
			if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3"|| WelcomePage.comboBox.getSelectedItem() == "4") {
				
				WelcomePage.Table4_with_4.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table5_with_4) {
			a = WelcomePage.Table5_with_4;
			if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3" || WelcomePage.comboBox.getSelectedItem() == "4") {
				
				WelcomePage.Table5_with_4.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table6_with_4) {
			a = WelcomePage.Table6_with_4;
			if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3" || WelcomePage.comboBox.getSelectedItem() == "4") {
				
				WelcomePage.Table6_with_4.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table7_with_6) {
			a = WelcomePage.Table7_with_6;
			if (WelcomePage.comboBox.getSelectedItem() == "4" ||WelcomePage.comboBox.getSelectedItem() == "5"||WelcomePage.comboBox.getSelectedItem() == "6") {
				
				WelcomePage.Table7_with_6.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table8_with_6) {
			a = WelcomePage.Table8_with_6;
			if (WelcomePage.comboBox.getSelectedItem() == "4" ||WelcomePage.comboBox.getSelectedItem() == "5"||WelcomePage.comboBox.getSelectedItem() == "6") {
				
				WelcomePage.Table8_with_6.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table9_with_8) {
			a = WelcomePage.Table9_with_8;
			if (WelcomePage.comboBox.getSelectedItem() == "6" || WelcomePage.comboBox.getSelectedItem() == "7"||WelcomePage.comboBox.getSelectedItem() == "8") {
				
				WelcomePage.Table9_with_8.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
		else if (e.getSource() == WelcomePage.Table10_with_8) {
			a = WelcomePage.Table10_with_8;
			if (WelcomePage.comboBox.getSelectedItem() == "6" || WelcomePage.comboBox.getSelectedItem() == "7" || WelcomePage.comboBox.getSelectedItem() == "8") {

				WelcomePage.Table10_with_8.setEnabled(false);
				LaunchPage LaunchPageview = new LaunchPage();
				this.setVisible(false);
			}
			else {
				WarningText.setVisible(true);
			}
		}
	}
}
