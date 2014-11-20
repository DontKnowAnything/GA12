
/**
 *
 * @author User
 */
public class Node
{ private float dataValue;
   private Node next;

    /**
     *
     */
    public Node()
   { dataValue = 0;
      next = null;
   }

    /**
     *
     * @param val
     */
    public Node(float val)
   { dataValue=val;
      next = null;
   }

    /**
     *
     * @param newData
     */
    public void setDataValue(float newData)
   { dataValue = newData;
   }

    /**
     *
     * @return
     */
    public float getDataValue()
   { 
      float dV=dataValue;
      return dV;
   }

    /**
     *
     * @param nextNode
     */
    public void setNext(Node nextNode)
   { next = nextNode;
   }

    /**
     *
     * @return
     */
    public Node getNext()
   { Node n=next;
      return n;
   }
   
}
