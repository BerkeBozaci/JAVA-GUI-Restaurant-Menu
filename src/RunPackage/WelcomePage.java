package RunPackage;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends JFrame implements ActionListener{
	
	static int two_per_table =  3;
	static int four_per_table = 3;
	static int six_per_table = 2;
	static int eigth_per_table = 2;
	
	static int total_table = 0;
	static ArrayList<String> Orders_for_management = new ArrayList<>();;
	static HashMap<Object, Integer> Total_sales = new HashMap<>();
	static ArrayList<ArrayList> List_of_orders = new ArrayList<>();
	static ArrayList<String> List_of_tables = new ArrayList<>();
	
	
	static JButton Table1_with_2 = new JButton();
	static JButton Table2_with_2 = new JButton();
	static JButton Table3_with_2 = new JButton();
	static JButton Table4_with_4 = new JButton();
	static JButton Table5_with_4 = new JButton();
	static JButton Table6_with_4 = new JButton();
	static JButton Table7_with_6 = new JButton();
	static JButton Table8_with_6 = new JButton();
	static JButton Table9_with_8 = new JButton();
	static JButton Table10_with_8 = new JButton();
	
	
	static JComboBox comboBox;
	
	JButton ExitButton = new JButton("Exit");
	
	JLabel WarningText = new JLabel();
	JLabel WelcomeText = new JLabel();
	JLabel comboNumText = new JLabel();
	
	WelcomePage(){
		
		total_table = two_per_table + four_per_table + six_per_table + eigth_per_table;
		
		WelcomeText.setText("Welcome");
		WelcomeText.setBounds(400, 150, 300, 100);
		WelcomeText.setVisible(true);
		WelcomeText.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		
		comboNumText.setText("Welcome to Restaurant please enter the number of person for ordering.");
		comboNumText.setBounds(170, 220, 700, 100);
		comboNumText.setVisible(true);
		comboNumText.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		WarningText.setText("Sorry we dont have any empty table right now.");
		WarningText.setBounds(200, 700, 600, 100);
		WarningText.setVisible(false);
		WarningText.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		String[] personNumbers = {"1","2","3","4","5","6","7","8"};
		comboBox = new JComboBox(personNumbers);
		comboBox.setBounds(400,300,50,50);
		comboBox.addActionListener(this);
		
		ExitButton.setBounds(700,700,100,20);
		ExitButton.setFocusable(false);
		ExitButton.addActionListener(this);
		
		if (total_table == 0) {
			WarningText.setVisible(true);
		}
		
		this.add(comboBox);
		this.add(WelcomeText);
		this.add(comboNumText);
		this.add(WarningText);
		this.add(ExitButton);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,900);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		this.add(name); 
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			if (comboBox.getSelectedItem() == "1") {
				if (two_per_table > 0) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "2") {
				if (two_per_table >= 1||four_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
					this.dispose();
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "3") {
				if (four_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
					this.dispose();
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "4") {
				if (four_per_table >= 1||six_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
					this.dispose();
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "5") {
				if (six_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
					this.dispose();
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "6") {
				if (six_per_table >= 1||eigth_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
					this.dispose();
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "7") {
				if (eigth_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
				}
				else {
					WarningText.setVisible(true);
				}
			}
			else if (comboBox.getSelectedItem() == "8") {
				if (eigth_per_table >= 1) {
					RestaurantViewPage RestaurantView = new RestaurantViewPage();
					this.setVisible(false);
				
				}
				else {
					WarningText.setVisible(true);
				}
			}
		}
		else if (e.getSource() == ExitButton) {
			int count = 1;
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			System.out.println("Manager View");
			System.out.println("----------------------------------");
			for (ArrayList orders : List_of_orders) {
				String string_count = Integer.toString(count);
				int y = List_of_orders.indexOf(orders);
				System.out.println("Order Number: " + string_count); 
				System.out.println("Table Number: " + List_of_tables.get(y)); 
				for (Object p:orders) {
					System.out.println(p); 
				}
				System.out.println("----------------------------------");
				count++;
			}	
			for (String k: Orders_for_management) {
				int i = Total_sales.containsKey(k) ? Total_sales.get(k) : 0;
				Total_sales.put(k, i + 1);
			}
			System.out.println("Total Sales: ");
			for (Object k: Total_sales.keySet()) {
				System.out.print(k);
				System.out.print("    ");
				System.out.println(Total_sales.get(k));	
			}
			System.exit(0);
		}
	}
}
