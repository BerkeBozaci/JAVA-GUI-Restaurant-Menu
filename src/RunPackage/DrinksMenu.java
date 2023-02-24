package RunPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DrinksMenu implements ActionListener{
	
	//WindowFrame
	JFrame DrinksMenuWindow = new JFrame();
	
	//Back button
	JButton Back = new JButton();
	
	//Label For Title Soups
	JLabel DrinksLabel = new JLabel();
	
	//Total Price for everything label to string for showing in label
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	
	//Label for totalPrice
	JLabel TotalPriceLabel = new JLabel();
	JLabel TotalPriceTextLabel = new JLabel();

	JLabel BeloweigthteenWarning = new JLabel();
	
	//Creating Cola
	JLabel ColaLabel = new JLabel();
	JLabel ColaInfo = new JLabel();
	JLabel ColaInfo1 = new JLabel();
	JLabel ColaPriceInfo = new JLabel();

	JButton plusCola = new JButton();
	JButton minusCola = new JButton();
	
	String ColaPrice = Double.toString(Main.Cola.getPrice());
	String ColaRealCount = Integer.toString(Main.Cola.getCount());
	
	JLabel ColaCountLabel = new JLabel();
	JLabel ColaWarningText = new JLabel();
	
	ImageIcon cokeImage = new ImageIcon("ImageFolder/cola.PNG");
	JLabel ColaImageLabel = new JLabel();
	
	//Creating Sprite
	JLabel SpriteLabel = new JLabel();
	JLabel SpriteInfo = new JLabel();
	JLabel SpriteInfo1 = new JLabel();
	JLabel SpritePriceInfo = new JLabel();

	
	JButton plusSprite = new JButton();
	JButton minusSprite = new JButton();
	
	String SpritePrice = Double.toString(Main.Sprite.getPrice());
	String SpriteRealCount = Integer.toString(Main.Sprite.getCount());
	
	JLabel SpriteCountLabel = new JLabel();
	JLabel SpriteWarningText = new JLabel();
	
	ImageIcon spriteImage = new ImageIcon("ImageFolder/canofsprite.PNG");
	JLabel SpriteImageLabel = new JLabel();
	
	//Creating Water
	JLabel WaterLabel = new JLabel();
	JLabel WaterInfo = new JLabel();
	JLabel WaterInfo1 = new JLabel();
	JLabel WaterPriceInfo = new JLabel();

	
	JButton plusWater = new JButton();
	JButton minusWater= new JButton();
	
	String WaterPrice = Double.toString(Main.Water.getPrice());
	String WaterRealCount = Integer.toString(Main.Water.getCount());
	
	JLabel WaterCountLabel = new JLabel();
	JLabel WaterWarningText = new JLabel();
	
	ImageIcon WaterImage = new ImageIcon("ImageFolder/bottleofwater.PNG");
	JLabel WaterImageLabel = new JLabel();
	
	//Creating Red Wine
	JLabel RedWineLabel = new JLabel();
	JLabel RedWineInfo = new JLabel();
	JLabel RedWineInfo1 = new JLabel();
	JLabel RedWinePriceInfo = new JLabel();

	
	JButton plusRedWine = new JButton();
	JButton minusRedWine = new JButton();
	
	String RedWinePrice = Double.toString(Main.RedWine.getPrice());
	String RedWineRealCount = Integer.toString(Main.RedWine.getCount());
	
	JLabel RedWineCountLabel = new JLabel();
	JLabel RedWineWarningText = new JLabel();
	
	ImageIcon RedWineImage = new ImageIcon("ImageFolder/redd.PNG");
	JLabel RedWineImageLabel = new JLabel();
	
	//Creating White Wine
	JLabel WhiteWineLabel = new JLabel();
	JLabel WhiteWineInfo = new JLabel();
	JLabel WhiteWineInfo1 = new JLabel();
	JLabel WhiteWinePriceInfo = new JLabel();
	
	
	JButton plusWhiteWine = new JButton();
	JButton minusWhiteWine = new JButton();
	
	String WhiteWinePrice = Double.toString(Main.WhiteWine.getPrice());
	String WhiteWineRealCount = Integer.toString(Main.WhiteWine.getCount());
	
	JLabel WhiteWineCountLabel = new JLabel();
	JLabel WhiteWineWarningText = new JLabel();
	
	ImageIcon WhiteWineImage = new ImageIcon("ImageFolder/whitewine.PNG");
	JLabel WhiteWineImageLabel = new JLabel();
	
	//Creating Special Craft Beer 
	JLabel SpecialCraftBeerLabel = new JLabel();
	JLabel SpecialCraftBeerInfo = new JLabel();
	JLabel SpecialCraftBeerInfo1 = new JLabel();
	JLabel SpecialCraftBeerPriceInfo = new JLabel();

	
	JButton plusSpecialCraftBeer = new JButton();
	JButton minusSpecialCraftBeer= new JButton();
	
	String SpecialCraftBeerPrice = Double.toString(Main.SpecialCraftBeer.getPrice());
	String SpecialCraftBeerRealCount = Integer.toString(Main.SpecialCraftBeer.getCount());
	
	JLabel SpecialCraftBeerCountLabel = new JLabel();
	JLabel SpecialCraftBeerWarningText = new JLabel();
	
	ImageIcon SpecialCraftBeerImage = new ImageIcon("ImageFolder/craftbeer.PNG");
	JLabel SpecialCraftBeerImageLabel = new JLabel();
	
	DrinksMenu(){
		
		
		LabelCreator(BeloweigthteenWarning, "You are not allowed to drink alcoholic drinks! ",1000,9000,300,45,15);
		BeloweigthteenWarning.setVisible(false);
		
		LabelCreator(TotalPriceTextLabel, "Total Price: ",1300,40,300,45,15);
		LabelCreator(DrinksLabel, "Drinks", 875,20,150,50,20);
		ButtonCreator(Back, "Back", 0,0,100,20);
		LabelCreator(TotalPriceLabel, TotalPrice, 1400,40,45,45,15);
		
		//For Cola
		LabelCreator(ColaLabel, "Cola: ", 175,150,300,50,18);
		LabelCreator(ColaPriceInfo, ColaPrice, 240,155,45,45,15);
		LabelCreator(ColaCountLabel, ColaRealCount, 760,130,45,45,18);
		
		LabelCreator(ColaWarningText, "Sorry there is no Cola left.", 215, 225, 600,80,18);
		ColaWarningText.setVisible(false);
		
		ButtonCreator(plusCola, "+", 790,130,45,45);
		ButtonCreator(minusCola, "-", 700,130,45,45);
		
		ColaImageLabel.setIcon(cokeImage);
		ColaImageLabel.setBounds(50,5,400,400);
		ColaImageLabel.setVisible(true);
		DrinksMenuWindow.add(ColaImageLabel);
		
		
		//For Sprite
		LabelCreator(SpriteLabel, "Sprite: ", 175,380,300,50,18);
		LabelCreator(SpritePriceInfo, SpritePrice, 280,385,45,45,15);
		LabelCreator(SpriteCountLabel, SpriteRealCount, 760,365,45,45,18);
		
		LabelCreator(SpriteWarningText, "Sorry there is no Sprite left.", 215, 455, 600,80,18);
		SpriteWarningText.setVisible(false);
		
		ButtonCreator(plusSprite, "+", 790,365,45,45);
		ButtonCreator(minusSprite, "-", 700,365,45,45);
		
		SpriteImageLabel.setIcon(spriteImage);
		SpriteImageLabel.setBounds(50,275,400,400);
		SpriteImageLabel.setVisible(true);
		DrinksMenuWindow.add(SpriteImageLabel);
		
		//For Water
		LabelCreator(WaterLabel, "Water: ", 175,650,300,50,18);
		LabelCreator(WaterPriceInfo, WaterPrice, 300,655,45,45, 15);
		LabelCreator(WaterCountLabel, WaterRealCount, 760,670,45,45,18);
		
		LabelCreator(WaterWarningText, "Sorry there is no Water left.", 215, 725, 600,80,18);
		WaterWarningText.setVisible(false);
		
		ButtonCreator(plusWater, "+", 790,670,45,45);
		ButtonCreator(minusWater, "-", 700,670,45,45);
		
		WaterImageLabel.setIcon(WaterImage);
		WaterImageLabel.setBounds(50,550,400,400);
		WaterImageLabel.setVisible(true);
		DrinksMenuWindow.add(WaterImageLabel);
		
		//For Red Wine
		LabelCreator(RedWineLabel, "Red Wine: ", 1300,100,300,50,18);
		LabelCreator(RedWineInfo, "Select your best fitted wines ", 1300,110,600,80,14);
		LabelCreator(RedWineInfo1, "with your courses by experts.", 1300,125,600,80,14);
		LabelCreator(RedWinePriceInfo, RedWinePrice, 1400,105,45,45,15);
		LabelCreator(RedWineCountLabel, RedWineRealCount, 1660,130,45,45,18);
		
		LabelCreator(RedWineWarningText, "Sorry there is no Red Wine left.", 1290, 175, 600,80,18);
		RedWineWarningText.setVisible(false);
		
		ButtonCreator(plusRedWine, "+", 1690,130,45,45);
		ButtonCreator(minusRedWine, "-", 1600,130,45,45);
		
		RedWineImageLabel.setIcon(RedWineImage);
		RedWineImageLabel.setBounds(900,5,400,400);
		RedWineImageLabel.setVisible(true);
		DrinksMenuWindow.add(RedWineImageLabel);
		
		//For White Wine
		LabelCreator(WhiteWineLabel, "White Wine: ", 1250,390,300,50,18);
		LabelCreator(WhiteWineInfo, "Select your best fitted wines ", 1250,405,600,80, 14);
		LabelCreator(WhiteWineInfo1, "with your courses by experts.", 1250,420,600,80, 14);
		LabelCreator(WhiteWinePriceInfo, WhiteWinePrice, 1400,395,45,45,15);
		LabelCreator(WhiteWineCountLabel, WhiteWineRealCount, 1660,400,45,45,18);
		
		LabelCreator(WhiteWineWarningText, "Sorry there is no White Wine left.", 1290, 465, 600,80,18);
		WhiteWineWarningText.setVisible(false);
		
		ButtonCreator(plusWhiteWine, "+", 1690,400,45,45);
		ButtonCreator(minusWhiteWine, "-", 1600,400,45,45);
		
		WhiteWineImageLabel.setIcon(WhiteWineImage);
		WhiteWineImageLabel.setBounds(900,300,400,400);
		WhiteWineImageLabel.setVisible(true);
		DrinksMenuWindow.add(WhiteWineImageLabel);
		
		
		//For Special Craft Beer 
		LabelCreator(SpecialCraftBeerLabel, "Special Craft Beer: ", 1300,670,300,50,18);
		LabelCreator(SpecialCraftBeerInfo, "Find your taste with different ", 1300,700,600,80, 14);
		LabelCreator(SpecialCraftBeerInfo1, "kind of our special craft beers.", 1300,715,600,80, 14);
		LabelCreator(SpecialCraftBeerPriceInfo, SpecialCraftBeerPrice, 1500,675,45,45,15);
		LabelCreator(SpecialCraftBeerCountLabel, SpecialCraftBeerRealCount, 1660,720,45,45,18);
		
		LabelCreator(SpecialCraftBeerWarningText, "Sorry there is no Special Craft Beer left.", 1340, 745, 600,80,18);
		SpecialCraftBeerWarningText.setVisible(false);
		
		ButtonCreator(plusSpecialCraftBeer, "+", 1690,720,45,45);
		ButtonCreator(minusSpecialCraftBeer, "-", 1600,720,45,45);
		
		SpecialCraftBeerImageLabel.setIcon(SpecialCraftBeerImage);
		SpecialCraftBeerImageLabel.setBounds(900,550,400,400);
		SpecialCraftBeerImageLabel.setVisible(true);
		DrinksMenuWindow.add(SpecialCraftBeerImageLabel);
		
		
		DrinksMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrinksMenuWindow.setSize(1800,1000);
		DrinksMenuWindow.setResizable(false);
		DrinksMenuWindow.setLayout(null);
		DrinksMenuWindow.setVisible(true);
	}
	
	//Method for creating Labels
	void LabelCreator(JLabel name, String text, int x_cor, int y_cor, int length, int height, int punto) {
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setVisible(true);
		name.setFont(new Font("Verdana", Font.PLAIN, punto));
		DrinksMenuWindow.add(name);
	}
	
	//Method for creating buttons 
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		DrinksMenuWindow.add(name);
	}
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Back) {
			MenuPage BackToSession = new MenuPage();
			DrinksMenuWindow.setVisible(false);
		}
		
		else if (e.getSource() == plusCola) {
			if (Main.Cola.getStock()>0) {
					
				Main.Cola.setCount(Main.Cola.getCount() + 1);
				Main.Cola.setStock(Main.Cola.getStock() - 1);
					
				String ColaRealCount = Integer.toString(Main.Cola.getCount());
				ColaCountLabel.setText(ColaRealCount);
				LaunchPage.Orders.add("Cola");
						
				LaunchPage.totalPrice += Main.Cola.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				ColaWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusCola) {
			ColaWarningText.setVisible(false);
			if (Main.Cola.getCount()>0) {
				
				Main.Cola.setCount(Main.Cola.getCount() - 1);
				Main.Cola.setStock(Main.Cola.getStock() + 1);
				
				String ColaRealCount = Integer.toString(Main.Cola.getCount());
				ColaCountLabel.setText(ColaRealCount);
				LaunchPage.Orders.remove("Cola");
				
				LaunchPage.totalPrice -= Main.Cola.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusSprite) {
			if (Main.Sprite.getStock()>0) {
					
				Main.Sprite.setCount(Main.Sprite.getCount() + 1);
				Main.Sprite.setStock(Main.Sprite.getStock() - 1);
					
				String SpriteRealCount = Integer.toString(Main.Sprite.getCount());
				SpriteCountLabel.setText(SpriteRealCount);
				LaunchPage.Orders.add("Sprite");
				
				LaunchPage.totalPrice += Main.Sprite.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);				
			}
			else {
				SpriteWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusSprite) {
			SpriteWarningText.setVisible(false);
			if (Main.Sprite.getCount()>0) {
				
				Main.Sprite.setCount(Main.Sprite.getCount() - 1);
				Main.Sprite.setStock(Main.Sprite.getStock() + 1);
				
				String SpriteRealCount = Integer.toString(Main.Sprite.getCount());
				SpriteCountLabel.setText(SpriteRealCount);
				LaunchPage.Orders.remove("Sprite");
				
				LaunchPage.totalPrice -= Main.Sprite.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusWater) {
			if (Main.Water.getStock()>0) {
					
				Main.Water.setCount(Main.Water.getCount() + 1);
				Main.Water.setStock(Main.Water.getStock() - 1);
					
				String WaterRealCount = Integer.toString(Main.Water.getCount());
				WaterCountLabel.setText(WaterRealCount);
				LaunchPage.Orders.add("Water");
				
				LaunchPage.totalPrice += Main.Water.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				WaterWarningText.setVisible(true);
			}
			
		}
		else if (e.getSource()==minusWater) {
			WaterWarningText.setVisible(false);
			if (Main.Water.getCount()>0) {
				
				Main.Water.setCount(Main.Water.getCount() - 1);
				Main.Water.setStock(Main.Water.getStock() + 1);
				
				String WaterRealCount = Integer.toString(Main.Water.getCount());
				WaterCountLabel.setText(WaterRealCount);
				LaunchPage.Orders.remove("Water");
				
				LaunchPage.totalPrice -= Main.Water.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusRedWine) {
			if (Main.RedWine.getStock()>0) {	
				Main.RedWine.setCount(Main.RedWine.getCount() + 1);
				Main.RedWine.setStock(Main.RedWine.getStock() - 1);
					
				String RedWineRealCount = Integer.toString(Main.RedWine.getCount());
				RedWineCountLabel.setText(RedWineRealCount);
				LaunchPage.Orders.add("Red Wine");
				
				LaunchPage.totalPrice += Main.RedWine.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);	
				}
			else {
				RedWineWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusRedWine) {
			RedWineWarningText.setVisible(false);
			if (Main.RedWine.getCount()>0) {
				
				Main.RedWine.setCount(Main.RedWine.getCount() - 1);
				Main.RedWine.setStock(Main.RedWine.getStock() + 1);
				
				String RedWineRealCount = Integer.toString(Main.RedWine.getCount());
				RedWineCountLabel.setText(RedWineRealCount);
				LaunchPage.Orders.remove("Red Wine");
				
				LaunchPage.totalPrice -= Main.RedWine.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusWhiteWine) {
			if (Main.WhiteWine.getStock()>0) {
					
				Main.WhiteWine.setCount(Main.WhiteWine.getCount() + 1);
				Main.WhiteWine.setStock(Main.WhiteWine.getStock() - 1);
					
				String WhiteWineRealCount = Integer.toString(Main.WhiteWine.getCount());
				WhiteWineCountLabel.setText(WhiteWineRealCount);
				LaunchPage.Orders.add("White Wine");
				
				LaunchPage.totalPrice += Main.WhiteWine.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				WhiteWineWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusWhiteWine) {
			WhiteWineWarningText.setVisible(false);
			if (Main.WhiteWine.getCount()>0) {
				
				Main.WhiteWine.setCount(Main.WhiteWine.getCount() - 1);
				Main.WhiteWine.setStock(Main.WhiteWine.getStock() + 1);
				
				String WhiteWineRealCount = Integer.toString(Main.WhiteWine.getCount());
				WhiteWineCountLabel.setText(WhiteWineRealCount);
				LaunchPage.Orders.remove("White Wine");
				
				LaunchPage.totalPrice -= Main.WhiteWine.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusSpecialCraftBeer) {
			if (Main.SpecialCraftBeer.getStock()>0) {
					
				Main.SpecialCraftBeer.setCount(Main.SpecialCraftBeer.getCount() + 1);
				Main.SpecialCraftBeer.setStock(Main.SpecialCraftBeer.getStock() - 1);
					
				String SpecialCraftBeerRealCount = Integer.toString(Main.SpecialCraftBeer.getCount());
				SpecialCraftBeerCountLabel.setText(SpecialCraftBeerRealCount);
				LaunchPage.Orders.add("Special Craft Beer Wine");
				
				LaunchPage.totalPrice += Main.SpecialCraftBeer.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
				
			}
			else {
				SpecialCraftBeerWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusSpecialCraftBeer) {
			SpecialCraftBeerWarningText.setVisible(false);
			if (Main.SpecialCraftBeer.getCount()>0) {
				
				Main.SpecialCraftBeer.setCount(Main.SpecialCraftBeer.getCount() - 1);
				Main.SpecialCraftBeer.setStock(Main.SpecialCraftBeer.getStock() + 1);
				
				String SpecialCraftBeerRealCount = Integer.toString(Main.SpecialCraftBeer.getCount());
				SpecialCraftBeerCountLabel.setText(SpecialCraftBeerRealCount);
				LaunchPage.Orders.remove("Special Craft Beer Wine");
				
				LaunchPage.totalPrice -= Main.SpecialCraftBeer.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
	}
}
