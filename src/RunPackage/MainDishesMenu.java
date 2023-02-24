package RunPackage;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainDishesMenu implements ActionListener{
	
	//WindowFrame
	JFrame MainDishesMenuWindow = new JFrame();
	
	//Back button
	JButton Back = new JButton();
	
	//Label For Title Soups
	JLabel MainCoursesLabel = new JLabel();
	
	//Total Price for everything label to string for showing in label
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	
	//Label for totalPrice
	JLabel TotalPriceLabel = new JLabel();
	JLabel TotalPriceTextLabel = new JLabel();
	
	//Creating Hamburger
	JLabel HamburgerLabel = new JLabel();
	JLabel HamburgerInfo = new JLabel();
	JLabel HamburgerInfo1 = new JLabel();
	JLabel HamburgerPriceInfo = new JLabel();
	
	ImageIcon hamburgerimage = new ImageIcon("ImageFolder/hamburgerlast.jpg");
	JLabel HamburgerImageLabel = new JLabel();
	
	
	JButton plusHamburger = new JButton();
	JButton minusHamburger = new JButton();
	
	String HamburgerPrice = Double.toString(Main.Hamburger.getPrice());
	String HamburgerRealCount = Integer.toString(Main.Hamburger.getCount());
	
	JLabel HamburgerCountLabel = new JLabel();
	JLabel HamburgerWarningText = new JLabel();
	
	//Creating New York Strip Steak
	JLabel NewYorkStripSteakLabel = new JLabel();
	JLabel NewYorkStripSteakInfo = new JLabel();
	JLabel NewYorkStripSteakInfo1 = new JLabel();
	JLabel NewYorkStripSteakPriceInfo = new JLabel();

	
	JButton plusNewYorkStripSteak = new JButton();
	JButton minusNewYorkStripSteak = new JButton();
	
	String NewYorkStripSteakPrice = Double.toString(Main.NewYorkStripSteak.getPrice());
	String NewYorkStripSteakRealCount = Integer.toString(Main.NewYorkStripSteak.getCount());
	
	JLabel NewYorkStripSteakCountLabel = new JLabel();
	JLabel NewYorkStripSteakWarningText = new JLabel();
	
	ImageIcon NewYorkStripSteakimage = new ImageIcon("ImageFolder/steak11jpeg.jpeg");
	JLabel NewYorkStripSteakImageLabel = new JLabel();
	
	//Creating Salmon
	JLabel SalmonLabel = new JLabel();
	JLabel SalmonInfo = new JLabel();
	JLabel SalmonInfo1 = new JLabel();
	JLabel SalmonPriceInfo = new JLabel();

	
	JButton plusSalmon = new JButton();
	JButton minusSalmon= new JButton();
	
	String SalmonPrice = Double.toString(Main.Salmon.getPrice());
	String SalmonRealCount = Integer.toString(Main.Salmon.getCount());
	
	JLabel SalmonCountLabel = new JLabel();
	JLabel SalmonWarningText = new JLabel();
	
	ImageIcon Salmonimage = new ImageIcon("ImageFolder/salmss1.PNG");
	JLabel SalmonImageLabel = new JLabel();
	
	//Creating Fish and Chips
	JLabel FishandChipsLabel = new JLabel();
	JLabel FishandChipsInfo = new JLabel();
	JLabel FishandChipsInfo1 = new JLabel();
	JLabel FishandChipsPriceInfo = new JLabel();

	
	JButton plusFishandChips = new JButton();
	JButton minusFishandChips = new JButton();
	
	String FishandChipsPrice = Double.toString(Main.FishandChips.getPrice());
	String FishandChipsRealCount = Integer.toString(Main.FishandChips.getCount());
	
	JLabel FishandChipsCountLabel = new JLabel();
	JLabel FishandChipsWarningText = new JLabel();
	
	ImageIcon FishandChipsimage = new ImageIcon("ImageFolder/fish.PNG");
	JLabel FishandChipsImageLabel = new JLabel();
	
	//Creating Pizza
	JLabel PizzaLabel = new JLabel();
	JLabel PizzaInfo = new JLabel();
	JLabel PizzaInfo1 = new JLabel();
	JLabel PizzaPriceInfo = new JLabel();

	
	JButton plusPizza = new JButton();
	JButton minusPizza= new JButton();
	
	String PizzaPrice = Double.toString(Main.Pizza.getPrice());
	String PizzaRealCount = Integer.toString(Main.Pizza.getCount());
	
	JLabel PizzaCountLabel = new JLabel();
	JLabel PizzaWarningText = new JLabel();
	
	ImageIcon Pizzaimage = new ImageIcon("ImageFolder/pizzaa.PNG");
	JLabel PizzaImageLabel = new JLabel();
	
	MainDishesMenu(){
		
		LabelCreator(TotalPriceTextLabel, "Total Price: ",1300,40,300,45,15);
		
		LabelCreator(MainCoursesLabel, "Main Courses", 875,20,150,50,20);
		ButtonCreator(Back, "Back", 0,0,100,20);
		LabelCreator(TotalPriceLabel, TotalPrice, 1400,40,45,45,15);
		
		//For Hamburger
		LabelCreator(HamburgerLabel, "Hamburger: ", 340,100,300,50,18);
		LabelCreator(HamburgerInfo, "Create your own Hamburger", 340,110,600,80, 14);
		LabelCreator(HamburgerPriceInfo, HamburgerPrice, 480,105,45,45,15);
		LabelCreator(HamburgerCountLabel, HamburgerRealCount, 760,130,45,45,18);
		
		LabelCreator(HamburgerWarningText, "Sorry there is no Hamburger left.", 380, 175, 600,80,18);
		HamburgerWarningText.setVisible(false);
		
		ButtonCreator(plusHamburger, "+", 790,130,45,45);
		ButtonCreator(minusHamburger, "-", 700,130,45,45);
		
		HamburgerImageLabel.setIcon(hamburgerimage);
		HamburgerImageLabel.setBounds(50,5,400,400);
		HamburgerImageLabel.setVisible(true);
		MainDishesMenuWindow.add(HamburgerImageLabel);
		
		//For New York Strip Steak
		LabelCreator(NewYorkStripSteakLabel, "New York Strip Steak: ", 380,320,300,50,18);
		LabelCreator(NewYorkStripSteakInfo, "A thick center cut (300gr) steak from the ", 380,330,600,80, 14);
		LabelCreator(NewYorkStripSteakInfo1, "tender short loin, seasoned and chargrilled", 380,345,600,80, 14);
		LabelCreator(NewYorkStripSteakPriceInfo, NewYorkStripSteakPrice, 600,325,45,45,15);
		LabelCreator(NewYorkStripSteakCountLabel, NewYorkStripSteakRealCount, 760,365,45,45,18);
		
		LabelCreator(NewYorkStripSteakWarningText, "Sorry there is no New York Steak left.", 420, 395, 600,80,18);
		NewYorkStripSteakWarningText.setVisible(false);
		
		ButtonCreator(plusNewYorkStripSteak, "+", 790,365,45,45);
		ButtonCreator(minusNewYorkStripSteak, "-", 700,365,45,45);
		
		NewYorkStripSteakImageLabel.setIcon(NewYorkStripSteakimage);
		NewYorkStripSteakImageLabel.setBounds(50,330,400,200);
		NewYorkStripSteakImageLabel.setVisible(true);
		MainDishesMenuWindow.add(NewYorkStripSteakImageLabel);
		
		
		//For Salmon
		LabelCreator(SalmonLabel, "Salmon: ", 330,560,300,50,18);
		LabelCreator(SalmonInfo, "Pan seared fresh salmon ", 330,570,600,80, 14);
		LabelCreator(SalmonInfo1, "served with fresh vegetables and lemon.", 330,585,600,80, 14);
		LabelCreator(SalmonPriceInfo, SalmonPrice, 450,565,45,45, 15);
		LabelCreator(SalmonCountLabel, SalmonRealCount, 760,575,45,45,18);
		
		LabelCreator(SalmonWarningText, "Sorry there is no Salmon left.", 370, 635, 600,80,18);
		SalmonWarningText.setVisible(false);
		
		ButtonCreator(plusSalmon, "+", 790,575,45,45);
		ButtonCreator(minusSalmon, "-", 700,575,45,45);
		
		SalmonImageLabel.setIcon(Salmonimage);
		SalmonImageLabel.setBounds(50,500,400,400);
		SalmonImageLabel.setVisible(true);
		MainDishesMenuWindow.add(SalmonImageLabel);
		
		//For Fish and Chips
		LabelCreator(FishandChipsLabel, "Fish and Chips: ", 1240,100,300,50,18);
		LabelCreator(FishandChipsInfo, " Fried fish in crispy batter, served with chips. ", 1235,110,600,80,14);
		LabelCreator(FishandChipsPriceInfo, FishandChipsPrice, 1400,105,45,45,15);
		LabelCreator(FishandChipsCountLabel, FishandChipsRealCount, 1660,130,45,45,18);
		
		LabelCreator(FishandChipsWarningText, "Sorry there is no Fish and Chips left.", 1280, 175, 600,80,18);
		FishandChipsWarningText.setVisible(false);
		
		ButtonCreator(plusFishandChips, "+", 1690,130,45,45);
		ButtonCreator(minusFishandChips, "-", 1600,130,45,45);
		
		FishandChipsImageLabel.setIcon(FishandChipsimage);
		FishandChipsImageLabel.setBounds(970,5,400,400);
		FishandChipsImageLabel.setVisible(true);
		MainDishesMenuWindow.add(FishandChipsImageLabel);
		
		//For Pizza
		LabelCreator(PizzaLabel, "Pizza: ", 1280,380,300,50,18);
		LabelCreator(PizzaInfo, "Create your own pizza ", 1280,390,600,80, 14);
		LabelCreator(PizzaPriceInfo, PizzaPrice, 1350,385,45,45,15);
		LabelCreator(PizzaCountLabel, PizzaRealCount, 1660,420,45,45,18);
		
		LabelCreator(PizzaWarningText, "Sorry there is no Pizza left.", 1320, 455, 600,80,18);
		PizzaWarningText.setVisible(false);
		
		ButtonCreator(plusPizza, "+", 1690,420,45,45);
		ButtonCreator(minusPizza, "-", 1600,420,45,45);
		
		PizzaImageLabel.setIcon(Pizzaimage);
		PizzaImageLabel.setBounds(970,330,400,400);
		PizzaImageLabel.setVisible(true);
		MainDishesMenuWindow.add(PizzaImageLabel);
		
		MainDishesMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainDishesMenuWindow.setSize(1800,1000);
		MainDishesMenuWindow.setResizable(false);
		MainDishesMenuWindow.setLayout(null);
		MainDishesMenuWindow.setVisible(true);
	}
	
	//Method for creating label
	void LabelCreator(JLabel name, String text, int x_cor, int y_cor, int length, int height, int punto) {
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setVisible(true);
		name.setFont(new Font("Verdana", Font.PLAIN, punto));
		MainDishesMenuWindow.add(name);
	}
	
	//Method for creating buttons 
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		MainDishesMenuWindow.add(name);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			MenuPage BackToSession = new MenuPage();
			MainDishesMenuWindow.setVisible(false);
		}
		else if (e.getSource() == plusHamburger) {
			if (Main.Hamburger.getStock()>0) {
					
				Main.Hamburger.setCount(Main.Hamburger.getCount() + 1);
				Main.Hamburger.setStock(Main.Hamburger.getStock() - 1);
					
				String HamburgerRealCount = Integer.toString(Main.Hamburger.getCount());
				HamburgerCountLabel.setText(HamburgerRealCount);
				LaunchPage.Orders.add("Hamburger");

				
				LaunchPage.totalPrice += Main.Hamburger.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}	
			else {
				HamburgerWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusHamburger) {
			HamburgerWarningText.setVisible(false);
			if (Main.Hamburger.getCount()>0) {
				
				Main.Hamburger.setCount(Main.Hamburger.getCount() - 1);
				Main.Hamburger.setStock(Main.Hamburger.getStock() + 1);
				
				String HamburgerRealCount = Integer.toString(Main.Hamburger.getCount());
				HamburgerCountLabel.setText(HamburgerRealCount);
				LaunchPage.Orders.remove("Hamburger");
				
				
				LaunchPage.totalPrice -= Main.Hamburger.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusNewYorkStripSteak) {
			if (Main.NewYorkStripSteak.getStock()>0) {
					
				Main.NewYorkStripSteak.setCount(Main.NewYorkStripSteak.getCount() + 1);
				Main.NewYorkStripSteak.setStock(Main.NewYorkStripSteak.getStock() - 1);
					
				String NewYorkStripSteakRealCount = Integer.toString(Main.NewYorkStripSteak.getCount());
				NewYorkStripSteakCountLabel.setText(NewYorkStripSteakRealCount);
				LaunchPage.Orders.add("New York Strip Steak");
					
				
				LaunchPage.totalPrice += Main.NewYorkStripSteak.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				NewYorkStripSteakWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusNewYorkStripSteak) {
			NewYorkStripSteakWarningText.setVisible(false);
			if (Main.NewYorkStripSteak.getCount()>0) {
				
				Main.NewYorkStripSteak.setCount(Main.NewYorkStripSteak.getCount() - 1);
				Main.NewYorkStripSteak.setStock(Main.NewYorkStripSteak.getStock() + 1);
				
				String NewYorkStripSteakRealCount = Integer.toString(Main.NewYorkStripSteak.getCount());
				NewYorkStripSteakCountLabel.setText(NewYorkStripSteakRealCount);
				LaunchPage.Orders.remove("New York Strip Steak");
			
				
				LaunchPage.totalPrice -= Main.NewYorkStripSteak.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusSalmon) {
			if (Main.Salmon.getStock()>0) {
					
				Main.Salmon.setCount(Main.Salmon.getCount() + 1);
				Main.Salmon.setStock(Main.Salmon.getStock() - 1);
					
				String SalmonRealCount = Integer.toString(Main.Salmon.getCount());
				SalmonCountLabel.setText(SalmonRealCount);
				LaunchPage.Orders.add("Salmon");
				
				
				LaunchPage.totalPrice += Main.Salmon.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				SalmonWarningText.setVisible(true);
			}
			
		}
		else if (e.getSource()==minusSalmon) {
			SalmonWarningText.setVisible(false);
			if (Main.Salmon.getCount()>0) {
				
				Main.Salmon.setCount(Main.Salmon.getCount() - 1);
				Main.Salmon.setStock(Main.Salmon.getStock() + 1);
				
				String SalmonRealCount = Integer.toString(Main.Salmon.getCount());
				SalmonCountLabel.setText(SalmonRealCount);
				LaunchPage.Orders.remove("Salmon");
				
				
				LaunchPage.totalPrice -= Main.Salmon.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusFishandChips) {
			if (Main.FishandChips.getStock()>0) {
					
				Main.FishandChips.setCount(Main.FishandChips.getCount() + 1);
				Main.FishandChips.setStock(Main.FishandChips.getStock() - 1);
					
				String FishandChipsRealCount = Integer.toString(Main.FishandChips.getCount());
				FishandChipsCountLabel.setText(FishandChipsRealCount);
				LaunchPage.Orders.add("Fish and Chips");
					
				
				LaunchPage.totalPrice += Main.FishandChips.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else  {
				FishandChipsWarningText.setVisible(true);
			}
			
		}
		else if (e.getSource()==minusFishandChips) {
			FishandChipsWarningText.setVisible(false);
			if (Main.FishandChips.getCount()>0) {
				
				Main.FishandChips.setCount(Main.FishandChips.getCount() - 1);
				Main.FishandChips.setStock(Main.FishandChips.getStock() + 1);
				
				String FishandChipsRealCount = Integer.toString(Main.FishandChips.getCount());
				FishandChipsCountLabel.setText(FishandChipsRealCount);
				LaunchPage.Orders.remove("Fish and Chips");
			
				
				LaunchPage.totalPrice -= Main.FishandChips.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusPizza) {
			if (Main.Pizza.getStock()>0) {
					
				Main.Pizza.setCount(Main.Pizza.getCount() + 1);
				Main.Pizza.setStock(Main.Pizza.getStock() - 1);
					
				String PizzaRealCount = Integer.toString(Main.Pizza.getCount());
				PizzaCountLabel.setText(PizzaRealCount);
				LaunchPage.Orders.add("Pizza");
					
				
				LaunchPage.totalPrice += Main.Pizza.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
				
			}
			else {
				PizzaWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusPizza) {
			PizzaWarningText.setVisible(false);
			if (Main.Pizza.getCount()>0) {
				
				Main.Pizza.setCount(Main.Pizza.getCount() - 1);
				Main.Pizza.setStock(Main.Pizza.getStock() + 1);
				 
				String PizzaRealCount = Integer.toString(Main.Pizza.getCount());
				PizzaCountLabel.setText(PizzaRealCount);
				LaunchPage.Orders.remove("Pizza");
				
				LaunchPage.totalPrice -= Main.Pizza.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
	}
}


