package SoupsPackage;

public class ChefsSpecialSoupItems {
	double price;
	boolean availability;
	int stock;
	int count;
	
	public ChefsSpecialSoupItems(){
		this.price = 18.0;
		this.stock = 5;
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
