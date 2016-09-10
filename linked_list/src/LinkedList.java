import nodes.IntNode;

/**
 * Created by Deslyxia on 9/9/16.
 */
public class LinkedList {
    public IntNode firstNode;

    LinkedList(){
        firstNode = null;
    }

    public Boolean isEmpty() {
        return (firstNode == null);
    }

    public void insertFirstLink(Integer number) {
        IntNode newNode = new IntNode(number);
        newNode.next = firstNode;
        firstNode = newNode;
    }

    public IntNode removeFirstLink() {
        IntNode nodeRef = firstNode;

        if (!isEmpty()) {
            firstNode = firstNode.next;
        } else {
            System.out.println("List is Empty");
        }
        return nodeRef;
    }

    public void printList(){
        IntNode nodeRef = firstNode;
        Integer i = 1;
        if (!isEmpty()) {
            while (nodeRef != null) {
                System.out.println("Node " + i + " data : " + nodeRef.data);
                nodeRef = nodeRef.next;
                i++;
            }
        }
    }
}
