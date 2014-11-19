/**
 * Add new data to end of list
 * Remove from beginning of list
 * 
 * @author pcmcknew1
 *
 */
public class LinkedList {

	private Node head;

	
	/**
	 * 
	 */
	public LinkedList() {
		head = new Node(.3f);
	}
	/**
	 * 
	 * @param newFloat 
	 * 
	 */
	public void addBegin(float newFloat){
		Node nN=new Node(newFloat);
		nN.setNext(head);
		head=nN;
	}

	/**
	 * @return If 
	 */
	public boolean isEmpty() {
		boolean b;
		if (head == null) {
			b = true;
		} else {
			b = false;
		}
		return b;

	}

	@Override
	public String toString() {
		Node current = head;
		while (current != null) {
			current.getNext();
			current = current.getNext();
		}
		return "LinkedList [head=" + current + ", isEmpty()=" + isEmpty() + "]";
	}
}
