
/**
 *
 * @author User
 */
public class LinkedList
{ 
   private Node first = null;

    /**
     *
     */
    public LinkedList()
   {
      //first = new Node(4);
      first=null;
   }

    /**
     *
     * @return
     */
    public boolean isEmpty()
   {
      boolean e;
      if(first==null){
         e = true;
      }
      else{
         e = false;
      }
      return e;
   }

    /**
     *
     * @param e
     */
    public void add(float e){
   
      { Node newNode = new Node(e);     // create a new Node object
      
         //if (isEmpty())
         //{ 
         newNode.setNext(first);
         first = newNode;
         //}
         // else 
         // {// traverse the list to the end
            // Node current = first;
            // while (current.getNext() != null)
            // {  current = current.getNext();
            // }
         //   //add newNode to the end
            // current.setNext(newNode);
         // }
      }
   }
   public String toString()
   {
      String p="";
      Node ref=first;
      while(ref!=null)
      {
         p+=ref.getDataValue()+", ";
         ref=ref.getNext();
      }
      return p;
   }
}
