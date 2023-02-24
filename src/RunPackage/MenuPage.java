package RunPackage;


import java.awt.Component;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MenuPage extends JFrame implements ActionListener{
	
	JButton Soups = new JButton("Soups");
	JButton Salads = new JButton("Salads");
	JButton MainDishes = new JButton("Main Dishes");
	JButton Drinks = new JButton("Drinks");
	JButton Desserts = new JButton("Desserts");
	
	JButton Back = new JButton("Back");
	JButton EndOrder = new JButton("End Order");
	
	JLabel totPr = new JLabel();
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	JLabel TotalPriceLabel = new JLabel();
	
	MenuPage(){
		
		Soups.setBounds(500,460,200,40);
		Soups.setFocusable(false);
		Soups.addActionListener(this);

		Salads.setBounds(500,520,200,40);
		Salads.setFocusable(false);
		Salads.addActionListener(this);
		
		MainDishes.setBounds(500,580,200,40);
		MainDishes.setFocusable(false);
		MainDishes.addActionListener(this);
		
		Drinks.setBounds(500,640,200,40);
		Drinks.setFocusable(false);
		Drinks.addActionListener(this);
		
		Desserts.setBounds(500,700,200,40);
		Desserts.setFocusable(false);
		Desserts.addActionListener(this);
		
		Back.setBounds(0,0,100,20);
		Back.setFocusable(false);
		Back.addActionListener(this);
		
		TotalPriceLabel.setBounds(620,302,100,40);
		TotalPriceLabel.setVisible(true);
		TotalPriceLabel.setText(TotalPrice);
		TotalPriceLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		totPr.setBounds(500,300,200,40);
		totPr.setVisible(true);
		totPr.setText("Total Price: ");
		totPr.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		EndOrder.setBounds(550,800,100,60);
		EndOrder.setFocusable(false);
		EndOrder.addActionListener(this);
		
		this.add(Soups);
		this.add(Salads);
		this.add(MainDishes);
		this.add(Drinks);
		this.add(Desserts);
		this.add(Back);
		this.add(EndOrder);
		
		this.add(TotalPriceLabel);
		this.add(totPr);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,1200);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			LaunchPage returnMenu = new LaunchPage();
			this.setVisible(false);
		}
		else if (e.getSource() == Soups) {
			SoupsMenu soupMenu = new SoupsMenu();
			this.setVisible(false);
		}
		else if (e.getSource() == Salads) {
			SaladsMenu saladMenu = new SaladsMenu();
			this.setVisible(false);
		}
		else if (e.getSource() == MainDishes) {
			MainDishesMenu mainDishMenu = new MainDishesMenu();
			this.setVisible(false);
		}
		else if (e.getSource() == Drinks) {
			DrinksMenu drinkMenu = new DrinksMenu();
			this.setVisible(false);
		}
		else if (e.getSource() == Desserts) {
			DessertsMenu dessertMenu = new DessertsMenu();
			this.setVisible(false);
		}
		else if (e.getSource() == EndOrder) {
			String s = TotalPrice; 
			for (String p: LaunchPage.Orders) {
				WelcomePage.Orders_for_management.add(p);
			}
			LaunchPage.Orders.add("Total Price: " + s);
			WelcomePage.List_of_orders.add(LaunchPage.Orders);
			LaunchPage.totalPrice = 0; 
		
			Main.ChickenNoodleSoup.setCount(0);
			Main.MisoSoup.setCount(0);
			Main.PatatoSoup.setCount(0);
			Main.TomatoSoup.setCount(0);
			Main.ChefsSpecialSoup.setCount(0);
			Main.CaesarSalad.setCount(0);
			Main.CrabSalad.setCount(0);
			Main.GreekSalad.setCount(0);
			Main.AvacadoSalad.setCount(0);
			Main.RedBeetSalad.setCount(0);
			Main.Hamburger.setCount(0);
			Main.NewYorkStripSteak.setCount(0);
			Main.Salmon.setCount(0);
			Main.FishandChips.setCount(0);
			Main.Pizza.setCount(0);
			Main.Cola.setCount(0);
			Main.Sprite.setCount(0);
			Main.Water.setCount(0);
			Main.RedWine.setCount(0);
			Main.WhiteWine.setCount(0);
			Main.SpecialCraftBeer.setCount(0);
			Main.Strudel.setCount(0);
			Main.Tiramisu.setCount(0);
			Main.FriedIceCream.setCount(0);
			Main.SanSebastianCheesecake.setCount(0);
			Main.ChocolateSouffle.setCount(0);
			
			if (RestaurantViewPage.a == WelcomePage.Table1_with_2) {
				if (WelcomePage.comboBox.getSelectedItem() == "1" || WelcomePage.comboBox.getSelectedItem() == "2"){
					WelcomePage.two_per_table-=1;
					RestaurantViewPage.table_name = " 1";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table1_with_2.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);		
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table2_with_2) {
				if (WelcomePage.comboBox.getSelectedItem() == "1" ||WelcomePage.comboBox.getSelectedItem() == "2") {
					WelcomePage.two_per_table-=1;
					RestaurantViewPage.table_name = " 2";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table2_with_2.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table3_with_2) {
				if (WelcomePage.comboBox.getSelectedItem() == "1" ||WelcomePage.comboBox.getSelectedItem() == "2") {
					WelcomePage.two_per_table-=1;					
					RestaurantViewPage.table_name = " 3";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table3_with_2.setEnabled(false);					
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table4_with_4) {
				if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3"|| WelcomePage.comboBox.getSelectedItem() == "4") {				
					WelcomePage.four_per_table-=1;				
					RestaurantViewPage.table_name = " 4";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table4_with_4.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table5_with_4) {
				if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3" || WelcomePage.comboBox.getSelectedItem() == "4") {				
					WelcomePage.four_per_table--;									
					RestaurantViewPage.table_name = " 5";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table5_with_4.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table6_with_4) {
				if (WelcomePage.comboBox.getSelectedItem() == "2" || WelcomePage.comboBox.getSelectedItem() == "3" || WelcomePage.comboBox.getSelectedItem() == "4") {		
					WelcomePage.four_per_table--;
					RestaurantViewPage.table_name = " 6";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table6_with_4.setEnabled(false);					
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table7_with_6) {
				if (WelcomePage.comboBox.getSelectedItem() == "4" ||WelcomePage.comboBox.getSelectedItem() == "5"||WelcomePage.comboBox.getSelectedItem() == "6") {
					WelcomePage.six_per_table--;
					RestaurantViewPage.table_name = " 7";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table7_with_6.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table8_with_6) {
				if (WelcomePage.comboBox.getSelectedItem() == "4" ||WelcomePage.comboBox.getSelectedItem() == "5"||WelcomePage.comboBox.getSelectedItem() == "6") {		
					WelcomePage.six_per_table--;		
					RestaurantViewPage.table_name = " 8";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table8_with_6.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table9_with_8) {
				if (WelcomePage.comboBox.getSelectedItem() == "6" || WelcomePage.comboBox.getSelectedItem() == "7"||WelcomePage.comboBox.getSelectedItem() == "8") {
					WelcomePage.eigth_per_table--;		
					RestaurantViewPage.table_name = " 9";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table9_with_8.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			else if (RestaurantViewPage.a == WelcomePage.Table10_with_8) {
				if (WelcomePage.comboBox.getSelectedItem() == "6" || WelcomePage.comboBox.getSelectedItem() == "7" || WelcomePage.comboBox.getSelectedItem() == "8") {
					WelcomePage.eigth_per_table--;			
					RestaurantViewPage.table_name = " 10";
					WelcomePage.List_of_tables.add(RestaurantViewPage.table_name);
					WelcomePage.Table10_with_8.setEnabled(false);
					this.setVisible(false);
				}
				else {
					RestaurantViewPage.WarningText.setVisible(true);
				}
			}
			WelcomePage WelcomePageFramea = new WelcomePage();
			this.setVisible(false);
			LaunchPage.LaunchFrame.setVisible(false);
		}
	}

}