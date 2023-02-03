package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}
	
	public double cover() {
		double couvert;
		if(feeding() <= 30) {
			couvert = 4;
		}
		else {
			couvert = 0;
		}
		return couvert;
	}
	
	public double ticket() {
		double ticketPrice = 0;
		if(gender == 'F') {
			ticketPrice = 8;
		}
		else if(gender == 'M') {
			ticketPrice = 10;
		}
		return ticketPrice;
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}

}
