package DessertsPackage;

public class SanSebastianCheesecakeItems {
	
	double price;
	boolean availability;
	int stock;
	int count;
	
	public SanSebastianCheesecakeItems(){
		this.price = 25.0;
		this.stock = 16;
		if (this.stock>0) {
			this.availability = true;
		}
		else {
			this.availability = false;
		}
		this.count = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
