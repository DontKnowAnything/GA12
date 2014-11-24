
/**
 *
 * @author User
 */
public class Node
{ private float floatPoint;
   private Node next;

    /**
     *
     */
    public Node()
   { floatPoint = 0;
      next = null;
   }

    /**
     * 
     *
     * @param p
     */
    public Node(float p)
   { floatPoint=p;
      next = null;
   }

    /**
     * Hopefully correctly mutates the float
     *
     * @param newFloat
     */
    public void setFloatPoint(float newFloat)
   { floatPoint = newFloat;
   }

    /**
     *
     * @return
     */
    public float getFloatPoint()
   { 
      float dV=floatPoint;
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
