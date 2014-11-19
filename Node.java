/**
 * 
 * @author pcmcknew1
 *
 */
public class Node {
	private float floatPoint;
	private Node next;

	/**
	 * 
	 */
	public Node() {
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @param floatPoint 
	 */
	public Node(float floatPoint) {
		setFloatPoint(floatPoint);
		next = null;
	}

	/**
	 * @return The data value
	 */
	public float getFloatPoint() {
		return floatPoint;
	}

	/**
	 * @param floatPointValue 
	 */
	public void setFloatPoint(float floatPointValue) {
		float point = floatPointValue;
		floatPoint = point;
	}

	/**
	 * @return The next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param nextNode 
	 */
	public void setNext(Node nextNode) {
		Node setNextNode=nextNode;
		next = setNextNode;
	}

}
