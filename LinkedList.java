/**
 * Maintains Node object list 
 * Adds to end of list 
 * Removes from beginning of list
 *
 * @author User
 */
public class LinkedList {

    private Node first = null;

    /**
     *
     */
    public LinkedList() {
        //first = new Node(4);
        first = null;

    }

    /**
     *
     * @return Status of list
     */
    public boolean isEmpty() {
        boolean e;
        if (first == null) {
            e = true;
        } else {
            e = false;
        }
        return e;
    }

    /**
     * Add to end
     *
     * @param e The float
     */
    public void add( float e ) {

        {
            Node newNode = new Node( e );

            //If last data entered is last on list, use this
            /*if (isEmpty()) {
             newNode.setNext(first); //Adds to begining?
             first = newNode;
             } else {
             Node current = first;
             while (current.getNext() != null) {
             current = current.getNext();
             }
             current.setNext(newNode);
             }*/
            
            //If last data entered is first on list, use this
            newNode.setNext( first );
            first = newNode;

        }
    }

    /**
     * Remove from beginning
     *
     * @param point The Point 
     */
    public void remove() {
        Node previousNode = null;
        Node currentNode = first;
        String err = "";
        
        if ( currentNode == null ) {
            err += "t";
        } else {
            if ( previousNode == null ) {
                first = currentNode.getNext();
                currentNode = null;
            } else {
                err += "wrong";
            }
        }
    }

    public String toString() {
        String p = "";
        Node ref = first;
        while ( ref != null ) {
            p += ref.getFloatPoint() + " ";
            ref = ref.getNext();
        }
        return p;
    }
}
