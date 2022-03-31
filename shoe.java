public class Shoe implements Comparable<Shoe>{

	private int size;
	private String name;
	private int price;
	
	
	//Constructor.
	public Shoe(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
		
	}
	
	//Returns size of shoe
	public int getSize() {
		return this.size;
		
	}
	
	//Returns name of shoe
	public String getName() {
		return this.name;
		
	}
	
	//Returns price of shoe
	public int getPrice() {
		return this.price;
	}
	
	
	public String toString() {
		String output = "";
		output += name + " , " + size + " , " + price; 
		
		return output;
		
	}
	
	//Checking if 2 different shoes are equal based on size, price and name
	public boolean equals(Shoe other) {
		if(other != null && this.size == other.size && this.price == other.price && this.name.equalsIgnoreCase(other.name)) {
			return true;
		}else;
		return false;
		
	}

	@Override
	public int compareTo(Shoe o) {
		int output = -1;
		
		if(this.price > o.price) {
			output = 1;
		}else if(this.price == o.price){
			output = 0;
		}
		return output;
	}
	
	
}
