
import java.util.Iterator;


public class ShoeLinkedBag implements Iterable<Shoe>{
	private ShoeNode head;
	private int manyItems;
	
	//Constructor
	public ShoeLinkedBag() {
		this.head = null;
		this.manyItems = 0;
	}
	
	public int size() {
		return manyItems;
	}
/**
 * Displays list 
 */
	public void display() {
		ShoeNode cursor;
		
		String list = "Front -> | ";
		
		for(cursor = this.head; cursor != null; cursor = cursor.getLink()) {
			list = list + cursor.getData().toString() + " | -> | ";
		}
		
		System.out.println(list);
	}
/**
 * Adds shoe to list
 * @param element
 * Shoe to add to list
 */
	public void add(Shoe element) {
		head = new ShoeNode(element, head);
		manyItems++;
		
	}

	
/**
 * Adds Shoe at given index in list
 * @param index
 * index to add shoe at
 * @param element
 * Shoe to add to list
 */
	public void add(int index, Shoe element) {
		ShoeNode next = head;
		int i = 1;
		
		if(index > manyItems) {
			next.addNodeAfter(element);
		}if(index < 0) {
			
		}if(index == 0 || index == 1) {
			head = new ShoeNode(element, head);
		}else {
		
		//Iterates through and checks to see if index is equal to counter(i);
		//If true, then adds node after current node.
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(index != i) {
				i++;
			}if(index == i) {
				cursor.addNodeAfter(element);
				i++;
			}
		}
	}
		manyItems++;

}

/**
 * Adds Shoe at the end of the list
 * @param element
 * Shoe to add at the end of the list
 */
	public void addLast(Shoe element) {
		//Iterate through adding the given element at the last iteration.
		
		int i = 0;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {		
				if(i != manyItems) {
					i++;
				}if(i == manyItems) {
					cursor.addNodeAfter(element);
					i++;
				}
		
			}
		}
		
/**
 * 
 * @param target
 * the Shoe to search and remove
 * @return
 * whether the Shoe was removed or not
 */
	public boolean remove(Shoe target) {
		//Iterate through while keeping a reference to the previous node
		//Once target is found, previous node will be used to remove the target.
		
		boolean removed = false;
		ShoeNode selection = head;
		
		if(head.getData() == target) {
			head = head.getLink();
		}
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {         
				if(cursor.getData() != target) {
					selection = cursor;
					
				}else {
					selection.removeNodeAfter();
	 			}
		}	
		manyItems--;
		return removed;
		}
		
/**
 * Removed element at given element
 * @param index
 * removes element at given index
 * @return
 * returns true or false based on whether element was removed or not
 */
	public boolean remove(int index) {
		//Uses selection to keep reference of previous node
		//Then iterates through, once the inner index is equal to given index,
		//it'll remove the node using the previous node, which is stored in selection. 
		
		boolean removed = false;
		int i = 1;
		ShoeNode selection = head;
		
		if(index > manyItems || index < 0) {
			removed = false;
		}
		if(index == 1) {
			head = head.getLink();
		}
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {                
			if(i != index) {
				selection = cursor;
				i++;
			}else {
				selection.removeNodeAfter();
				i++;
			}
		}
		
		manyItems--;
		return removed;
	}
/**
 * Removes last element in list
 */

	public void removeLast() {
		//Iterates through and removes the last element in the list
		int i = 0;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {         
			if(i != manyItems) {
				i++;
			}if(i == manyItems - 1) {
				cursor.removeNodeAfter();
				i++;
			}
			
		}
	
}
/**
 * Counting the amount of elements within the range of start and end
 * @param start 
 *   start counting from this element in the list
 * @param end 
 *   stop counting from this element in the list
 * @return 
 *   counter variable that holds the total amount of elements in between start and end.
 */

	public int countRange(Shoe start, Shoe end) {
		//Iterates through and adds to the counter every time the condition is met.
	
		int counter = 1;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(start) >= 1 && cursor.getData().compareTo(end) <= 1) { 
				counter++;
			}
		}
		return counter;
	}

/**
 * If index is within range it will return the element at the index,
 * otherwise it will return null
 * @param index 
 * 	Index to grab element from
 * @return 
 * 	element at index in Linked List
 */

	public Shoe grab(int index) {
		//Iterates through and grabs Shoe at given index.
		
		Shoe element = null;
		int i = 0;
		
		if(index > manyItems) {
			element = null;
		}
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {                  
			if(index != i) {
				i++;
			}if(index == i){
				element = cursor.getData();
				i++;
			}
			
		}
		
		return element;
	}

/**
 * Finds the target the given shoe is located at
 * @param target
 * Shoe to look for 
 * @return
 * Index that the target is located at given index
 */
	public int indexOf(Shoe target) {
		
		int index = 1;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(target) != 0) {
				index++; 
			}else { 																							
				return index;
			}
			
			
		}
		return index;
		
	}

/**
 * Sets given Shoe at given index
 * @param index
 * index to set element too
 * @param element
 * Shoe to set at given index
 */
	public void set(int index, Shoe element) {
		int i = 0;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(index != i) {																					
				i++;
			}if(index == i) {
				cursor.setData(element);
				i++;
			}
			
			
		}
	}
	

/**
* Replaced requested old element with new given element.
* 
* @param oldThing
* Old element replaced
*  @param newThing
* New element to replaced old element with
* @return
* True or false based on whether old element was replaced or not
*/
	public boolean replace(Shoe oldThing, Shoe newThing) {
		//Searches for oldThing in list,
		//Once found sets its to newThing
		
		boolean replaced = false;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData() == oldThing) {
				cursor.setData(newThing);                                               
				replaced = true;
			}else {
				
			}
		}
		return replaced;
	}
/**
 * Adds up the prices of all the shoe in the list
 * @return
 * Returns the sum of all the shoes prices.
 */
	public int totalValue() {
		int total = 0;
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {									
			total += cursor.getData().getPrice();
		}
		return total;
	}

/**
 * Makes a new list and adds shoe's that are less than given shoe's price
 * @param element
 * Element to compare the other elements too
 * @return
 * A new list composed of Shoe's that have prices less than given shoe price
 */
	public ShoeNode lessThan(Shoe element) {
		ShoeNode nHead = new ShoeNode(element, null);
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(element) == -1) {
				nHead.addNodeAfter(cursor.getData());
				nHead.getLink();
			}
		}
		ShoeNode.display(nHead);
		 return nHead;
	}
	
/**
 * Makes a new list and adds shoe's that are greater than given shoe's price
 * @param element
 * Element to compare to other elements in list
 * @return
 * A new list composed of Shoe's that have prices greater than given shoe price
 */
	public ShoeNode greaterThan(Shoe element) {
		ShoeNode nHead = new ShoeNode(element, null);
		
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(element) == 1) {
				nHead.addNodeAfter(cursor.getData());
				nHead.getLink();
			}
			
		}
		ShoeNode.display(nHead);
		return nHead;
	}
	
/**
 * Iterates through the list and grabs the highest priced shoe.
 * @return
 * The highest priced shoe in the list
 */
	public Shoe getMax() {
		Shoe maxShoe = head.getData();
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(maxShoe) == 1) {
				maxShoe = cursor.getData();
																											
			}
			
		}
		return maxShoe;
	}
	
/**
 * Iterates through the list and grabs the lowest priced shoe.
 * @return
 * The lowest price shoe
 */
	public Shoe getMin() {
		Shoe minShoe = head.getData();
		for(ShoeNode cursor = head; cursor != null; cursor = cursor.getLink()) {
			if(cursor.getData().compareTo(minShoe) == -1) {
				minShoe = cursor.getData();
			}
			
		}
		return minShoe;
	}
/**
 * Inner iterator class.
 * @author amaar
 *
 */
	 class ShoeLinkedBagIterator implements Iterator<Shoe>{
		private ShoeNode cursor = head;
	
		@Override
		public boolean hasNext() {
			boolean output = false;
			
			if(manyItems <= 1) {
				output = true;
			}
			
			if(cursor != null || cursor != null && cursor.getLink() != null) {
				output = true;
			}else {
				output = false;
			}
			
			return output;
		}

		@Override
		public Shoe next() {
			ShoeNode next = cursor;
			cursor = cursor.getLink();
			
			return next.getData();
	}
	 
}
/**
 * Returns ShoeBag iterator.
 */
public Iterator<Shoe> iterator() {
	return new ShoeLinkedBagIterator();
}                              


}
