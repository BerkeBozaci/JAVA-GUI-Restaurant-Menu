package RunPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class SaladsMenu implements ActionListener{
	
	//WindowFrame
	JFrame SaladsMenuWindow = new JFrame();
	
	//Back button
	JButton Back = new JButton();
	
	//Label For Title Soups
	JLabel SaladsLabel = new JLabel();
	
	//Total Price for everything label to string for showing in label
	String TotalPrice = Double.toString(LaunchPage.totalPrice);
	
	//Label for totalPrice
	JLabel TotalPriceLabel = new JLabel();
	JLabel TotalPriceTextLabel = new JLabel();

	//Creating Caesar Salad
	JLabel CaesarSaladLabel = new JLabel();
	JLabel CaesarSaladInfo = new JLabel();
	JLabel CaesarSaladInfo1 = new JLabel();
	JLabel CaesarSaladPriceInfo = new JLabel();
	JLabel CaesarSaladInfo2 = new JLabel();
	
	JButton plusCaesarSalad = new JButton();
	JButton minusCaesarSalad = new JButton();
	
	String CaesarSaladPrice = Double.toString(Main.CaesarSalad.getPrice());
	String CaesarSaladRealCount = Integer.toString(Main.CaesarSalad.getCount());
	
	JLabel CaesarSaladCountLabel = new JLabel();
	JLabel CaesarSaladWarningText = new JLabel();
	
	ImageIcon CaesarSaladImage = new ImageIcon("ImageFolder/caesar.PNG");
	JLabel CaesarSaladImageLabel = new JLabel();
	
	//Creating Crab Salad
	JLabel CrabSaladLabel = new JLabel();
	JLabel CrabSaladInfo = new JLabel();
	JLabel CrabSaladInfo1 = new JLabel();
	JLabel CrabSaladPriceInfo = new JLabel();
	
	JButton plusCrabSalad = new JButton();
	JButton minusCrabSalad = new JButton();
	
	String CrabSaladPrice = Double.toString(Main.CrabSalad.getPrice());
	String CrabSaladRealCount = Integer.toString(Main.CrabSalad.getCount());
	
	JLabel CrabSaladCountLabel = new JLabel();
	JLabel CrabSaladWarningText = new JLabel();
	
	ImageIcon CrabSaladImage = new ImageIcon("ImageFolder/crab.PNG");
	JLabel CrabSaladImageLabel = new JLabel();
	
	//Creating Greek Salad
	JLabel GreekSaladLabel = new JLabel();
	JLabel GreekSaladInfo = new JLabel();
	JLabel GreekSaladInfo1 = new JLabel();
	JLabel GreekSaladPriceInfo = new JLabel();
	JLabel GreekSaladInfo2 = new JLabel();
	
	
	JButton plusGreekSalad = new JButton();
	JButton minusGreekSalad = new JButton();
	
	String GreekSaladPrice = Double.toString(Main.GreekSalad.getPrice());
	String GreekSaladRealCount = Integer.toString(Main.GreekSalad.getCount());
	
	JLabel GreekSaladCountLabel = new JLabel();
	JLabel GreekSaladWarningText = new JLabel();
	
	ImageIcon GreekSaladImage = new ImageIcon("ImageFolder/greek.PNG");
	JLabel GreekSaladImageLabel = new JLabel();
	
	//Creating Avacado Salad
	JLabel AvacadoSaladLabel = new JLabel();
	JLabel AvacadoSaladInfo = new JLabel();
	JLabel AvacadoSaladInfo1 = new JLabel();
	JLabel AvacadoSaladPriceInfo = new JLabel();

	
	JButton plusAvacadoSalad = new JButton();
	JButton minusAvacadoSalad = new JButton();
	
	String AvacadoSaladPrice = Double.toString(Main.AvacadoSalad.getPrice());
	String AvacadoSaladRealCount = Integer.toString(Main.AvacadoSalad.getCount());
	
	JLabel AvacadoSaladCountLabel = new JLabel();
	JLabel AvacadoSaladWarningText = new JLabel();
	
	ImageIcon AvacadoSaladImage = new ImageIcon("ImageFolder/avacado.PNG");
	JLabel AvacadoSaladImageLabel = new JLabel();
	
	//Creating Red Beet Salad
	JLabel RedBeetSaladLabel = new JLabel();
	JLabel RedBeetSaladInfo = new JLabel();
	JLabel RedBeetSaladInfo1 = new JLabel();
	JLabel RedBeetSaladPriceInfo = new JLabel();

	
	JButton plusRedBeetSalad = new JButton();
	JButton minusRedBeetSalad = new JButton();
	
	String RedBeetSaladPrice = Double.toString(Main.RedBeetSalad.getPrice());
	String RedBeetSaladRealCount = Integer.toString(Main.RedBeetSalad.getCount());
	
	JLabel RedBeetSaladCountLabel = new JLabel();
	JLabel RedBeetSaladWarningText = new JLabel();
	
	ImageIcon RedBeetSaladImage = new ImageIcon("ImageFolder/redbeet.PNG");
	JLabel RedBeetSaladImageLabel = new JLabel();
	
	SaladsMenu(){
		
		LabelCreator(TotalPriceTextLabel, "Total Price: ",1300,40,300,45,15);
		
		LabelCreator(SaladsLabel, "Salads", 875,20,150,50,20);
		ButtonCreator(Back, "Back", 0,0,100,20);
		LabelCreator(TotalPriceLabel, TotalPrice, 1400,40,45,45,15);
		
		//For Caesar Salad
		LabelCreator(CaesarSaladLabel, "Caesar Salad: ", 305,100,300,50,18);
		LabelCreator(CaesarSaladInfo, "Romaine lettuce and croutons dressed with lemon", 305,110,600,80, 14);
		LabelCreator(CaesarSaladInfo1, "juice, olive oil, egg, Worcestershire sauce, anchovies", 305,125,600,80, 14);
		LabelCreator(CaesarSaladInfo2, "garlic, Dijon mustard, Parmesan cheese, and black pepper.", 305,140,600,80, 14);
		LabelCreator(CaesarSaladPriceInfo, CaesarSaladPrice, 470,105,45,45,15);
		LabelCreator(CaesarSaladCountLabel, CaesarSaladRealCount, 760,130,45,45,18);
		
		LabelCreator(CaesarSaladWarningText, "Sorry there is no Caesar Salad left.", 350, 175, 600,80,18);
		CaesarSaladWarningText.setVisible(false);
		
		ButtonCreator(plusCaesarSalad, "+", 790,130,45,45);
		ButtonCreator(minusCaesarSalad, "-", 700,130,45,45);
		
		CaesarSaladImageLabel.setIcon(CaesarSaladImage);
		CaesarSaladImageLabel.setBounds(50,5,400,400);
		CaesarSaladImageLabel.setVisible(true);
		SaladsMenuWindow.add(CaesarSaladImageLabel);
		
		//For Crab Salad
		LabelCreator(CrabSaladLabel, "Crab Salad: ", 330,360,300,50,18);
		LabelCreator(CrabSaladInfo, "Dungeness Crab dressed with Louis dressing ", 330,380,600,80, 14);
		LabelCreator(CrabSaladInfo1, "in a bed of Iceberg lettuce.", 330,395,600,80, 14);
		LabelCreator(CrabSaladPriceInfo, CrabSaladPrice, 470,365,45,45,15);
		LabelCreator(CrabSaladCountLabel, CrabSaladRealCount, 760,380,45,45,18);
		
		LabelCreator(CrabSaladWarningText, "Sorry there is no Crab Salad left.", 350, 435, 600,80,18);
		CrabSaladWarningText.setVisible(false);
		
		ButtonCreator(plusCrabSalad, "+", 790,380,45,45);
		ButtonCreator(minusCrabSalad, "-", 700,380,45,45);
		
		CrabSaladImageLabel.setIcon(CrabSaladImage);
		CrabSaladImageLabel.setBounds(50,275,400,400);
		CrabSaladImageLabel.setVisible(true);
		SaladsMenuWindow.add(CrabSaladImageLabel);
		
		//For Greek Salad
		LabelCreator(GreekSaladLabel, "Greek Salad: ", 330,650,300,50,18);
		LabelCreator(GreekSaladInfo, "Tomatoes, cucumbers, onion, feta cheese, olives", 330,670,600,80, 14);
		LabelCreator(GreekSaladInfo1, "dressed with salt, pepper, Greek oregano, olive oil.", 330,685,600,80, 14);
		LabelCreator(GreekSaladPriceInfo, GreekSaladPrice, 460,655,45,45, 15);
		LabelCreator(GreekSaladCountLabel, GreekSaladRealCount, 760,680,45,45,18);
		
		LabelCreator(GreekSaladWarningText, "Sorry there is no Greek Salad left.", 350, 720, 600,80,18);
		GreekSaladWarningText.setVisible(false);
		
		ButtonCreator(plusGreekSalad, "+", 790,680,45,45);
		ButtonCreator(minusGreekSalad, "-", 700,680,45,45);
		
		GreekSaladImageLabel.setIcon(GreekSaladImage);
		GreekSaladImageLabel.setBounds(50,550,400,400);
		GreekSaladImageLabel.setVisible(true);
		SaladsMenuWindow.add(GreekSaladImageLabel);
		
		//For Avacado Salad
		LabelCreator(AvacadoSaladLabel, "Avacado Salad: ", 1175,100,300,50,18);
		LabelCreator(AvacadoSaladInfo, "Avacados, cucumber, tomatoes, onions", 1175,110,600,80,14);
		LabelCreator(AvacadoSaladInfo1, "dressed with lemon juice and red wine vinegar.", 1175,125,600,80,14);
		LabelCreator(AvacadoSaladPriceInfo, AvacadoSaladPrice, 1350,105,45,45,15);
		LabelCreator(AvacadoSaladCountLabel, AvacadoSaladRealCount, 1660,130,45,45,18);
		
		LabelCreator(AvacadoSaladWarningText, "Sorry there is no Avacado Salad left.", 1200, 175, 600,80,18);
		AvacadoSaladWarningText.setVisible(false);
		
		ButtonCreator(plusAvacadoSalad, "+", 1690,130,45,45);
		ButtonCreator(minusAvacadoSalad, "-", 1600,130,45,45);
		
		AvacadoSaladImageLabel.setIcon(AvacadoSaladImage);
		AvacadoSaladImageLabel.setBounds(900,5,400,400);
		AvacadoSaladImageLabel.setVisible(true);
		SaladsMenuWindow.add(AvacadoSaladImageLabel);
		
		//For Red Beet Salad
		LabelCreator(RedBeetSaladLabel, "Red Beet Salad: ", 1175,400,300,50,18);
		LabelCreator(RedBeetSaladInfo, "Boiled red beets with feta cheese ", 1175,420,600,80, 14);
		LabelCreator(RedBeetSaladInfo1, "and bell peppers with lemon juice.", 1175,435,600,80, 14);
		LabelCreator(RedBeetSaladPriceInfo, RedBeetSaladPrice, 1350,405,45,45,15);
		LabelCreator(RedBeetSaladCountLabel, RedBeetSaladRealCount, 1660,420,45,45,18);
		
		LabelCreator(RedBeetSaladWarningText, "Sorry there is no Red Beet Salad left.", 1200, 500, 600,80,18);
		RedBeetSaladWarningText.setVisible(false);
		
		ButtonCreator(plusRedBeetSalad, "+", 1690,420,45,45);
		ButtonCreator(minusRedBeetSalad, "-", 1600,420,45,45);
		
		RedBeetSaladImageLabel.setIcon(RedBeetSaladImage);
		RedBeetSaladImageLabel.setBounds(900,300,400,400);
		RedBeetSaladImageLabel.setVisible(true);
		SaladsMenuWindow.add(RedBeetSaladImageLabel);
		
		
		
		SaladsMenuWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SaladsMenuWindow.setSize(1800,1000);
		SaladsMenuWindow.setResizable(false);
		SaladsMenuWindow.setLayout(null);
		SaladsMenuWindow.setVisible(true);
	}
	
	//Method for creating labels
	void LabelCreator(JLabel name, String text, int x_cor, int y_cor, int length, int height, int punto) {
		name.setText(text);
		name.setBounds(x_cor, y_cor, length, height);
		name.setVisible(true);
		name.setFont(new Font("Verdana", Font.PLAIN, punto));
		SaladsMenuWindow.add(name);
	}
	
	//Method for creating buttons 
	void ButtonCreator(JButton name, String text, int x_cor, int y_cor, int length, int height){
		name.setText(text);
		name.setFont(new Font("Verdana", Font.PLAIN, 14));
		name.setBounds(x_cor, y_cor, length, height);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(true);
		SaladsMenuWindow.add(name);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Back) {
			MenuPage BackToSession = new MenuPage();
			SaladsMenuWindow.setVisible(false);
		}
		else if (e.getSource() == plusCaesarSalad) {
			if (Main.CaesarSalad.getStock()>0) {
					
				Main.CaesarSalad.setCount(Main.CaesarSalad.getCount() + 1);
				Main.CaesarSalad.setStock(Main.CaesarSalad.getStock() - 1);
					
				String CaesarSaladRealCount = Integer.toString(Main.CaesarSalad.getCount());
				CaesarSaladCountLabel.setText(CaesarSaladRealCount);
				LaunchPage.Orders.add("Caesar Salad");
					
				
				LaunchPage.totalPrice += Main.CaesarSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				CaesarSaladWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusCaesarSalad) {
			CaesarSaladWarningText.setVisible(false);
			if (Main.CaesarSalad.getCount()>0) {
				
				Main.CaesarSalad.setCount(Main.CaesarSalad.getCount() - 1);
				Main.CaesarSalad.setStock(Main.CaesarSalad.getStock() + 1);
				
				String CaesarSaladRealCount = Integer.toString(Main.CaesarSalad.getCount());
				CaesarSaladCountLabel.setText(CaesarSaladRealCount);
				LaunchPage.Orders.remove("Caesar Salad");
				
				LaunchPage.totalPrice -= Main.CaesarSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusCrabSalad) {
			if (Main.CrabSalad.getStock()>0) {
					
				Main.CrabSalad.setCount(Main.CrabSalad.getCount() + 1);
				Main.CrabSalad.setStock(Main.CrabSalad.getStock() - 1);
					
				String CrabSaladRealCount = Integer.toString(Main.CrabSalad.getCount());
				CrabSaladCountLabel.setText(CrabSaladRealCount);
				LaunchPage.Orders.add("Crab Salad");
				
				LaunchPage.totalPrice += Main.CrabSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				CrabSaladWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusCrabSalad) {
			CrabSaladWarningText.setVisible(false);
			if (Main.CrabSalad.getCount()>0) {
				
				Main.CrabSalad.setCount(Main.CrabSalad.getCount() - 1);
				Main.CrabSalad.setStock(Main.CrabSalad.getStock() + 1);
				
				String CrabSaladRealCount = Integer.toString(Main.CrabSalad.getCount());
				CrabSaladCountLabel.setText(CrabSaladRealCount);
				LaunchPage.Orders.remove("Crab Salad");
				
				LaunchPage.totalPrice -= Main.CrabSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusGreekSalad) {
			if (Main.GreekSalad.getStock()>0) {
					
				Main.GreekSalad.setCount(Main.GreekSalad.getCount() + 1);
				Main.GreekSalad.setStock(Main.GreekSalad.getStock() - 1);
					
				String GreekSaladRealCount = Integer.toString(Main.GreekSalad.getCount());
				GreekSaladCountLabel.setText(GreekSaladRealCount);
				LaunchPage.Orders.add("Greek Salad");
				
				LaunchPage.totalPrice += Main.GreekSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				GreekSaladWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusGreekSalad) {
			GreekSaladWarningText.setVisible(false);
			if (Main.GreekSalad.getCount()>0) {
				
				Main.GreekSalad.setCount(Main.GreekSalad.getCount() - 1);
				Main.GreekSalad.setStock(Main.GreekSalad.getStock() + 1);
				
				String GreekSaladRealCount = Integer.toString(Main.GreekSalad.getCount());
				GreekSaladCountLabel.setText(GreekSaladRealCount);
				LaunchPage.Orders.remove("Greek Salad");
				
				LaunchPage.totalPrice -= Main.GreekSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusAvacadoSalad) {
			if (Main.AvacadoSalad.getStock()>0) {
					
				Main.AvacadoSalad.setCount(Main.AvacadoSalad.getCount() + 1);
				Main.AvacadoSalad.setStock(Main.AvacadoSalad.getStock() - 1);
					
				String AvacadoSaladRealCount = Integer.toString(Main.AvacadoSalad.getCount());
				AvacadoSaladCountLabel.setText(AvacadoSaladRealCount);
				LaunchPage.Orders.add("Avacado Salad");
				
				LaunchPage.totalPrice += Main.AvacadoSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				AvacadoSaladWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusAvacadoSalad) {
			AvacadoSaladWarningText.setVisible(false);
			if (Main.AvacadoSalad.getCount()>0) {
				
				Main.AvacadoSalad.setCount(Main.AvacadoSalad.getCount() - 1);
				Main.AvacadoSalad.setStock(Main.AvacadoSalad.getStock() + 1);
				
				String AvacadoSaladRealCount = Integer.toString(Main.AvacadoSalad.getCount());
				AvacadoSaladCountLabel.setText(AvacadoSaladRealCount);
				LaunchPage.Orders.remove("Avacado Salad");
				
				LaunchPage.totalPrice -= Main.AvacadoSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
		else if (e.getSource() == plusRedBeetSalad) {
			if (Main.RedBeetSalad.getStock()>0) {
					
				Main.RedBeetSalad.setCount(Main.RedBeetSalad.getCount() + 1);
				Main.RedBeetSalad.setStock(Main.RedBeetSalad.getStock() - 1);
					
				String RedBeetSaladRealCount = Integer.toString(Main.RedBeetSalad.getCount());
				RedBeetSaladCountLabel.setText(RedBeetSaladRealCount);
				LaunchPage.Orders.add("Red Beet Salad");
				
				LaunchPage.totalPrice += Main.RedBeetSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);			
			}
			else {
				RedBeetSaladWarningText.setVisible(true);
			}
		}
		else if (e.getSource()==minusRedBeetSalad) {
			RedBeetSaladWarningText.setVisible(false);
			if (Main.RedBeetSalad.getCount()>0) {
				
				Main.RedBeetSalad.setCount(Main.RedBeetSalad.getCount() - 1);
				Main.RedBeetSalad.setStock(Main.RedBeetSalad.getStock() + 1);
				
				String RedBeetSaladRealCount = Integer.toString(Main.RedBeetSalad.getCount());
				RedBeetSaladCountLabel.setText(RedBeetSaladRealCount);
				LaunchPage.Orders.remove("Red Beet Salad");
				
				LaunchPage.totalPrice -= Main.RedBeetSalad.getPrice();
				String TotalPrice = Double.toString(LaunchPage.totalPrice);
				TotalPriceLabel.setText(TotalPrice);
			}
		}
	}
}
