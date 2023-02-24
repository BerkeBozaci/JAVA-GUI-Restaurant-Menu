package RunPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class DessertsMenu implements ActionListener{
	
	//WindowFrame
	JFrame DessertsMenuWindow = new JFrame();

	//Back button
	JButton Back = new JButton();
	
	//Label For Title Soups
	JLabel DessertsLabel = new JLabel();
	
	//Total Price for everything label to string for showing in label
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	
	//Label for totalPrice
	JLabel TotalPriceLabel = new JLabel();
	JLabel TotalPriceTextLabel = new JLabel();
	
	//Creating Strudel
	JLabel StrudelLabel = new JLabel();
	JLabel StrudelInfo = new JLabel();
	JLabel StrudelInfo1 = new JLabel();
	JLabel StrudelPriceInfo = new JLabel();

	JButton plusStrudel = new JButton();
	JButton minusStrudel = new JButton();
	
	String StrudelPrice = Double.toString(Main.Strudel.getPrice());
	String StrudelRealCount = Integer.toString(Main.Strudel.getCount());
	
	JLabel StrudelCountLabel = new JLabel();
	JLabel StrudelWarningText = new JLabel();
	
	ImageIcon StrudelImage = new ImageIcon("ImageFolder/strudell.PNG");
	JLabel StrudelImageLabel = new JLabel();
	
	//Creating Tiramisu
	JLabel TiramisuLabel = new JLabel();
	JLabel TiramisuInfo = new JLabel();
	JLabel TiramisuInfo1 = new JLabel();
	JLabel TiramisuPriceInfo = new JLabel();

	JButton plusTiramisu = new JButton();
	JButton minusTiramisu = new JButton();
	
	String TiramisuPrice = Double.toString(Main.Tiramisu.getPrice());
	String TiramisuRealCount = Integer.toString(Main.Tiramisu.getCount());
	
	JLabel TiramisuCountLabel = new JLabel();
	JLabel TiramisuWarningText = new JLabel();
	
	ImageIcon TiramisuImage = new ImageIcon("ImageFolder/tiramisu.PNG");
	JLabel TiramisuImageLabel = new JLabel();
	
	//Creating Fried Ice Cream
	JLabel FriedIceCreamLabel = new JLabel();
	JLabel FriedIceCreamInfo = new JLabel();
	JLabel FriedIceCreamInfo1 = new JLabel();
	JLabel FriedIceCreamPriceInfo = new JLabel();

	JButton plusFriedIceCream = new JButton();
	JButton minusFriedIceCream= new JButton();
	
	String FriedIceCreamPrice = Double.toString(Main.FriedIceCream.getPrice());
	String FriedIceCreamRealCount = Integer.toString(Main.FriedIceCream.getCount());
	
	JLabel FriedIceCreamCountLabel = new JLabel();
	JLabel FriedIceCreamWarningText = new JLabel();
	
	ImageIcon FriedIceCreamImage = new ImageIcon("ImageFolder/friedicecream.PNG");
	JLabel FriedIceCreamImageLabel = new JLabel();
	
	//Creating San Sebastian Cheesecake
	JLabel SanSebastianCheesecakeLabel = new JLabel();
	JLabel SanSebastianCheesecakeInfo = new JLabel();
	JLabel SanSebastianCheesecakeInfo1 = new JLabel();
	JLabel SanSebastianCheesecakePriceInfo = new JLabel();

	JButton plusSanSebastianCheesecake = new JButton();
	JButton minusSanSebastianCheesecake = new JButton();
	
	String SanSebastianCheesecakePrice = Double.toString(Main.SanSebastianCheesecake.getPrice());
	String SanSebastianCheesecakeRealCount = Integer.toString(Main.SanSebastianCheesecake.getCount());
	
	JLabel SanSebastianCheesecakeCountLabel = new JLabel();
	JLabel SanSebastianCheesecakeWarningText = new JLabel();
	
	ImageIcon SanSebastianCheesecakeImage = new ImageIcon("ImageFolder/sansebastian.PNG");
	JLabel SanSebastianCheesecakeImageLabel = new JLabel();
	
	//Creating Chocolate Souffle
	JLabel ChocolateSouffleLabel = new JLabel();
	JLabel ChocolateSouffleInfo = new JLabel();
	JLabel ChocolateSouffleInfo1 = new JLabel();
	JLabel ChocolateSoufflePriceInfo = new JLabel();
	
	JButton plusChocolateSouffle = new JButton();
	JButton minusChocolateSouffle = new JButton();
	
	String ChocolateSoufflePrice = Double.toString(Main.ChocolateSouffle.getPrice());
	String ChocolateSouffleRealCount = Integer.toString(Main.ChocolateSouffle.getCount());
	
	JLabel ChocolateSouffleCountLabel = new JLabel();
	JLabel ChocolateSouffleWarningText = new JLabel();
	
	ImageIcon ChocolateSouffleImage = new ImageIcon("ImageFolder/sufle.PNG");
	JLabel ChocolateSouffleImageLabel = new JLabel();
	
	DessertsMenu(){
		
		LabelCreator(TotalPriceTextLabel, "Total Price: ",1300,40,300,45,15);
		LabelCreator(DessertsLabel, "Desserts", 875,20,150,50,20);
		ButtonCreator(Back, "Back", 0,0,100,20);
		LabelCreator(TotalPriceLabel, TotalPrice, 1400,40,45,45,15);
		
		//For Strudel
		LabelCreator(StrudelLabel, "Strudel: ", 320,100,300,50,18);
		LabelCreator(StrudelInfo, "Layered pastry with a filled with apple ", 320,110,600,80, 14);
		LabelCreator(StrudelInfo1, "served with cream on top.", 320,125,600,80, 14);
		LabelCreator(StrudelPriceInfo, StrudelPrice, 400,105,45,45,15);
		LabelCreator(StrudelCountLabel, StrudelRealCount, 760,130,45,45,18);
		
		LabelCreator(StrudelWarningText, "Sorry there is no Strudel left.", 500, 200, 600,80,18);
		StrudelWarningText.setVisible(false);
		
		ButtonCreator(plusStrudel, "+", 790,130,45,45);
		ButtonCreator(minusStrudel, "-", 700,130,45,45);
		
		StrudelImageLabel.setIcon(StrudelImage);
		StrudelImageLabel.setBounds(50,5,400,400);
		StrudelImageLabel.setVisible(true);
		DessertsMenuWindow.add(StrudelImageLabel);
		
		//For Tiramisu
		LabelCreator(TiramisuLabel, "Tiramisu: ", 350, 350,300,50,18);
		LabelCreator(TiramisuInfo, "Ladyfingers dipped in coffee, layered with", 350,360,600,80, 14);
		LabelCreator(TiramisuInfo1, "a whipped cream and  flavoured with cocoa. ", 350,375,600,80, 14);
		LabelCreator(TiramisuPriceInfo, TiramisuPrice, 450,355,45,45,15);
		LabelCreator(TiramisuCountLabel, TiramisuRealCount, 760,385,45,45,18);
		
		LabelCreator(TiramisuWarningText, "Sorry there is no Tiramisu left.", 500, 500, 600,80,18);
		TiramisuWarningText.setVisible(false);
		
		ButtonCreator(plusTiramisu, "+", 790,385,45,45);
		ButtonCreator(minusTiramisu, "-", 700,385,45,45);
		
		TiramisuImageLabel.setIcon(TiramisuImage);
		TiramisuImageLabel.setBounds(50,275,400,400);
		TiramisuImageLabel.setVisible(true);
		DessertsMenuWindow.add(TiramisuImageLabel);
		
		//For Fried Ice Cream
		LabelCreator(FriedIceCreamLabel, "Fried Ice Cream: ", 250,650,300,50,18);
		LabelCreator(FriedIceCreamInfo, "Scoop of ice cream that is frozen hard, ", 250,660,600,80, 14);
		LabelCreator(FriedIceCreamInfo1, "coated in a batter, and quickly deep-fried.", 250,675,600,80, 14);
		LabelCreator(FriedIceCreamPriceInfo, FriedIceCreamPrice, 420,655,45,45, 15);
		LabelCreator(FriedIceCreamCountLabel, FriedIceCreamRealCount, 760,660,45,45,18);
		
		LabelCreator(FriedIceCreamWarningText, "Sorry there is no Fried Ice Cream left.", 500, 720, 600,80,18);
		FriedIceCreamWarningText.setVisible(false);
		
		ButtonCreator(plusFriedIceCream, "+", 790,660,45,45);
		ButtonCreator(minusFriedIceCream, "-", 700,660,45,45);
		
		FriedIceCreamImageLabel.setIcon(FriedIceCreamImage);
		FriedIceCreamImageLabel.setBounds(50,550,400,400);
		FriedIceCreamImageLabel.setVisible(true);
		DessertsMenuWindow.add(FriedIceCreamImageLabel);
		
		//For San Sebastian Cheesecake
		LabelCreator(SanSebastianCheesecakeLabel, "San Sebastian Cheesecake: ", 1160,100,300,50,18);
		LabelCreator(SanSebastianCheesecakeInfo, "Baked at a very high temperature that causes to", 1160,110,600,80,14);
		LabelCreator(SanSebastianCheesecakeInfo1, "crispy upper crust while maintaining a smooth texture inside.", 1160,125,600,80,14);
		LabelCreator(SanSebastianCheesecakePriceInfo, SanSebastianCheesecakePrice, 1440,105,45,45,15);
		LabelCreator(SanSebastianCheesecakeCountLabel, SanSebastianCheesecakeRealCount, 1660,130,45,45,18);
		
		LabelCreator(SanSebastianCheesecakeWarningText, "Sorry there is no San Sebastian Cheesecake left.", 1200, 175, 600,80,18);
		SanSebastianCheesecakeWarningText.setVisible(false);
		
		ButtonCreator(plusSanSebastianCheesecake, "+", 1690,130,45,45);
		ButtonCreator(minusSanSebastianCheesecake, "-", 1600,130,45,45);
		
		SanSebastianCheesecakeImageLabel.setIcon(SanSebastianCheesecakeImage);
		SanSebastianCheesecakeImageLabel.setBounds(900,5,400,400);
		SanSebastianCheesecakeImageLabel.setVisible(true);
		DessertsMenuWindow.add(SanSebastianCheesecakeImageLabel);
		
		//For Chocolate Souffle
		LabelCreator(ChocolateSouffleLabel, "Chocolate Souffle: ", 1160,400,300,50,18);
		LabelCreator(ChocolateSouffleInfo, "Chocolate cake stuffed with melted chocolate.", 1160,410,600,80, 14);
		LabelCreator(ChocolateSouffleInfo1, "Served with powdered sugar.", 1160,425,600,80, 14);
		LabelCreator(ChocolateSoufflePriceInfo, ChocolateSoufflePrice, 1400,405,45,45,15);
		LabelCreator(ChocolateSouffleCountLabel, ChocolateSouffleRealCount, 1660,415,45,45,18);
		
		LabelCreator(ChocolateSouffleWarningText, "Sorry there is no Chocolate Souffle left.", 1200, 475, 600,80,18);
		ChocolateSouffleWarningText.setVisible(false);
		
		ButtonCreator(plusChocolateSouffle, "+", 1690,415,45,45);
		ButtonCreator(minusChocolateSouffle, "-", 1600,415,45,45);
		
		ChocolateSouffleImageLabel.setIcon(ChocolateSouffleImage);
		ChocolateSouffleImageLabel.setBounds(900,300,400,400);
		ChocolateSouffleImageLabel.setVisible(true);
		DessertsMenuWindow.add(ChocolateSouffleImageLabel);
		
		DessertsMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DessertsMenuWindow.setSize(1800,1000);
		DessertsMenuWindow.setResizable(false);
		DessertsMenuWindow.setLayout(null);
		DessertsMenuWindow.setVisible(true);
	}
	
	//Method for creating labels
	void LabelCreator(JLabel name, String text, int x_cor, int y_cor, int length, int height, int punto) {
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setVisible(true);
		name.setFont(new Font("Verdana", Font.PLAIN, punto));
		DessertsMenuWindow.add(name);
	}
	
	//Method for creating buttons 
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		DessertsMenuWindow.add(name);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			MenuPage BackToSession = new MenuPage();
			DessertsMenuWindow.setVisible(false);
		}
		else if (e.getSource() == plusStrudel) {
			if (Main.Strudel.getStock()>0) {
					
				Main.Strudel.setCount(Main.Strudel.getCount() + 1);
				Main.Strudel.setStock(Main.Strudel.getStock() - 1);
					
				String StrudelRealCount = Integer.toString(Main.Strudel.getCount());
				StrudelCountLabel.setText(StrudelRealCount);
				LaunchPage.Orders.add("Strudel");
				
				LaunchPage.totalPrice += Main.Strudel.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				StrudelWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusStrudel) {
			StrudelWarningText.setVisible(false);
			if (Main.Strudel.getCount()>0) {
				
				Main.Strudel.setCount(Main.Strudel.getCount() - 1);
				Main.Strudel.setStock(Main.Strudel.getStock() + 1);
				
				String StrudelRealCount = Integer.toString(Main.Strudel.getCount());
				StrudelCountLabel.setText(StrudelRealCount);
				LaunchPage.Orders.remove("Strudel");
				
				LaunchPage.totalPrice -= Main.Strudel.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusTiramisu) {
			if (Main.Tiramisu.getStock()>0) {
					
				Main.Tiramisu.setCount(Main.Tiramisu.getCount() + 1);
				Main.Tiramisu.setStock(Main.Tiramisu.getStock() - 1);
					
				String TiramisuRealCount = Integer.toString(Main.Tiramisu.getCount());
				TiramisuCountLabel.setText(TiramisuRealCount);
				LaunchPage.Orders.add("Tiramisu");
				
				LaunchPage.totalPrice += Main.Tiramisu.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				TiramisuWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusTiramisu) {
			TiramisuWarningText.setVisible(false);
			if (Main.Tiramisu.getCount()>0) {
				
				Main.Tiramisu.setCount(Main.Tiramisu.getCount() - 1);
				Main.Tiramisu.setStock(Main.Tiramisu.getStock() + 1);
				
				String TiramisuRealCount = Integer.toString(Main.Tiramisu.getCount());
				TiramisuCountLabel.setText(TiramisuRealCount);
				LaunchPage.Orders.remove("Tiramisu");
				
				LaunchPage.totalPrice -= Main.Tiramisu.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusFriedIceCream) {
			if (Main.FriedIceCream.getStock()>0) {
					
				Main.FriedIceCream.setCount(Main.FriedIceCream.getCount() + 1);
				Main.FriedIceCream.setStock(Main.FriedIceCream.getStock() - 1);
					
				String FriedIceCreamRealCount = Integer.toString(Main.FriedIceCream.getCount());
				FriedIceCreamCountLabel.setText(FriedIceCreamRealCount);
				LaunchPage.Orders.add("Fried Ice Cream");
				
				LaunchPage.totalPrice += Main.FriedIceCream.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				FriedIceCreamWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusFriedIceCream) {
			FriedIceCreamWarningText.setVisible(false);
			if (Main.FriedIceCream.getCount()>0) {
				
				Main.FriedIceCream.setCount(Main.FriedIceCream.getCount() - 1);
				Main.FriedIceCream.setStock(Main.FriedIceCream.getStock() + 1);
				
				String FriedIceCreamRealCount = Integer.toString(Main.FriedIceCream.getCount());
				FriedIceCreamCountLabel.setText(FriedIceCreamRealCount);
				LaunchPage.Orders.remove("Fried Ice Cream");
				
				LaunchPage.totalPrice -= Main.FriedIceCream.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusSanSebastianCheesecake) {
			if (Main.SanSebastianCheesecake.getStock()>0) {
					
				Main.SanSebastianCheesecake.setCount(Main.SanSebastianCheesecake.getCount() + 1);
				Main.SanSebastianCheesecake.setStock(Main.SanSebastianCheesecake.getStock() - 1);
					
				String SanSebastianCheesecakeRealCount = Integer.toString(Main.SanSebastianCheesecake.getCount());
				SanSebastianCheesecakeCountLabel.setText(SanSebastianCheesecakeRealCount);
				LaunchPage.Orders.add("San Sebastian Cheesecake");
				
				LaunchPage.totalPrice += Main.SanSebastianCheesecake.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				SanSebastianCheesecakeWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusSanSebastianCheesecake) {
			SanSebastianCheesecakeWarningText.setVisible(false);
			if (Main.SanSebastianCheesecake.getCount()>0) {
				
				Main.SanSebastianCheesecake.setCount(Main.SanSebastianCheesecake.getCount() - 1);
				Main.SanSebastianCheesecake.setStock(Main.SanSebastianCheesecake.getStock() + 1);
				
				String SanSebastianCheesecakeRealCount = Integer.toString(Main.SanSebastianCheesecake.getCount());
				SanSebastianCheesecakeCountLabel.setText(SanSebastianCheesecakeRealCount);
				LaunchPage.Orders.remove("San Sebastian Cheesecake");
				
				LaunchPage.totalPrice -= Main.SanSebastianCheesecake.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusChocolateSouffle) {
			if (Main.ChocolateSouffle.getStock()>0) {
					
				Main.ChocolateSouffle.setCount(Main.ChocolateSouffle.getCount() + 1);
				Main.ChocolateSouffle.setStock(Main.ChocolateSouffle.getStock() - 1);
					
					String ChocolateSouffleRealCount = Integer.toString(Main.ChocolateSouffle.getCount());
					ChocolateSouffleCountLabel.setText(ChocolateSouffleRealCount);
					LaunchPage.Orders.add("Chocolate Souffle");
				
					LaunchPage.totalPrice += Main.ChocolateSouffle.getPrice();
					String TotalPrice = Double.toString(LaunchPage.totalPrice);
					TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				ChocolateSouffleWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusChocolateSouffle) {
			ChocolateSouffleWarningText.setVisible(false);
			if (Main.ChocolateSouffle.getCount()>0) {
				
				Main.ChocolateSouffle.setCount(Main.ChocolateSouffle.getCount() - 1);
				Main.ChocolateSouffle.setStock(Main.ChocolateSouffle.getStock() + 1);
				
				String ChocolateSouffleRealCount = Integer.toString(Main.ChocolateSouffle.getCount());
				ChocolateSouffleCountLabel.setText(ChocolateSouffleRealCount);
				LaunchPage.Orders.remove("Chocolate Souffle");
				
				LaunchPage.totalPrice -= Main.ChocolateSouffle.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
	}
}

