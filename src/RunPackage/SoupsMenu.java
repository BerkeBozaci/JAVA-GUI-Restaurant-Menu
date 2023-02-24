package RunPackage;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class SoupsMenu implements ActionListener{
	
	
	//Back button
	JButton Back = new JButton();
	
	//WindowFrame
	JFrame SoupsMenuWindow = new JFrame();
	//ImageIcon BackGround = new ImageIcon("ImageFolder/chickennoodlsoup.PNG");
	//Label For Title Soups
	JLabel SoupsLabel = new JLabel();
	JLabel TotalPriceTextLabel = new JLabel();

	//Image, Text and buttons of ChickenNoodleSoup
	
	JLabel ChickenLabel = new JLabel(); //Title
	JLabel ChickenInfo = new JLabel(); //Info Text
	JLabel ChickenInfo1 = new JLabel(); //Info Text
	JLabel ChickenPriceInfo = new JLabel(); //Price Text
	JLabel ChickenImageLabel = new JLabel(); //Image
	
	JButton plusChickenNoodle = new JButton(); //Plus Button
	JButton minusChickenNoodle = new JButton(); //Minus Button
	
	String ChickenPrice = Double.toString(Main.ChickenNoodleSoup.getPrice());
	JLabel ChickenNoodleSoupWarningText = new JLabel();
	
	ImageIcon ChickenNoodleSoupImage = new ImageIcon("ImageFolder/chickennoodlsoup.PNG");
	JLabel ChickenNoodleSoupImageLabel = new JLabel();
	
	//Miso Soup Labels and buttons
	JLabel MisoSoupLabel = new JLabel();
	JLabel MisoSoupInfo = new JLabel();
	JLabel MisoSoupInfo1 = new JLabel();
	JLabel MisoSoupInfo2 = new JLabel();
	JLabel MisoSoupPriceInfo = new JLabel();

	
	JButton plusMisoSoup = new JButton();
	JButton minusMisoSoup = new JButton();
	
	String MisoPrice = Double.toString(Main.MisoSoup.getPrice());
	
	String MisoSoupRealCount = Integer.toString(Main.MisoSoup.getCount());
	
	JLabel MisoSoupCountLabel = new JLabel();
	JLabel MisoSoupWarningText = new JLabel();
	
	ImageIcon MisoSoupImage = new ImageIcon("ImageFolder/miso.PNG");
	JLabel MisoSoupImageLabel = new JLabel();
	
	//Patato Soup Item
	JLabel PatatoSoupLabel = new JLabel();
	JLabel PatatoSoupInfo = new JLabel();
	JLabel PatatoSoupInfo1 = new JLabel();
	JLabel PatatoSoupPriceInfo = new JLabel();

	
	JButton plusPatatoSoup = new JButton();
	JButton minusPatatoSoup = new JButton();
	
	String PatatoPrice = Double.toString(Main.PatatoSoup.getPrice());
	String PatatoRealCount = Integer.toString(Main.PatatoSoup.getCount());
	
	JLabel PatatoSoupCountLabel = new JLabel();
	JLabel PatatoSoupWarningText = new JLabel();
	
	ImageIcon PatatoSoupImage = new ImageIcon("ImageFolder/patato.PNG");
	JLabel PatatoSoupImageLabel = new JLabel();
	
	//Tomato Soup Item
	JLabel TomatoSoupLabel = new JLabel();
	JLabel TomatoSoupInfo = new JLabel();
	JLabel TomatoSoupInfo1 = new JLabel();
	JLabel TomatoSoupInfo2 = new JLabel();
	JLabel TomatoSoupPriceInfo = new JLabel();

	
	JButton plusTomatoSoup = new JButton();
	JButton minusTomatoSoup = new JButton();
	
	String TomatoPrice = Double.toString(Main.TomatoSoup.getPrice());
	String TomatoRealCount = Integer.toString(Main.TomatoSoup.getCount());
	
	JLabel TomatoSoupCountLabel = new JLabel();
	JLabel TomatoSoupWarningText = new JLabel();
	
	ImageIcon TomatoSoupImage = new ImageIcon("ImageFolder/tomato.PNG");
	JLabel TomatoSoupImageLabel = new JLabel();
	
	//Chef's Special Soup Item
	JLabel ChefsSpecialSoupLabel = new JLabel();
	JLabel ChefsSpecialSoupInfo = new JLabel();
	JLabel ChefsSpecialSoupInfo1 = new JLabel();
	JLabel ChefsSpecialSoupPriceInfo = new JLabel();
	
	JButton plusChefsSpecialSoup = new JButton();
	JButton minusChefsSpecialSoup = new JButton();
		
	String ChefsSpecialSoupPrice = Double.toString(Main.ChefsSpecialSoup.getPrice());
	String ChefsSpecialSoupRealCount = Integer.toString(Main.ChefsSpecialSoup.getCount());
		
	JLabel ChefsSpecialSoupCountLabel = new JLabel();
	JLabel ChefsSpecialSoupWarningText = new JLabel();
	
	ImageIcon ChefsSpecialSoupImage = new ImageIcon("ImageFolder/kelle.PNG");
	JLabel ChefsSpecialSoupImageLabel = new JLabel();
	
	//Total Price for everything label to string for showing in label
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	
	//Total count of sales of ChickenNoodleSoup to string for showing in label 
	String CNSrealCount = Integer.toString(Main.ChickenNoodleSoup.getCount());
	
	//Label for totalPrice
	JLabel TotalPriceLabel = new JLabel();
	
	//Labels for Counts of  types of soups
	JLabel CNScountLabel = new JLabel();
	
	
	SoupsMenu(){
		
		LabelCreator(TotalPriceTextLabel, "Total Price: ",1300,40,300,45,15);
		//Creating Labels with LabelCreator method
		LabelCreator(SoupsLabel, "Soups", 875,20,150,50,20);
		
		//Labels For Chicken Noodle Soup
		LabelCreator(ChickenLabel, "Chicken Noodle Soup: ", 300,100,300,50,18);
		LabelCreator(ChickenInfo, "Simply made with egg noodles and bits of chicken ", 300,110,600,80, 14);
		LabelCreator(ChickenInfo1, "with vegetables cooked in a chicken stock.", 300,125,600,80, 14);
		LabelCreator(ChickenPriceInfo, ChickenPrice, 550,105,45,45,15);
		LabelCreator(CNScountLabel, CNSrealCount, 760,130,45,45,18);
		
		LabelCreator(ChickenNoodleSoupWarningText, "Sorry there is no Chicken Noodle Soup left.", 300, 175, 600,80,18);
		ChickenNoodleSoupWarningText.setVisible(false);
		
		ChickenNoodleSoupImageLabel.setIcon(ChickenNoodleSoupImage);
		ChickenNoodleSoupImageLabel.setBounds(50,5,400,400);
		ChickenNoodleSoupImageLabel.setVisible(true);
		SoupsMenuWindow.add(ChickenNoodleSoupImageLabel);
		
		LabelCreator(TotalPriceLabel, TotalPrice, 1400,40,45,45,15);
		
		//Labels for Miso Soup
		LabelCreator(MisoSoupLabel, "Miso Soup: ", 300,350,300,50,18);
		LabelCreator(MisoSoupInfo, "Traditional Japanese soup consisting of a dashi ", 300,360,600,80, 14);
		LabelCreator(MisoSoupInfo1, "stock into which softened miso paste is mixed.", 300,375,600,80, 14);
		LabelCreator(MisoSoupInfo2, "(with optional ingredients vegetables, tofu, abura-age.)", 300,390,600,80, 14);
		LabelCreator(MisoSoupPriceInfo, MisoPrice, 500,355,45,45,15);
		LabelCreator(MisoSoupCountLabel, MisoSoupRealCount, 760,385,45,45,18);
		
		LabelCreator(MisoSoupWarningText, "Sorry there is no Miso Soup left.", 300, 420, 600,80,18);
		MisoSoupWarningText.setVisible(false);
		
		MisoSoupImageLabel.setIcon(MisoSoupImage);
		MisoSoupImageLabel.setBounds(50,275,400,400);
		MisoSoupImageLabel.setVisible(true);
		SoupsMenuWindow.add(MisoSoupImageLabel);
		
		//Labels for Patato Soup
		LabelCreator(PatatoSoupLabel, "Patato Soup: ", 300,650,300,50,18);
		LabelCreator(PatatoSoupInfo, "Thick chunky soup mainly made with potatoes and milk ", 300,660,600,80, 14);
		LabelCreator(PatatoSoupInfo1, "together with optional vegetables and seasonings.", 300,675,600,80, 14);
		LabelCreator(PatatoSoupPriceInfo, PatatoPrice, 500,655,45,45,15);
		LabelCreator(PatatoSoupCountLabel, PatatoRealCount, 760,675,45,45,18);
		
		LabelCreator(PatatoSoupWarningText, "Sorry there is no Patato Soup left.", 300, 750, 600,80,18);
		PatatoSoupWarningText.setVisible(false);
		
		PatatoSoupImageLabel.setIcon(PatatoSoupImage);
		PatatoSoupImageLabel.setBounds(50,550,400,400);
		PatatoSoupImageLabel.setVisible(true);
		SoupsMenuWindow.add(PatatoSoupImageLabel);
		
		//Labels for Tomato Soup
		LabelCreator(TomatoSoupLabel, "Tomato Soup: ", 1150,100,300,50,18);
		LabelCreator(TomatoSoupInfo, "Chunks of tomato, cream, chicken or vegetable stock,  ", 1150,110,600,80, 14);
		LabelCreator(TomatoSoupInfo1, "vermicelli and chunks of other vegetables. ", 1150,125,600,80, 14);
		LabelCreator(TomatoSoupInfo2, "(with optional topping: shredded cheese.)", 1150,140,600,80, 14);
		LabelCreator(TomatoSoupPriceInfo, TomatoPrice, 1300,105,45,45,15);
		LabelCreator(TomatoSoupCountLabel, TomatoRealCount, 1660,130,45,45,18);
		
		LabelCreator(TomatoSoupWarningText, "Sorry there is no Tomato Soup left.", 1150, 175, 600,80,18);
		TomatoSoupWarningText.setVisible(false);
		
		TomatoSoupImageLabel.setIcon(TomatoSoupImage);
		TomatoSoupImageLabel.setBounds(900,5,400,400);
		TomatoSoupImageLabel.setVisible(true);
		SoupsMenuWindow.add(TomatoSoupImageLabel);
		
		//Labels for Chef's Special Soup
		LabelCreator(ChefsSpecialSoupLabel, "Chef's Special Soup: ", 1200,400,300,50,18);
		LabelCreator(ChefsSpecialSoupInfo, "Very healthy, Turkish style special soup,", 1200,430,600,80, 14);
		LabelCreator(ChefsSpecialSoupInfo1, "made from lamb's head and feet", 1200,445,600,80, 14);
		LabelCreator(ChefsSpecialSoupPriceInfo, ChefsSpecialSoupPrice, 1400,405,45,45,15);
		LabelCreator(ChefsSpecialSoupCountLabel, ChefsSpecialSoupRealCount, 1660,430,45,45,18);
		
		LabelCreator(ChefsSpecialSoupWarningText, "Sorry there is no Chef's Special Soup left.", 1200, 475, 600,80,18);
		ChefsSpecialSoupWarningText.setVisible(false);
		
		ChefsSpecialSoupImageLabel.setIcon(ChefsSpecialSoupImage);
		ChefsSpecialSoupImageLabel.setBounds(900,300,400,400);
		ChefsSpecialSoupImageLabel.setVisible(true);
		SoupsMenuWindow.add(ChefsSpecialSoupImageLabel);
		
		//Creating Buttons with ButtonCreator method
		ButtonCreator(Back, "Back", 0,0,100,20);
		
		ButtonCreator(plusChickenNoodle, "+", 790,130,45,45);
		ButtonCreator(minusChickenNoodle, "-", 700,130,45,45);
		
		ButtonCreator(plusMisoSoup, "+", 790,385,45,45);
		ButtonCreator(minusMisoSoup, "-", 700,385,45,45);
		
		ButtonCreator(plusPatatoSoup, "+", 790,675,45,45);
		ButtonCreator(minusPatatoSoup, "-", 700,675,45,45);
		
		ButtonCreator(plusTomatoSoup, "+", 1690,130,45,45);
		ButtonCreator(minusTomatoSoup, "-", 1600,130,45,45);
		
		ButtonCreator(plusChefsSpecialSoup, "+", 1690,430,45,45);
		ButtonCreator(minusChefsSpecialSoup, "-", 1600,430,45,45);
		
		
		//Editing features of SoupsMenuWindow
		SoupsMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SoupsMenuWindow.setSize(1800,1000);
		SoupsMenuWindow.setResizable(false);
		SoupsMenuWindow.setLayout(null);
		SoupsMenuWindow.setVisible(true);
		
	}
	
	//Method for creating labels with texts not images
	void LabelCreator(JLabel name, String text, int x_cor, int y_cor, int length, int height, int punto) {
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setVisible(true);
		name.setFont(new Font("Verdana", Font.PLAIN, punto));
		SoupsMenuWindow.add(name);
	}
	
	//Method for creating buttons 
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		SoupsMenuWindow.add(name);
	}
	 
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			MenuPage BackToSession = new MenuPage();
			SoupsMenuWindow.setVisible(false);
		}
		else if (e.getSource() == plusChickenNoodle) {
			if (Main.ChickenNoodleSoup.getStock()>0) {
					
				Main.ChickenNoodleSoup.setCount(Main.ChickenNoodleSoup.getCount() + 1);
				Main.ChickenNoodleSoup.setStock(Main.ChickenNoodleSoup.getStock() - 1);
					
				String CNSrealCount = Integer.toString(Main.ChickenNoodleSoup.getCount());
				CNScountLabel.setText(CNSrealCount);
				LaunchPage.Orders.add("Chicken Noodle Soup");
				
				LaunchPage.totalPrice += Main.ChickenNoodleSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				ChickenNoodleSoupWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusChickenNoodle) {
			ChickenNoodleSoupWarningText.setVisible(false);
			if (Main.ChickenNoodleSoup.getCount()>0) {
				
				Main.ChickenNoodleSoup.setCount(Main.ChickenNoodleSoup.getCount() - 1);
				Main.ChickenNoodleSoup.setStock(Main.ChickenNoodleSoup.getStock() + 1);
				
				String CNSrealCount = Integer.toString(Main.ChickenNoodleSoup.getCount());
				CNScountLabel.setText(CNSrealCount);
				LaunchPage.Orders.remove("Chicken Noodle Soup");
				
				LaunchPage.totalPrice -= Main.ChickenNoodleSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusMisoSoup) {
			if (Main.MisoSoup.getStock()>0) {
					
				Main.MisoSoup.setCount(Main.MisoSoup.getCount() + 1);
				Main.MisoSoup.setStock(Main.MisoSoup.getStock() - 1);
					
				String MisoSoupRealCount = Integer.toString(Main.MisoSoup.getCount());
				MisoSoupCountLabel.setText(MisoSoupRealCount);
				LaunchPage.Orders.add("Miso Soup");
				
				LaunchPage.totalPrice += Main.MisoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				MisoSoupWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusMisoSoup) {
			MisoSoupWarningText.setVisible(false);
			if (Main.MisoSoup.getCount()>0) {
				
				Main.MisoSoup.setCount(Main.MisoSoup.getCount() - 1);
				Main.MisoSoup.setStock(Main.MisoSoup.getStock() + 1);
				
				String MisoSoupRealCount = Integer.toString(Main.MisoSoup.getCount());
				MisoSoupCountLabel.setText(MisoSoupRealCount);
				LaunchPage.Orders.remove("Miso Soup");
				
				LaunchPage.totalPrice -= Main.MisoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusPatatoSoup) {
			if (Main.PatatoSoup.getStock()>0) {
					
				Main.PatatoSoup.setCount(Main.PatatoSoup.getCount() + 1);
				Main.PatatoSoup.setStock(Main.PatatoSoup.getStock() - 1);
					
				String PatatoRealCount = Integer.toString(Main.PatatoSoup.getCount());
				PatatoSoupCountLabel.setText(PatatoRealCount);
				LaunchPage.Orders.add("Patato Soup");
				
				LaunchPage.totalPrice += Main.PatatoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				PatatoSoupWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusPatatoSoup) {
			PatatoSoupWarningText.setVisible(false);
			if (Main.PatatoSoup.getCount()>0) {
				
				Main.PatatoSoup.setCount(Main.PatatoSoup.getCount() - 1);
				Main.PatatoSoup.setStock(Main.PatatoSoup.getStock() + 1);
				
				String PatatoRealCount = Integer.toString(Main.PatatoSoup.getCount());
				PatatoSoupCountLabel.setText(PatatoRealCount);
				LaunchPage.Orders.remove("Patato Soup");
				
				LaunchPage.totalPrice -= Main.PatatoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusTomatoSoup) {
			if (Main.TomatoSoup.getStock()>0) {
					
				Main.TomatoSoup.setCount(Main.TomatoSoup.getCount() + 1);
				Main.TomatoSoup.setStock(Main.TomatoSoup.getStock() - 1);
					
				String TomatoRealCount = Integer.toString(Main.TomatoSoup.getCount());
				TomatoSoupCountLabel.setText(TomatoRealCount);
				LaunchPage.Orders.add("Tomato Soup");
				
				LaunchPage.totalPrice += Main.TomatoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				TomatoSoupWarningText.setVisible(true);
			}
		}
		else if (e.getSource()== minusTomatoSoup) {
			TomatoSoupWarningText.setVisible(false);
			if (Main.TomatoSoup.getCount()>0) {
				
				Main.TomatoSoup.setCount(Main.TomatoSoup.getCount() - 1);
				Main.TomatoSoup.setStock(Main.TomatoSoup.getStock() + 1);
				
				String TomatoRealCount = Integer.toString(Main.TomatoSoup.getCount());
				TomatoSoupCountLabel.setText(TomatoRealCount);
				LaunchPage.Orders.remove("Tomato Soup");
				
				LaunchPage.totalPrice -= Main.TomatoSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusChefsSpecialSoup) {
			if (Main.ChefsSpecialSoup.getStock()>0) {
					
				Main.ChefsSpecialSoup.setCount(Main.ChefsSpecialSoup.getCount() + 1);
				Main.ChefsSpecialSoup.setStock(Main.ChefsSpecialSoup.getStock() - 1);
					
				String ChefsSpecialSoupRealCount = Integer.toString(Main.ChefsSpecialSoup.getCount());
				ChefsSpecialSoupCountLabel.setText(ChefsSpecialSoupRealCount);
				LaunchPage.Orders.add("Chef's Special Soup");
				
				LaunchPage.totalPrice += Main.ChefsSpecialSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				ChefsSpecialSoupWarningText.setVisible(true);
			}
		}
		else if (e.getSource()== minusChefsSpecialSoup) {
			ChefsSpecialSoupWarningText.setVisible(false);
			if (Main.ChefsSpecialSoup.getCount()>0) {
				
				Main.ChefsSpecialSoup.setCount(Main.ChefsSpecialSoup.getCount() - 1);
				Main.ChefsSpecialSoup.setStock(Main.ChefsSpecialSoup.getStock() + 1);
				
				String ChefsSpecialSoupRealCount = Integer.toString(Main.ChefsSpecialSoup.getCount());
				ChefsSpecialSoupCountLabel.setText(ChefsSpecialSoupRealCount);
				LaunchPage.Orders.remove("Chef's Special Soup");
				
				LaunchPage.totalPrice -= Main.ChefsSpecialSoup.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
	}
}