import java.util.Iterator;


public class ShoeLinkedBagDriver {

	public static void main(String[] args) {
		ShoeLinkedBag shoeBag = new ShoeLinkedBag();
		
		Shoe shoe1 = new Shoe("Jordan 11's", 12, 120);
		Shoe shoe2 = new Shoe("Yeezy's", 10, 600);
		Shoe shoe3 = new Shoe("Boost 13s", 12, 130);
		Shoe shoe4 = new Shoe("AirMax 90s", 13, 150);
		Shoe shoe5 = new Shoe("Flip Flops", 5, 10);
		Shoe shoe6 = new Shoe("Air Forces", 3, 700);
		Shoe shoe7 = new Shoe("shoes", 20, 4000);
		
		shoeBag.add(shoe1);
		shoeBag.add(shoe2);
		shoeBag.add(shoe3);
		shoeBag.add(shoe4);
		shoeBag.add(shoe5);
		shoeBag.add(shoe6);
		shoeBag.add(shoe7);

	
//Commented to make accessing individual methods easier
	
	//Size Method
		System.out.println(shoeBag.size());
	
	//Add Methods
		
		shoeBag.add(6, shoe7);
		shoeBag.display();
		
	//AddLast Method
		shoeBag.addLast(shoe3);
		shoeBag.display();
		
		
	//Remove Methods
		shoeBag.display();
		shoeBag.remove(7);
		shoeBag.display();
		
		shoeBag.remove(shoe1);
		shoeBag.display();
		
	//RemoveLast Method
		shoeBag.removeLast();
		shoeBag.display();
		
	//countRage Method
		System.out.println(shoeBag.countRange(shoe1, shoe6));
		shoeBag.display();
		
	//Grab Method
		System.out.println(shoeBag.grab(10));
		System.out.println(shoeBag.grab(-1));
		System.out.println(shoeBag.grab(1));
		System.out.println(shoeBag.grab(4));
	
	//IndexOf Method
		System.out.println(shoeBag.indexOf(shoe1));
		System.out.println(shoeBag.indexOf(shoe7));
		
	//Set Method
		shoeBag.display();
		shoeBag.set(2, shoe1);
		shoeBag.display();
	
	//Replace Method
		System.out.println(shoeBag.replace(shoe1, shoe6));
		shoeBag.display();
		
		Shoe shoe8 = new Shoe("Not in list", 20, 20);
		System.out.println(shoeBag.replace(shoe8, shoe7));
		shoeBag.display();
		
	
	//Total Value Method
		System.out.println(shoeBag.totalValue());
		
	//Less Than Method
	//First line is the Element thats searched, 
	//Preceding Lines are the elements that are less than first line element
		System.out.println(shoeBag.lessThan(shoe2));
		
	//Greater Than Method
	//First line is the Element thats searched, 
	//Preceding Lines are the elements that are greater than first line element
		System.out.println(shoeBag.greaterThan(shoe2));
		System.out.println(shoeBag.greaterThan(shoe5));
		
		
		
	//getMax Method
		System.out.println(shoeBag.getMax());
	
	//getMin Method
		System.out.println(shoeBag.getMin());
		
		
	//Iterator Class
		Iterator<Shoe> itr  = shoeBag.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
