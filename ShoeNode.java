
public class ShoeNode {
	private Shoe data;
	private ShoeNode link;
	
	
	public ShoeNode(Shoe Shoe, ShoeNode link) {
		this.data = Shoe;
		this.link = link;
	}
	
	//Getters and Setters
	
	public Shoe getData() {
		return this.data;
	}
	
	public ShoeNode getLink() {
		return link;
	}
	
	public void setData(Shoe value) {
		this.data = value;
	}
	
	public void setLink(ShoeNode newLink) {
		link = newLink;
	}
	
	
	// Add node
	public void addNodeAfter(Shoe shoe) {
		this.link = new ShoeNode(shoe, this.link);
	}
	
	// Remove node
	public void removeNodeAfter() {
		this.link = this.link.link;
	}
	
	/**
	 * Find the node at the position and returns it. 
	 * @param head
	 * Head of Linked List. 
	 * @param position
	 * Position to look at.
	 * @return
	 * The node at said position. 
	 */
	public static ShoeNode listPosition(ShoeNode head, int position) {
		ShoeNode cursor;
		int i;
		
		if(position <= 0) {
			throw new IllegalArgumentException("Position is not Positive");
			
		}
		cursor = head;
		for(i = 1; (i < position) && (cursor != null); i++) {
			cursor = cursor.link;
		}
		
		return cursor;
	}
	
	/**
	 * Finds the length of the Linked List
	 * @param head
	 * Head of Linked List.
	 * @return
	 * Length of the Linked List.
	 */
	public static int listLength(ShoeNode head) {
		ShoeNode cursor;
		int answer;
		
		answer = 0;
		for(cursor = head; cursor != null; cursor = cursor.link) {
			answer++;
		}
		
	return answer;
	
	}
	
	/**
	 * Searched the linked list for the target and returns it. 
	 * @param head
	 * Head of Linked List.
	 * @param target
	 * Target to be found.
	 * @return
	 * The shoe at the target position.
	 */
	public static ShoeNode listSearch(ShoeNode head, int target) {
		ShoeNode cursor;
		
		for(cursor = head; cursor != null; cursor = cursor.link) {
			if (target == cursor.getData().getPrice()) {
				return cursor;
			}
		}
		return null;
	}
	
	/**
	 * Displays all contents in the list.
	 * @param list
	 * The list to display.
	 */
	public static void display(ShoeNode list) {
		ShoeNode cursor = list;
		while(cursor != null) {
			System.out.println(cursor.data + " ");
			cursor = cursor.getLink();
		}
		
	}
	
}
